import java.util.*;
public class Leetcode
{
    public static void main(String[]args)
    {

    }
}

//------------------------------------------------------------------------------ARRAY/STRING--------------------------------------------------------------------------------

//26. Remove Duplicates from sorted Array
class remdup
{
    static int dup(int[]arr)
    {
        int k = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] != arr[k])
            {
                k++;
                arr[k] = arr[i];
            }
        }
        System.out.println(k);
        return k;
    }
    public static void main(String[]args)
    {
        int[]arr = {0,0,1,1,1,2,2,2,2,3,3,3,3,3,4,4,5,5,5,6,6,6};
        int val = dup(arr);
        for(int i = 0;i<=val;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

//27. Remove Element
class rem
{
    static int remove(int[]arr, int val)
    {
        int k = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]!=val)
            {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[]args)
    {
        int[]arr = {1,2,3,2,2,4,5,3,2,2,2,5,6};
        int val = remove(arr, 2);
        for(int i = 0;i<=val;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

//88. Merge  Sorted Array
class Merges
{
    static void met(int[]nums1, int[]nums2, int m, int n)
    {
        int i = m-1, j = n -1, k = nums1.length-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k--] = nums1[i--];
            }
            else
            {
                nums1[k--] = nums2[j--];
            }
        }
        while(i>=0)
        {
            nums1[k--] = nums1[i--];
        }
        while(j>=0)
        {
            nums1[k--] = nums2[j--];
        }
        for(int a = 0;a<nums1.length;a++)
        {
            System.out.print(nums1[a] + " ");
        }
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the array1: ");
        int m = java.nextInt();
        int nums1[]=new int[m];
        System.out.println("Enter the value of array1: ");
        for(int i = 0;i<m;i++)
        {
            nums1[i] = java.nextInt();
        }
        System.out.println("Enter the size of the array2: ");
        int n = java.nextInt();
        int nums2[]=new int[n];
        System.out.println("Enter the value of array2: ");
        for(int i = 0;i<n;i++)
        {
            nums2[i] = java.nextInt();
        }
        met(nums1, nums2, m-n, n);
    }
}

// 189. Rotate Array
class Rotat
{
    static void met(int[]nums, int k)
    {
        for(int i = 0;i<k;i++)
        {
            int last = nums[nums.length - 1];
            for(int j = nums.length - 1;j>0;j--)
            {
                nums[j] = nums[j-1];
            }
            nums[0] = last;
        }
        for(int i:nums)
        {
            System.out.print(i + " ");
        }
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int size = java.nextInt();
        int[]arr = new int[size];
        System.out.println("Enter the value for the array: ");
        for(int i = 0;i<size;i++)
        {
            arr[i] = java.nextInt();
        }
        System.out.println("Enter the number of times to get rotate: ");
        int k = java.nextInt();
        met(arr,k);
    }
}

/*another approcch
class rot
{
    static void met(int[] nums, int k)
    {
        int n = nums.length;
        int[]arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[(i + k)%n] = nums[i];
        }
        for(int i = 0;i<n;i++)
        {
            nums[i] = arr[i];
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = java.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter the values for the array: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = java.nextInt();
        }
        System.out.println("Enter the number of times: ");
        int k = java.nextInt();
        met(arr, k);
    }
}*/

//------------------------------------------------------------------------------HASHMAP-------------------------------------------------------------------------------------

//1. two sum
class twosum
{
    static int[] twosum(int arr[], int tar)
    {
        HashMap<Integer, Integer> two = new HashMap<>();
        for(int i = 0;i<arr.length;i++)
        {
           int j = tar - arr[i];
           if(two.containsKey(j))
           {
            return new int[]{two.get(j), i};
           }
           two.put(arr[i], i);
        }
        return new int[]{0};
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size for the array: ");
        int n = java.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter the value for the array: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = java.nextInt();
        }
        System.out.println("Enter the number to target: ");
        int tar = java.nextInt();
        arr= twosum(arr, tar);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}

//--------------------------------------------------------------------------------BIT MANIPULATION-----------------------------------------------------------------------

//136. Single Number
class Single
{
    static int sin(int[]nums)
    {
        if(nums.length<2)
        {
            return nums[0];
        }
        int[]dub = new int[nums.length];
        for(int i = 0;i<nums.length;i++)
        {
            int count = 1;
            if(dub[i] == 1)
            {
                continue;
            }
            for(int j = i+1;j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                    dub[j] = 1;
                }
            }
            if(count < 2)
            {
                return nums[i];
            }
        }
        return 0;
    }
    public static void main(String[]args)
    {
        int[]nums = {-1,-1,-2};
        System.out.println(sin(nums));
    }
}
//  2nd Approach
class Single2
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

//------------------------------------------------------------------------------TWO POINTERS------------------------------------------------------------------------------

//11. Container with Most Water
class container {
    static int maxArea(int[] height) {
        int left = 0, right = height.length -1;
        int maxwater = 0;
        while(left < right)
        {
            int length = Math.min(height[left], height[right]);
            int area = length * (right - left);
            maxwater = Math.max(maxwater, area);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}

//125. Valid Palindrome
class Palin
{
    static boolean met(String s)
    {
        s = s.toLowerCase();
        String m = s.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0, right = m.length()-1;
        while(left<right)
        {
            if(m.charAt(left) != m.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = java.nextLine();
        System.out.println("Is the given string is palindrome: "+met(s));
    }
}

//392. Is Subsequence

class Subsequence
{
    static boolean met(String s, String t )
    {
        int i = 0, j = 0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i) == t.charAt(j))
            {
                i++;
            }
            j++;
        }
        if(i == s.length())
        {
            return true;
        }
        return false;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String t = java.nextLine();
        System.out.println("Enter the sequence to check: ");
        String s = java.nextLine();
        System.out.println("is the sequence is in the string: "+ met(s, t));
    }
}

//-----------------------------------------------------------------------------BINARY SEARCH----------------------------------------------------------------------------

//35. Search Insert Position
class Insert
{
    static int ins(int[] nums, int target)
    {
        for(int i = 0;i<nums.length;i++)
        {
            if(target <= nums[i])
            {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number to insert: ");
        int n = java.nextInt();
        System.out.println("Enter the size of the array: ");
        int size = java.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the values of the array: ");
        for(int i = 0;i<size;i++)
        {
            nums[i] = java.nextInt();
        }
        System.out.println(ins(nums, n));
    }
}

//74. SEARCH A 2D MATRIX

class search2d
{
    static boolean met(int[][] matrix, int target)
    {
        for(int i = 0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[i].length;j++)
            {
                if(target == matrix[i][j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        int[][]matrix = new int[3][3];
        System.out.println("Enter the value for the array: ");
        for(int i = 0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[i].length;j++)
            {
                matrix[i][j] = java.nextInt();
            }
        }
        System.out.println("Enter the target: ");
        int target = java.nextInt();
        System.out.println(met(matrix, target ));
    }
}

//----------------------------------------------------------------------------------MATH------------------------------------------------------------------------------

//9. Palindrome Number
class Palindrome
{
    static boolean palin(int n)
    {
        int pal = n;
        int res = 0;
        while(n>0)
        {
            res = res*10 + n%10;
            n = n/10;
        }
        if(pal == res)
        {
            return true;
        }
        return false;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = java.nextInt();
        System.out.println("Is the given number is palindrome? "+ palin(num));
    }
}

//66. Plus One
class Plus
{
    static int[] met(int[]arr)
    {
        long l = 1;
        String str = "";
        for(int i = 0;i<arr.length;i++)
        {
            str+=arr[i];
        }
        l+=Long.parseLong(str);
        str = String.valueOf(l);
        int[]arr2 = new int[str.length()];
        for(int i = arr2.length-1;i>=0;i--)
        {
            arr2[i] = (int)l%10;
            l = l/10;
        }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = java.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values for the array: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = java.nextInt();
        }
        int[] arr2 = met(arr);
        for(int i = 0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}

//69. Sqrt(x)
class Sqr
{
    static void met(int n)
    {
        System.out.println((int)Math.sqrt(n));
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = java.nextInt();
        met(n);
    }
}

//50. Pow(X,N)
class pow 
{
        static double met(double x, int n) 
        {
            return Math.pow(x,n);
        }
        public static void main(String[]args)
        {
            Scanner java = new Scanner(System.in);
            System.out.println("Enter the value: ");
            double x = java.nextDouble();
            System.out.println("Enter the power value: ");
            int n = java.nextInt();
            System.out.println(met(x,n));
        }
}

//-----------------------------------------------------------------------------------leetcode-----------------------------------------------------------------------------

//796. Rotate String
class Rotate
{
    static boolean rot(String s, String goal)
    {
        if(s.length() != goal.length())
        {
            return false;
        }
        s = s + s;
        if(s.contains(goal))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = java.nextLine();
        System.out.println("Enter the string to find out: ");
        String goal = java.nextLine();
        System.out.println(rot(s, goal));
    }
}

//268. Missing Number
class Missing
{
    static int miss(int []nums)
    {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++)
        {
            if(i != nums[i])
            {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[]args)
    {
        int[]arr = {2,0,3};
        System.out.println(miss(arr));
    }
}




