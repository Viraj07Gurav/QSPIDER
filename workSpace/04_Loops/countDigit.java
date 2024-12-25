class countDigit
{
    public static  int finddigit(int a)
    {
        int res=0;
        for(int i=a;i!=0;i=a/10)
        {
         res++;
           

        }
        return res;

    }
    public static void main(String [] args)
    {
        System.out.println(finddigit(1234));
    }
}