class IncrementDecrement

{
    public static void main(String [] args)
    {
        System.out.println("hello world");
        int a=12;
        int b=--a + a++ + ++a;
        int c=--a - --b + ++b - ++a;
        a=++b - --c - b++ + c++ - --b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}