import java.util.*;
public class PrimeNum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num,i,sum=0;
        boolean isPrime = false;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number : ");
        num=sc.nextInt();

        i=1;
        while(i<=num/2)
        {
            if(num%i==0)
            {
                isPrime = false;
                break;
            }
        }i++;
        if(isPrime)
        {
            System.out.println(+num+" is a Prime number");
        }
        else
        {
            System.out.println(+num+" is a not a Prime number");
        }
    }

}
