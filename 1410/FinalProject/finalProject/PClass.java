package finalProject;

public enum PClass {

	NONE
	{
		@Override
		public String toString()
		{
			return "None";
		}
	}, 
	BARBARIAN
	{
		@Override
		public String toString()
		{
			return "Barbarian";
		}
	}, 
	BARD
	{
		@Override
		public String toString()
		{
			return "Bard";
		}
	}, 
	CLERIC
	{
		@Override
		public String toString()
		{
			return "Cleric";
		}
	}, 
	DRUID
	{
		@Override
		public String toString()
		{
			return "Druid";
		}
	}, 
	FIGHTER
	{
		@Override
		public String toString()
		{
			return "Fighter";
		}
	}, 
	MONK
	{
		@Override
		public String toString()
		{
			return "Monk";
		}
	}, 
	PALADIN
	{
		@Override
		public String toString()
		{
			return "Paladin";
		}
	}, 
	RANGER
	{
		@Override
		public String toString()
		{
			return "Ranger";
		}
	}, 
	ROGUE
	{
		@Override
		public String toString()
		{
			return "Rogue";
		}
	}, 
	SORCERER
	{
		@Override
		public String toString()
		{
			return "Sorcerer";
		}
	}, 
	WIZARD
	{
		@Override
		public String toString()
		{
			return "Wizard";
		}
	}
	
}
