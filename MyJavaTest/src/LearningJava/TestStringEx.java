package LearningJava;
import java.util.Scanner;

public class TestStringEx {

	public static void main(String[] args) {
	//	String myStr = "this is a test string";
		Scanner input = new Scanner(System.in);
		System.out.println("enter a string");
		String myStr = input.nextLine();
		while (myStr.isEmpty() || myStr == null) {
			System.out.println("enter a new string");
			myStr = input.nextLine();
		}
		input.close();
		
		
		//	String Output = reverse(myStr);
	//	System.out.println(Output);
		TestStringEx TS = new TestStringEx();
		String RevCharset = TS.revCharinStr(myStr);
		
		
		
		System.out.println(" from main" + RevCharset);
	
	
	}
	
	public static String reverse(String myStr) {
		String reverse= " ";
		int len = myStr.length();
		if (len == 0)
			System.out.println("empty string, cant be reversed");
		else {
			String[] Arr1 = myStr.split("\\s+");
			for(String item:Arr1) {
				reverse = item + " " + reverse;
				
			}
			
		}
		return reverse;
	}
	
	public static String revCharinStr(String myStr) {
		String reverseC = "";
		char[] abc = myStr.toCharArray();
		int i=abc.length;
		System.out.println("length is :" + i);
		//char[] revChar = new char[i];
		//int j=0;
		int k = i-1;
		for(;k>=0;k--) {
					reverseC = reverseC + abc[k];
							}
						
		return reverseC;
	}
}
