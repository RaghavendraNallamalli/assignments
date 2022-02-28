import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            int a = scanner.nextInt();
            System.out.println("Enter a number:");
            int b = scanner.nextInt();
            int result = a/b;
            System.out.println("Result:"+result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}