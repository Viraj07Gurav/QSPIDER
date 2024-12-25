import java.util.*;
class countNum
{
    public static void count()
    {
        Scanner sc=new Scanner(System.in);
        int p_cnt=0;
        int n_cnt=0;
        int z_cnt=0;
        int num;
        do{
            System.out.println("enter any number. 0 for stop:");
            num=sc.nextInt();
            if(num>0)
            {
                p_cnt++;
            }
            else if(num<0)
            {
                n_cnt++;
            }
            else
            {
                z_cnt++;
            }
        }while(num!=0);
        
    
        
        System.out.println("POSITIVE NUM: "+p_cnt);
        System.out.println("POSITIVE NUM: "+n_cnt);
        System.out.println("POSITIVE NUM: "+z_cnt);
    }

    public static void main(String[] args)
    {
        count();
    }
}