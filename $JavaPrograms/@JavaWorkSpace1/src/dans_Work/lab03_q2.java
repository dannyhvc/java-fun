/*
 * Project Name: lab3_q1.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/19/2019 | Time: 2:41 PM
 */
package dans_Work;
import java.util.Scanner;

public class lab03_q2 {

  public static void main(String[] args)
  {
    long startTime = System.nanoTime();

//TODO: declaring variables ============================================================================================
    Scanner in = new Scanner(System.in);
    int maxNumPalindrome = 0, multple = 0, lowerBound, unpperBound;
    String sNum, result = "";
    boolean isPalindrome;

//TODO: lab standard format output =====================================================================================
    System.out.println("******************************************************");
    System.out.println("ES1069b: Lab 07 Q4");
    System.out.println("Date: L2/24/18");
    System.out.println("Name: Pls Stop Cheating");
    System.out.println("Student Number: 123456789");
    System.out.println("******************************************************");


//TODO: INPUT SECTION ==================================================================================================
    System.out.println("Max range for palindrome creation (enter a number): ");
    while (true)
    { 									// nope
      maxNumPalindrome = in.nextInt(); 							// should i start it?
      if (maxNumPalindrome >= 1 && maxNumPalindrome <= 9999)
        break; 					// yep
      System.out.println("Try again: ");		// will i?
    }																	// fuk no

    //checking input within range for the divisor
    System.out.println("Multiple divisor input section: ");
    while (true)
    {
      multple = in.nextInt();
      if (multple >= 1 && multple <= 150)
        break;
      System.out.println("Try again: ");
    }

    in.close();//good house keeping, frees the heap of the input stack.

//TODO: Check number of palindromes SECTION=============================================================================
    for (int i = 1; i <= maxNumPalindrome; i++)
    {
      String s = Integer.toString(i);
      lowerBound = 0; // arrays always start at 0
      unpperBound = s.length() - 1; // the highest position in the array is at the number of element - 1.
      isPalindrome = true; //true until proven false.

      //loops until the two bounds meet
      while (lowerBound < unpperBound)
      {
        //checks positions in the array making sure that they must be equal or else the are not palindrome.
        if (s.charAt(lowerBound) != s.charAt(unpperBound))
        {
          isPalindrome = false;
          break; // if the number does end up being a palindrome then it kick it out and the for
                 // iterates to the next instance
        }//end if

        lowerBound++;  //moves from left to right on char num array positions to check if its a palindrome
        unpperBound--; //moves from right to left on char num array positions to check if its a palindrome
      }//end while

      if(isPalindrome && i%multple == 0)
        result += i + " ";//since concatenation has a higher precedence than arithmetic result turns into a string.
                          //therefore instead of an array its only going to print a super long string with all the
                          //number in it

    }//end for

//TODO: Output of the program ==========================================================================================
    //prints the palindrome side by side with spaces
    System.out.println("The palindromes are: \n" + result);

    long endTime = System.nanoTime() - startTime;
    System.out.format("%.2f seconds elapsed",endTime / 1_000_000_000.0);
  }//END main()

}//end lab03_q2