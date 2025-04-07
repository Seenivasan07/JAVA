import java.util.*;
public class Data
{
    public static void main(String[] args) {
        
    }
}

//----------------------------------------------------------------ARRAYLIST--------------------------------------------------------------------------
/*
Task 1: Create and Print an ArrayList
-	Create an ArrayList<String>.
-	Add five different names.
-	Print the ArrayList.

 */
class Ds1
{
    public static void main(String[]args)
    {
       ArrayList<String>nam = new ArrayList<>();
       nam.add("java");
       nam.add("python");
       nam.add("javascript");
       nam.add("sql");
       nam.add("c");
       System.out.println(nam);
    }
}
/*
Task 2: Remove an Element from ArrayList
-	Remove an element by index.
-	Remove an element by value.
-	Print the modified ArrayList.

 */
class Ds2
{
    public static void main(String[] args) 
    {
        ArrayList<String>nam = new ArrayList<>();
        nam.add("java");
        nam.add("python");
        nam.add("javascript");
        nam.add("sql");
        nam.add("c");
        nam.remove("c");
        nam.remove(2);
        System.out.println(nam);
    }
}
/*
Task 3: Search in an ArrayList
-	Check if a specific value exists in the ArrayList.
-	Print the index of a value.  
 */
class Ds3
{
    public static void main(String[] args) 
    {
        System.out.println("Enter any value: ");
        Scanner java = new Scanner(System.in);
        String val = java.nextLine();
        ArrayList<Integer>index = new ArrayList<>();
        ArrayList<String>nam = new ArrayList<>();
        nam.add("java");
        nam.add("python");
        nam.add("javascript");
        nam.add("sql");
        nam.add("c");
        nam.add("python");
        for(int i = 0;i<nam.size();i++)
        {
            if(nam.get(i).equalsIgnoreCase(val))
            {
                index.add(i);
            }
        }
        System.out.println("The positions were the given value presented: "+ index);
    }
}
/*
Task 4: Sort an ArrayList
-	Sort an ArrayList of integers in ascending order.

 */
class Ds4
{
    public static void main(String[]args)
    {
        ArrayList<Integer>num = new ArrayList<>();
        num.add(23);
        num.add(45);
        num.add(34);
        num.add(2);
        num.add(908);
        num.add(65);
        Collections.sort(num);
        System.out.println(num);
    }
}
/*
Task 5: Convert an ArrayList to an Array
-	Convert an ArrayList<String> to a regular String[] array.
-	Convert an ArrayList<Integer> to a regular int[] array ad find the sum of all elements.
 */
class Ds5
{
    public static void main(String[] args) 
    {
        ArrayList<String>nam = new ArrayList<>();
        nam.add("java");
        nam.add("python");
        nam.add("javascript");
        nam.add("sql");
        nam.add("c");
        nam.add("python");
        String[]arr1 = new String[nam.size()];
        for(int i = 0;i<nam.size();i++)
        {
            arr1[i] = (String)nam.get(i);
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        ArrayList<Integer>num = new ArrayList<>();
        num.add(23);
        num.add(45);
        num.add(34);
        num.add(2);
        num.add(908);
        num.add(65);
        int[]arr2 = new int[num.size()];
        for(int i = 0;i<nam.size();i++)
        {
            arr2[i]=(int)num.get(i);
            System.out.print(arr2[i] + " ");
        }
    }
}

//-----------------------------------------------------------------LINKED LIST-------------------------------------------------------------------------
/*
Task 1: Create a LinkedList and Add Elements
-	Create a LinkedList<Integer>.
-	Add elements at different positions (head, tail, specific index).
-	Print the LinkedList.
 */
class Ds6
{
    public static void main(String[]args)
    {
        LinkedList<Integer>
    }
}