import java.util.Scanner;

class prime
{
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        // if(n==2||n==3)
        // {
        //     return true;
        // }
        // if(n%2==0||n%3==0)
        // {
        //     return false;
        // }
       
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
    
      
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num");
        int num=sc.nextInt();
        System.out.println(isPrime(num));
    }
}
