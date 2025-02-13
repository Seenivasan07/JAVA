import java.util.Scanner;
class Loop
{
    /*main */
    public static void main(String[]args)
    {

    }
}
/*Print numbers */
class While 
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("enter the number");
        int d = java.nextInt();
        do {
            System.out.println(d);
            d++;
        }
        while (d<=100);
    }
    
}
/* Calculate the sum of the first 10 natural numbers. */
class Dowhile
{
    public static void main(String[]args)
{
    Scanner javaa = new Scanner(System.in);
    System.out.println("enter the number");
    int p = javaa.nextInt();
    int i = 1;
    int sum = 0;
    do {
        sum = sum + i;
        ++i;    
    }
    while(i <= p);
    System.out.println("The sum is " + sum);
}
}
/* printing the table for the given number*/ 
class Table
{
    public static void main(String[]args)
    {
        Scanner tab = new Scanner (System.in);
        System.out.println("enter the table no: ");
        int tbno = tab.nextInt();
        System.out.println("enter the end no: ");
        int endno = tab.nextInt();
        int i = 1;
        int sum = 0;
        System.out.println(sum);
        while ((i<=endno) && (tbno>0))
        {
            sum = i * tbno;
            System.out.println(i + " x " + tbno + " = " + sum);
            i++;
        }
        
    }
}
class Tab{
    public static void main(String[]args)
    {
        Scanner tab1 = new Scanner (System.in);
        System.out.println("enter the table no: ");
        int p = tab1.nextInt();
        if (p>0)
        {
           System.out.println("enter the end no: ");
           int b = tab1.nextInt();
           int j = 1;
           int ans;
           while (j<=b) 
           {
            ans = j * p;
            System.out.println(j + " x " + p + " = " + ans);
            j++;
           }
        }  
        else{
            System.out.println("Give the correct positive number");
        } 
    }
}
class Forloop{
    public static void main(String[]args)
    {
        Scanner star = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int start = star.nextInt();
        int i, j;
            for (i = 0;i<=start;i++)
            {
                for (j=i;j<=start;j++)
                {
                    System.out.print("*");
                    
                }
            System.out.println();
            }
        }
    }

class Forloop2{
    public static void main(String[]args)
    {
        Scanner star = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int end = star.nextInt();
        int a,b;
            for (a = end;a>0;a--)
            {
                for (b=a;b<=end;b++)
                {
                    System.out.print(b);
                    
                }
            System.out.println();
            }
        }
    }
    
class Forloop3
{
    public static void main(String[]args)
    {
        int i, j, k, n = 10;
        for (i=1;i<=n;i++)
        {
            for (j=i;j<=n;j++)
            {
                System.out.print(j + " ");
            }
            for (k=1;k<i;k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
class Forloop4
{
    public static void main(String[]args)
    {
        int k = 1, i, j, n = 5;
        while (k<=n)
        {
            for (i=k;i<=n;i++)
            {
            System.out.print(i+ " ");
            }
            for (j=1;j<k;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
            k++;    
        }  
    }
}
class Forloop5
{
    public static void main(String[] args) {
        int i, j, n = 5;
        for (i=1; i<=n; i++)
        {
            for (j=1; j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
class Forloop6
{
    public static void main(String[] args) {
        int i, j, count = 1, n=5;
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(count++);
                //count ++;
            }
            System.out.println();
        }
    }
}
class Forloop7
{
    public static void main(String[]args)
    {
        int i, j, n=3;
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                if (j<(n-i-1))
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











