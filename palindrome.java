import java.nio.ReadOnlyBufferException;
import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = sc.nextInt();
        int temp, rev = 0, digit;
        temp = num;
        while (temp > 0) {
            digit = temp % 10;
            rev = (rev * 10) + digit;
            temp = temp / 10;
        }
        if (rev == num) {
            System.out.println("yes " + num + " is palindrome");
        } else {
            System.out.println("NO " + num + " is not palindrome ");
        }
    }
}