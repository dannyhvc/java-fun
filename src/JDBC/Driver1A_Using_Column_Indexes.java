/**
 * Program Name: Driver1A_Using_Column_Indexes.java
 * Purpose: shows the steps in making a connection to a back-end database using 
 *          a JDBC driver, and passing in some type of query or DML statement. 
 *          REVISION : changed to using column index numbers down in the result set
 *                     processing loop.
 * Coder: Bill Pulling for Sec01
 * Date: Jul 5, 2017 
 */
import java.sql.*;
public class Driver1A_Using_Column_Indexes 
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
			//create the Connection object by calling DriverManager class method getConnection()
			myConn = DriverManager.getConnection(
					   "jdbc:mysql://localhost:3306/demo?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=EST5EDT","root","password");
			
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
				System.out.println(myRslt.getString(2) +
						    ", " + myRslt.getString(3)  + ", " +
						     myRslt.getString(4) );
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









