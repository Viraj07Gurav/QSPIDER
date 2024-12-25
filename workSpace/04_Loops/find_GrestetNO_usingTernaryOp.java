class find_GrestetNO_usingTernaryOp
{
    public static int oldest(int a,int b,int c)
    {
        int d=(a>b)?(a>c?a:b):(b>c?b:c);
        if(d==a)
        {
            System.out.println("alex id oldest: "+d);
        }
        if(d==b)
        {
            System.out.println("bob id oldest: "+d);
        }
        else
        {
            System.out.println("park is oldest: "+c);
        }
        return 1;
    }
    public static void main(String[] args)
    {
        oldest(20,40,50);
    }
}