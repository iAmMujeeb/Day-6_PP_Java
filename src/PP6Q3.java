import java.util.Scanner;

public class PP6Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number = ");
        int n = sc.nextInt();
        int temp = 0;
        switch (n) {
            case 0:
                System.out.println("Not a Prime Number");
                break;
            case 1:
                System.out.println("Not a Prime Number");
                break;
            case 2:
                System.out.println("Prime Number");
                temp=3;
                break;
        }
        for (int i = 3; i <= n; i++) {
            if ((i == n) && (n % i == 0)&&(n%2!=0))
                temp = 1;
        }
        if(temp==1)
            System.out.println("Prime Number");
        else if (temp==0) {
            System.out.println("Not a Prime Number");
        }
    }
}