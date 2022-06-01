import java.util.Random;
import java.util.Scanner;
class NumberGuess
{
    public int number;


    public int inputNumber;

    public int noOfGuesses=0;

    public int getNoOfGuesses()
    {
        return noOfGuesses;
    }
    
    public void setNoOfGuesses(int noOfGuesses)
    {
        this.noOfGuesses = noOfGuesses;
    }

    NumberGuess ()
    { 
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    
    void takeUserInput()
    {
      System.out.println("Guess the Number");
      Scanner sc=new Scanner(System.in);
      inputNumber = sc .nextInt();
    
    }

    boolean isCorrectNumber()
    {
       noOfGuesses++;
       if(inputNumber==number)
       {
         System.out.format("Yes you guessed it right , the number is %d\nYou guessed it in %d attempts",number,noOfGuesses);
         return true;
       }
       
       else if(inputNumber<number)
       {
           System.out.println("low.....");
       }

       else if(inputNumber>number)
       {
           System.err.println("high.....");
       }

       return false;
    }

}


public class task2
{
    public static void main(String args[])

    {
       NumberGuess n = new NumberGuess();
       boolean b = false;
       while(!b)
       {
       n.takeUserInput();
       b= n.isCorrectNumber();
      

       }
    
    }
}
