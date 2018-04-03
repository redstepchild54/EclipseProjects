package ConcertLab;

public class Concert 
{
	private String name;
	private Time startTime;
	private Time endTime;

	public Concert(String n, Time start, Time end) 
	{
		name = n;
		startTime = start;
		endTime = end;
	}

	@Override
	public String toString() 
	{
		return "The " + name + " concert starts at " + startTime + " and ends at " + endTime + ".";
	}

}
