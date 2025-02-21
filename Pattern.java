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
class Pat15 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        int count = 1;
        int add;
        for (int i = 0; i < n; i++) 
        {
            count = 1+i;
            add = 1;
            for (int j = 0; j<n+i; j++)
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
/*
*           * 
  *       *
    *   *
      *
    *   *
  *       *
*           *
 */
class Pat16
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        for(int i=1;i<=n;i++)
        {
          
            for(int j = 1;j<=n; j++)
            {
                if(i==j||i+j==n+1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
/*
1           1 
  2       2   
    3   3     
      4       
    5   5     
  6       6   
7           7 
 */
class Pat17
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        for(int i=1;i<=n;i++)
        {
          
            for(int j = 1;j<=n; j++)
            {
                if(i==j||i+j==n+1)
                {
                    System.out.print(i+ " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
/*
A           A 
  B       B
    C   C
      D
    E   E
  F       F
G           G 
 */
class Pat18
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        char n = java.next().charAt(0);
        for(char i='A';i<=n;i++)
        {
          
            for(char j = 'A';j<=n; j++)
            {
                if(i==j||i+j==n+'A')
                {
                    System.out.print(i + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
/*
T                   T 
  I               I   
    R           R     
      U       U       
        N   N
          E
        L   L
      V       V       
    E           E     
  L               L
I                   I
 */
class Pat19
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        String a = "TIRUNELVELI";
        int s = a.length();
        for( int i=0;i<s;i++)
        {
          
            for(int j = 0;j<s; j++)
            {
                if(i==j||i+j==s-1)
                {
                    System.out.print(a.charAt(i) + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
/*
T                   I 
  I               L
    R           E
      U       V
        N   L
          E
        N   L
      U       V       
    R           E
  I               L
T                   I
 */
class Pat20
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        String a = "TIRUNELVELI";
        int s = a.length();
        for( int i=0;i<s;i++)
        {
          
            for(int j = 0;j<s; j++)
            {
                if(i==j||i+j==s-1)
                {
                    System.out.print(a.charAt(j) + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
/*
Z O H O 
    H
  O
Z O H O
 */
class Pat21
{
    public static void main(String[] args) 
    {
        String a = "ZOHO";
        for( int i=0;i<5;i++)
        {
          
            for(int j = 0;j<4; j++)
            {
                if(i==0||i+j==4-1||i==3)
                {
                    System.out.print(a.charAt(j) + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
/*
Z O H O C O R P   
              O
            R
          A
        T
      I
    O
  I
N L I M I T E D
 */
class Pat22
{
    public static void main(String[] args) 
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        String a = "ZOHOCORP ORATIOINLIMITED  ";
        int count = 0;
        for( int i=0;i<n;i++)
        {
          
            for(int j = 0;j<n; j++)
            {
                if(i==0||i+j==n-1||i==(n-1))
                {
                    System.out.print(a.charAt(count++) + " ");
                }
                else{
                    System.out.print("  ");
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
  * * * * * 
    * * * 
      *
 */
class Pat23
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        int l;
        for(int i=-n;i<=n;i++)
        {
            if(i<0)
            {
                l = -i;
            }
            else
            {
                l = i;
            }
            for(int j = 0;j<(2*n-l+1);j++)
            {
                if(j<l)
                {
                    System.out.print("  ");
                }
                else //(j<(2*n-2*l+1))
                {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }

    }
}
/*
* * * * * * * * 
* * * * * * *   
* * * * * *     
* * * * *       
* * * *
* * * * *       
* * * * * *     
* * * * * * *   
* * * * * * * *
 */
class Pat24
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        int l;
        for(int i=-n;i<=n;i++)
        {
            if(i<0)
            {
                l = -i;
            }
            else
            {
                l = i;
            }
            for(int j = -n;j<n;j++)
            {
                if(j<l)
                {
                    System.out.print("* ");
                }
                else //(j<(2*n-2*l+1))
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
}
/*
* * * * * _ 
* * * * _ _ _
* * * _ _ _ _ _
* * _ _ _ _ _ _ _
* _ _ _ _ _ _ _ _ _
_ _ _ _ _ _ _ _ _ _ _
* _ _ _ _ _ _ _ _ _
* * _ _ _ _ _ _ _
* * * _ _ _ _ _
* * * * _ _ _
* * * * * _
 */
class Pat25
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        int l;
        for(int i = -n;i<=n;i++)
        {
            if(i<0)
            {
                l = -i;
            }
            else
            {
                l = i;
            }
            for(int j = 0;j<2*n-l+1;j++)
            {
                if(j<l)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("_ ");
                }
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
* * 
* * * 
* * * * 
* * * * *
 */
class Pat26
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        int l;
        for(int i = -n+1;i<n;i++)
        {
            if(i<0)
            {
                l = -i;
            }
            else
            {
                l = i;
            }
            for(int j = 0;j<n;j++)
            {
                if(j<l+1)
                {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
/*
  * * * * 
    * * * 
      * * 
        * 
      * * 
    * * * 
  * * * * 
 */
class Pat27
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        int l;
        for(int i= -n+1;i<n;i++)
        {
            if(i<0)
            {
                l = -i;
            }
            else
            {
                l=i;
            }
            for(int j = 0;j<n+1;j++)
            {
               if(j<n-l)
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
* * * * * * * * 

* * * _ _ * * *

* * _ _ _ _ * *

* _ _ _ _ _ _ *

* * _ _ _ _ * *

* * * _ _ * * *

* * * * * * * *
 */
class Pat28
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        int l;
        for(int i = -n+1;i<n;i++)
        {
            if(i<0)
            {
                l=-i;
            }
            else
            {
                l=i;
            }
            for(int j = 0;j<2*n;j++)
            {
                if(j<n)
                    {
                        if(j<l+1)
                        {
                            System.out.print("* ");
                        } 
                        else
                        {
                            System.out.print("_ ");
                        }  
        
                    }
                if(j>=n)
                    {
                        if(j<(2*n-l-1))
                        {
                            System.out.print("_ ");
                        }
                        else
                        {
                            System.out.print("* ");
                        }
                    }
               
            }
            System.out.println("\n");
        }
    }
}








