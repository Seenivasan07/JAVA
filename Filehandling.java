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
           int count = 0;
           String line;
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
        writefile("D:\\Java\\filehand.csv");
        readfile("D:\\Java\\filehand.csv");
    }
}
//Methods in Filehandling
class Fh3//creating a folder using (mkdir)
{
    public static void main(String[]args)
    {
        try {
        File obj = new File("D:\\Java");
        boolean present = obj.exists();  //(exists) checking whether the file is already present or not....
        if(present==false)
        {
            obj.mkdir();
            System.out.println("The folder "+obj.getName() +"is created..."); // (getName) method which is used to get the name of the file or folder.
        }
        else{
            System.out.println("Folder name already exists...");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
class Fh4//creating a subfolder inside the folder using (mkdirs)
{
    public static void main(String[]args)
    {
        try {
        File obj = new File("D:\\Java\\filehandling\\methods");
        boolean present = obj.exists(); 
        if(present==false)
        {
            obj.mkdirs();
            System.out.println("The folder is created...");
        }
        else{
            System.out.println("Folder name already exists...");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
class Fh5 // creating a file using (createNewFile())
{
    public static void main(String[]args)
    {
        try {
        File obj = new File("D:\\Java\\filehandling.txt");
        boolean present = obj.exists(); 
        if(present==false)
        {
            obj.createNewFile();
            System.out.println("The file is "+obj.getName() +"created...");
        }
        else{
            System.out.println("File name already exists...");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
class Fh6 //deleting the file using (delete())
{
    public static void main(String[]args)
    {
        try {
        File obj = new File("D:\\Java\\filehandling.txt");
        boolean found = obj.exists();
        if(found == true)
        {
            obj.delete();
            System.out.println("The file has been deleted successfully...");
        }
        else
        {
            System.out.println("Check whether the file name enter is correct ...");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
class Fh7//Renaming the file using (rename()) method..
{
    public static void main(String[] args) {
        try 
        {
            File old = new File("D:\\Java\\filehandling.txt");
            File newf = new File("D:\\Java\\filehand.txt");
            Boolean found = old.exists();
            if(found == true)
            {
                old.renameTo(newf);
                System.out.println("The name has been changed successfully...");
            } 
            else
            {
                System.out.println("File name already exists.. or The oldfile is not present...");
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Fh8 //to check the property of the file whether it can be execute, read or write...
{
    public static void main(String[]args)
    {
        try 
        {
          File obj = new File("D:\\Java\\filehand.txt");  
          Boolean found = obj.exists();
          if(found = true)
          {
             System.out.println(obj.canExecute());   //checks whether the file can be execute..
             System.out.println(obj.canRead());      //checks whether the file can be read..
             System.out.println(obj.canWrite());     //checks whether the file can be write..
          }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
class Fh9 // to list the files in the folder using (list())...if we use (listFiles()) this will only print files and folders in a file array.
{
    public static void main(String[]args)
    {
        try 
        {
           File obj = new File("D:");
           String[] lists = obj.list();         // (list) method will take a list of all the files in the filepath given and store .
           for(String i:lists)                  // in array in string datatype
           {
            System.out.println(i);
           } 
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
class Fh10
{
    public static void main(String[]args)
    {
        try 
        {
          File obj = new File("C:\\Users\\seeni\\OneDrive\\Desktop");
          File[] lists = obj.listFiles();       //it only list files and folders..
          for(File i:lists)
          {
            System.out.println(i);
          }
          for(File i:lists)
          {
            if(i.isFile())                 //it will only print files..
            {
                System.out.println(i);
            }
          }
          System.out.println(" ");
          for(File i:lists)
          {
            if(i.isDirectory())                 //it will only print folders..
            {
                System.out.println(i);
            }
          }
          for(File i:lists)  // print only the extension what you want...
          {
            if(i.isFile())              
            {
                String name = i.getName();
                int last = name.lastIndexOf(".");
                String ext = name.substring(last+1);
                if(ext.equals("txt"))
                {
                System.out.println(ext+" "+i.length());
                }
            }
          }
        } 
        catch (Exception e)
        {
            // TODO: handle exception
        }
    }
}
class Fh11 // writing in a file using buffered writer...
{
    public static void main(String[]args)
    {
        try {
        File obj = new File("D:\\Java\\filehand.txt");
        BufferedWriter bwrite = new BufferedWriter(new FileWriter("D:\\Java\\filehand.txt"));
        bwrite.write("Writes text data efficiently by buffering character.");
        bwrite.newLine();
        bwrite.write("Faster than FileWriter alone because it reduces I/O operations by minimizing disk writes.");
        bwrite.newLine();
        bwrite.write("Supports methods like write(), newLine() for line breaks, and flush() for immediate writing.");
        bwrite.newLine();
        bwrite.flush();//The .flush() method in Java's BufferedWriter is used to forcefully write buffered data to the file without closing the writer.
        bwrite.close();
        System.out.println("The file has been written successfully..."); 
            
    } catch (Exception e) {
        e.printStackTrace();
    }  
    }    
}
class Fh12 // reading in file using scanner...
{
    public static void main(String[] args) {
        try {
            File obj = new File("D:\\Java\\filehand.txt");
            Scanner java = new Scanner(obj);
            while (java.hasNextLine()) 
            {
                System.out.println(java.nextLine());
            }
            java.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Fh13      //reading file using bufferedreader..
{
    public static void main(String[]args)
    {
        try {
            File obj = new File("D:\\Java\\filehand.txt");
            BufferedReader r = new BufferedReader(new FileReader(obj));
            String line;
            while((line = r.readLine())!=null)
            {
                System.out.println(line);
            }
            r.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Fh14 // appending the data with the existing ones...
{
public static void main(String[] args) {
    try {
        File obj = new File("D:\\Java\\filehand.txt");
        BufferedWriter r = new BufferedWriter(new FileWriter(obj, true)); // while appending you have to pass "True" to append if not
        r.newLine();                                                             // default it take it as "False" and replace the existing ones..
        r.append("i am from zoho");
        System.out.println("The file has been appended...");
        r.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
class Fh15 //to count the no. of lines in the file...
{
    public static void main(String[] args) {
        try {
        File obj = new File("D:\\Java\\filehand.txt");
        BufferedReader r = new BufferedReader(new FileReader(obj));
        String line;
        int count = 0;
        while((line=r.readLine())!=null)
        {
            System.out.println(line);
            count++;
        } 
        r.close();
        System.out.println("The no. of lines: "+count);       
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
class Fh16 // to count the no. of sentences in the file..
{
    public static void main(String[] args) {
        try {
            File obj = new File("D:\\Java\\filehand.txt");
            BufferedReader r = new BufferedReader(new FileReader(obj));
            String[] arr;
            String line;
            int count = 0;
            while((line = r.readLine())!=null)
            {
                arr = line.split("[.]");//split will return values in array format... 
                count +=arr.length;
                System.out.println(line);
            }
            r.close();
        System.out.println("The no. of sentences: "+count); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Fh17 // to count the no. of words in the file..
{
    public static void main(String[] args) {
        try {
            File obj = new File("D:\\Java\\filehand.txt");
            BufferedReader r = new BufferedReader(new FileReader(obj));
            String word;
            int count = 0;
            while((word = r.readLine())!=null)
            {
                String[] arr = word.split(" ");
                count +=arr.length;
                System.out.println(word);
            }
            r.close();
        System.out.println("The no. of words: "+count); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Fh18 // to count the no. of characters in the file..
{
    public static void main(String[] args) {
        try {
            File obj = new File("D:\\Java\\filehand.txt");
            FileReader r = new FileReader(obj);
            int c;
            int count = 0;
            while((c = r.read())!=-1)
            {
                count ++;
                System.out.print((char)c);
            }
            r.close();
        System.out.println("The no. of words: "+count); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Siri implements Serializable  // we have to implement serializable class for serialization
{
    String content;
    public Siri(String content)
    {
        this.content = content;
    }
    public void display()
    {
        System.out.println(content);
    }
}
class Fh19 // serializing a file...
{
    public static void main(String[]args)
    {
        try {
            File obj = new File("D:\\Java\\filehand.txt");
            BufferedReader r = new BufferedReader(new FileReader(obj));
            StringBuilder b = new StringBuilder();
            String line;
            while((line = r.readLine())!=null)
            {
                b.append(line).append("\n");
            }
            r.close();
            Siri s = new Siri(b.toString());
            FileOutputStream f = new FileOutputStream("D:\\Java\\serialize.ser");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(s);
            o.close();
            f.close();
            System.out.println("The file get serialized...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Fh20    //Deserializing the file....
{
    public static void main(String[]args)
    {
        try {
            File obj = new File("D:\\\\Java\\\\serialize.ser");
            FileInputStream f = new FileInputStream(obj);
            ObjectInputStream o = new ObjectInputStream(f);
            Siri s = (Siri)o.readObject();
            o.close();
            s.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Fh21 //writing and storing property files...
{
    public static void main(String[]args)
    {
        try {
            Properties pro = new Properties();
            pro.setProperty("name", "ZOHO");      //(set property) is used to set the value for the key..
            pro.setProperty("Phno", "7777777");
            FileOutputStream o = new FileOutputStream("D:\\Java\\prop.properties");
            pro.store(o,"Credentials");            //(store) is used to push the key and values as a property file with a comment..
            o.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Fh22
{
    public static void main(String[]args)
    {
        try {
            Properties pro = new Properties();
            FileInputStream f = new FileInputStream("D:\\Java\\prop.properties");
            pro.load(f);
            System.out.println("Name: "+ pro.getProperty("name"));
            System.out.println("Phno: "+ pro.getProperty("Phno"));
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}