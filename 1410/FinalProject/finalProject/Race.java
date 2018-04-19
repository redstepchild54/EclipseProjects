package finalProject;

public enum Race {

	NONE
	{
		@Override
		public String toString()
		{
			return "None";
		}
	}, 
	DWARF
	{
		@Override
		public String toString()
		{
			return "Dwarf";
		}
	}, 
	ELF
	{
		@Override
		public String toString()
		{
			return "Elf";
		}
	}, 
	GNOME
	{
		@Override
		public String toString()
		{
			return "Gnome";
		}
	}, 
	HALFELF
	{
		@Override
		public String toString()
		{
			return "Half-Elf";
		}
	}, 
	HALFORC
	{
		@Override
		public String toString()
		{
			return "Half-Orc";
		}
	}, 
	HALFLING
	{
		@Override
		public String toString()
		{
			return "Halfling";
		}
	}, 
	HUMAN
	{
		@Override
		public String toString()
		{
			return "Human";
		}
	}
	
}
