public class ArrayTest {
    public static void main(String[]args)
    {

    }
}
//Program to find the maximum element in an array.
class Array1
{
    public static void main(String[] args)
    {
        int[] a = {3, 5, 1, 9};
        for(int i = 0;i<a.length;i++)
        {
            for(int j = i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The maximum element in the given array is: "+a[0]);
    }
}
//Program to find the minimum element in an array.
class Array2
{
    public static void main(String[] args)
    {
        int[] a = {7, 2, 10, 4};
        for(int i = 0;i<a.length;i++)
        {
            for(int j = i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The minimum element in the given array is: "+a[0]);
    }
}
//Progam to calculate the average of elements in an array
class Array3
{
    public static void main(String[]args)
    {
        int[]a = {3, 5, 7, 9};
        int sum = 0;
        for(int i =0;i<a.length;i++)
        {
            sum = sum + a[i];
        }
        System.out.println("The average of the elements in the given array: "+ sum/a.length);
    }
}
//Program to count the number of even and odd numbers in the array.
class Array4
{
    public static void main(String[]args)
    {
        int[]a = {2, 3, 4, 5, 6};
        int odd=0,even=0;
        for(int i = 0;i<a.length;i++)
        {
            if(a[i] % 2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("The number of even and odd numbers in the given array: even = "+ even + ", odd = "+ odd);
    }
}
//Program to find the second largest element in an array.
class Array5
{
    public static void main(String[] args)
    {
        int[] a = {12, 34, 1, 10, 35};
        int k = 0;
        for(int i = 0;i<a.length;i++)
        {
            for(int j = i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
        if(a[0]==a[1])
        {
        while(k<a.length)
        {
        if(a[1]!=a[k])
        {
            System.out.println("The second largest element in an array: "+a[k]);
            break;
        }
        k++;
        }
        }
        else{
            System.out.println("The second largest element in an array: "+a[1]);  
        }
    }
}
//Program to calculate the sum of elements at even indices in an array.
class Array6
{
    public static void main(String[] args)
    {
        int[] a = {2, 4, 6, 8, 10};
        int sum = 0;
        for(int i= 0;i<a.length;i++)
        {
            if(i == 0 || i%2 == 0)
            {
                sum = sum + a[i];
            }
        }
        System.out.println("The sum of elements at even indices in an array: "+sum);
    }
}
//Program to merge two arrays
class Array7
{
    public static void main(String[] args)
    {
        int[]a = {1,3,5};
        int[]b = {2,4,6};
        int[]c = new int[a.length+b.length];
        for(int i = 0;i<c.length;i++)
        {
            if(i<a.length)
            {
                c[i] = a[i];
            }
            else{
                c[i] = b[i - b.length];
            }
            System.out.print(c[i] + " ");
        }

    }
}
//Program to sort an array in ascending order.
class Array8
{
    public static void main(String[]args)
    {
        int[] a = {3, 1, 4, 2};
        for(int i = 0; i<a.length;i++)
        {
            for(int j = i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + " ");
        }
    }
}
// Program to find the frequency of each element in an array
class Array9{
    public static void main(String[] args) 
    {
        int[] a = {44,1,1,2,3,2,5,1,3};
        int [] dub = new int[a.length]; 
        for (int i = 0; i < a.length; i++) 
        {
            if (dub[i]== 1) 
            {
                continue;
            }
            int count = 1; 
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] == a[j]) 
                {
                    count++;
                    dub[j] = 1; 
                }
            }
            System.out.println(a[i] + " -> " + count );
        }
    }
}
// Program to remove duplicates in an array
class Array10{
    public static void main(String[] args) {
        int[] a = {1,1,44,2,3,2,3,5,-1};
        int[] b = new int[a.length];
        int[] dub = new int[a.length]; 
        for (int i = 0; i < a.length; i++) 
        {
            if(dub[i]==1)
            {
                continue;
            }
            for(int j = i+1;j<a.length;j++)
            {
                if(a[i] == a[j])
                {
                    dub[j] = 1;
                }
            }
            System.out.println(a[i]);
            b[i] = a[i];
        }
        for (int i:b)
        {
            System.out.println(i);
        }
    }
}

