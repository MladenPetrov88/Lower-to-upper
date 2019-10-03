
import java.util.Scanner;

public class LowerToUpper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        if (input.equals(input.toLowerCase())) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }

    }
}
