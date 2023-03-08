import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value: "); //EX:2
        int base = sc.nextInt();
        System.out.println("Enter the exponent value: ");//EX:3  2^3=8
        int exp = sc.nextInt();
        long result = 1;
        System.out.print(base+ " raised to the power "+ exp+" is: ");
        while (exp != 0)
        {
            result =result * base;
            --exp;
            System.out.println(exp);
        }
        System.out.println(result);
    }
}
