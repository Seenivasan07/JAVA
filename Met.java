import java.util.Scanner;
public class Met 
{
    public static void main(String[] args)
    {

    }
}
class Met1
{
    static void Swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: a = "+a+", b = "+b);
    }
    public static void main(String[] args)
    {
        int a = 10, b = 20;
        System.out.println("After Swapping: a = "+a+", b = "+b);
        Swap(a, b);

    }
}
class Met2
{
    static boolean Prime(int a)
    {
        int count = 0;
        if(a<=1)
        {
            return false;
        }
        else {
        for(int i=2; i<a;i++)
        {
            if(a%i==0)
            {
              return false;
            }
        }
    }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = java.nextInt();
        if(Prime(a)==true)
        {
            System.out.println("The given number is a Prime");
        }
        else{
            System.out.println("The given number is not a Prime");
        }
    }
}