package mybasicpractice;

class Calculator{
	void add(int a, int b) {
		System.out.println("A+B= " +a + +b);
	}
	void add(int a , double b) {
		System.out.println("A+B = " +a + +b);
	}
	void add(double a , int b) {
		System.out.println("A+B = " +a + +b);
	}
}

class ScientificCalcultor extends Calculator {
	@Override
	void add(int a,int b) {
		System.out.println("A + B = " +a + +b);
	}
	@Override
	void add(int a , double b) {
		System.out.println("A+B = " +a + +b);
	}
	@Override
	void add(double a , int b) {
		System.out.println("A+B = " +a + +b);
	}
	
}

public class PloymorphismPractice {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.add(10, 34);
		c1.add(43.45, 53);
		c1.add(4, 45.54);
		
		System.out.println("-------------------------------");
		ScientificCalcultor c2 = new ScientificCalcultor();
		c2.add(34, 054);
		c2.add(45, 45.4);
		c2.add(45.5, 53);

	}

}
