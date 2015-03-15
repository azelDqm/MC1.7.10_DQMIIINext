package dqmIII.enums;

public enum EnumDqmBugFix {
	Fix080MP(0, "ver080_MPresetBug");

	private int id;
	private final String name;

	private EnumDqmBugFix(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public int getId()
	{
		return this.id;
	}
}