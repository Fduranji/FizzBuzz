import java.util.Scanner;

/**
   FizzBuzzGame class
   Player plays FizzBuzz up to
   the number 15...
*/

public class FizzBuzzGame
{
   public static void main(String[] args)
   {
      //Arrays to hold both the answers and 
      //player input
      String[] ans = new String[15];
      String[] FizzBuzz = new String[15];
      //To read from keyboard
      Scanner keyboard = new Scanner(System.in);
      
      //Filling in the ans array with the answers
      for(int i = 0; i < ans.length; i++)
      {
         String output = "";
         if( (i+1) % 3 == 0) output += "Fizz";
         if( (i+1) % 5 == 0) output += "Buzz";
         if(output.equals("")) output += (i+1);
         
         ans[i] = output;         
      }
      
      System.out.println("Enter the numbers from 1 - 15.\nIf the number is " +
                         "divisible by 3 enter Fizz.\nDivisible by 5 enter Buzz " +
                         "\nDivisible by both 3 and 5, enter FizzBuzz.");
                      
      
      String input; //Hold user input
      //Filling in the FizzBuzz array with user input
      for(int i = 0; i < ans.length; i++)
      {
         System.out.print("Enter the number: ");
         input = keyboard.next();
         FizzBuzz[i] = input;
      }
      
      int correct = 0; //Hold the correct number of answers
      //Comparing the arrays
      for(int i = 0; i < ans.length; i++)
      {
         if( ans[i].equals(FizzBuzz[i]) )
         {
            correct++;
         }
         else
         {
            System.out.println("Number " + (i+1) + " was incorrect");
            System.out.println("\tshould have been " + ans[i]);
         }
      }
      
      System.out.println("Total correct: " + correct);
   }
}
