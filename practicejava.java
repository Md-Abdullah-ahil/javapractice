import java.util.Scanner;

public class practicejava {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M value");
        int m = sc.nextInt();

        if (m % 3 == 0 && m % 5 == 0) {
            System.out.println("Good Number");

        } else if (m % 3 == 0 && m % 5 != 0) {
            System.out.println("Bad Numbers");

        } else if (m % 5 == 0 && m % 3 != 0) {
            System.out.println("Poor Number");

        } else {
            System.out.println("-1");
        }
    }
}