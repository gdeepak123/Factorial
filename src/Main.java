import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Given number:");
        int number = sc.nextInt();
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial =factorial  *i;

        }
        System.out.println("the factorial of a given number is:" + factorial);
    }
}