import java.util.Scanner;
public class Geeks
{
    public static void main(String[] args) {}
}
class Pat29
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        for(int i = 1;i<=n;i++)
        {
            if(i%2!=0)
            {
            for(int j = 1;j<=n-i+1;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
            }
            else if(i%2==0)
            {
            for(int j = n-i+1;j>=1;j--)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
            }
        }
    }
}
class Transpoint {
      public static int Point(int[] arr) {
          int n = 1;
          for(int i = 0;i<arr.length;i++)
          {
            if(arr[i]==1)
            return i;   
          }
          return -1;
      }
public static void main(String[]args)
{
    Scanner java = new Scanner(System.in);
    System.out.println("Enter the size: ");
    int size = java.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the array value: ");
    for(int i = 0;i<arr.length;i++)
    {
        arr[i]=java.nextInt();
    }
    System.out.println(Point(arr));
}
}

