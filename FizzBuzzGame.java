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
      String[] ans = new String[15];
      String[] FizzBuzz = new String[15];
      
      Scanner keyboard = new Scanner(System.in);
      
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
                      
      
      String input;
      
      for(int i = 0; i < ans.length; i++)
      {
         System.out.print("Enter the number: ");
         input = keyboard.next();
         FizzBuzz[i] = input;
      }
      
      int correct = 0;
      
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