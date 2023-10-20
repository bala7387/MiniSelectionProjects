import java.util.Scanner;
import java.lang.Math;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Rock (0), Paper (1), Scissors (2)");
        int human = scan.nextInt();
        int bot = (int) (Math.random() * 3);
        if (human == 0 && bot == 1)
        {
            System.out.println("You played rock. The bot played paper. You lost.");
        }
        else if(human == 0 && bot == 2)
        {
            System.out.println("You played rock. The bot played scissors. You win.");
        }
        else if(human == 2 && bot == 0)
        {
            System.out.println("You played scissors. The bot played rock. You lost.");
        }
        else if(human == 1 && bot== 0)
        {
            System.out.println("You played paper. The bot played rock. You win.");
        }
        else if(human == 1 && bot == 2)
        {
            System.out.println("You played paper. The bot played scissors. You lost.");
        }
        else if(human == 2 && bot == 1)
        {
            System.out.println("You played scissors. The bot played paper. You win.");
        }
        if(human == bot)
        {
            System.out.println("Tie.");
        }

    }
}
