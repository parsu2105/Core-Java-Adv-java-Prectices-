package mybasicpractice;

public class TryCatchExample {

	public static void main(String[] args) {
		try {
			int result = 10/0;
		}catch(ArithmeticException e) {
			System.out.println("CANNOT DIVIDE BY ZERO");
		}finally {
			System.out.println("FINALY BLOCK IS ALWAYS EXECUTED.");
		}

	}

}
