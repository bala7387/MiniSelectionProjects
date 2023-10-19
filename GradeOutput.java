import java.util.Scanner;
public class GradeOutput {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        System.out.println("Enter in your grade as an integer");
        int grade;
        grade = scan.nextInt();

        if (grade <= 59)
        {
            System.out.println("F");
        }
        else if (grade <=62)
        {
            System.out.println("D-");
        }
        else if (grade <= 67)
        {
            System.out.println("D");
        }
        else if (grade <=69)
        {
            System.out.println("D+");
        }
        else if (grade <= 72)
        {
            System.out.println("C-");
        }
        else if (grade <= 77)
        {
            System.out.println("C");
        }
        else if (grade <= 79)
        {
            System.out.println("C+");
        }
        else if (grade <= 82)
        {
            System.out.println("B-");
        }
        else if (grade <= 87)
        {
            System.out.println("B");
        }
        else if (grade <= 89)
        {
            System.out.println("B+");
        }
        else if (grade <= 92)
        {
            System.out.println("A-");
        }
        else if (grade <=97)
        {
            System.out.println("A");
        }
        else if (grade <=100)
        {
            System.out.println("A+");
        }
    }
}
