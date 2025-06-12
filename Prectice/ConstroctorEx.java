package com.Prectice;

public class ConstroctorEx extends Object {

	int rs;
	String mobile;

	ConstroctorEx(int rs, String mobile) {

		this.mobile = mobile;
		this.rs = rs;
	}

	public static void main(String[] args) {
System.out.println("asjjj");

//ConstroctorEx ex = new ConstroctorEx(20, "mi");
//System.out.println("ConstroctorEx.main()");
//ConstroctorEx ex1 = new ConstroctorEx(20, "mxxxx");
//System.out.println(ex1.mobile + " " + ex1.rs);

Example s =new Example(11,"aa");
System.out.println(s.amount + " chaining  "+ s.name);
System.out.println(s.rs + " perengt " + s.mobile);

	}

}

class Example extends ConstroctorEx {
	int amount;
	String name;

	Example(int amount, String name) {
		super(11, "mi");
		this.amount = amount;
		this.name = name;

	}

	
		
	}
