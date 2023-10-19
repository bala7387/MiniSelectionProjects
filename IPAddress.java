import java.util.Scanner;
public class IPAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first octet:");
        int octet1 = scan.nextInt();
        System.out.println("Please enter the second octet:");
        int octet2 = scan.nextInt();
        System.out.println("Please enter the third octet");
        int octet3 = scan.nextInt();
        System.out.println("Please enter the fourth octet");
        int octet4 = scan.nextInt();
        boolean correct1 = octet1 >= 0 && octet1 <= 255;
        boolean correct2 = octet2 >= 0 && octet2 <= 255;
        boolean correct3 = octet3 >= 0 && octet3 <= 255;
        boolean correct4 = octet4 >= 0 && octet4 <= 255;

        if (octet1 < 0 || octet1 > 255)
        {
            System.out.println("Octet 1 is incorrect");
        }
        if (octet2 < 0 || octet2 > 255)
        {
            System.out.println("Octet 2 is incorrect");
        }
        if (octet3 < 0 || octet3 > 255)
        {
            System.out.println("Octet 3 is incorrect");
        }
        if(octet4 < 0 || octet4 > 255)
        {
            System.out.println("Octet 4 is incorrect");
        }
        if(correct1 && correct2 && correct3 && correct4)
            System.out.println("IP Address: " + octet1 + "." + octet2 + "." + octet3 + "." + octet4);
    }
}




