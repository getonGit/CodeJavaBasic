package LearningJava;

import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {
//		System.out.println("Hello World");
//		char ch= 's';
//		System.out.println(ch);
////		String S1 = new String;
//		String S9 = "My God";
//	//	System.out.println(S1);
//		String S1 = "  really  ";
//		System.out.println(S1);
//		String S2 = S1.trim();
//		System.out.println(S2);
//		String S3 = S1.concat(S9);
//		System.out.println(S3);
//		//System.out.println("the char at index is " + S9.toCharArray());
//		System.out.println(S3.length());
//		System.out.println();
//		
//		int[] a1 = {90, 60, 1};
//		int[] a2 = {3, 4, 5, 6, 7};
//		System.arraycopy(a1, 0, a2, 6, 2);
//		System.out.println(a2);
		
		GetterSetterExamples Stud = new GetterSetterExamples();
		Stud.setGrade(90);
		Stud.getGrade();
		Stud.setGradName("engineering");
		System.out.println("im graudate in" + Stud.getGradName());
		Stud.setStudName("shilpa");
		Stud.getStudName();

	}

}
