class sumofDigit{
    public static int demo1(int a)
    {
        int res=0;
        int res1=0;
        int temp=a;
        for(int i=1;i!=0 ;i/=10)
        {
        if(temp>0)
        {
             a=a%10;
            res=res+a;
        }
    }
    return res;
    
    }
    public static void main(String[] args)
    {
        System.out.println(demo1(111));
    }
}