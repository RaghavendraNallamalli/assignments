import java.util.Scanner;
class divison  {
    public static void solve() throws UnsupportedOperationException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            int a = scanner.nextInt();
            System.out.println("Enter a number:");
            int b = scanner.nextInt();
            if (b == 0) {
                throw new UnsupportedOperationException("Invalid operation for Division by Zero");
            }
            int result = a / b;
            System.out.println("Result is:" + result);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
public class Q2 {

    public static void main(String[] args)  {
        divison.solve();
    }

}