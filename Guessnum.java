import java.util.Scanner;
import java.util.Random;
class Guessnum 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    String play="yes";
    //while loop to determine if we are going to play the game again
      while(play.equals("yes"))
        {
          Random r = new Random();
          int rno = r.nextInt(100);
          int guess = -1;
          int tries = 0;
      // while loop to check if the game is over
        while(guess != rno)
          {
            System.out.print("Guess a number between 1 and 100: ");
            guess = sc.nextInt();
            tries++;
            if (guess== rno)
            {
                System.out.println("Awesome! You guessed the number");
                System.out.println("It only took "+ tries +" Guesses!");
                System.out.println("Would you like to play again? Yes or No:");
                play = sc.next().toLowerCase();

            }
            else if(guess > rno)
            {
                System.out.println("Your guess is too high, try again");
            }
            else
            {
                System.out.println("Your guess is too low, try again");
            }
          }
        }
       sc.close();
  }
}