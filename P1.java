//Taking input from the user
import java.util.Scanner;
public class P1 {
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);

         System.out.println("Taking the input from the user ");

         System.out.println("Enter the first number =");
         int a = sc.nextInt();
         System.out.println("Enter the second number =");
         int b = sc.nextInt();

         int sum = a+b;
         System.out.println("sum of both number = "+sum);
    }

}
