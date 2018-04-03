package Concert_Lab;

public class ConcertApp 
{

	public static void main(String[] args) 
	{
		Time s = new Time(17,0,0);
		Time e = new Time(23,30,0);
		Concert con = new Concert("Devo", s, e);
		System.out.println(con);
	}

}
