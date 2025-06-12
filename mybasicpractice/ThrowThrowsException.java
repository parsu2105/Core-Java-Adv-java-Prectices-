package mybasicpractice;

public class ThrowThrowsException {
	
	static void validateAge(int age)throws IllegalArgumentException{
		if(age<18)
			throw new IllegalArgumentException("Not eligible for voting");
		else 
			System.out.println("Eleigble for voting");
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
	
		try {
			validateAge(15);
		}catch(IllegalArgumentException e) {
			System.out.println("Exception : " + e.getMessage());
		}

	}

}
