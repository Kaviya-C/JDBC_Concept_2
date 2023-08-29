package com.learn.statement;

public class SQLInjectionAttack {
	public static void main(String... args) {

		/*
		 * simple statement --- sql injection attack is happened
		 * 
		 * prepared statement -- sql injection attack is not happened
		 * 
		 * inserting special characters in the sql query
		 * 
		 * at the end this is called sql injection attack
		 * 
		 * statement s=con.createStatement(); username =sc.next() password=sc.nextInt();
		 * query="Select count(*) from users where uname=" +username+" and
		 * upwd=""+password; res=s.executeQuery(query);
		 * 
		 * int c=0
		 * 
		 * if(res.next()) { c=res.getInt(1); } if(c==0) invalid else valid
		 * 
		 */
	}

}
