import java.util.Scanner;
public class MultiDimArray 
{
    public static void main(String[] args)
    {

    }
}
//Write a Java program to initialize a 2D array with predefined values and print its elements in matrix format.
class mul1
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the row and column: ");
        int row = java.nextInt();
        int col = java.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the values for the array: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = java.nextInt();
            }
        }
        for(int[]i:arr)
        {
            for(int j:i)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
//Write a Java program to find the sum of all elements in a 2D array.
class mul2
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the row and column: ");
        int row = java.nextInt();
        int col = java.nextInt();
        int sum = 0;
        int[][] arr = new int[row][col];
        System.out.println("Enter the values for the array: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = java.nextInt();
                sum = sum + arr[i][j];
            }
        }
        System.out.println("The sum of the given array: "+ sum);
    }
}
//Find the Largest Element in a 2D Array
class mul3
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of row and column: ");
        int row = java.nextInt();
        int col = java.nextInt();
        int[][]arr = new int[row][col];
        int max = arr[0][0];
        System.out.println("Enter the value for the array: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = java.nextInt();
            }
        }
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                if(max<arr[i][j])
                {
                    int temp = max;
                    max = arr[i][j];
                    arr[i][j] = temp;
                }
            }
        }
        System.out.println("The largest element in the given array:" + max);
    }
}
//Write a Java program to calculate and print the sum of each row in a 2D array.
class mul4
{
    public static void main(String[] args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for the row and column: ");
        int row = java.nextInt();
        int col = java.nextInt();
        int sum;
        int[][] arr = new int[row][col];
        System.out.println("Enter the values for the array: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = java.nextInt();
            }
        }
        for(int i = 0;i<row;i++)
        {
            sum = 0;
            for(int j = 0;j<col;j++)
            {
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of Row "+i+" is: "+ sum);
        }
    }
}
//Write a Java program to calculate and print the sum of each column in a 2D array.
class mul5
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for the row and column: ");
        int row = java.nextInt();
        int col = java.nextInt();
        int sum;
        int[][] arr = new int[row][col];
        System.out.println("Enter the values for the array: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = java.nextInt();
            }
        }
        for(int j = 0;j<col;j++)
        {
            sum = 0;
            for(int i = 0;i<row;i++)
            {
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of column "+j+" is: "+ sum);
        }     
    }
}
//Write a Java program to find the transpose of a given 2D array.
class mul6
{
    public static void main(String[] args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for the row and column: ");
        int row = java.nextInt();
        int col = java.nextInt();
        int sum;
        int[][] arr = new int[row][col];
        int[][] trans = new int[col][row];
        System.out.println("Enter the values for the array: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = java.nextInt();
            }
        }
        
        for(int j = 0;j<col;j++)
        {
            for(int i = 0;i<row;i++)
            {
               trans[j][i] = arr[i][j];
            }
        }
        for(int[]i:trans)
        {
            for(int j:i)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
//Write a Java program to check if a given matrix is symmetric (i.e., its transpose is the same as the original).
class mul7
{
    public static void main(String[] args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for the row and column: ");
        int row = java.nextInt();
        int col = java.nextInt();
        int count=0;
        int[][] arr = new int[row][col];
        int[][] trans = new int[col][row];
        System.out.println("Enter the values for the array: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = java.nextInt();
            }
        }
        
        for(int j = 0;j<col;j++)
        {
            for(int i = 0;i<row;i++)
            {
               trans[j][i] = arr[i][j];
            }
        }
        if(arr.length==trans.length)
        {
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                if(arr[i][j]!=trans[i][j])
                {
                    count++;
                    break;
                }         
            }
        }
        if(count==0)
        {
            System.out.println("The given is a symmetric matrix..");
        }
        else{
            System.out.println("The given is not a symmetric matrix..");
        }
    }
}}
//Write a Java program to add two matrices and store the result in a third matrix.(NOTE: IF THE DIMENSIONS ARE SAME ONLY, MATRIX ADDITION IS POSSIBLE)
class mul8
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for row and column: ");
        int row = java.nextInt();
        int col = java.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] c = new int[row][col];
        System.out.println("Enter the value for the array a: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                a[i][j]=java.nextInt();
            }
        }
        System.out.println("Enter the value for the array b: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                b[i][j]=java.nextInt();
            }
        }
        System.out.println("Enter the value for the array b: ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
//Write a Java program to multiply two matrices and store the result in a third matrix.
//(NOTE: For A × B to be valid, the number of columns in A must be equal to the number of rows in B.)
class mul9
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for row and column for a: ");
        int r1 = java.nextInt();
        int c1 = java.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter the size for row and column for b: ");
        int r2 = java.nextInt();
        int c2 = java.nextInt();
        int[][] b = new int[r2][c2];

        if(c1 == r2)
        {
        int[][] c = new int[r1][c2];
        System.out.println("Enter the value for the array a: ");
        for(int i = 0;i<r1;i++)
        {
            for(int j = 0;j<c1;j++)
            {
                a[i][j]=java.nextInt();
            }
        }
        System.out.println("Enter the value for the array b: ");
        for(int i = 0;i<r2;i++)
        {
            for(int j = 0;j<c2;j++)
            {
                b[i][j]=java.nextInt();
            }
        }
        for(int i = 0;i<r1;i++)
        {
            for(int j = 0;j<c2;j++)
            {
                for(int k = 0;k<c1;k++)
                {
                c[i][j] = c[i][j] + a[i][k]*b[k][j];
                }
            }
        }
        for(int i = 0;i<r1;i++)
        {
            for(int j = 0;j<c2;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
    }
}
//Write a Java program to rotate a matrix 90 degrees clockwise.
class mul10
{
public static void main(String[]args)
{
    Scanner java = new Scanner(System.in);
    System.out.println("Enter the size for row and column: ");
    int row = java.nextInt();
    int col = java.nextInt();
    int[][] a = new int[row][col];
    int[][] b = new int[col][row];
    System.out.println("Enter the values for the array: ");
    for(int i = 0;i<row;i++)
    {
        for(int j = 0;j<col;j++)
        {
            a[i][j] = java.nextInt();
        }
    }
    System.out.println("After the matrix get transposed...");
    for(int i = 0;i<col;i++)
    {
        for(int j = 0;j<row;j++)
        {
            b[i][j]=a[j][i];
            System.out.print(b[i][j]+ " ");
        }
        System.out.println("");
    }
    System.out.println("After the matrix get rotated by 90 degree...");
    for(int i = 0;i<col;i++)
    {
        for(int j = 0, k = row-1;j<k;j++, k--)
        {
            int temp = b[i][j];
            b[i][j] = b[i][k];
            b[i][k] = temp;
        }
    }
    for(int i = 0;i<b.length;i++)
    {
        for(int j = 0;j<b[i].length;j++)
        {
            System.out.print(b[i][j] + " ");
        }
        System.out.println(" ");
    }
}
}
/*To print a spiral in the format:
1  2  3  4
12 13 14 5
11 16 15 6
10 9  8  7
*/
class mul11
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the row and column: ");
        int row = java.nextInt();
        int col = java.nextInt();
        System.out.println("Enter the value till you want to print: ");
        int n = java.nextInt();
        int value = 1;
        int[][]arr = new int[row][col];
        int mincol= 0, minrow= 0, maxrow = row-1, maxcol= col-1;
        while(value<=n)
        {
            for(int j = mincol;j<=maxcol && value <= n;j++)
            {
                arr[minrow][j]=value;
                value++;
            }
            for(int i = minrow + 1;i<=maxrow && value <= n;i++)
            {
                arr[i][maxcol]=value;
                value++;
            }
            for(int j = maxcol - 1;j>=mincol && value <= n;j--)
            {
                arr[maxrow][j]=value;
                value++;
            }
            for(int i = maxrow - 1;i>minrow && value <= n;i--)
            {
                arr[i][mincol]=value;
                value++;
            }
            minrow++;
            mincol++;
            maxrow--;
            maxcol--;
        }
        for(int i= 0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}
/* TO PRINT THE MATRIX IN SNAKE FORMAT
1       2       3       4       5
10      9       8       7       6
11      12      13      14      15
20      19      18      17      16
21      22      23      24      25
*/
class mul12
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for the row and the column");
        int row = java.nextInt();
        int col = java.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the value till you want..");
        int n = java.nextInt();
        int value = 1;
        int minrow = 0, mincol = 0, maxrow = row-1, maxcol = col-1;
        while(value<=n)
        {
            for(int j = mincol;j<=maxcol && value<=n;j++)
            {
                arr[minrow][j] = value;
                value++;
            }
            minrow++;
            for(int j = maxcol;j>=0 && value<=n;j--)
            {
                arr[minrow][j] = value;
                value++;
            }
            minrow++;
        }
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
/*To print the given matrix in spiral format...
1  2  3  4
12 13 14 5
11 16 15 6
10 9  8  7
*/
class mul13
{
    public static void main(String[]args)
    {
        int[][]arr = {{1,2,3,4}, {12,13,14,5},{11,16,15,6},{10,9,8,7}};
        int mincol= 0, minrow= 0, maxcol = arr[0].length-1, maxrow = arr.length-1;
        int count = 0;
        while(count<(arr.length*arr[0].length))
        {
        for(int j = mincol;j<=maxcol;j++)
        {
            System.out.print(arr[minrow][j] + " ");
            count++;
        }
        for(int i = minrow+1;i<=maxrow;i++)
        {
            System.out.print(arr[i][maxcol]+" ");
            count++;
        }
        for(int j = maxcol-1;j>=mincol;j--)
        {
            System.out.print(arr[maxrow][j]+" ");
            count++;
        }
        for(int i = maxrow-1;i>minrow;i--)
        {
            System.out.print(arr[i][mincol]+" ");
            count++;
        }
        mincol++;
        minrow++;
        maxcol--;
        maxrow--;
    }
    }
}
/*To print the given matrix in snake format...
1  2  3  4
8  7  6  5
9  10 11 12
16 15 14 13
*/
class mul14
{
    public static void main(String[]args)
    {
        int[][]arr = {{1,2,3,4}, {8,7,6,5},{9,10,11,12},{16,15,14,13}};
        int mincol= 0, minrow= 0, maxcol = arr.length-1, maxrow = arr[0].length-1;
        int total = arr.length * arr[0].length; 
        int count = 0;
        while(count<total)
        {
            for(int j = mincol;j<=maxcol;j++)
            {
                System.out.print(arr[minrow][j]+" ");
                count++;
            }
            minrow++;
            for(int j = maxcol;j>=mincol;j--)
            {
                System.out.print(arr[minrow][j]+" ");
                count++;
            }
            minrow++;
        }
    }
}
/*Reverse Spiral Order Traversal
1  2  3  4
12 13 14 5
11 16 15 6
10 9  8  7
*/
class mul15 
{
    public static void main(String[]args)
    {
    int[][] arr = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
    int total = arr.length*arr[0].length;
    int count = 0, minrow = 0, mincol = 0, maxcol = arr[0].length - 1, maxrow = arr.length - 1;
    int[]revarr = new int[total];
    while(count < arr.length*arr[0].length)
    {
    for(int j = mincol;j<=maxcol;j++)
    {
        revarr[count] = arr[minrow][j];
        count ++;
    }
    for(int i = minrow+1;i<=maxrow;i++)
    {
        revarr[count] = arr[i][maxcol];
        count++;
    }
    for(int j = maxcol-1;j>=mincol;j--)
    {
        revarr[count] = arr[maxrow][j];
        count ++;
    }
    for(int i = maxrow-1;i>minrow;i--)
    {
        revarr[count] = arr[i][mincol];
        count++;
    }
    minrow++;
    mincol++;
    maxrow--;
    maxcol--;
    }
    for(int i = total - 1;i>=0;i--)
    {
        System.out.print(revarr[i] + " ");
    }
}
}
