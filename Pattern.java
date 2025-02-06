import java.util.Scanner;
public class Pattern 
{
    public static void main(String[]args)
    {

    }
    
}
/*
* 
* * 
* * * 
* * * * 
* * * * * 
*/
class Pat1
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the count: ");
        int n = java.nextInt();
        int i, j;
        for (i=0;i<n;i++)
        {
            for (j=0;j<(i+1);j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
/*
* * * * * 
* * * * 
* * * 
* * 
* 
 */
class Pat2
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the count: ");
        int n = java.nextInt();
        int i, j;
        for (i=0;i<n;i++)
        {
            for (j=0;j<(n-i);j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
/*
* * * * * 
  * * * *
    * * *
      * *
        *
 */
class Pat3
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the count: ");
        int n = java.nextInt();
        int i, j;
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                if(j<i)
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
/*
        * 
      * *
    * * *
  * * * *
* * * * *
 */
class Pat4
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the count: ");
        int n = java.nextInt();
        int i, j;
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
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
/*
        *   
      *   *
    *   *   *
  *   *   *   *
*   *   *   *   *
 */
class Pat5
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the count: ");
        int n = java.nextInt();
        int i, j;
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                if(j<(n-i-1))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("*   ");
                }              
            }
            System.out.println("");
        }
    }
}
/*
 *   *   *   *   *   
  *   *   *   *
    *   *   *
      *   *
        *   
 */
class Pat6
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the count: ");
        int n = java.nextInt();
        int i, j;
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                if(j<i)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("*   ");
                }              
            }
            System.out.println("");
        }
    }
}
/*
        * 
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
 */
class Pat7
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the count: ");
        int n = java.nextInt();
        int i, j;
        for (i=0;i<n;i++)
        {
            for (j=0;j<(n+i);j++)
            {
                if(j<n-i-1)
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
/*
 * * * * * * * * * 
  * * * * * * *
    * * * * *
      * * *
        *
 */
class Pat8
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the count: ");
        int n = java.nextInt();
        int i, j;
        for (i=0;i<n;i++)
        {
            for (j=0;j<2*n-i-1;j++)
            {
                if(j<i)
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
/*
* * * * * * 
 * * * * *
  * * * *
   * * *
    * *
     *
    * *
   * * *
  * * * *
 * * * * * 
* * * * * *
 */
class Pat9
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the count: ");
        int n = java.nextInt();
        int i, j, l;
        for (i=-n;i<=n;i++)
        {
            if(i<0)
            {
                l=-i;
            }
            else
            {
                l=i;
             }
            for(j=0;j<n+1;j++)
            {
                if(j<(n-l))
                {
                    System.out.print(" ");
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
/*
*  *  *  *  *  
  *  *  *  *  *
    *  *  *  *  *
      *  *  *  *  *
        *  *  *  *  * 
 */
class Pat10
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the count: ");
        int n = java.nextInt();
        int i, j;
        for (i=0;i<n;i++)
        {
            for (j=0;j<n+i;j++)
            {
                if (j>=i)
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
}
}
/*
     *
    * *
   * * *
  * * * *
 * * * * * 
* * * * * *
  * * * *
   * * *
    * *
     *
 
 */
class Pat11
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i==1)||(j==1)||(i==n)||(j==n))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }     
    }
}
/*
* 
* * 
*   * 
*     * 
* * * * *  */
class Pat12
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        int i=0;
        while(i<n)
        {
            int j = 0;
            while(j<=i)
            {
                if(i==(n-1)||j==0||i==j)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
/*
        1 
      2 1
    3 2 1
  4 3 2 1
5 4 3 2 1
 */
class Pat13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        int count = 1;
        for (int i = 0; i < n; i++) 
        {
            count = 1+i;
            for (int j = 0; j < n; j++)
            {
               if(j<(n-i-1))
               {
                System.out.print("  ");
               }
               else
               {
                System.out.print(count-- + " ");
               }    
            }
            System.out.println("");     
        }     
    }
}
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
class Pat14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        int count = 1;
        for (int i = 0; i < n; i++) 
        {
            count = 1;
            for (int j = 0; j < n; j++)
            {
               if(j<(i+1))
               {
                System.out.print(count++ + " ");
               }
               else
               {
                System.out.print("  ");
               }   
            }
            System.out.println("");
        }     
    }
}
/*
        1 
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
 */
class Pat15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        int count = 1;
        int add;
        for (int i = 0; i < n; i++) 
        {
            count = 1+i;
            add = 1;
            for (int j = 1; j < = n+i; j++)
            {
               if(j<(n-i-1))
               {
                System.out.print("  ");
               }
               else if(j<n)
               {
                System.out.print(count-- + " ");
               }
               else if(j>=n)
               {
                System.out.print(++add + " ");
               }   
            }
            System.out.println("");
        }     
    }
}






