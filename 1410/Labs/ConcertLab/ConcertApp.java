package ConcertLab;

public class ConcertApp 
{
	public static void main(String[] args) 
	{
		Time s = new Time (17,0,0);
		Time e = new Time (23,30,0);
		String bandName = new String ("Devo");
		Concert con = new Concert(bandName, s, e);
		System.out.println("Concert: " + con);
	}
}
