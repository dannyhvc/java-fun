package JDBC;

/**
 * Program Name: Driver1.java
 * Purpose: shows the steps in making a connection to a back-end database using
 *          a JDBC driver, and passing in some type of query or DML statement.
 * Coder: Bill Pulling for Sec02
 * Date: Jul 4, 2017
 */
import java.sql.*;
public class Driver1 
{

	public static void main(String[] args) throws SQLException
	{
		// standard boilerplate code for most JDBC apps
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRslt = null;
		
		//step 1: use a try catch block to make the connection
		try
		{
			//create the Connection object by calling DriverManager class method getConnection() NOTE: replace the final parameter with the password you use to connect to mysql
			myConn = DriverManager.getConnection(
			    "jdbc:mysql://localhost:3306/demo?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=EST5EDT",
          "root",
          "password");
			
			//create a Statement object to hold the query. Call the Connection object's
			// createStatement method to do this.
			myStmt = myConn.createStatement();
			
			//pass in a query string using the Statement object's executeQuery() method
			//and catch the returned result set in your ResultSet object
			myRslt = myStmt.executeQuery("Select * From employees");
			
			//process the ResultSet object that is returned. The result set of rows that
			// is returned from the database is often referred to as a CURSOR. CURSOR is an acronym... 
			// CURSOR = CURrent Set Of Records...CURSOR!
			 
			while(myRslt.next() )
			{
				System.out.println(myRslt.getString("last_name") +
						    ", " + myRslt.getString("first_name")  + ", " +
						     myRslt.getString("email") );
			}//end while
					
		}
		catch(Exception ex)
		{
			System.out.println("Exception caught, message is " + ex.getMessage());
			ex.printStackTrace();
		}
		finally
		{
			//clean-up code t make sure the connection to the db is closed properly
			//close the objects in the reverse order that you opened them.
			if(myRslt != null)
				myRslt.close();
			if(myStmt != null)
				myStmt.close();
			if(myConn != null)
				myConn.close();
		}
		

	}//end main

}//end class








