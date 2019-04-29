package oopsPractice;

public class Cars {

	int speed=0;
	String make;
	int wheels;
	
//	public Cars() {
//		System.out.println("speed is " + speed);
//		
//	}
	public Cars(int mySpeed) {
		speed= mySpeed;
		System.out.println("speed is " + speed);
		
	}

	public void incSpeed(int speed) {
		speed++;
		System.out.println("increased speed is " + speed );
		
	}
	
	
}
