import java.util.Scanner;

public class PP6Q2 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int i=1;
        while(i <= n/2)
        {
            if(n%i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        if(sum==n)
        {
            System.out.println(n+" is a perfect number.");
        }
        else
            System.out.println(n+" is not a perfect number.");
    }
}
