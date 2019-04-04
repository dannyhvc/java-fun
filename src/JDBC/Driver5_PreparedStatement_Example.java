/**
 * Program Name: Driver5_PreparedStatement_Example.java
 * Purpose: shows the steps in making a connection to a back-end database using 
 *          a JDBC driver, and passing in some type of query or DML statement.
 *          REVISION: this version uses a PreparedStatement object to which a user can pass
 *                     parameters (arguments) that will be incorporated into the SQL statement.
 *                     A PreparedStatement has "place-holder" variables that can be used to
 *                     accept parameters passed in by the user.  
 * Coder: Bill Pulling for Sec01
 * Date: Jul 6, 2017 
 */
import java.sql.*;
public class Driver5_PreparedStatement_Example 
{

	public static void main(String[] args) throws SQLException
	{
		// standard boilerplate code for most JDBC apps
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRslt = null;
		//add a PreparedStatememt object
		PreparedStatement myPrepStmt = null;
		
		//create some String objects for the parts of the connection string
		String url = "jdbc:mysql://localhost:3306/demo?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=EST5EDT";
		String user = "student";
		String password = "student";
			
			
		//step 1: use a try catch block to make the connection
		try
		{
			//create the Connection object by calling DriverManager class method getConnection()
			myConn = DriverManager.getConnection(url, user, password);
			
			
			//REVISION: create a PreparedStatement object with a couple of place-holder variables
			myPrepStmt = myConn.prepareStatement("SELECT * FROM employees " +
			                                     "WHERE salary > ? AND department = ?");
			
			
			
			//hard code the parameters and then pass them in
			myPrepStmt.setDouble(1, 30000);
			myPrepStmt.setString(2, "Legal");
			
			//RUN THE QUERY
			myRslt = myPrepStmt.executeQuery();
			
			//call the method to display the results
		 displayResults(myRslt);		
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
	
	private static void displayResults(ResultSet rs) throws SQLException
	{
		while(rs.next() )
		{
			//use column index numbers to retrieve data
			String lastName = rs.getString(2);
			String firstName = rs.getString(3);
			double salary = rs.getDouble(6);
			String department = rs.getString(5);
			
			System.out.printf("%s, %s, %.2f, %s \n", lastName, firstName, salary, department);
		}
	}//end method
	
	

}//end class









