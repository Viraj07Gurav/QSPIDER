public class BinaryTodeci {
    
public static int pow(int base, int exponant)
{   int res=1;
    for(int i=1;i<=exponant;i++)
    {
         res*=base;
    }
    return res;
}
public static int count(int num)
{
   int count=0;
    while(num!=0)
    {
        num/=10;
        count++;
      
    }
    return count;
}
public static int deci(int num)
{
    int result=0;
    int cnt=count(num);
   
        while(num!=0)
        {
            for(int i=0;i<cnt;i++)
            {
            result+=(num%10)*pow(2,i);
            num/=10;
        }
    }        
    return result;
}
public static void main(String[] args) {
    System.out.println(deci(1010));
}
}
