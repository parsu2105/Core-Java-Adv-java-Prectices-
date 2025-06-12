package com.kodewala;

class JungleJanber{
	void lion() {
		System.out.println("THIS IS THE LION");
	}
}
class WildAnimal extends JungleJanber {
	void dolfine() {
		System.out.println("THIS IS THE DOLFINE");
	}
}
public class MultilebleInheritance extends WildAnimal {
	
	void tiger() {
		System.out.println("THIS IS THE THIGER ");
	}

	public static void main(String[] args) {
		System.out.println("This is the EXAMPLE OF MULTILEVEL INHERITANCE");
		MultilebleInheritance multilebleInheritance=new MultilebleInheritance();
		multilebleInheritance.dolfine();
		multilebleInheritance.lion();
		multilebleInheritance.tiger();
		System.out.println("THIS IS THE MULTILEVEL INHERITANCE");

	}

}
