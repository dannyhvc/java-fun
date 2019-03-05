package MY_CODE;/*
* Project Name: MY_CODE.LILI_Lottery.java
* Purpose:
* Coder: Daniel Herrera (0881570) for Section 03
* Date: 2/21/2019 | Time: 11:41 PM
*/

import java.util.Random;
import java.util.Scanner;

public class LILI_Lottery
{
  public static void main(String[] args)
  {
    // scanner stuff
    Scanner scanner = new Scanner(System.in);

    //input shit
    System.out.print(
        "(1) Small prize \n(2) Big prize \n(3) Lotto\n--> ");
    byte ui = scanner.nextByte();

    //input stuff.
    choice(ui);

  }//psvm

  private static void choice(byte ui)
  {
    switch (ui)
    {
      case 1:
        smallPrize();
        break;
      case 2:
        bigPrize();
        break;

      case 3:
        lotto();
        break;

      default:
        System.out.println("Error 422, invalid input.");
        break;
    }//end switch
  }

  private static void smallPrize()
  {
    //DECLARING STUFF
    Scanner scanner = new Scanner(System.in);
    int tryer;
    int win  = numberWinner();

    //LCC
    int i= 1;
    while(i <= 5)
    {
      //try input
      System.out.print("Try number " + i + ": ");
      tryer = scanner.nextInt();

      //win condition
      if (tryer == win)
      {
        System.out.println("\nWINNER. ILY <3.");
        printer(win);
        break;
      }
      else if (i == 5)
      {
        System.out.println("\nHEHE.");
        printer(win);
        break;
      }

      ++i;
    }


  }//end smallPrize

  private static void bigPrize()
  {
    Scanner scanner = new Scanner(System.in);
    int tryer;
    int win  = numberWinner();

    int i= 1;
    while(i <= 3)
    {
      System.out.print("Try number " + i + ": ");
      tryer = scanner.nextInt();

      if (tryer == win)
      {
        System.out.println("\nWINNER. ILY <3.");
        printer(win);
        break;
      }
      else if (i == 3)
      {
        System.out.println("\nHEHE.");
        printer(win);
        break;
      }

      ++i;
    }//end while

  }//end bigPrize

  private static void lotto()
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("LOTTO NUMBER (1 - 25)");
    int tryer = scanner.nextInt();
    int winLotto = lottoWinner();

    if (tryer == winLotto)
    {
      System.out.println("\nWINNER. ILY <3.");
      printer(winLotto);
    }
    else
    {
      System.out.println("\nHEHE.");
      printer(winLotto);
    }

  }//end lotto

  private static int numberWinner()
  {
    Random rand = new Random();
    int num;
    return num = rand.nextInt(20) + 1;
  }

  private static int lottoWinner()
  {
    Random rand = new Random();
    int num;
    return num = rand.nextInt(25) + 1;
  }

  private static void printer(int num)
  {
    System.out.println("\nThe Number WAS... " + num);
  }

}//end Main class
