import java.util.*;
import java.io.*;
public class Filehandling
{
    public static void main(String[]args)
    {

    }
}
class Fh1 {
    public static void createfile(String filepath)
    {
        try 
        {
            File obj = new File(filepath);
            if(obj.createNewFile())
            {
                System.out.println("The file "+obj.getName()+" has been created succesfully");
            }
            else
            {
                System.out.println("There is a problem in creating the file....");
            }   
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*public static void writefile(String filepath)    //writing using Filewriter
    {
        try 
        {
            FileWriter obj = new FileWriter(filepath);
            obj.write("In the following example, we use the FileWriter class together with its write() method\n\r" 
            +"to write some text to the file we created in the example above.\n\r"
            +"Note that when you are done writing to the file, you should close it with the close() method:");
            obj.close();
            System.out.println("The file get written.");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }*/
    public static void writefile(String filepath) //File write using Buffered writer
    {
        try 
        {
            BufferedWriter obj = new BufferedWriter(new FileWriter(filepath));
            obj.write("In the following example, we use the FileWriter class together with its write() method");
            obj.newLine();
            obj.write("to write some text to the file we created in the example above.");
            obj.newLine();
            obj.write("Note that when you are done writing to the file, you should close it with the close() method:");
            obj.close();
            System.out.println("The file get written...");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    /*public static void readfile(String filepath)//File reading using Scanner
    {
        try 
        {
            File obj = new File(filepath);
            Scanner sobj = new Scanner(obj);
            while(sobj.hasNextLine())
            {
                System.out.println(sobj.nextLine());
            }
            sobj.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }*/
    public static void readfile(String filepath)   //File reading using buffered class
    {
        try 
        {
           BufferedReader obj = new BufferedReader(new FileReader(filepath));
           String line;
           int count = 0;
           while((line = obj.readLine())!=null) 
           {
            System.out.println(line);
            count++;
           }
           obj.close();
           System.out.println("The file has been readed.");
           System.out.println("The no. of lines in the file: "+count);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*public static void readfile(String filepath) // File reading using Filereader
    {
        try 
        {
            FileReader obj = new FileReader(filepath);
            int character;
            while((character = obj.read())!=-1)
            {
               System.out.print((char)character);
            }
            obj.close();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }*/
    public static void rename(String newpath, String oldpath)
    {
        try 
        {
            File oldpat = new File(oldpath);
            File newpat = new File(newpath);
            if(oldpat.renameTo(newpat))
            {
                System.out.println("File name has been renamed Successfully");
            }
            else
            {
                System.out.println("There is a problem in renaming a file");
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void deletef(String filepath)
    {
        try 
        {
            File obj = new File(filepath);
            if(obj.delete())
            {
                System.out.println("The file has been deleted successfully");
            }
            else
            {
                System.out.println("There is a problem in deleting the file");
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        createfile("C:\\java\\JAVA\\file.txt");
        writefile("C:\\java\\JAVA\\file.txt");
        readfile("C:\\java\\JAVA\\file.txt");
        rename("C:\\\\java\\\\JAVA\\\\filehandling.txt", "C:\\\\java\\\\JAVA\\\\file.txt");
        //deletef("C:\\\\\\\\java\\\\\\\\JAVA\\\\\\\\filehandling.txt");
    }
}
//working with csv files...
class Fh2
{
    public static void writefile(String filepath)
    {
        try 
        {
        FileWriter obj = new FileWriter(filepath);
        obj.append ("name,\t age,\t email\n");
        obj.append ("asus,\t 22,\t asus22@gmail.com\n");
        obj.append ("vivo,\t 23,\t asus23@gmail.com\n");
        obj.append ("book,\t 24,\t asus24@gmail.com\n");
        obj.close();
        } 
        catch (Exception e) 
        {
        e.printStackTrace();
    }
    }
    public static void readfile(String filepath)
    {
        try 
        {
        Scanner obj = new Scanner(new File(filepath));
        obj.useDelimiter(",");
        while(obj.hasNextLine())
        {
            System.out.println(obj.nextLine());
        }
        obj.close();         
    } 
    catch (Exception e) 
    {
        e.printStackTrace();
    }
    }
    public static void main(String[]args)
    {
        writefile("C:\\java\\JAVA\\file.txt");
        readfile("C:\\java\\JAVA\\file.txt");
    }
}
