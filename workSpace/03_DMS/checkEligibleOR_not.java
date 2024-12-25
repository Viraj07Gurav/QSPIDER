class checkEligibleOR_not
{
    public static String percentage(int a,int b)
    {
        String s=" ";
        double c=(a*100)/b;
        System.out.println(c);
        if(c>=75)
        {
            System.out.println("eligible");
        }
        else
        {
            System.out.println("not eligible");
        }
        return s;
    }
    public static void main(String[] args)
    {
        percentage(75,100);
    }
}