import java.util.Scanner;
public class multi
{
    public static void main(String[]args)
    {

    }
}
//To find the Average of Array Elements using arrays and functions.
class mularr1
{
    static int met(int[] arr)
    {
        int sum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        return sum/arr.length;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = java.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values for the array: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = java.nextInt();
        }
        System.out.print("The average of the given array: "+ met(arr));
    }
}
//To find the sum  of Array Elements using arrays and functions.
class mularr2
{
    static int[][] met(int[][]A, int[][]B, int[][]C)
    {
        for(int i = 0;i<C.length;i++)
        {
            for(int j = 0;j<C[i].length;j++)
            {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
    public static void main(String[]args)
    {
        System.out.println("Addition in matrix can be done, only when the size of matrix A "+ "\n" + "and the size of the matrix B is equal.So, assign the size correctly.");
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for the row and column: ");
        int row = java.nextInt();
        int col = java.nextInt();
        int[][] A = new int[row][col];
        int[][] B = new int[row][col];
        int[][] C = new int[row][col];
        System.out.println("Enter the value for the matrix A: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                A[i][j] = java.nextInt();
            }
        }
        System.out.println("Enter the value for the matrix B: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                B[i][j] = java.nextInt();
            }
        }
        met(A, B, C);
        for(int i = 0;i<C.length;i++)
        {
            for(int j = 0;j<C[i].length;j++)
            {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
//To multiply Array Elements using arrays and functions.
class mularr3
{
    static int[][] met(int[][]A, int[][]B, int[][]C)
    {
        for(int i = 0;i<A.length;i++)//consider A row
        {
            for(int j = 0;j<B[i].length;j++)//consider B column
            {
                for(int k = 0;k<A[0].length;k++)//consider A column
                {
                    C[i][j] = C[i][j] + A[i][k]*B[k][j];
                }
            }
        }
        return C;
    }
    public static void main(String[]args)
    {
        System.out.println("Multiplication in matrix can be done, only when the column size of matrix A \n " + "and the row size of the matrix B is equal.So, assign the size correctly.\n");
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for the row1 and column1: ");
        int row1 = java.nextInt();
        int col1 = java.nextInt();
        System.out.println("Enter the size for the row2 and column2: ");
        int row2 = java.nextInt();
        int col2 = java.nextInt();
        int[][] A = new int[row1][col1];
        int[][] B = new int[row2][col2];
        int[][] C = new int[row1][col2];
        System.out.println("Enter the value for the matrix A: ");
        for(int i = 0;i<row1;i++)
        {
            for(int j = 0;j<col1;j++)
            {
                A[i][j] = java.nextInt();
            }
        }
        System.out.println("Enter the value for the matrix B: ");
        for(int i = 0;i<row2;i++)
        {
            for(int j = 0;j<col2;j++)
            {
                B[i][j] = java.nextInt();
            }
        }
        met(A, B, C);
        for(int i = 0;i<C.length;i++)
        {
            for(int j = 0;j<C[i].length;j++)
            {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
//Write a program to transpose the matrix
class mularr4
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the row and column:");
        int row = java.nextInt();
        int col = java.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the value for the matrix:");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = java.nextInt();
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
        } 
        System.out.println("After Getting transposed: ");
        for(int j = 0;j<col;j++)
        {
            for(int i = 0;i<row;i++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
       
}
}
//Find maximum element in the given array
class mularr5
{
    static int met(int[] arr)
    {
        int max = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.print("Enter the size for the array: ");
        int n = java.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values for the array: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = java.nextInt();
        }
        System.out.println("The maximum element in the given array: "+ met(arr));
    }
}
//Program that searches for an element in an array and return its position.
class mularr6
{
    static int met(int[] arr, int m)
    {
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] ==  m)
            {
                System.out.println("The element " + m + " is in the position: "+ i);
                continue;
            }
        }
        return 0;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.print("Enter the size for the array: ");
        int n = java.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values for the array: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = java.nextInt();
        }
        System.out.println("Enter the element you want search in the given array: ");
        int m = java.nextInt();
        met(arr, m);
    }
}
//Reverse a Matrix
class mularr7
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for the rows and columns");
        int row = java.nextInt();
        int col = java.nextInt();
        int[][] arr = new int[row][col];
        int[][] rev = new int[row][col];
        System.out.println("Enter the values for the array: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = java.nextInt();
            }
        }
        for(int i = 0, k = row -1;i<row && k>=0;i++,k--)
        {
            for(int j=0,l=col-1;j<col && l>=0;j++,l--)
            {
                rev[k][l] = arr[i][j] ;
            }
        }
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                System.out.print(rev[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
//Rotate a matrix
class mularr8
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the row and column:");
        int row = java.nextInt();
        int col = java.nextInt();
        int[][] arr = new int[row][col];
        int[][] trans = new int[col][row];
        System.out.println("Enter the value for the matrix:");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = java.nextInt();
            }
        }
        System.out.println("After Getting transposed: ");
        for(int i = 0;i<col;i++)
        {
            for(int j = 0;j<row;j++)
            {
                trans[i][j] = arr[j][i];
                System.out.print(trans[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("After getting rotated 90 degress: ");
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
                System.out.print(trans[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
//Function to merge two arrays and return the combined array
class mularr9
{
    static int[] met(int[]a, int[]b)
    {
        int c[] = new int[a.length + b.length];
        for(int i = 0;i<c.length;i++)
        {
            if(i<a.length)
            {
                c[i] = a[i];
            }
            else
            {
             c[i] = b[i - a.length];
            }
        }
        return c;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for  the array 1: ");
        int n = java.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the size for  the array 2: ");
        int m = java.nextInt();
        int[]b = new int[m];
        int[] c = new int[n+m];
        System.out.println("Enter the values for array1");
        for(int i = 0;i<n;i++)
        {
            a[i] = java.nextInt();
        }
        System.out.println("Enter the values for array2");
        for(int i = 0;i<m;i++)
        {
            b[i] = java.nextInt();
        }
        System.out.println("Enter the values for array2");
      
        //System.out.print("The combined array of a and b: " + met(a,b));...if we directly print the array, it prints its address instead of value;
        int []res = met(a,b);
        for(int i:res)
        {
            System.out.print(i + " ");
        }
    }
}
//To calculate the sum of diagonal elements
class mularr10
{
    static int met(int[][]arr)
    {
        int sum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                if(i+j == arr.length-1)
                {
                    sum = sum + arr[i][j];
                }
            }  
        }
        return sum;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for the rows and columns: ");
        int row = java.nextInt();
        int col = java.nextInt();
        int[][]arr = new int[row][col];
        System.out.println("Enter the value for the array: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = java.nextInt();
            }
        }
        System.out.println("The sum of the diagnols in the given matrix: "+ met(arr));
    }
}
//Funtion to count even and odd numbers in an array;
class mularr11
{
    static int[] met(int[] arr)
    {
        int even = 0;
        int odd = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            even++;
            else
            odd++;
        }
        return new int[]{even, odd};
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = java.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values for the array: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = java.nextInt();
        }
        int[] res = met(arr);
        System.out.println("The total number of even numbers: "+ res[0]);
        System.out.println("The total number of odd numbers: "+ res[1]);
    }
}
//Funtion to calculate the sum of elements
class mularr12
{
    static int[] met(int[][]arr)
    {
        int[]res = new int[arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            int sum = 0;
            for(int j = 0;j<arr[i].length;j++)
            {
                sum = sum + arr[i][j];
            }
            res[i] = sum;
        }
        return res;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for the row and column: ");
        int row = java.nextInt();
        int col = java.nextInt();
        int[][]arr = new int[row][col];
        System.out.println("Enter the value for the array: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = java.nextInt();
            }
        }
        int[]res = met(arr);
        for(int i = 0;i<res.length;i++)
        {
            System.out.println("The sum of "+ i + " row: " + res[i]);
        }
    }
}
//To print the given 2x2 array in spiral order
class mularr13
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for row and column: ");
        int row = java.nextInt();
        int col = java.nextInt();
        int[][]arr = new int[row][col];
        System.out.println("Enter the value for the array:");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = java.nextInt();
            }
        }
        int total = row*col;
        int count = 0, mincol = 0, minrow = 0, maxcol = col-1, maxrow = row -1;
        while(count<total)
        {
            for(int j = mincol; j<=maxcol && count<total;j++)
            {
                System.out.println(arr[minrow][j]+ " ");
                count++;
            }
            for(int i = minrow+1;i<=maxrow && count<total ;i++)
            {
                System.out.println(arr[i][maxcol]+ " ");
                count++;
            }
            for(int j = maxcol-1; j>=mincol && count<total;j--)
            {
                System.out.println(arr[maxrow][j]+ " ");
                count++;
            }
            mincol++;
            minrow++;
            maxcol--;
            maxrow--;
        }
    }
}

