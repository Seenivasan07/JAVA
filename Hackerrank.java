import java.util.*;
public class Hackerrank {
    public static void main(String[]args)
    {}
}
class Sol1 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if((N%2!=0)||((N%2==0)&&(N>=6&&N<=20)))
        {
            System.out.println("Weird");
        }
        else if(((N%2==0)&&(N>=2&&N<5))||((N%2==0)&&(N>20)))
        {
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}
class Sol2
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = java.nextInt();//5
        int b = java.nextInt();//3
        int c = java.nextInt();//5
        int res1;
        for(int j = 0;j<c;j++)
        {
        res1 = 0;
        for(int i = 0;i<=j;i++)
        {
           res1 = ((int)Math.pow(2,i)*b) + res1;
        }
        System.out.println(a + res1);
        }       
    }
}
//We use , , and  to produce some series :

