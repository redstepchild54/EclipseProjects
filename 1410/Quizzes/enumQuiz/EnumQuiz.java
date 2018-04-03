package enumQuiz;

public class EnumQuiz {

	public static void main(String[] args) {
		
		Navigation navRight = Navigation.RIGHT;
		
		System.out.println(navRight.valueOf("RIGHT"));
		
		System.out.println(Navigation.values());

		TrafficLight greenLight = TrafficLight.GREEN;
		System.out.println(greenLight.duration());
		System.out.println(navRight.values());
	}

	public enum Navigation {LEFT, RIGHT, STRAIGHT};
	
	public enum TrafficLight 
	{ 
	     RED(3.5), GREEN(7.5), YELLOW(1.2);

	      double duration; 

	      TrafficLight( double d)
	     { 
	          duration = d;
	     }

	     public double duration()
	     {
	          return duration;
	     }
	}
}
