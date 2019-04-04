/**
 * Program Name: SimpleJDBCExample3.java
 * Purpose: a slightly older example that shows using a ResultSetMetaData object
 *          to assist in outputting data using loops.
 * Coder: Bill Pulling
 * Date: Jul 8, 2015 
 */
import java.sql.*;
public class SimpleJDBCExample3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//create some strings to hold useful data
			String url = "jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=EST5EDT";//Note changed database here to the 'world' database
			String user = "root";
			String password = "password";
			
			// standard boilerplate in a JDBC app
			Connection myConn = null;
			Statement myStmt = null;
			ResultSet myRslt = null;
			
			try
			{
				//Step 0: older code sometimes had this step of loading the driver.
				//Not necessary after java 1.6 where automatic driver detection was introduced, so
				//if you have the driver location in the build path, Eclipse will find it.
			 // Class.forName("com.mysql.jdbc.Driver").newInstance();
			  //System.out.println("Driver successfully loaded...");
			  
			  //Step 1: make the connection
			  myConn = DriverManager.getConnection(url, user, password);
			  
			  //step 2: create the statement
			  myStmt = myConn.createStatement();
			  
			  //step 3: execute and assign result set to ResultSet object
			  myRslt = myStmt.executeQuery("Select code, name, continent FROM country");
			  
			  //step 4: process results
			  //use the ResultsSetMetaData object to get some details from the CURSOR( an acronym for CURrent Set Of Records)
			  //about number of rows and columns in the returned results
			  
			  ResultSetMetaData metaData = myRslt.getMetaData();
			  
			  int numColumns = metaData.getColumnCount();
			  
			  System.out.println("Country Table in the MYSQL 'World' Database\n");
			  
			  //loop through the cursor
			  for(int i = 1; i <= numColumns; i++)
			  {
			  	//column numbering is ONE-BASED in SQL
			  	System.out.printf("%-8s\t\t", metaData.getColumnName(i) );
			  }
			  //blank line under column names;
			  System.out.println();
			  
			  //use a nested while/for loop to process the CURSOR
			  //outer loop checks for next record in set.
			  while(myRslt.next() ) 
			  {
			  	//inner for loop handles printing to the screen
			  	for(int i = 1; i <= numColumns; i++)
				  {
				  	//column numbering is ONE-BASED in SQL
				  	System.out.printf("%-8s\t\t", myRslt.getObject(i) );
				  }//end for
			  	//move down one line
			  	System.out.println();
			  	
			  }//end while			  
			  
			}
			//the catch stack 
			/** NOTE: This catches an exception thrown by line 30, but we don't really need to write anything like line 30 anymore
			catch(ClassNotFoundException ex)
			{
				ex.printStackTrace();
			}*/
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			finally //note that we put the finally code inside its own try-catch block. You sometimes see this. 
			         //In our previous examples we had the main method confess using the throws SQLException.
			        //here we used a try-catch inside the finally. 
			{
				try
				{
					if(myRslt != null)
					{
						myRslt.close();
					}
					
					if(myStmt != null)
					{
						myStmt.close();
					}
					
					if(myConn != null)
					{
						myConn.close();
					}
				}//end try
				catch(SQLException ex)
				{
					ex.printStackTrace();
				}
				
			}//end finally						
	}//end main
}//end class