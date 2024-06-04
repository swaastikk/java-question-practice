//ask user to inter the name and greet them with "hello<name> , have a good day "
import java.util.*;
public class roj3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of user = ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + ", have a good day");
    }
}
