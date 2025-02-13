  class Pat15{
   public static void main(String arg[])
   { Scanner scanner = new Scanner(System.in);
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