
import java.util.Scanner;

class findTheGreastestNo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        System.out.println("enter c");
        int c=sc.nextInt();
        // if(a>b&&a>c)
        // {
        //     System.out.println("a is greater");

        // }
        // else if(b>a&&b>c)
        // {
        //     System.out.println("b is grater");
        // }
        // else{
        //     System.out.println("c greater");
        // }
        
      int greater=a>b?(a>c?a:c):(b>c?b:c);
      System.out.println(greater)  ;
    }
}