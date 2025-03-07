import java.util.Scanner;
public class Methodtest
{
    public static void main(String[]args)
    {

    }
}
//Factorial..
class Met1
{
    static int met(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n * met(n-1);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        System.out.println(met(n));
    }
}
// Tocheck whether the given number is prime or nott...
class Met2
{
    static int met(int n, int m)
    {
        int count = 0;
        if(m==0)
        {
            return 0;
        }
        if(n%m==0)
        {
            count ++;
        }
        return count + met(n, m-1);
    }
    
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number which should be greater than 1: ");
        int n = java.nextInt();
        if(n==2)
        {
            System.out.println("The given number is the prime number");
        }
        else if(met(n, n) <= 2)
        {
            System.out.println("The given number is the prime number");
        }
        else{
            System.out.println("The given number is not the prime number");
        }
    }
}
// To print the FIBONACCI SERIES...
class Met3
{
    static int met(int f, int s, int n)
    {
        if(n<=0)
        {
            return f;
        }
        else
        {
        f = s - f;
        s = s + f;
        System.out.println(f);
        return met(f, s, n-1);
        }
        
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the fibonacci series: ");
        int n = java.nextInt();
        met(1,1,n);
    }
}
//Sum of the given digits..
class Met4
{
    static int met(int n, int num)
    {
        if(n>0)
        {
            num = num + n%10;
        }
        else
        {  
            return num;
        }
        return met(n/10, num);

    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any value: ");
        int n = java.nextInt();
        System.out.println("The sum of the given digits: "+ met(n, 0));
    }
}
//To check whether the given string is palindrome or not
class Met5
{
    static boolean met(String str, int start, int end)
    {
        if(start>=end)
        {
            return true;
        }
        if(str.charAt(start)!=str.charAt(end))
        {
           return false; 
        }
        return met(str, start+1, end - 1);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any string to check: ");
        String str = java.nextLine();
        if (met(str, 0, str.length()-1) == true)
        {
            System.out.println("The given string is palindrome");
        }
        else
        {
            System.out.println("The given string is not a palindrome");
        }
    }
}
//To find the GCD(Greatest Common Divisor) and LCM (Least Common Multiple)
class Met6
{
    static int met(int n1, int n2)
    {
        if(n2==0)
        return n1;
        return met(n2, n1%n2);
    }
    static int met1(int n1, int n2, int max)
    {
        if((max % n1 == 0) && (max % n2 == 0))
        return max;
        return met1(n1, n2, ++max);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter value for n1 and n2: ");
        int n1 = java.nextInt();
        int n2 = java.nextInt();
        int max = n1>n2?n1:n2;
        System.out.println("The GCD of the given two numbers: "+ met(n1, n2));
        System.out.println("The LCM of the given two numbers: "+ met1(n1, n2, max));
    }
}
//To find the given number is Armstrong Number checker..
class Met7
{
    static int met(int n, int size)
    {
        if(n==0)
        {
            return 0;
        }
        int arm = n%10;
        return (int)Math.pow(arm, size) + met(n/10, size);

    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = java.nextInt();
        int m = n, length = 0;
        while(n>0)
        {
            n = n/10;
            length++;
        }
        if(met(m, length) == m)
        {
            System.out.println(m + " is an Armstrong Number..");
        }
        else
        {
            System.out.println(m + " is not an Armstrong Number..");
        }
    }
}
//Factor Count..
class Met8
{
    static int met(int n, int m)
    {
        int count = 0;
        if(m==0)
        {
            return 0;
        }
        if(n%m==0)
        {
            count = 1;
        }
        return count + met(n, m-1);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = java.nextInt();
        System.out.println("The Number of factors for the given number: " + met(n, n));
    }
}
////Perfect Number..
class Met9
{
    static int met(int n, int m)
    {
        if(m==0)
        {
            return 0;
        }
        if(n%m==0)
        {
            return m + met(n,m-1);
        }
        return met(n, m-1);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = java.nextInt();
        if(met(n, n/2) == n)
        {
            System.out.println("The given number "+ n +" is a Perfect Number..");
        }
        else{
            System.out.println("The given number "+ n +" is not a Perfect Number..");
        }
    }
}
//Power Function
class Met10
{
    static int met(int n, int m)
    {
        return (int)Math.pow(n, m);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the base value: ");
        int n = java.nextInt();
        System.out.println("Enter the exponent value: ");
        int m = java.nextInt();
        System.out.println("Value after get powered: "+ met(n, m));
    }
}
//Digit Reverser
class Met11
{
    static String met(int n)
    {
        String str = "";
        if(n==0)
        {
            return "";
        }
        if(n>0)
        {
            int m = n%10;
            str = str + m;
        }
        return str + met(n/10);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = java.nextInt();
        System.out.println("The Reversed value of the given: "+ met(n));
    }
}
//Digit Reverser without using string...
class Met12
{
    static int met(int n, int m)
    {
        if(n==0)
        {
            return m;
        }
        if(n>0)
        {
            m = m*10 + n%10;
        }
        return met(n/10, m);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = java.nextInt();
        System.out.println("The Reversed value of the given: "+ met(n, 0));
    }
}