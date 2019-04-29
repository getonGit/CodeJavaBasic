package oopsPractice;

public class InhertianceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed;
		Cars c1 = new Cars(90);
		System.out.println(c1.speed);
		c1.incSpeed(90);
		
		Tesla t1 = new Tesla(80);
		System.out.println(t1.speed);
		t1.incSpeed();
			}

}
