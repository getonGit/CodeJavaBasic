package LearningJava;

public class SwitchEx {

	public static void main(String[] args) {
		
		int Rank = findRank(5);
		
		System.out.println("my rank is: " + Rank);
	}

	static int findRank(int caseval) {
		int Rank;
		switch(caseval) {
		default: 
			
			Rank = 3;
			break;
			
		case 0: 
			Rank = 1;
			break;
						
		case 1: 
			Rank = 2;
			break;
				
		
	}
	return Rank;
	}
	
}