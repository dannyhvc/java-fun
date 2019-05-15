/*
 * Project Name: json_writing.java
 * Purpose:
 * Coder: Dan, Aiden, ...
 * Date: 5/14/2019 | Time: 8:09 PM
 */
package Year_1.MY_CODE.Json_stuff;

import java.io.*;
import java.util.*;
import org.json.simple.*;

public class json_writing
{
  @SuppressWarnings("unchecked")
  public static void main( String[] args )
  {
    boolean flag = true;
    Scanner scanner0 = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    JSONObject employeeDetails = new JSONObject();
    JSONObject employeeObject = new JSONObject();
    JSONArray employeeList = new JSONArray();


    for (int i = 0; i < 5; i++)
    {
      //inputs
      System.out.print("Input: "); String inputs = scanner0.nextLine();
      //outputs
      System.out.print("Outputs: ");String outputs = scanner1.nextLine();

      //resetting the JSONObject
      employeeDetails = new JSONObject();

      //adding elements to the JSONObject
      employeeDetails.put("e-inputs", inputs);
      employeeDetails.put("e-outputs", outputs);

      //adding another layer to place the JSONObject
      employeeObject = new JSONObject();
      employeeObject.put("training", employeeDetails);

      //Add employees to list
      employeeList.add(employeeObject);

      //Write JSON file
    }//end for

    //adds the object to the file.
    try (FileWriter file = new FileWriter("train_samples.json"))
    {
      file.write(employeeList.toJSONString());
      file.flush();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }//end try-catch[]

  }//end main()
}//end class
