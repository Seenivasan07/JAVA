import java.util.Scanner;
public class Forwhi
{
    public static void main(String[]args)
    {

    }
}
/* program to print numbers from 1 to 10 using a for loop.*/
class For1
{
    public static void main(String[] args) {
    {
        for (int i = 1; i<=10; i++)
        {
            System.out.println(i);
        }
    }
}
}
/*2.Print all even numbers from 1 to 50.*/
class For2
{
    public static void main(String[] args) 
    {
        for (int i=1; i<=50; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }

        }
    }
}
/*  Calculate and print the sum of the first N natural numbers. */
class For3
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any natural number: ");
        int n = java.nextInt();
        int i, count = 0;
        for(i=0; i<=n;i++)
        {
            count = count + i;
        }
        System.out.println("The sum of the given natural number is: "+count);
    }
}
/* Compute the factorial of a given number using a for loop.*/
class For4
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any positivenumber: ");
        int n = java.nextInt();
        int i, fact = 1;
        for(i=1; i<=n;i++)
        {
            fact = fact * i;
        }
        System.out.println("The factorial of the given number is: "+fact);
    }
}/*5.Print the multiplication table for a given number. */
class For5
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the table number: ");
        int t = java.nextInt();
        System.out.println("Enter the number till you want the table: ");
        int n = java.nextInt();
        int m = 10;
        int i=1;
        for (i=1; i<=n; i++)
        {
            System.out.println(t + "x" + i + "=" + i*t);
        }
        while(i<=m)
        {
            System.out.println(t + "x" + i + "=" + i*t);
            i++;
        }
    }
}
/*  Print numbers from 100 to 1 in descending order.*/
class For6
{
    public static void main(String[] args) 
    {
        int count = 1;
        for (int i = 100; i>=0;i--)
        {
        System.out.print(i+ " ");
           if(count==10)
           {
            System.out.print("\n");
            count=0;
           }
           count++;
           }
        
    }
    }
/* 7.Fibonacci Series (First N terms): Generate the first N terms of the Fibonacci sequence.*/
class For71
{
    public static void main(String[] args) 
    {
        int count = 1;
        for (int i = 0; i<20; i=i+count)
        {
            System.out.println(i);
            System.out.println(count = count + i);
        }
    }
}
/*7.Fibonacci Series (First N terms): Generate the first N terms of the Fibonacci sequence. */
class For72
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n term: ");
        int n = java.nextInt();
        int result = 0, count = 1;
        System.out.println(result);
        System.out.println(count);
        for (int i=1; i<=n;i++)
        {
            System.out.println(result = result + count);
            System.out.println(count = count + result);
        }
    }
}
class For73
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n term: ");
        int n = java.nextInt();
        int a = 0, b= 1, res;
        System.out.println(a);
        System.out.println(b);
        for (int i=3; i<=n;i++)
        {
            System.out.println(res = a + b);
            a = b;
            b = res;
        }
    }
}
/*  Compute the sum of digits of a given number using loops. */
class For8
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        int sum = 0;
        for(;n>0;)                  //for(;n>0;n/=10)
        {
            sum = sum + n%10;
            n = n/10;
        }
        System.out.println("sum of the given number: " + sum);
    }
}
/*Determine if a given number is prime using a loop.*/
class For9
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt(); 
        int i;
        for(i=2; i<n; i++)
        {
            if (n%i==0)
                {
                    i=0;
                    break;
                }
        }
        if(i==0)
        {
            System.out.println("The given number "+n+" is not a prime number");
        }
        else
        {
            System.out.println("The given number "+n+" is a prime number");
        }
    }
}

/*10.Print a pattern such as:
*
**
***
****
*/
class For10
{
    public static void main(String[] args) 
    {
        int n = 4;
        for(int i=0; i<n;i++)
        {
            for (int j=0;j<(i+1);j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
/*Palindrome Number: Check whether a given number is a palindrome using a loop*/
class For11
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        int p = n;
        int sum = 0;
        for(;n>0;)
        {
           sum = sum*10 + n%10;
           n=n/10;
        }
        if(sum==p)
        {
         System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
    }
}
//Armstrong number
class For12
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        int org = n, temp, arms = 0;
        for(;n>0;n/=10)
        {
            temp = n % 10;
            arms = temp*temp*temp + arms;//Math.pow(temp,3)
        }
        if(arms==org)
        {
            System.out.println("The number "+org+" is an armstrong number");
        }
        else{
            System.out.println("The number "+org+" is not an armstrong number");
        }
    }
}
//LCM & GCD Calculation: Compute the Least Common Multiple (LCM) and Greatest Common Divisor (GCD) of two numbers.
class For13
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter two positive numbers : ");
        int i = java.nextInt();
        int j = java.nextInt();
        int a = i, b = j;
        for(;a!=b;)
        {
            if(a>b)
            { a = a-b; }
            if(b>a)
            { b = b - a; }
            if(a==0)
            { System.out.println("The HCF for the given numbers are: "+b); break; }
            if(b==0)
            { System.out.println("The HCF for the given numbers are: "+a); break;}
        }
        if(a==b)
        {System.out.println("The HCF for the given numbers are: "+a);}
        int max = i>j?i:j;         //we can also find lcm by using the formula : n1 * n2 / hcf
        for(;;max++)
        {
            if ((max%i==0)&&(max%j==0)) 
            {
                System.out.println("The LCM of the given numbers are: "+max);   
                break;
            }
        }
    }
}
//reverse and print the given number........
class For14
{
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = java.nextInt();
        int sum = 0;
        for(;n>0;n/=10)
        {
            sum=sum*10 + n%10;
        } 
        System.out.println("The reversed number of the given: "+sum); 
    }
}
//15.Number to Binary Conversion: Convert a decimal number to binary using loops.
class For15
{
    public static void main(String[] args) {
        String bin = "";
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any Decimal number: ");
        int d = java.nextInt();
        int rem;
        for(;d>0;)
        {
            rem = d%2;
            bin = rem + bin;
            d = d/2;
        }
        System.out.println("The Binary number for the given decimal is: "+bin);
    }
}
//16.Star Pyramid: Create a full pyramid pattern using nested loops.
class For16
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = java.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n+i;j++)
            {
                if(j<(n-i-1))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
//17.Floyd’s Triangle: Print Floyd’s triangle using a for loop.
class For17
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = java.nextInt();
        int count = 1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<(i+1);j++)
            {
                System.out.print(count++ +" ");
            }
            System.out.println("");
        }
    }
}
class For18
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        int sum = 2;
        for(int i=3;i<=n;i++)
        {
            for(int j=2;j<i;j++)
            {
               if(i%j==0)
               {
                break;
               }
               else {
                sum = sum + i;
                break;
               }
            }
        }  
        System.out.println("The sum of the  prime numbers is: "+ sum);  
    }
}
class For19
{
    public static void main(String[] args) {
        int n = 5;
        int i=1;
        int j=0;
        while(i < n)
        {
            while (j<i)
            {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println("");
        }
        
    }
}
class Hexdec
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any decimal number: ");
        int n = java.nextInt();
        char dec;
        String hex = "";
        int rem;
        while(n>0)
        {
            rem = n%16;
            if(rem<10)
            {
                dec = (char)('0'+rem);
            }
            else
            {
                dec = (char)('A'+(rem-10));
            }
            hex = dec + hex;
            n = n/16;
        }
        System.out.println("The Hexadecimal value of the given decimal is: "+ hex);
    }
}
class Ex
{
    public static void main(String[] args) {
        int a = 10;
        System.out.println((char)a);
    }
}



