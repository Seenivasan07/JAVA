import java.util.Scanner;
public class Array
{
    public static void main(String[] args) {
        
    }
}
/* Average of the given age */ 
class Arr1
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the storage value for the array: ");
        int n = java.nextInt();
        int[]age = new int[n];
        int sum = 0;
        for(int i=0; i < age.length; i++)
        {
            System.out.println("Enter the age: "  );
            age[i] = java.nextInt();
            sum = sum + age[i];
        }
        System.out.println("The average of the given ages are: " + (float)sum/age.length);            
    }
}
/* Finding the largest number and its index value */ 
class Arr2
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the storage value for the array: ");
        int n = java.nextInt();
        int[]num = new int[n]; 
        System.out.println("Enter "+ n +" numbers: ");
        num[0] = java.nextInt();
        int large = num[0], index=0;
        for(int i=1;i<num.length;i++)
        {
           num[i] = java.nextInt();
           if(large<num[i])
           {
            large=num[i];
            index = i;
           }
        }
        System.out.println("The largest number of the given and its index value is "+ large +", "+index);     
    }
} 
/* Find out the max and min , then add and give the result */
class Arr3
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the storage value for the array: ");
        int n = java.nextInt();
        int num[] = new int[n];
        System.out.println("Enter "+ n + " values: ");
        num[0]=java.nextInt();
        int max =num[0], min = num[0];
        for(int i=1;i<num.length;i++)
        {
            num[i]=java.nextInt();
            if(min>num[i])
            {
              min = num[i];
            }  
            if(max<num[i])
            {
              max = num[i];
            }  
        }
        System.out.println("The sum of the max and min of the given numbers is: "+ (max + min));
    }
}
/*print 0 if the value in the array is even else print what is in it */
class Arr4
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the Storage value for the array: ");
        int n = java.nextInt();
        System.out.println("Enter the "+ n + " values: ");
        int[]num = new int[n];
        for(int i = 0; i<num.length;i++)
        {
            num[i] = java.nextInt();
            if(num[i]%2==0)
            {
              num[i]=0;  
            }
        }
        System.out.println("");
        for (int j:num)
        {
            System.out.println(j);
        }
    }
}
/* just initiallize values for an array and print it */
class Arr5
{
    public static void main(String[] args) 
    {
       Scanner java = new Scanner(System.in);
       System.out.println("Enter the length of the array: ");
       int n = java.nextInt();
       int[]num = new int[n];
       System.out.println("Enter "+ n + " values: ");
       for(int i=0;i<num.length;i++)
       {
        num[i] = java.nextInt();
       }
       int j=0;
           do
              {
               System.out.println(num[j]);
               j++;
              }while(j<num.length);           
    }
}
/* sum of all elements in the given array */
class Arr6
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = java.nextInt();
        int[]num = new int[n];
        int sum = 0;
        System.out.println("Enter "+ n + " values: ");
        for(int i = 0;i<num.length;i++)
        {
            num[i]=java.nextInt();
            sum = sum + num[i];
        }
        System.out.println("The sum of the elements in the array: "+ sum);
    }
}
/*Write a program to count how many even and odd numbers are in an array. */
class Arr7
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = java.nextInt();
        int[]num = new int[n];
        int ecount = 0, ocount=0;
        System.out.println("Enter "+n+" values: ");
        for(int i = 0;i<num.length;i++)
        {
            num[i]=java.nextInt();
            if(num[i]%2==0)
            {
                ecount++;
            }
            else{
                ocount++;
            }
        }
        System.out.println("The even and odd counts in the given arrays are: "+ecount+", "+ocount);
    }
}
/*to find the index value of the given number */
class Arr8
{
    public static void main(String[] args) 
    {
        {
            Scanner java = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int n = java.nextInt();
            int[]num = new int[n];
            System.out.println("Enter "+n+" values: ");
            int i = 0,j = 0;
            for(i=0;i<num.length;i++)
            {
                num[i] = java.nextInt(); 
            }
            System.out.println("Enter the number to find it's index value: ");
            int m = java.nextInt();
            while(j<num.length)
            {
               if(num[j]==m)
               {
                System.out.println("The index value for the given is: "+j);
                break;
               }
               j++;
            }
        }
    }
}
/*Reversing the given array without using extra array */
class Arr9
{
    public static void main(String[] args) 
    {
        int[]num={1,2,3,4,5};
        System.out.println("Before Reversing");
        for(int i =0;i<num.length;i++)
        {
            System.out.print(num[i]+ " ");
        }
        System.out.println("\n"+"After Reversing");
        for(int j=num.length-1;j>=0;j--)
        {
            System.out.print(num[j]+" ");
        }
    }
}
/*Write a program to sort an array in ascending order- Selection method */
class Arr10
{
    public static void main(String[] args) 
    {
        int[]arr = {990,234,9087,10000};
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length-1;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]+" ");
        }
    }
}
/*Write a program to sort an array in decending order - Selection Method */ 
class Arr11
{
    public static void main(String[] args) 
    {
        int[]arr = {1,879,1000,999,998};
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]+" ");
        }
    }
}
/*Write a program to sort an array in ascending order - Bubble Sort. */
class Arr12
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = java.nextInt();
        int[]num = new int[n];
        System.out.println(" Enter the values: ");
        for(int i=0;i<num.length;i++)
        {
            num[i] = java.nextInt();
        }
        for(int j = 0;j<num.length-1;j++)
        {
            for(int k = 0;k<num.length - j - 1; k++)
            {
                if(num[j]>num[j+1])
                {
                    int temp = num[j];
                    num[j]= num[j+1];
                    num[j+1]= temp;
                }
            }
            
        }
        for(int l = 0;l<num.length;l++)
        {
            System.out.println(num[l]);
        }
    }
}
/* Program to find whether the given array is palindrome or not */
class Arr13
{
    public static void main(String[]args)
    {
        int[]arr = {1,3,4,5,4,3,1};
        int s=1;
        for(int i = 0, j=arr.length-1; i<arr.length && j>=0; i++,j--)
        {
            if(arr[i]!=arr[j])
            {
                s=0;
                break;
            }
        } 
     if(s==0) 
     {
        System.out.println("The given array is not a palindrome");
     }
     else{
        System.out.println("The given array is a palindrome");
     }
        
    }
}
/* Write a program to find the second largest number in an array. */
class Arr14
{
    public static void main(String[] args) 
    {
        int[]arr = {1,879,1000,1099,1098};
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println(arr[1]+" ");
    }
}
/* program to remove duplicates from array */
class Arr15
{
    public static void main(String[] args) 
    {
        int[]n = {1,3,2,4,5,1,3,2,4,5,6,7,8,9,10,10,10,3};
        for(int i = 0;i<n.length;i++)
        {
            int count = 0;
            for(int j = i+1;j<n.length;j++)
            {
                if(n[i]==n[j])
                {
                  count++;
                }
            }
            if(count == 0)
            {
            System.out.print(n[i]+" ");
            }
        }
        
    }
}
/* program to shift array towards left*/
class Arr16
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        int[]arr = {1,2,3,4,5,6};
        for(int i=0;i<n;i++)
        {
            int first = arr[0];
            for(int j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[arr.length - 1]=first;
        }
        for (int i:arr)
        {
            System.out.print(i + " ");
        }
    }

}
/* program to shift array towards right*/
class Arr17
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        int[]arr = {1,2,3,4,5,6};
        for(int i = 0;i<n;i++)
        {
            int last = arr[arr.length - 1];
            for(int j=arr.length -1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        for (int i:arr)
        {
            System.out.println(i+ " ");
        }
    }
}
/* Write a program to search for an element in an array (Linear Search). */
class Arr18
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int m = java.nextInt();
        int[]n = {2,3,4,5,6};
        for(int i = 0;i<n.length;i++)
        {
            if(n[i]==m)
            {
                System.out.println("The element "+ m +" is in the "+ i + " index.");
                break;
            }

        }
    }
}
/*Write a program to merge two sorted arrays into a single sorted array. */
class Arr19
{
    public static void main(String[]args)
    {
        int[]a={1,2,3};
        int[]b={4,5,6};

        int[] c = new int [a.length+b.length];
        for(int i =0;i<c.length;i++)
        {
            if(i<a.length)
            {
                c[i]=a[i];
            }
            else{
                c[i]=b[i-a.length];
            }
        }
        for(int i:c)
        System.out.print(i+" ");
    }
}
/*Write a program to find the maximum sum subarray (Kadane’s Algorithm). */
class Arr20
{
    public static void main(String[]args)
    {
        int[]a={1, -2, 3, 4, -1, 2, 1, -5, 4};
        int cursum = 0;
        int maxsum = 0;
        for(int i = 0;i<a.length;i++)
        {
            cursum = cursum + a[i];
            if(maxsum<cursum)
            {
                maxsum = cursum;
            }
            if(cursum<0)
            {
                cursum = 0;
            }
        }
        System.out.println(maxsum);

    }
}
/*Write a program to check if two arrays are anagrams of each other (contain the same elements in any order). */
class Arr21
{
    public static void main(String[]args)
{
    int[]a={1,2,3,4};
    int[]b={4,3,2,1};
    int count = 1;
    for(int i = 0;i<b.length;i++)
    {
        for(int j=i+1;j<b.length;j++)
        {
            if(b[j]<b[i])
            {
                int temp = b[i];
                b[i] = b[j];
                b[j] = temp;
            }
        }
    }
    for(int i = 0,j = 0;i<a.length && j<b.length;i++,j++)
    {
        if(a[i]!=b[j])
        {
            count = 0;
            break;
        }
    }
    if(count == 1)
    {
    System.out.println("The given array is a anagram");
    }
    else
    {
    System.out.println("The given array is not a anagram");
    }/* */
}
}
/* Write a program to find the element that appears only once in an array while others appear twice (Bitwise XOR method). */
class Arr22
{
    public static void main(String[] args) 
    {
        int[]n = {1,2,3,4,5,6,5,4,3,2,1};
        int uni = 0;
        for(int i = 0;i<n.length;i++)
        {
           uni ^=n[i];
        }
    System.out.println("The unique element that appeared in the array is: "+ uni);
    }
}
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.You can return the 
answer in any order. */

class Arr23
{
    public static void main(String[]args)
    {
        int[]n = {2,7,11,15};
        int target = 26;
        for(int i =0;i<=n.length-1;i++)
        {
            for(int j = i+1;j<n.length;j++)
            {
                if(target == n[i]+n[j])
                {
                    System.out.println("The indices for adding the target is "+ i +" and "+ j);
                    break;
                }
            }
        }
    }
}
/* Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.The overall run time
 complexity should be O(log (m+n)) */
 
 class Arr24
 {
    public static void main(String[]args)
    {
        int[]a = {1,3};
        int[]b = {2,4};
        int[]c = new int[a.length+b.length];
        float median;
        for(int i = 0;i<c.length;i++)
        {
            if(i<a.length)
            {
                c[i] = a[i];
            }
            if(i>=a.length)
            {
                c[i] = b[i-a.length];
            }
        }
        for(int i =0;i<c.length;i++)
        {
            for(int j=i+1;j<c.length;j++)
            {
                if(c[j]<c[i])
                {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
            System.out.println(c[i]);
        }
        if (c.length % 2 == 0) {
            median = (float) (c[c.length / 2] + c[(c.length / 2) - 1]) / 2;
        } else {
            median = c[c.length / 2];
        }
        System.out.println("The median of the sorted array is: "+ median);
    }
 }
 //////MULTIDIMENSIONAL ARRAY
 
/* Adding the sum of N x N matrix */
class Arr25
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the row: ");
        int row = java.nextInt();
        System.out.println("Enter the size of the column: ");
        int col = java.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] c = new int[row][col];
        System.out.println("Enter the value for A: ");
        for(int i = 0;i<a.length;i++)
        {
            for(int j = 0;j<a.length;j++)
            {
                a[i][j] = java.nextInt();
            }
        }
        System.out.println("Enter the value for B: ");
        for(int i = 0;i<b.length;i++)
        {
            for(int j = 0;j<b.length;j++)
            {
                b[i][j] = java.nextInt();
            }
        }
        for(int i = 0;i<c.length;i++)
        {
            for(int j = 0;j<c.length;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }       
    }
}
/* Write a Java program to find the transpose of a 3x3 matrix. The program should:
Take a 3x3 matrix as input from the user.
Compute its transpose (swap rows and columns).
Print the transposed matrix.
 */
class Arr26
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the row value: ");
        int row = java.nextInt();
        System.out.println("Enter the column: ");
        int col = java.nextInt();
        int[][] mat = new int[row][col];
        int[][] tam = new int[row][col];
        System.out.println("Enter the value for the matrix: ");
        for(int i = 0;i<mat.length;i++)
        {
            for(int j = 0;j<mat.length;j++)
            {
                mat[i][j] = java.nextInt();
            }
        }
        for(int i = 0;i<tam.length;i++)
        {
            for(int j = 0;j<tam.length;j++)
            {
                tam[i][j] = mat[j][i];
                System.out.print(tam[i][j]+ " ");
            }
        System.out.println("");
        }
    }
}
/* checks whether a given matrix is symmetric (i.e., the matrix is equal to its transpose). */
class Arr27
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row = java.nextInt();
        System.out.println("Enter the col: ");
        int col = java.nextInt();
        int[][] mat = new int[row][col];
        int count = 1;
        System.out.println("Enter the value for the matrix");
        for(int i = 0;i<mat.length;i++)
        {
            for(int j = 0;j<mat[i].length;j++)
            {
                mat[i][j] = java.nextInt();
            }
        }
        for(int i = 0;i<mat.length;i++)
        {
            for(int j = 0;j<mat[i].length;j++)
            {
                if(mat[i][j]!=mat[j][i])
                {
                   count = 0;
                   break;
                }
            }
        }
        if(count == 1)
        {
            System.out.println("The given matrix is Symmetrical");
        }
        else{
            System.out.println("The given matrix is not a Sysmmetrical");
        }
    }
}
