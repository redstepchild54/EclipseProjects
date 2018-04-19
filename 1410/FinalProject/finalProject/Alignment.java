package finalProject;

public enum Alignment {
	NONE
	{
		@Override
		public String toString()
		{
			return "None";
		}
	}, 
	LAWFULGOOD
	{
		@Override
		public String toString()
		{
			return "Lawful Good";
		}
	}, 
	NEUTRALGOOD
	{
		@Override
		public String toString()
		{
			return "Neutral Good";
		}
	}, 
	CHAOTICGOOD
	{
		@Override
		public String toString()
		{
			return "Chaotic Good";
		}
	}, 
	LAWFULNEUTRAL
	{
		@Override
		public String toString()
		{
			return "Lawful Neutral";
		}
	}, 
	NEUTRAL
	{
		@Override
		public String toString()
		{
			return "Neutral";
		}
	}, 
	CHAOTICNEUTRAL
	{
		@Override
		public String toString()
		{
			return "Chaotic Neutral";
		}
	}, 
	LAWFULEVIL
	{
		@Override
		public String toString()
		{
			return "Lawful Evil";
		}
	}, 
	NEUTRALEVIL
	{
		@Override
		public String toString()
		{
			return "Neutral Evil";
		}
	}, 
	CHAOTICEVIL
	{
		@Override
		public String toString()
		{
			return "Chaotic Evil";
		}
	}
}
