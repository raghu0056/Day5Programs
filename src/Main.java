import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Example program for lep year or not ");

        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        }
        else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        }
        else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
