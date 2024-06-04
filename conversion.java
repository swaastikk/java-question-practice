//convertion program 
import java.util.Scanner;
public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Convertion of KM to Miles");

        System.out.println("Enter the KM =");
        float a = sc.nextFloat();
        
        Double Miles = a * 0.621321;
        System.out.println("Miles = "+Miles);
    }
}
