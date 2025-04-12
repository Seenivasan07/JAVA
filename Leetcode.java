import java.util.*;
public class Leetcode
{
    public static void main(String[] args) {
        
    }
}
//to find unique and add them.
class Unique 
{
    static int met(char[] arr)
    {
        int m = 0;
        int num = 0;
    for(int i = 0;i<arr.length;i++)
        {
            int a =1;
            if(arr[i]!=' ')
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=' ';
                    a++;
                }
            }
            if(a>1)
                {
                    arr[i] = ' ';
                }
        }
        for(char i:arr)
        {
            if(i!=' ')
            num = num*10 + (i - '0');
        }
         /*str = "";
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] != ' ')
            str+=arr[i]; 
        }
        if(str.equals(""))
        {
            return 0;
        }
        int n = Integer.parseInt(str);*/
        while(num>0)
        {
            m = m + num%10;
            num = num/10;
        }
        return m;
}
public static void main(String[]args)
{
    Scanner java = new Scanner(System.in);
    System.out.println("Enter the number: ");
    String n = java.nextLine();
    char[] arr = n.toCharArray();
    System.out.println(met(arr));
}
}
/*
class Solution {
    public int sumOfUnique(int[] arr)
{
    int m = 0;
    for(int i = 0;i<arr.length;i++)
    {
        int a = 1;
        for(int j = i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                arr[j]=0;
                a++;
            }    
        }
        if(a==1)
            {
                m = m + arr[i];
            }
    }
    if(m>0)
    {
        return m;
    }
    return 0;

}
}
 */
//Finding the next greatest number with the same digits...
class Solution {
    static int met(int a) 
    {
    int b = a;
    String str= String.valueOf(a);
    char[] n = str.toCharArray();
    int i;
    for(i = n.length-2;i>=0;i--)
    {
        if(n[i]<n[i+1])
        break;
    }
    if(i<0)
    {
        return -1;
    }
    int j = n.length-1;
    while(n[i]>=n[j])
    {
        j--;
    }
    char temp = n[i];
    n[i]=n[j];
    n[j]=temp;
    Arrays.sort(n,i+1,n.length);
    str = String.valueOf(n);
    long m = Long.parseLong(str);
    if(m>Integer.MAX_VALUE)
    {
        return -1;
    }
    return (int)m;
}
public static void main(String[]args)
{
    Scanner java = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = java.nextInt();
    System.out.println(met(n));
}
}
//66. Plus One
class Plus
{
    static int[] met(int[] arr)
    {
        int i;
        long j = 1;
        String str = "";
        for(i = 0;i<arr.length;i++)
        {
            str+=arr[i];
        }
        j += Long.parseLong(str);
        str = String.valueOf(j);
        int[] arr2 = new int[str.length()];
        for(i = arr2.length-1;i>=0;i--)
        {
            arr2[i]=(int)(j%10);
            j = j/10;
        }
        return arr2;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long num = java.nextLong();
        String str = String.valueOf(num);
        int[]arr = new int[str.length()];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = str.charAt(i)-'0';
        }
        arr = met(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}

//13. Roman to Integer
class Roman
{
    static int rom(String s)
    {
        HashMap<Character, Integer>r =new HashMap<>();
        r.put('I',1);
        r.put('V',5);
        r.put('X',10);
        r.put('L', 50);
        r.put('C', 100);
        r.put('D', 500);
        r.put('M', 1000);
        
        int total = 0;
        int pre = 0;
        for(int i = s.length()-1;i>=0;i--)
        {
            int val = r.get(s.charAt(i));
            if(val<pre)
            {
                total -=val;
            }
            else
            {
                total+=val;
            }
            pre = val;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        String s = java.nextLine();
        System.out.println(rom(s));
    }
}

//7. Reverse Integer

class reverse {
    static int reverse(int x) {
        int i = 0, num = 0;
        while(x!=0)
            {
                int digit = x%10;
                x = x/10;
                if(num>Integer.MAX_VALUE/10 || num==Integer.MAX_VALUE && digit>7)
                {
                    return 0;
                }
                if(num<Integer.MIN_VALUE/10 || num==Integer.MIN_VALUE && digit<-8)
                {
                    return 0;
                }
            }
        return num;
    }
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner java = new Scanner(System.in);
        int num = java.nextInt();
        System.out.println(reverse(num));
    }
}

/*27. Remove Element
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. 
Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. 
The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
class remove
{
    public static int rem(int[]arr, int val)
    {
        int j = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] != val)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
            System.out.print(arr[j] + " ");
        }
       
        return 0;
    }
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = java.nextInt();
        System.out.println("Enter the value to get remove: ");
        int val = java.nextInt();
        System.out.println("Enter the values for the array: ");
        int[]arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = java.nextInt();
        }
        rem(arr, val);
    }
}
