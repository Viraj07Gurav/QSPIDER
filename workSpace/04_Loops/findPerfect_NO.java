class findPerfect_NO
{
    public static void perfect(int var0) {
        int var1 = var0;
        int var2 = 0;
  
        for(int var3 = 1; var3 <= var1 / 2; ++var3) {
           if (var1 % var3 == 0) {
              var2 += var3;
           }
        }
  
        System.out.println("perfect num" + var2);
        if (var2 == var0) {
           System.out.println("perfect num");
        }
  
     }
  
     public static void main(String[] var0) {
        perfect(28);
     }
     
}