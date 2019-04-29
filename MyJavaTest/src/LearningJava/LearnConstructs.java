package LearningJava;

public class LearnConstructs {

	int speed;
	int gear;
	
	public LearnConstructs() {
//		this(30,90);
		System.out.println("im default constructor");
		speed = 0;
		gear =0;
		
		
	}
	
	public LearnConstructs(int speed, int gear) {
		System.out.println("im argument constructor");
		this.speed = speed;
		this.gear =gear;
	}
	
}
