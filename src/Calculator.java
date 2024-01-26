import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        float a, b, res;
        char select, ch;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first and second number: ");
        a = scan.nextFloat();
        b = scan.nextFloat();
        System.out.print("\nEnter your selection: 1 for Addition, 2 for Subtraction, 3 for Multiplication, and 4 for Division: ");
        select = scan.next().charAt(0);
        switch(select) {
            case '1':
                res = a + b;
                System.out.println("\nResult = " + res);
                break;
            case '2':
                res = a - b;
                System.out.println("\nResult = " + res);
                break;
            case '3':
                res = a * b;
                System.out.println("\nResult = " + res);
                break;
            case '4':
                res = a / b;
                boolean b1 = b != 0;
                if(b!= 0);
                else {
                System.out.println("Division not possible by zero");
            }
                System.out.println("\nResult = " + res);
                break;
            default:
                System.out.println("\nInvalid selection. Please try again.");
                break;
        }
    }
}
