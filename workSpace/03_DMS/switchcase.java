class switchcase
{
    public static void main(String[] args)
    {
        String s="july";
        switch(s)
        {
            case "jan":
            System.out.println("January");
            break;
            case "feb":
            System.out.println("second month of year");
            break;
            case "mar":
            System.out.println("Third month of the year");
            break;
            case "apr":
            System.out.println("4th month of the year");
            break;
            case "may":
            System.out.println("5th month of the year");
            break; 
            default:
            System.out.println("invalid");
            break;
        }
    
    }
}