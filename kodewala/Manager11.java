package com.kodewala;
class Manager11{
	String dbName,user,password;
	Manager11 (){
		this("myname","root","admin123");
	}
	Manager11 (String dbName,String user,String password){
		this.dbName=dbName;
		this.user=user;
		this.password=password;
		connect();
	}
	void connect() {
		System.out.println("Connecting to DB:" +dbName +"as" +user);
	}
	public static void main(String[] args) {
		Manager11 db1=new Manager11 ();
		Manager11 db2=new Manager11 ("testdb","admin","pass123");

	}

}
