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


class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void wagTail() { // Specific to Dog
        System.out.println("Dog wags tail");
    }
}

class Main {
    public static void main(String[] args) {
        Animal obj1 = new Dog(); 
        obj1.makeSound(); 
        Dog obj2 = new Dog();
        obj2.wagTail();
    }
}



