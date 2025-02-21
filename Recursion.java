import java.util.Scanner;
public class Recursion
{
    public static void main(String[]args)
    {

    }
}
//factorial of the given number
class Rec1 
{
    static int met(int n)
    {
        if(n>0)
        {
            return n * met(n-1);
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        System.out.println(met(n));
    }
}
//Sum from 1 to N
class Rec2
{
    static int met(int n)
    {
        if(n>=1)
        {
            return n+met(n-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = java.nextInt();
        System.out.println("The sum of all number from 1 to "+ n + ": " + +met(n));
    }
}
//fibonacci series
class Rec4
{
static int met(int f, int s, int n)
{
    if(n<=0)
        return f;
    
    else
    {
        f=s-f;
        s=f+s;
        System.out.println(f);
        return met(f, s, n-1);
    }
    
}
    public static void main(String[]args)
    {
        int f = 1, s = 1;
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the term: ");
        int n = java.nextInt();
        met(f,s,n);
    }

}
//To check whether the given string is palindrome using recursion
class Rec5
{
    static boolean met(String m, int start, int end)
    {
        if(start>=end)
        {
            return true;
        }
        if(m.charAt(start)!=m.charAt(end))
            {
                return false;
            }
        
        return met(m, start + 1, end -1);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String m = java.nextLine();
        if(met(m, 0, m.length()-1)==true)
        {
            System.out.println("The given string is a palindrome ");
        }
        else{
            System.out.println("The given is not an palindrome");
        }
    }
}
//Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).
class Rec6
{
    static int met(int num, int exp)
    {
        if(exp==0)
        {
            return 1;
        }
        return num * met(num, exp-1);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int m = java.nextInt();
        System.out.println("Enter the exponentiation: ");
        int n = java.nextInt();
        System.out.println("The "+n+" power of "+m+" is: "+ met(m,n));
    }
}
//Write a Java recursive method to reverse a given string.
class Rec7
{
    static String met(String n, int m)
    {
        if(m<0)
        {
            return "";
        }
        return (n.charAt(m) + met(n, m-1));
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String n = java.nextLine();
        int m = n.length()-1;
        System.out.println(met(n,m));
        
    }
}
//Write a Java recursive method to find the greatest common divisor (GCD) of two numbers.
class Rec8
{
    static int met(int n1, int n2, int min)
    {
        if(n1%min==0 && n2%min==0)
        return min;
        return met(n1,n2,--min);

    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int n1 = java.nextInt();
        int n2 = java.nextInt();
        int min = n1<n2?n1:n2;
        System.out.println("The GCD of the given numbers: "+ met(n1, n2, min));
    }
}
//Write a Java recursive method to find the greatest common divisor (GCD) of two numbers using EUCLIDS ALGORITHM.
class Rec9
{
    static int met(int n1, int n2)
    {
        if(n2 == 0)
        return n1;
        return met(n2, n1%n2);   
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int n1 = java.nextInt();
        int n2 = java.nextInt();
        System.out.println("The GCD of the given numbers: "+ met(n1, n2));
    }
}
//Write a Java recursive method to count the number of occurrences of a specific element in an array.
class Rec10
{
    static int met(int arr[], int n, int count, int m)
    {
        if(n<0)
        return count;
        if(arr[n]==m)
        count++;
        return met(arr, n-1, count, m);
    }
    public static void main(String[]args)
    {
        int count = 0;
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = java.nextInt();
        System.out.println("Enter the values for the array: ");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = java.nextInt();
        }
        System.out.println("Enter the value to check: ");
        int m = java.nextInt();
        System.out.println("The number "+ m +" is occuring "+ met(arr, n-1, count, m)+" times..");
    }
}
//Write a Java recursive method to find the sum of all odd numbers in an array.
class Rec11
{
    static int met(int arr[], int n)
    {
        int sum=0;
        if(n<0)
        return sum;
        if(arr[n]%2!=0)
        sum = arr[n];
        return sum + met(arr, n-1);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = java.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the values for the array: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = java.nextInt();
        }
        System.out.println("The sum of the odd numbers in the array :"+ met(arr, n-1));
    }
}
//Write a Java recursive method to find the length of a given string.
class Rec12
{
    static int met(String n, int len, int count)
    {
        if(len < 0)
        return count;
        else
        count++;
        return met(n, len - 1, count);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String n = java.nextLine();
        System.out.println("The length of the given string: "+ met(n, n.length()-1, 0));
    }
}
//Write a Java recursive method to calculate the product of all numbers in an array.
class Rec13
{
    static int met(int[] arr, int n)
    {
        int res = 1;
        if(n<0)
        return res;
        res = arr[n];
        return res*met(arr, n-1);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = java.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter the values for the array: ");
        for(int i = 0;i<n;i++)
        {
            arr[i]=java.nextInt();
        }
        System.out.println("The product of all the elements in the given array: "+ met(arr, n-1));
    }
}
//Write a Java recursive method to find the sum of the digits of a given integer.
class Rec14
{
    static int met(int n)
    {
        if (n==0)
        return 0;
        return n%10 + met(n/10); 
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int n = java.nextInt();
        System.out.println("The sum of the digits of the given integer: "+ met(n));
    }
}
//Write a Java recursive method to find the maximum element in an array.
class Rec15
{
    static int met(int[]arr, int n)
    {
        if(n==0)
        return arr[0];
        int max = met(arr, n-1);
        return arr[n]> max?arr[n]:max;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = java.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values for the array:");
        for(int i = 0;i<n;i++)
        {
            arr[i]=java.nextInt();
        }
        System.out.println("The maximum element in the given array: "+ met(arr, n-1));
    }
}
//Write a Java recursive method to check if a given array is sorted in ascending order
class Rec16
{
    static boolean met(int[] arr, int n)
    {
        if(n==0)
            return true;
        if(arr[n]<arr[n-1])
            return false;
        return met(arr, n-1);
    }
    public static void main(String[] args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = java.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values in the array: ");
        for(int i = 0;i<n;i++)
        {
            arr[i]=java.nextInt();
        }
        if(met(arr, n-1) != false)
        {
            System.out.println("The given array is sorted..");
        }
        else{
            System.out.println("The given array is not sorted..");
        }
    }
}
class Rec17 {
    static boolean met(int[] arr, int n) {
        if (n == 0) // Base case: a single element or empty array is sorted
            return true;
        if (arr[n] < arr[n - 1]) // If any pair is out of order
            return false;
        return met(arr, n - 1); // Recursive call for the remaining array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Renamed for clarity
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the values in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (met(arr, n - 1)) {
            System.out.println("The given array is sorted.");
        } else {
            System.out.println("The given array is not sorted.");
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
