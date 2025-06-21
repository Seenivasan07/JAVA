import java.util.*;

class Practset {
    public static void main(String[]args)
    {

    }
}
//1. To print the binary, octal, hexadecimal value of an integer..
class Prog1
{
   static void binary(int n)
   {
    String S = "";
    while(n!=0)
    {
        S = (n%2)+ S;
        n = n/2;
    }
    System.out.println("The Binary Value: "+ S);
   } 
   static void octal(int n)
   {
    String S = "";
    while(n!=0)
    {
        S = (n%8)+ S;
        n = n/8;
    }
    System.out.println("The Octal Value: "+ S);
   }
   static void hexdec(int n)
   {
    String S = "";
    String hex = "0123456789ABCDEF";
    while(n!=0)
    {
        S = hex.charAt(n%16)+ S;
        n = n/16;
    }
    System.out.println("The Hexadecimal Value: "+ S);
   }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any Integer: ");
        int n = java.nextInt();
        binary(n);
        octal(n);
        hexdec(n);
    }
}

//2. To find the circumference of the square;
class Prog2
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the side: ");
        int n = java.nextInt();
        System.out.println("The Area of the square: " + n*n);
        System.out.println("The Perimeter of the square: "+ 4*n);
    }
}

//3. To find the circumference of the rectangle;
class Prog3
{
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int l = java.nextInt();
        System.out.println("Enter the breadth: ");
        int b = java.nextInt();
        System.out.println("The Area of the Rectangle: "+ l*b);
        System.out.println("The Perimeter of the Rectangle: "+ 2*(l+b));
    }
}

//. To find the circumference of the cylinder;
class Prog4
{
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = java.nextInt();
        System.out.print("The circumference of the radius: "+ 2*3.14*r);
    }
}

//.To generate a division and addition table for the given number.
class Prog5
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        System.out.println("Enter the ending number: ");
        int m = java.nextInt();
        System.out.println("Addition Table for the given number: ");
        for(int i = 1;i<=m;i++)
        {
            System.out.println(n +" + "+ i +" = "+ (n+i));
        }
        System.out.println("Division Table for the given number: ");
        for(int i = 1;i<=m;i++)
        {
            System.out.println(n + " / "+ i +" = "+ (n/i));
        }
    }
}

//Program to print the ASCII Value of all Alphabets
class Prog6
{
    public static void main(String[]args)
    {
        System.out.println("For UpperCase Letters: ");
        for(char ch = 'A';ch<='Z';ch++)
        {
            System.out.println(ch + " -> " + (ch + 0));
        }
        System.out.println("");
        System.out.println("For LowerCase Letters: ");
        for(char ch = 'a';ch<='z';ch++)
        {
            System.out.println(ch + " -> " + (ch + 0));
        }
    }
}

//Program To compute quotient and remainder of a given number
class Prog7
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the Dividend value: ");
        int dvd = java.nextInt();
        System.out.println("Enter the Divisor: ");
        int dvs = java.nextInt();
        System.out.println("The Quotient: " + (dvd/dvs));
        System.out.println("The Remainder: "+ (dvd%dvs));
    }
}

//Program to demonstrate the working of keyword long and double
class Prog8
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        long l = 78467937394L;
        double f = 56.468363648484;
        System.out.println("The Long value: "+ l);
        System.out.println("The Double value: "+ f);
    }
}

//Program to swap two numbers
class Prog9
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a = java.nextInt();
        System.out.println("Enter the value of B: ");
        int b = java.nextInt();
        int temp = a;
        a = b;
        b = temp;
        /*without using temp

        1. ARITHMETIC METHOD:
        a = a+b;
        b = a-b;
        a = a-b;

        2. XOR METHOD
        a= a^b;
        b= a^b;
        a= a^b;*/
        System.out.println("The value of a: "+ a);
        System.out.println("The value of b: "+ b);
    }
}

//Program to find a given number is odd or even
class Prog10
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any number to check odd or even: ");
        int val = java.nextInt();
        System.out.println("The given no is: "+ (val%2==0?"even":"odd"));
    }
}

//Program to check whether a character is a vowel or consonant
class Prog11
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch = java.next().charAt(0);
        if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'|ch == 'u')
        {
            System.out.println("The given is vowel...");
        }
        else{
            System.out.println("The given is consonant");
        }
    }
}

//Program to find the largest number among four numbers
class Prog12
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        int a=90, b=100, c=200, d=40;
        a = a>b?a:b;
        c = c>d?c:d;
        System.out.println("The largest number: "+ (a>c?a:c));
    }
}

//Program to find the roots of a quadratic equation
class Prog13
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        double a = 2, b =5, c = -3;
        double d = b*b - 4*a*c;
        System.out.println(d);
        if(d>0)
        {
            System.out.println((-b+Math.sqrt(d))/(2*a));
            System.out.println((-b-Math.sqrt(d))/(2*a));
        } 
        else if(d==0)
        {
            System.out.println(-b/(2*a));
        }
        else
        {
            System.out.println(-b/(2*a));
            System.out.println(Math.sqrt(-d)/(2*a));
        }
    }
}

//Program to check whether a number is positive or negative
class Prog14
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        int n = java.nextInt();
        if(n==0)
        {
            System.out.println("zero");
        }
        else{
        System.out.println((n>0?"Positive":"Negative"));
        }
    }
}

//To check whether a Character is an Alphabet or not
class Prog15
{
    public static void main(String[]args)
    {
    System.out.println("Enter any character: ");
    Scanner java = new Scanner(System.in);
    char ch = java.next().charAt(0);
    if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
    {
        System.out.println("The Given is Alphabet");
    }
    else
    {
        System.out.println("The given is not an Alphabet");
    }
}
}

//Program to calculate the sum of natural number and find the smallest digit of the sum.
class Prog16
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = java.nextInt();
        int sum = (n*(n+1))/2;
        System.out.println(sum);
        int res = Integer.MAX_VALUE;
        while(sum!=0)
        {
            res = Math.min(res, sum%10);
            sum = sum/10;
        }
        System.out.println(res);
    }
}

//to define the functionality of a conditional operators
class Prog17
{
    public static void main(String[]args)
    {
        int a = 10, b = 5;
        if(a%2==0 && b%2==0)
        {
            System.out.println("Both are even numbers");
        }
        if(a%2==0 || b%2==0)
        {
            System.out.println("Only one of the given in even");
        }
        System.out.println("The bigger no is: " + ((a>b)?"a":"b"));
    }
}

//Given the radius of two concentric circle, find the area of the space between the circles(annular region)
class Prog18
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the radius of the larger circle: ");
        int R = java.nextInt();
        System.out.println("Enter the radius of the smaller circle: ");
        int r = java.nextInt();
        System.out.println(Math.PI*((R*R)-(r*r)));
    }
}

//Program to solve the given expression
class Prog19
{
    public static void main(String[]args)
    {
        int a = 69, b= 2;
        System.out.println(++a - --b);
        a = 69; b= 2;
        System.out.println(a-- %b++);
        a = 69; b= 2;
        System.out.println(a*=b+=5);
        a = 69; b= 2;
        System.out.println(a>>>b);
    }
}

//Program to solve the given expression
class Prog20
{
    public static void main(String[]args)
    {
        int a = 28;
        System.out.println(a+=++a + ++a + --a + a++);
    }
}

//Program to solve the given expression
class Prog21
{
    public static void main(String[]args)
    {
        int x = 10;
        System.out.println("X = "+ (++x *2+3*--x));
    }
}

//Program to solve the given expression
class Prog22
{
    public static void main(String[]args)
    {
        int y = 10;
        System.out.println("Z = "+ (++y*(y++ + 5)));
    }
}

//Program to solve the given expression
class Prog24
{
    public static void main(String[]args)
    {
        int x = 10;
        System.out.println("x1 = "+ (++x - x++ + --x));
    }
}

//Program to demonstrate the functionalities of "FINAL" keyword
class Prog25
{
    public static void main(String[]args)
    {
        final int x = 10;
        System.out.println("x = "+x);
        //x = 15;(if we try to change it will through an error)
        System.out.println("x = "+x);
    }
}

//Program to print the repeated elements and and not repeated elemets by merging the two sorted arrays
//Array1: 2,4,5,6,7,9,10,13
//Array2: 2,3,4,5,6,7,8,9,11,15
class Prog26
{
    public static void main(String[]args)
    {
        int[]arr1 = {2,4,5,6,7,9,10,13};
        int[]arr2 = {2,3,4,5,6,7,8,9,11,15};
        Set<Integer>merge = new TreeSet<>();
        Set<Integer>dup = new TreeSet<>();
        for(int i : arr1)
        {
            merge.add(i);
        }
        for(int i:arr2)
        {
            if(merge.contains(i))
            {
                dup.add(i);
            }
            else
            {
                merge.add(i);
            }
        }
        System.out.println("Merged Array: "+merge);
        System.out.println("Duplicate Array: "+dup);
    }
}

//Program to right rotate the elements of a multidimensional array
class Prog27
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the 2D matrix for row and col: ");
        int row = java.nextInt();
        int col = java.nextInt();
        int[][]arr = new int[row][col];
        int[][]trans = new int[col][row];
        System.out.println("Enter the values: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = java.nextInt();
            }
        }
        System.out.println("After getting Transposed: ");
        for(int j = 0;j<col;j++)
        {
            for(int i = 0;i<row;i++)
            {
                trans[j][i] = arr[i][j];
                System.out.print(trans[j][i] + " ");
            }
            System.out.println("");
        }
        System.out.println("After getting rotation: ");
        for(int i = 0;i<trans.length;i++)
        {
            for(int j = 0, k = trans[i].length-1;j<k;j++,k--)
            {
                int temp = trans[i][j];
                trans[i][j] = trans[i][k];
                trans[i][k] = temp;
            }
        }
        for(int i = 0;i<trans.length;i++)
        {
            for(int j = 0;j<trans[i].length;j++)
            {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

//Program to print the repeated elements and and not repeated elemets by merging the two sorted arrays
//Array1: 2,4,5,6,7,9,10,13
//Array2: 2,3,4,5,6,7,8,9,11,15

class Prog28
{
    public static void main(String[] args) 
    {
        int[]nums = {2,1,3,7,5,6,4};
        int[]arr = new int[nums.length];
        int k = 0, i = 0, j = nums.length-1;
        Arrays.sort(nums);
        while(i<=j)
        {
            if(k%2==0)
            {
                arr[k++] = nums[i];
                i++;
            }
            else
            {
                arr[k++] = nums[j];
                j--;
            }
        }
        for(int s:arr)
        {
            System.out.print(s + " ");
        }
    }
}

//Program to Find Factorial of a Number and the factorial number,s reverse number...
class Prog29
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        int fact = 1;
        int rev = 0;
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        for(int i = 1;i<=n;i++)
        {
            fact = fact * i;
        }
        System.out.println("The factorial of the given no: "+ fact);
        while(fact>0)
        {
            rev = rev*10 + fact%10;
            fact/=10;
        }
        System.out.println("The factorial number reverse of the given no: "+ rev);
    }
}

//Program to find the sum of elements of an array present on even position
class Prog30
{
    public static void main(String[]args)
    {
        int[]arr = {2,1,3,7,5,6,4};
        int sum = 0;
        for(int i = 0;i<arr.length;i+=2)
        {
            sum+=arr[i];
        }
        System.out.println("The sum of the even position in an array: "+sum);
    }
}

//Program to find the sum of elements of an array present on odd position
class Prog31
{
    public static void main(String[]args)
    {
        int[]arr = {2,1,3,7,5,6,4};
        int sum = 0;
        for(int i = 1;i<arr.length;i+=2)
        {
            sum+=arr[i];
        }
        System.out.println("The sum of the odd position in an array: "+sum);
    }
}

//Program to print the 2 largest element in an array
class Prog32
{
    public static void main(String[]args)
    {
        int[]arr = {2,1,3,7,5,6,4};
        int max = Integer.MIN_VALUE, secmax = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
            max = Math.max(max, arr[i]);
        }
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]<max)
            {
                secmax = Math.max(secmax, arr[i]);
            }
        }
        System.out.println("The second largest no: "+secmax);
    }
}

//Program to print the 2 smallest element in an array
class Prog33
{
    public static void main(String[]args)
    {
        int[]arr = {2,1,3,7,5,6,4};
        int min = Integer.MAX_VALUE, secmin = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
            min = Math.min(min, arr[i]);
        }
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>min)
            {
                secmin = Math.min(secmin, arr[i]);
            }
        }
        System.out.println("The Second Smallest no is: "+ secmin);
    }
}

//Program to print the number of elements present in an array
class Prog34
{
    public static void main(String[]args)
    {
        int[]arr = {2,1,3,7,5,6,4};
        System.out.println("The no. of elements present in the given array: "+arr.length);
    }
}

//Program to copy all the elements of one array into another array
class Prog35
{
    public static void main(String[]args)
    {
        int[]a = {2,1,3,7,5,6,4};
        int[]b = new int[a.length];
        for(int i = 0;i<a.length;i++)
        {
            b[i] = a[i];
            System.out.print(b[i] + " ");
        }
    }
}

//Program to find the frequency of each element in the array
class Prog36
{
    public static void main(String[]args)
    {
        int[]arr = {2,2,3,5,5,6,7,6,7,8,8,8,8,9,9,1,0};
        Map<Integer,Integer> fre = new HashMap<>();
        for(int i: arr)
        {
            if(fre.containsKey(i))
            {
                fre.put(i, fre.get(i)+1);
            }
            else
            {
                fre.put(i, 1);
            }
        }
        for(Integer i:fre.keySet())
        {
            System.out.println(i + " -> "+fre.get(i));
        }
    }
}

//Program to reverse the elements of the array
class Prog37
{
    public static void main(String[]args)
    {
        int[]arr = {1,2,3,4,5,6,7,8,9};
        for(int i = arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

//Program to print the delete an elements of an array
class Prog38
{
    public static void main(String[]args)
    {
        int[]arr = {1,2,3,4,5,6,7,8,9};
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the no. to get delete: ");
        int n = java.nextInt();
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == n)
            {
                continue;
            }
            else
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

//Program to print the average of all items of the array..
class Prog39
{
    public static void main(String[]args)
    {
        int[]arr = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("The Average of all items: "+sum/arr.length);
    }
}

//Program to inverse the elements of an array
class Prog40
{
    public static void main(String[]args)
    {
        int[]arr = {1,2,3,4,5};
        for(int i = arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

/*Program to print following pattern
        1  
       2 2  
      3 3 3  
     4 4 4 4  
    5 5 5 5 5  
   6 6 6 6 6 6  
  7 7 7 7 7 7 7  
 8 8 8 8 8 8 8 8  
9 9 9 9 9 9 9 9 9 */
class Prog41
{
    public static void main(String[]args)
    {
            Scanner java = new Scanner(System.in);
            System.out.println("Enter the n value: ");
            int n = java.nextInt();
            for(int i = 1;i<=n;i++)
            {
                for(int j = 1;j<=n;j++)
                {
                    if(j<=(n-i))
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print(i+ " ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
   
/*Program for the following pattern
        1  
       1 2  
      1 2 3  
     1 2 3 4  
    1 2 3 4 5  
   1 2 3 4 5 6  
  1 2 3 4 5 6 7  
 1 2 3 4 5 6 7 8  
1 2 3 4 5 6 7 8 9*/
class Prog42
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        for(int i = 1;i<=n;i++)
            {
                int count = 1;
                for(int j = 1;j<=n;j++)
                {
                    if(j<=(n-i))
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print(count++ + " ");
                    }
                }
                System.out.println(" ");
            }
    }
}

/*Program for the following pattern
     *  
    * *  
   * * *  
  * * * *  
 * * * * *  
* * * * * *  */
class Prog43
{
    public static void main(String[]args)
    {
            Scanner java = new Scanner(System.in);
            System.out.println("Enter the n value: ");
            int n = java.nextInt();
            for(int i = 1;i<=n;i++)
            {
                for(int j = 1;j<=n;j++)
                {
                    if(j<=(n-i))
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("* ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
   
/*Program for the following pattern
    A 
   B B 
  C C C 
 D D D D 
E E E E E 
 D D D D 
  C C C 
   B B 
    A */   
class Prog44
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any capital letter: ");
        char c = java.next().charAt(0);
        int n = c - 'A'+1;
        int l = 0;
        char ch = 'A'-2;
        for(int i=-n;i<=n;i++)
        {
            if(i<0 || i==0)
            {
                l = -i;
                ch++;
            }
            else{
                l = i;
                ch--;
            }
            for(int j = 1;j<=n;j++)
            {
                if(j<=l)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(ch+ " ");
                }
            }
            System.out.println("");
        }
    }
}

/*Program to print the following pattern
1       1 
 2     2 
  3   3 
   4 4 
    5 */
class Prog45
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String txt = java.nextLine();
        int n = txt.length();
        int k = 0;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(j<=(i-1))
                {
                    System.out.print(" ");
                }
                else
                {
                    if(j==i || j==n)
                    {
                        System.out.print(txt.charAt(k)+ " ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            k++;
            System.out.println("");
        }
    }
}

//Program to find odd numbers between the given range
class Prog46
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the starting point and the ending point: ");
        int start = java.nextInt();
        int end = java.nextInt();
        System.out.println("The odd numbers between the ranges: ");
        for(int i = start;i<=end;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
    }
}

//Program to print letters from 'A' to the userinput
class Prog47
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the ending alphabet: ");
        char ch = java.next().charAt(0);
        for(char c = 'A';c<=ch;c++)
        {
            System.out.print(c + " ");
        }
    }
}

//Program to print the sum of the given number and it's reverse.
class Prog48
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = java.nextInt();
        int n = num;
        int rev=0;
        while(n>0)
        {
            rev = rev*10 + n%10;
            n = n/10;
        }
        System.out.println("The sum is: "+ (num + rev));
    }
}

//Program to print the reverse of a string using recursion
class Prog49 {
    static void recur(String[] sent, int i) {
        if (i < 0) 
        {
            return;
        }
        System.out.print(sent[i] + " ");
        recur(sent, i - 1);
    }

    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Ente any string: ");
        String str = java.nextLine();
        String[] words = str.split(" ");
        recur(words, words.length - 1);  
    }
}

//Program to write the number in words
class Prog50
{
    public static void main(String[]args)
    {
        String[]ones = {"","one","two","three","four","five","six","seven","eight","nine","ten",
                       "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
        String[]tens = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the value between 0 and 999");
        int n = java.nextInt();
        while(n>0)
        {
            if(n>=100)
            {
                System.out.print(ones[n/100] + " hundred and ");
                n = n%100;
            }
            else if(n>=10)
            {
                System.out.print(tens[n/10] + " ");
                n = n%10;
            }
            else
            {
                System.out.print(ones[n]);
                n = n/10;
            }
        }
    }
}

//Program to sort the elements in the odd positions in descending and even in ascending
class Prog51
{
    public static void main(String[]args)
    {
        int[]nums = {1,6,2,5,3,4};
        List<Integer>odd = new ArrayList<>();
        List<Integer>even = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                odd.add(nums[i]);
            }
            else
            {
                even.add(nums[i]);
            }
        }
        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even);
        int j = 0, k = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                System.out.print(odd.get(j++) + " ");
            }
            else
            {
                System.out.print(even.get(k++)+ " ");
            }
        }
    }
}

//Program to print the alphabet "C" based on the given numbers
class Prog52
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = java.nextInt();
        for(int i = 1;i<=n;i++)
        {
            if(i==1 || i==n)
            {
               for(int j = 1;j<=n;j++)
               {
                 System.out.print("* ");
               }
            }
            else
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

//Program to print a pyramid with numbers increased by 1
class Prog53
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        int count = 1;
            for(int i = 1;i<=n;i++)
            {
                for(int j = 1;j<=n;j++)
                {
                if(j<=(n-i))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(count++ + " ");
                }
                }
                System.out.println("");
            }
    }
}

/*Program to print the given string in an "x" format
1   5
 2 4 
  3  
 2 4 
1   5 */
class Prog54
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(i==j || i+j==n+1)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

/*Program to print the following pattern
4444444
4333334
4322234
4321234
4322234
4333334
4444444 */
class Prog55
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        int mid = n/2;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                int val = Math.max(Math.abs(i - mid), Math.abs(j - mid)) + 1;
                System.out.print(val);
            }
            System.out.println("");

        }
    }
}

//Program to print all the substring of the given string without using strings
class Prog56
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = java.nextLine();
        char[]ch = str.toCharArray();
        for(int i = 0;i<ch.length;i++)
        {
            for(int j = i;j<ch.length;j++)
            {
                for(int k = i;k<=j;k++)
                {
                    System.out.print(ch[k]);
                }
                System.out.println("");
            }
        }
    }
}

//Print the numbers which are mismatched from two array
class Prog57
{
    public static void main(String[]args)
    {
        char[]ch1 = {'a','b','c','d','e','f','g','h','i'};
        char[]ch2 = {'a','b','d','e','e','g','g','i','i'};
        for(int i = 0;i<ch1.length;i++)
        {
            if(ch1[i] == ch2[i])
            {
                continue;
            }
            System.out.println(ch1[i]+""+ch2[i]);
        }
    }
}

//Program to print the sum of 2 huge numbers as separate digits, store them in array and process the result
class Prog58
{
    public static void main(String[]args)
    {
        int[]a = {9,2,8,1,3,5,6,7,3,1,1,6};
        int[]b = {7,8,4,6,2,1,9,9,7};
        int al = a.length - 1;
        int bl = b.length - 1;
        int[]c = new int[(Math.max(al,bl) + 1)];
        int cl = c.length - 1;
        int temp = 0;
        while(al>=0||bl>=0||temp!=0)
        {
            int num1 = (al>=0)?a[al]:0;
            int num2 = (bl>=0)?b[bl]:0;
            c[cl] = (num1 + num2 + temp)%10;
            temp = (num1 + num2 + temp)/10;
            al--;
            bl--;
            cl--;
        }
        int start = 0;
        if(c[start] == 0)
        {
            start = 1;
        }
        for(int i = start;i<c.length;i++)
        {
            System.out.print(c[i]+ " ");
        }
    }
}

/*Program to print the below format
+===+===+
| | |
| | |
| | |
+===+===+
| | |
| | |
| | |
+===+===+*/
class Prog59
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        for(int i = 0;i<=n;i++)
        {
            if(i%4==0)
            {
                System.out.println("+===+===+");
            }
            else
            {
                System.out.println("| | |");
            }
        }
    }
}

/*Program  to save the string "WELCOMETOZOHOCORPORATION" in a two dimensional array and search for substring
"too" in the two dimensional string both from left to right and from top to bottom
W E L C O
M E T O Z
O H O C O
R P O R A
T I O N */
class Prog60
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = java.nextLine();
        str = str.replaceAll(" ", "");

        int ind = 0;
        int size = (int)Math.ceil(Math.sqrt(str.length()));
        char[][]mat = new char[size][size];

        for(int i = 0;i<mat.length && ind<str.length();i++)
        {
            for(int j = 0;j<mat[0].length && ind<str.length();j++)
            {
                mat[i][j] = str.charAt(ind++);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the word to search: ");
        String word = java.nextLine();

        //for the row search
        for(int i = 0;i<mat.length;i++)
        {
            StringBuilder rowchk = new StringBuilder();
            for(int j = 0;j<mat[0].length;j++)
            {
                rowchk.append(mat[i][j]);
            }
            if(rowchk.toString().contains(word))
            {
                int pos = rowchk.indexOf(word);
                System.out.println("The word present from ("+ i + ", " + pos +") to ("+ i + ", " + (pos + word.length() -1) + ") in the row");
                break;
            }
        }

        //for the column search
        for(int j = 0;j<mat[0].length;j++)
        {
            StringBuilder colchk = new StringBuilder();
            for(int i = 0;i<mat.length;i++)
            {
                colchk.append(mat[i][j]);
            }
            if(colchk.toString().contains(word))
            {
                int pos = colchk.indexOf(word);
                System.out.println("The word present from (" + pos + ", " + j +") to (" + (pos + word.length() -1) + ", " + j + ") in the column");
                break;
            }
        }
    }
}

