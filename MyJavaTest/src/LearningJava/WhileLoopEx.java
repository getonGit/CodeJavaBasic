package LearningJava;

public class WhileLoopEx {
public static void main(String[] args) {
	int i=0;
	int[] arr1 = {10,11,12,13,14};
	for(int numval:arr1)
	System.out.print(numval);
	int len;
	len = arr1.length;
	while(i < len) {
		arr1[i] = arr1[i] + 1;
		System.out.println("\n"	+ arr1[i]);
		i++;
	}
	
	
	
	
	
}
}
