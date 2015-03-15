package dqmIII.items;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import dqmIII.DQM;

public class DqmItemRecipeBuilder {

	public DqmItemRecipeBuilder()
	{

        GameRegistry.addRecipe(new ItemStack(DQM.builder.itemBuilderDama , 1), new Object[]
                {
                    "ABC",
                    "DEF",
                    "GHI",
                    'A', DQM.builder.itemBuilderDama1, 'B', DQM.builder.itemBuilderDama2, 'C', DQM.builder.itemBuilderDama3,
                    'D', DQM.builder.itemBuilderDama4, 'E', DQM.builder.itemBuilderDama5, 'F', DQM.builder.itemBuilderDama6,
                    'G', DQM.builder.itemBuilderDama7, 'H', DQM.builder.itemBuilderDama8, 'I', DQM.builder.itemBuilderDama9
                });

        GameRegistry.addRecipe(new ItemStack(DQM.builder.itemBuilderDamaS , 1), new Object[]
                {
                    "ABC",
                    "DEF",
                    "GHI",
                    'A', DQM.builder.itemBuilderDamaS1, 'B', DQM.builder.itemBuilderDamaS2, 'C', DQM.builder.itemBuilderDamaS3,
                    'D', DQM.builder.itemBuilderDamaS4, 'E', DQM.builder.itemBuilderDamaS5, 'F', DQM.builder.itemBuilderDamaS6,
                    'G', DQM.builder.itemBuilderDamaS7, 'H', DQM.builder.itemBuilderDamaS8, 'I', DQM.builder.itemBuilderDamaS9
                });

        GameRegistry.addRecipe(new ItemStack(DQM.builder.itemBuilderDamaW , 1), new Object[]
                {
                    "ABC",
                    "DEF",
                    "GHI",
                    'A', DQM.builder.itemBuilderDamaW1, 'B', DQM.builder.itemBuilderDamaW2, 'C', DQM.builder.itemBuilderDamaW3,
                    'D', DQM.builder.itemBuilderDamaW4, 'E', DQM.builder.itemBuilderDamaW5, 'F', DQM.builder.itemBuilderDamaW6,
                    'G', DQM.builder.itemBuilderDamaW7, 'H', DQM.builder.itemBuilderDamaW8, 'I', DQM.builder.itemBuilderDamaW9
                });

	}
}
