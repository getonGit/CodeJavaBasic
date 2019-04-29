package LearningJava;

public class methodPrac1 {
public static void main(String[] args) {
	
	LearnConstructs LC1 = new LearnConstructs();
	System.out.println(LC1.gear);
	System.out.println(LC1.speed);
	
	LearnConstructs LC2 = new LearnConstructs(10, 20);
	System.out.println(LC2.gear);
	System.out.println(LC2.speed);
}

}
