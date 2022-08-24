
import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n, ft=0, sect=1, sum, nextt = 0,i ;
        System.out.println("Enter number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();

        System.out.println("Fibonacci series till " +n+ " are :");

        for(i=0; i<n; i++)
        {
            sum = ft+sect;
            System.out.println(" "+sum);
            ft=sect;
            sect=sum;
        }
    }
}
