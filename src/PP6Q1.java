import java.util.Scanner;

public class PP6Q1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till you wanna get fibonassi number = ");
        int n = sc.nextInt();
        System.out.print("(" + a + ")");
        System.out.print("(" + b + ")");
        for (int i = 2; i <= n - 1; i++) {
            int fib = (b * (a + b));
            System.out.print("(");
            System.out.print(fib);
            System.out.print(")");
            a = b;
            b = fib;
        }
    }
}
