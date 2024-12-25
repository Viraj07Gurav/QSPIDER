class sample {
    // static int x=10;
    int x=10;
    // static void access()
    void access()
    {
        System.out.println(x);
    }
    

// }
// public class innersample {
    public static void main(String[] args)
    {
        sample s1=new sample();
        sample s2=new sample();
        ++s1.x;
        System.out.println("dispalay x");
        s1.access();

        System.out.println("dispalay x");
        s2.access();
    }

    
}
