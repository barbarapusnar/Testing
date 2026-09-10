public class Vaja1
{
    public static void main(String[] args) {
        System.out.println("2 na 10 = "+potenca(10));
        System.out.println("7 Fibb število je "+fib(7));
        System.out.println("6 člen naloga 1 je "+naloga1(6));
    }
    public static int naloga1(int n)
    {
    // a1 = 2 a2 = 2  
    // a(n) = a (n-2)*a( n-1) – 1 
        if (n==1)
            return 2;
        if (n==2)
            return 2;
        return naloga1(n-2)*naloga1(n-1) -1;
    }
    public static  int potenca(int n)
    {
        //izračuna 2 na n rekurzivno
        if (n==0)
            return 1;
        return 2*potenca(n-1);
    }
    public static int fib(int n)
    {
        //izračuna n-to fibonaccijevo število
        if (n==1||n==2)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}