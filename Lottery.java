import java.util.Scanner;
import java.lang.Math;
public class Lottery {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a two digit number:");
        int number = scan.nextInt();
        int bot = (int) (Math.random()*90)+10;


        int number1 = number/10;
        int number2 = number%10;
        int bot1 = bot/10;
        int bot2 = bot%10;

        System.out.println("The lotto number is: " + bot);

        if(number == bot)
        {
            System.out.println("You win the jackpot of $10,000.");
        }
        else if((number1 == bot1) || (number2 == bot2))
        {
            System.out.println("You got one digit correct.");
            System.out.println("You win $500");
        }
        else if ((number1 == bot2) || (number2 == bot1))
        {
            System.out.println("You got one digit correct.");
            System.out.println("You win $500");
        }
        else if((number1 + number2) == (bot1 + bot2))
        {
            System.out.println("You got both digits correct.");
            System.out.println("You win $2,000.");
        }
        else
        {
            System.out.println("You did not win anything.");
        }



    }
}