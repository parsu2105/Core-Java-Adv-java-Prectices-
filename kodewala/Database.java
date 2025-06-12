package com.kodewala;

public class Database {
	String dbName,userid,passowrd;
	Database(){
		this("dbName", "userid", "dbName");
	}
	Database(String _dbName,String _userid,String _password){
		this.dbName=_dbName;
		this.userid=_userid;
		this.passowrd=_password;
		connect();
		
	}
	void connect() {
		System.out.println("Connecting to database"+dbName+"as"+userid);
	}
	public static void main(String[] args) {
		Database s1=new Database();
		Database s2=new Database("testdb","admin","pass123");
		System.out.println(s1.dbName);
		System.out.println(s2.dbName);

	}

}
