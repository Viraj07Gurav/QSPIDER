class find_lcm_anandSir
{
    public static int findlcm(int a, int b)
    {
        int lcm=0;
    
        int res=a>b?a:b;
        
        if(res==a)
        {
            int max=a;
            int min=b;
            {
                for(int i=1; ;i++)
                {
                   lcm=max*i;
                   if(lcm%min==0)
                   {
                    break;
                   } 
                }
            }
        }
        else
        {
            int max=b;
            int min=a;
            {
                for(int i=1; ;i++)
                {
                   lcm=max*i;
                   if(lcm%min==0)
                   {
                    break;
                   } 
                }
            }
        }
        return lcm;
    }
    public static void main(String[] args)
    {
        System.out.println(findlcm(100,120));
    }
}