package dqmIII.asm;

import java.util.List;

//import cpw.mods.fml.relauncher.FMLRelauncher;
import net.minecraft.launchwrapper.IClassTransformer;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

// Opcodes : インプリメントすると、ASMによるバイトコード定数にアクセスするのに便利です。
// 必須ではありません。不用な場合は implements から削除してください。

public class DqmTransFormer implements IClassTransformer, Opcodes
{
    // 改変対象のクラスの完全修飾名です。
    // 後述でMinecraft.jar内の難読化されるファイルを対象とする場合の簡易な取得方法を紹介します。
	private static final String TARGET_CLASS_NAME = "net.minecraft.util.CombatTracker";
	private static final String TARGET_CLASS_NAME2 = "net.minecraft.enchantment.EnumEnchantmentType";

    // クラスがロードされる際に呼び出されるメソッドです。
    @Override
    public byte[] transform(String name, String transformedName, byte[] bytes)
    {
        // FMLRelauncher.side() : Client/Server どちらか一方のを対象とする場合や、
        // 一つのMODで Client/Sever 両方に対応したMODで、この値を判定して処理を変える事ができます。
        // 今回は"CLIENT"と比較し、Client側のファイルを対象としている例です。
        // Client側専用のMODとして公開するのであれば、判定は必須ではありません。

        // name : 現在ロードされようとしているクラス名が格納されています。
        //if (!FMLRelauncher.side().equals("CLIENT") || !name.equals(TARGET_CLASS_NAME))

    	if (!transformedName.equals(TARGET_CLASS_NAME) && !transformedName.equals(TARGET_CLASS_NAME2))
        {
            // 処理対象外なので何もしない
            return bytes;
        }

    	System.out.println("CombatTrackerClass patching TRY:");
        try
        {
            // --------------------------------------------------------------
            // クラスファイル丸ごと差し替える場合
            // --------------------------------------------------------------
            //return replaceClass(bytes);

            // --------------------------------------------------------------
            // ASMを使用し、既存のクラスファイルに改変を施す場合。
            // --------------------------------------------------------------
        	if(transformedName.equals(TARGET_CLASS_NAME))
        	{
        		return hookCombatTrackerMethod(bytes);
        	}else if(transformedName.equals(TARGET_CLASS_NAME2))
        	{
        		return hookEnumEnchantment(bytes);
        	}else
        	{
        		return bytes;
        	}

        }
        catch (Exception e)
        {
            throw new RuntimeException("failed : TutorialTransformer loading", e);
        }

    }


    private byte[] hookCombatTrackerMethod(byte[] bytes)
    {
        // ASMで、bytesに格納されたクラスファイルを解析します。
    	System.out.println("CombatTrackerClass patching START");
        ClassNodeDum cnode = new ClassNodeDum();
        ClassReader reader = new ClassReader(bytes);
        reader.accept(cnode, 0);

        // 改変対象のメソッド名です
        String targetMethodName = "a";

        // 改変対象メソッドの戻り値型および、引数型をあらわします
        String targetMethoddesc = "(Lro;FF)V";

        // 対象のメソッドを検索取得します。
        MethodNode mnode = null;
        for (MethodNode curMnode : (List<MethodNode>) cnode.methods)
        {
            if (targetMethodName.equals(curMnode.name) && targetMethoddesc.equals(curMnode.desc))
            {
                mnode = curMnode;
                break;
            }
        }

        if (mnode != null)
        {
            try
            {
	        	System.out.println("CombatTrackerClass patching");
	            InsnList overrideList = new InsnList();

	            // メソッドコールを、バイトコードであらわした例です。
	            overrideList.add(new FieldInsnNode(GETSTATIC, "dqmIII/DQM", "damMessage", "LdqmIII/functions/FuncDamageMessage;"));
	            overrideList.add(new VarInsnNode(ALOAD, 0));
	            overrideList.add(new FieldInsnNode(GETFIELD, "rn", "b", "Lsv;"));
	            overrideList.add(new VarInsnNode(ALOAD, 1));
	            overrideList.add(new VarInsnNode(FLOAD, 2));
	            overrideList.add(new VarInsnNode(FLOAD, 3));
	            overrideList.add(new MethodInsnNode(INVOKEVIRTUAL, "dqmIII/functions/FuncDamageMessage", "message", "(Lsv;Lro;FF)V"));

	            // mnode.instructions.get(1)で、対象のメソッドの先頭を取得
	            // mnode.instructions.insertで、指定した位置にバイトコードを挿入します。
	            mnode.instructions.insert(mnode.instructions.get(1), overrideList);
	            // 改変したクラスファイルをバイト列に書き出します
	            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
	            System.out.println("CombatTrackerClass patching:" + cnode.name);
	            cnode.accept(cw);
	            bytes = cw.toByteArray();

	            System.out.println("CombatTrackerClass patching success!!:");
            } catch (Exception e) {
                throw new RuntimeException("failed : CombatTrackerClass patching ", e);
            }
        }

        return bytes;
    }



    private byte[] hookEnumEnchantment(byte[] bytes)
    {
        // ASMで、bytesに格納されたクラスファイルを解析します。
    	System.out.println("EnumEnchantmentrClass patching START");
    	ClassNodeDum cnode = new ClassNodeDum();
        ClassReader reader = new ClassReader(bytes);
        reader.accept(cnode, 0);

        // 改変対象のメソッド名です
        String targetMethodName = "a";

        // 改変対象メソッドの戻り値型および、引数型をあらわします
        String targetMethoddesc = "(Ladb;)Z";

        // 対象のメソッドを検索取得します。
        MethodNode mnode = null;
        for (MethodNode curMnode : (List<MethodNode>) cnode.methods)
        {
            if (targetMethodName.equals(curMnode.name) && targetMethoddesc.equals(curMnode.desc))
            {
                mnode = curMnode;
                break;
            }
        }

        if (mnode != null)
        {
        	System.out.println("EnumEnchantmentrClass patching");
            InsnList overrideList = new InsnList();
            LabelNode l2 = new LabelNode();

            // メソッドコールを、バイトコードであらわした例です。
            overrideList.add(new FieldInsnNode(GETSTATIC, "dqmIII/DQM", "enchaHook", "LdqmIII/functions/FuncEnchantExtension;"));
            overrideList.add(new VarInsnNode(ALOAD, 1));
            overrideList.add(new VarInsnNode(ALOAD, 0));
            overrideList.add(new MethodInsnNode(INVOKEVIRTUAL, "dqmIII/functions/FuncEnchantExtension", "canEnchantItem", "(Ladb;Lafu;)Z"));
            overrideList.add(new JumpInsnNode(IFEQ, l2));
            overrideList.add(new InsnNode(ICONST_1));
            overrideList.add(new InsnNode(IRETURN));
            overrideList.add(l2);

            // mnode.instructions.get(1)で、対象のメソッドの先頭を取得
            // mnode.instructions.insertで、指定した位置にバイトコードを挿入します。

            mnode.instructions.insert(mnode.instructions.get(1), overrideList);

            // 改変したクラスファイルをバイト列に書き出します
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);

            cnode.accept(cw);
            bytes = cw.toByteArray();
            System.out.println("EnumEnchantmentrClass patching success!!:");
        }

        return bytes;
    }


    // 下記の想定で実装されています。
    // EntityLiving.class の doRenderLiving の先頭に
    // tutorial/test.class の passTestRender(EntityLiving, double, double, double)メソッドの呼び出しを追加する。

    private byte[] hookDoRenderLivingMethod(byte[] bytes)
    {
        return bytes;
    }

}