import java.util.*;
import java.io.*;
public class Filehandtest {
    public static void main(String[]args)
    {

    }   
}
//JAVA PROGRAM THAT READS A TEXT FILE, COUNTS THE FREQUENCY OF EACH CHARACTER
//AND DISPLAYS THE RESULT IN SORTED...
class F1{
    public static void write(String filepath) {
       try 
       {
        FileWriter obj = new FileWriter(filepath); 
        obj.write("hello world");
        obj.close();
        System.out.println("The file is updated...");
       } 
       catch (Exception e) 
       {
        e.printStackTrace();
       }
    }
    public static String read(String filepath)
    {
        int c;
        String m = "";
        try 
        {
          FileReader r = new FileReader(filepath);
          while((c = r.read())!=-1)
          {
            if((char)c!=' ')
            {
              m+=(char)c;
            }
          } 
          r.close(); 
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return m;
    }
    public static void main(String[]args)
    {
        write("D:\\Java\\Filetest.txt");
        String m = read("D:\\Java\\Filetest.txt");
        char[] arr = m.toCharArray();
        int[] dub = new int[arr.length];
        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) 
        {
            if (dub[i]== 1) 
            {
                continue;
            }
            int count = 1; 
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    count++;
                    dub[j] = 1; 
                }
            }
            System.out.println(arr[i] + " -> " + count );
        }
    }
}
//--------------------------------------------------------------------------------------------------------------------------------------------------

//Create a new file and check if the file exists...
class F2
{
   public static void createfile(String filepath)
   {
    try 
    {
        File obj = new File(filepath);
        if(obj.exists())
        {
            System.out.println("The File already exists..");
        }
        else
        {
            obj.createNewFile();
            System.out.println("New File "+obj.getName()+" has been created Successfully..");
        }
    } 
    catch (Exception e) 
    {
        e.printStackTrace();
    }
   }
   public static void main(String[]args)
   {
    createfile("D:\\Java\\File.txt");
   }
}
//Write Data to a File
class F3 
{
    public static void write(String filepath)
    {
       try {
        BufferedWriter r = new BufferedWriter(new FileWriter(filepath));
        r.write("Hello, World!");
        r.flush();
        r.close();
        System.out.println("The file has been updated..");
       } catch (Exception e) {
        e.printStackTrace();
       }
    }
    public static void main(String[]args)
    {
        write("D:\\Java\\File.txt");
    }
}
//Read and Display File Content...
class F4 
{
    public static void read(String filepath)
    {
        try 
        {
            BufferedReader r = new BufferedReader(new FileReader(filepath));
            String content;
            while((content = r.readLine())!= null)
            {
                System.out.print(content);
            }
            r.close();
        } 
        catch (Exception e) 
        {
           e.printStackTrace();
        }
    }
    public static void main(String[] args) 
    {
        read("D:\\Java\\File.txt");
    }
}
//Append Data to a existing file....
class F5
{
    public static void write(String filepath)
    {
       try {
        BufferedWriter r = new BufferedWriter(new FileWriter(filepath, true));
        r.write("\nWelcome to java");
        r.flush();
        r.close();
        System.out.println("\"Welcome to java \" is appended");
       } catch (Exception e) {
        e.printStackTrace();
       }
    }
    public static void main(String[]args)
    {
        write("D:\\Java\\File.txt");
    }
}
//Delete a File...
class F6
{
    public static void deletefile(String filepath)
    {
     try 
     {
         File obj = new File(filepath);
         if(obj.exists())
         {
            obj.delete();
            System.out.println("File "+obj.getName()+" has been Deleted Successfully..");
         }
         else
         {
            System.out.println("Provide the file name correctly...");
         }
     } 
     catch (Exception e) 
     {
         e.printStackTrace();
     }
    }
    public static void main(String[]args)
    {
     deletefile("D:\\Java\\test.txt");
    } 
}
//Count no. of lines in a file...
class F7 
{
    public static void count(String filepath)
    {
        try 
        {
            BufferedReader r = new BufferedReader(new FileReader(filepath));
            String content;
            int count = 0;
            while((content = r.readLine())!= null)
            {
                count++;
            }
            r.close();
            System.out.println("Number of Lines: "+ count);
        } 
        catch (Exception e) 
        {
           e.printStackTrace();
        }
    }
    public static void main(String[] args) 
    {
        count("D:\\Java\\File.txt");
    }
}
//Copy content from one file to another
class F8 
{
    public static void copy(String f1, String f2)
    {
        try 
        {
            BufferedWriter w = new BufferedWriter(new FileWriter(f2, true));
            BufferedReader r = new BufferedReader(new FileReader(f1));
            String content;
            while((content = r.readLine())!=null)
            {
                w.write("\n"+content);
            }
            r.close();
            w.close();
            System.out.println("Data copied successfully....");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        copy("D:\\Java\\File.txt","D:\\Java\\Filetest.txt");
    }
}
//Userinput to a filee...
class F9 
{
    public static void userinput(String filepath)
    {
        System.out.println("Write something....");
        Scanner java = new Scanner(System.in);
        String input = java.nextLine();
        java.nextLine();
        try 
        {
            BufferedWriter w = new BufferedWriter(new FileWriter(filepath, true));
            w.write(input);
            w.newLine();
            w.close();
            System.out.println("File has  been updated with user input...");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        userinput("D:\\Java\\File.txt");
    }
}
//Search for a word in a file...
class F10
{
    public static void word(String word, String filepath)
    {
        try 
        {
            BufferedReader r = new BufferedReader(new FileReader(filepath));
            String content;
            int line = 0;
            boolean found = false;
            while((content = r.readLine())!=null)
            {
                line++;
                String[]arr = content.split("[\\W]+");  // (\W) it will not allow special character as a word...
                for(int i = 0;i<arr.length;i++)
                {
                    if(word.equalsIgnoreCase(arr[i]))  //equalsIgnoreCase allows to display even if it in the opposite case...
                    {
                        found = true;
                        System.out.println("Word found in line "+line);
                    }
                }
            }
            if(found == false)
            {
                System.out.println("Word not found...");
            }
            r.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        System.out.println("Enter the word to search....");
        Scanner java = new Scanner(System.in);
        String word = java.nextLine();
        word(word, "D:\\Java\\File.txt");
    }
}
// to count the no. of words in the file..
class F11 
{
    public static void main(String[] args) {
        try {
            File obj = new File("D:\\Java\\File.txt");
            BufferedReader r = new BufferedReader(new FileReader(obj));
            String word;
            int count = 0;
            while((word = r.readLine())!=null)
            {
                String[] arr = word.split(" ");
                count +=arr.length;
            }
            r.close();
        System.out.println("The no. of words: "+count); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//--------------------------------------------------------------------------------------------------------------------------------------------------
//Create and Write the data in the csv file...
class F12
{
    public static void write(String filepath)
    {
        try 
        {
            PrintWriter w = new PrintWriter(new File(filepath));
            w.println("ID,\tNAME,\tAGE");
            w.printf("%d,\t%s,\t%d", 1,"Alice",25);
            w.close();
            System.out.println("File has been created, Successfully....");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void read(String filepath)
    {
        try 
        {
           Scanner r = new Scanner(new File(filepath));
           r.useDelimiter(",");
           while(r.hasNextLine())
           {
            System.out.println(r.nextLine());
           } 
           r.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        write("D:\\Java\\File1.csv");
        read("D:\\Java\\File1.csv");
    }
}
//Write a Java program that takes an array of Student objects and writes them to a CSV file using PrintWriter.
class Student
{
    int id;
    String name;
    int age;
    public Student(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
class F13
{
    public static void csv(String filepath, Student[]students)
    {
        try 
        {
            PrintWriter r = new PrintWriter(new File(filepath));
            r.println("ID, NAME, AGE");
            for(Student i:students)
            {
                r.printf("%d, %s, %d\n", i.id, i.name, i.age);
            }
            r.close();
            System.out.println("Updated....");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        Student[]students = {new Student(1,"John",20), new Student(2,"Alice",22)};
        csv("D:\\Java\\File1.csv", students);
    }
}
// Write a Java program to search for a specific entry (e.g., a student's name) in a CSV file.
class F14
{
    public static void search(String filepath, String name)
    {
       try 
       {
        BufferedReader r = new BufferedReader(new FileReader(filepath));
        String content;
        boolean found = false;
        content = r.readLine();
        while(content!=null)
        {
            String[]arr = content.split(",\\s*");
            System.out.println(Arrays.toString(arr));
            if(arr[1].equalsIgnoreCase(name))
            {
                found = true;
                System.out.println("Record Found: "+ "ID: "+arr[0]+"  NAME: " + arr[1] +"  AGE: "+ arr[2]);
                break;
            }
            content = r.readLine();
        }
        if(found == false)
        {
            System.out.println("The Record is not found...");
        }
        r.close();
       } 
       catch (Exception e) 
       {
         e.printStackTrace();
       }
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the name you want to search...");
        String name = java.nextLine();
        search("D:\\Java\\File1.csv", name);
    }
}
//Write a Java program that updates a particular value in a CSV file.
//Sample Input: "students.csv", Update Age of John from 20 to 21
class F15
{
    public static void update(String filepath,String name, int age)
    {
        try 
        {
            BufferedReader r = new BufferedReader(new FileReader(filepath));
            PrintWriter w = new PrintWriter(new FileWriter("D:\\Java\\File2.csv"));
            String content;
            boolean found = false;
            while((content = r.readLine())!=null)
            {
                String[]arr = content.split(",\\s*");
                if(arr[0].equalsIgnoreCase("ID"))
                {
                    w.println(content);
                    continue;
                }
                if(arr[1].equalsIgnoreCase(name))
                {
                    arr[2] = String.valueOf(age);
                    found = true;
                }
                w.println(arr[0]+", "+arr[1]+", "+arr[2]);   //w.println(String.join(",\\s*",arr));
            }
                w.close();
                r.close();
                File o = new File(filepath);
                File n = new File("D:\\Java\\File2.csv");
                if(found==true)
                {
                    o.delete();
                    n.renameTo(o);
                    System.out.println("The File get updated...");
                }
                else{
                    n.delete();
                    System.out.println("Record not Found...");
                }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the name in which you want to update: ");
        String name = java.nextLine();
        System.out.println("Enter the age to update...");
        int age = java.nextInt();
        update("D:\\Java\\File1.csv",name, age);
    }
}
//Write a Java program that reads a CSV file and counts the number of rows and columns.
class F16 
{
    public static void count(String filepath)
    {
        try 
        {
            File obj = new File(filepath);
            BufferedReader r = new BufferedReader(new FileReader(obj));
            String content;
            int rowcount = 0, colcount=0;
            while((content = r.readLine())!=null)
            {
                rowcount++;
                String[]arr = content.split(",\\s*");
                colcount = Math.max(colcount, arr.length);
            }
            r.close();
            System.out.println("The number of rows in the "+obj.getName()+" file: " + rowcount);
            System.out.println("The number of columns in the "+obj.getName()+" file: " + colcount);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        count("D:\\Java\\File1.csv");
    }
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------
// Write a Java program to store user preferences (e.g., theme = dark mode) in a .properties file.
class F17  
{
    public static void pref(String filepath, Properties property)
    {
        try 
        {
            FileOutputStream o = new FileOutputStream(filepath);
            property.store(o, "USER PREFERENCE..");
            System.out.println("Preferences Saved Successfully..");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        Properties prop = new Properties();
        prop.setProperty("Theme", "Dark");
        prop.setProperty("Language", "English");
        pref("D:\\Java\\pref.properties", prop);
    }
}
// Write a Java program to read settings from a .properties file
class F18 
{
    public static void read(String filepath)
    {
        try 
        {
            FileInputStream r = new FileInputStream(filepath);
            Properties prop = new Properties();
            prop.load(r);
            System.out.println("Theme: "+prop.getProperty("Theme"));
            System.out.println("Language: "+prop.getProperty("Language"));
            r.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        read("D:\\Java\\pref.properties");
    }
}
//Modify a Property in a Properties File
class F19 
{
    public static void modify(String filepath, String key, String value)
    {
       try 
       {
        FileInputStream I = new FileInputStream(filepath);
        Properties prop = new Properties();
        prop.load((I));
        I.close();
        if(prop.containsKey(key))
        {
            prop.setProperty(key, value);
            FileOutputStream O = new FileOutputStream(filepath);
            prop.store(O, "Updated"+key);
            O.close();
            System.out.println("Property Updated Successfully...");
        }
        else
        {
            System.out.print("Property "+key+ " is not found...");
        }
       } 
       catch (Exception e) 
       {
         e.printStackTrace();
       }
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the key and Enter the value to update: ");
        String key = java.nextLine();
        String value = java.nextLine();
        modify("D:\\Java\\pref.properties", key, value);
    }
}
//Write a Java program to check if a particular key exists in a .properties file.
class F20 
{
    public static void search(String filepath, String key)
    {
        try 
        {
            FileInputStream I = new FileInputStream(filepath);
            Properties prop = new Properties();
            prop.load(I);
            I.close();
            if(prop.containsKey(key))
            {
                System.out.println(key +" Key Found in with the value: "+prop.getProperty(key));
            } 
            else
            {
                System.out.println("The key is not found..");
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the key to check: ");
        String key = java.nextLine();
        search("D:\\Java\\pref.properties", key);
    }
}
//Write a Java program that removes a key-value pair from a .properties file.
class F21   
{
    public static void remove(String filepath, String key)
    {
        try 
        {
            FileInputStream I = new FileInputStream(filepath);
            Properties prop = new Properties();
            prop.load(I);
            I.close();
            if(prop.containsKey(key))
            {
                prop.remove(key);
                FileOutputStream O = new FileOutputStream(filepath);
                prop.store(O, "Deleted "+key);
                O.close();
                System.out.println("The Key "+key+" deleted..");
            }
            else
            {
                System.out.println("The key is not found...");
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the key to delete: ");
        String key = java.nextLine();
        remove("D:\\Java\\pref.properties", key);
    }
}