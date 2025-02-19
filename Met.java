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
class Met3
{
    static String met(String str)
    {
        char a = str.charAt(0);
        char b = str.charAt(str.length()-1);
        return b + str.substring(1,(str.length()-1)) + a;
    }
    public static void main(String[]args)
    {
        String str = "java";
        System.out.println(met(str));
    }
}
class Met4
{
static boolean met(String str) 
  {
    if(str.length()>1)
    {
      if (str.substring(0,2).equals("hi"))
      return true;
    }
    return false;
  }
  public static void main(String[]args)
  {
    Scanner java = new Scanner(System.in);
    System.out.println("Enter any text: ");
    String str = java.nextLine();
    System.out.println(met(str));
  }
}
class Met5
{
     static boolean met(String str) {
        int count=1;
        if(str.length()>1)
        {
          for(int i = 0;i<str.length();i++)
          {
            if(str.charAt(i)=='e')
            {
              count++;
            }
          }
        }
        if(count>=1 && count<=3)
        {
          return true;
        }
        return false;
      }
      public static void main(String[]args)
      {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = java.nextLine();
        System.out.println(met(str));
      }
}