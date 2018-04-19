package finalProject;

public enum Size {

	NONE
	{
		@Override
		public String toString()
		{
			return "None";
		}
	}, 
	FINE
	{
		@Override
		public String toString()
		{
			return "Fine";
		}
	
	}, 
	DIMINUTIVE
	{
		@Override
		public String toString()
		{
			return "Diminutive";
		}
	}, 
	TINY
	{
		@Override
		public String toString()
		{
			return "Tiny";
		}
	}, 
	SMALL
	{
		@Override
		public String toString()
		{
			return "Small";
		}
	}, 
	MEDIUM
	{
		@Override
		public String toString()
		{
			return "Medium";
		}
	}, 
	TALL
	{
		@Override
		public String toString()
		{
			return "Tall";
		}
	}, 
	HUGE
	{
		@Override
		public String toString()
		{
			return "Huge";
		}
	}, 
	GARGANTUAN
	{
		@Override
		public String toString()
		{
			return "Gargantuan";
		}
	}, 
	COLOSSAL
	{
		@Override
		public String toString()
		{
			return "Colossal";
		}
	}
	
}
