class mergeTwoNO
{
    public static int mer(int a,int b)

    
{
    int max=Math.max(a,b);
        int mergenum=0;
        int min=Math.min(a,b);
        int cnt=0;
        int pw=1;
        int res=0;
        int temp=b;
        while(temp!=0)
        {
            temp=temp/10;
            cnt++;
        }
    for(int i=1;i<=cnt;i++)
    {
        pw=pw*10;
    }
      //res=a*pw;
      mergenum=a*pw+b;

      return mergenum;
    }
    public static void main(String[] args)
    {
        System.out.println(mer(450,4500
        ));
    }
}