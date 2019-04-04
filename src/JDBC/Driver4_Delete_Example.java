/**
 * Program Name: Driver4_Delete_Example.java
 * Purpose: shows the steps in making a connection to a back-end database using 
 *          a JDBC driver, and passing in some type of query or DML statement.
 *          REVISION: this version does DELETE of an existing row in the table. 
 * Coder: Bill Pulling for Sec01
 * Date: Jul 6, 2017 
 */
import java.sql.*;
public class Driver4_Delete_Example 
{

	public static void main(String[] args) throws SQLException
	{
		// standard boilerplate code for most JDBC apps
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRslt = null;
		
		//create some String objects for the parts of the connection string
		String url = "jdbc:mysql://localhost:3306/demo?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=EST5EDT";
		String user = "student";
		String password = "student";
			
			
		//step 1: use a try catch block to make the connection
		try
		{
			//create the Connection object by calling DriverManager class method getConnection()
			myConn = DriverManager.getConnection(url, user, password);
			
			//create a Statement object to hold the query. Call the Connection object's
			// createStatement method to do this.
			myStmt = myConn.createStatement();
			
			//create a String for the INSERT statement
			String deleteString = "DELETE FROM employees WHERE last_name = 'Brown'";
			//catch return value from the query in an int variable
			int rowsAffected = myStmt.executeUpdate(deleteString);
			
			System.out.println("DELETE was completed, rows affected is " + rowsAffected);
			System.out.println("Run Driver1 again to see the new row in the table. ");
						
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









