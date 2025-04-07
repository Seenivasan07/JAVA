import java.lang.invoke.ConstantCallSite;
import java.util.*;

public class Oopstest {
    public static void main(String[] args) {    
    }
}
//student class
class Student
{
    String name;
    int age;
    String grade;
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        Student obj = new Student();
        System.out.println("Enter the name: ");
        obj.name = java.nextLine();
        System.out.println("Enter the grade: ");
        obj.grade = java.nextLine();
        System.out.println("Enter the age: ");
        obj.age = java.nextInt();
        System.out.println("NAME: "+ obj.name);
        System.out.println("AGE: "+ obj.age);
        System.out.println("GRADE: "+ obj.grade);
    }
}
//Write a program with a book class that uses a parameterized constrctor to initialize title, author, and price, 
//and then display the book details.
class Book
{
    String Title;
    String Author;
    float Price;
    public Book(String Title, String Author, float Price)
    {
        this.Title = Title;
        this.Author = Author;
        this.Price = Price;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the title: ");
        String Title = java.nextLine();
        System.out.println("Enter the author: ");
        String Author = java.nextLine();
        System.out.println("Enter the price: ");
        float Price = java.nextFloat();
        Book obj = new Book(Title, Author, Price);
        System.out.println("TITLE: "+ obj.Title);
        System.out.println("AUTHOR: "+ obj.Author);
        System.out.println("PRICE: "+ obj.Price);
    }
}
/*build a simple address book program using classes. The program should allow:
1. adding a contact(name and phone number)
2. viewing all contacts.
3.Searching for a contact by name.

sample input/output:
1. add contact
2. view contact
3.search contact
4.exit */
class AddressBook
{
    private String[] Contactname;
    private String[] Contactnumber;
    private int count = 1;
    public AddressBook(int size)
    {
        this.Contactname = new String[size];
        this.Contactnumber = new String[size];
        this.Contactname[0] = "zoho";
        this.Contactnumber[0] = "9876543210";

    }
    public void addcontact(String contname, String contnumber)
    {
        if(count<Contactname.length)
        {
            this.Contactname[count] = contname;
            this.Contactnumber[count] = contnumber;
            count++;
            System.out.println("Contact Details added Successfully!!!");
        }
        else if(count>=Contactname.length)
        {
            System.out.println("The Address Book is Full !!!..");
        }
    }
    public void viewcontacts()
    {
        if(count==0)
        {
            System.out.println("Address Book is Empty!!");
        }
        for(int i = 0;i<count;i++)
        {
            System.out.println("Contact Name: "+ Contactname[i] + "  Contact Number: " + Contactnumber[i]);
        }
    }
    public void searchcontact(String contname)
    {
        boolean found = false;
        for(int i = 0;i<count;i++)
        {
            if(contname.equals(Contactname[i]))
            {
                System.out.println(Contactname[i]);
                System.out.println(Contactnumber[i]);
                found = true;
                break;
            }
        }
        if(found==false)
        {
            System.out.println("Contact is not found..");
        }
    }
}
class Contact
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the Address Book: ");
        int addsize = java.nextInt();
        String contactname, contactnumber;
        AddressBook obj = new AddressBook(addsize);
        while(true)
        {
        System.out.println("Enter \"1\" to ADDCONTACT\r\nEnter \"2\" to VIEWCONTACT\r\n"
                             + "Enter \"3\" to SEARCHCONTACT\r\nEnter \"4\" to EXIT"); 
        int option = java.nextInt();
        java.nextLine();
        switch(option)
        {
            case 1:
            {
                System.out.println("Enter the contactname: ");
                contactname = java.nextLine();
                System.out.println("Enter the Contactnumber: ");
                contactnumber = java.nextLine();
                obj.addcontact(contactname, contactnumber);
                break;
            }
            case 2:
            {
                obj.viewcontacts();
                break;
            }
            case 3:
            {
                System.out.println("Enter the contactname to search: ");
                contactname = java.nextLine();
                obj.searchcontact(contactname);
                break;
            }
            case 4:
            {
                System.out.println("Want to add or find any number... Use Me...");
                return;
            }
            default:
            {
                System.out.println("Enter some valid options!!!");
            }
           /*if (option == 4)
            {
                break;
            } */
        }
    }
    }
}
//create an employee class with attributes name, position, and salary. Write a program to add an employee and display their details.
class Employee
{
    String Name;
    String Position;
    float Salary;
    public Employee(String Name, String Position, float Salary)
    {
        this.Name = Name;
        this.Position = Position;
        this.Salary = Salary;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String Name = java.nextLine();
        System.out.println("Enter the Position: ");
        String Position = java.nextLine();
        System.out.println("Enter the Salary: ");
        float Salary = java.nextFloat();
        Employee obj = new Employee(Name, Position, Salary);
        System.out.println("NAME: "+ obj.Name);
        System.out.println("POSITION: "+ obj.Position);
        System.out.println("SALARY: "+ obj.Salary);
    }
}
//Write a Rectangle class with attributes length and width. Add methods to calculate area and perimeter.
class Rectangle
{
    float width;
    float length;
    public Rectangle(float width, float length)
    {
        this.width = width;
        this.length = length;
    }
    public float area()
    {
        return length * width;
    }
    public float perimeter()
    {
        return 2*(length + width);
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the length: ");
        float length = java.nextFloat();
        System.out.println("Enter the width: ");
        float width = java.nextFloat();
        Rectangle obj = new Rectangle(width, length);
        System.out.println("Enter \"1\" to find area or Enter \"2\" to find perimeter of the rectangle: ");
        int choice = java.nextInt();
        if(choice==1)
        {
            System.out.println("The Area of the Rectangle: "+obj.area());
        }
        else if(choice==2)
        {
            System.out.println("The Perimeter of the Rectangle: "+obj.perimeter());
        }
    }
}
// Create a circle class with an attribute radius. Write methods to calculate area and circumference.
class Circle
{
    float radius;
    public Circle(float radius)
    {
        this.radius = radius;
    }
    public float area()
    {
        return (float)Math.PI*radius*radius;
    }
    public float circumference()
    {
        return 2*(float)Math.PI*radius;
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius = java.nextFloat();
        Circle obj = new Circle(radius);
        System.out.println("Enter \"1\" to find area or Enter \"2\" to find circumference of the circle: ");
        int choice = java.nextInt();
        if(choice==1)
        {
            System.out.println("The Area of the circle: "+obj.area());
        }
        else if(choice==2)
        {
            System.out.println("The Circumference of the circle: "+obj.circumference());
        }
        else
        {
            System.out.println("Please Press the Valid Option!!!!");
        }
    }
}
//Write a Bank Acccount class with attributes account number, holder name, and balance. Add methods to deposit and withdraw money.
class BankAccount
{
    private String[] Account_Number;
    public  String[] AccountHolder_Name;
    private double[] Balance;
    public BankAccount(int size, String accno, String name, double balance)
    {
        Account_Number= new String[size];
        AccountHolder_Name = new String[size];
        Balance = new double[size];
        this.Account_Number[0] = accno;
        this.AccountHolder_Name[0] = name;
        this.Balance[0] =balance;
    }
    private void Deposit(String name, String accno, double amount)
    {
        boolean found = false;
        for(int i = 0;i<Account_Number.length;i++)
        {
            if(accno.equals(Account_Number[i]) && name.equals(AccountHolder_Name[i]))
            {
                Balance[i]+=amount;
                System.out.println("The Amount Deposited Successfully!!!\t Balance: "+ Balance[i]);
                found = true;
                break;
            }
        }
        if(found == false)
        {
            System.out.println("Please Enter the Credentials Correctly!!!");
        }
        return;
    }
    public void todeposit(String name, String accno, double amount)
    {
        Deposit(name, accno, amount);
        return;
    }
    private void withdraw(String name, String accno, double amount)
    {
        boolean found = false;
        for(int i = 0;i<Account_Number.length;i++)
        {
            if(accno.equals(Account_Number[i]) && name.equals(AccountHolder_Name[i]))
            {
                if(amount<=Balance[i])
                {
                Balance[i]-=amount;
                System.out.println("The Amount Withdrawn: "+ amount +"\t Balance: "+ Balance[i]);
                found = true;
                break;
                }
                else
                {
                    System.out.println("You have insufficient Balance: "+ Balance[i]);  
                    found = true;
                    break;
                }
            }
        }
        if(found == false)
        {
            System.out.println("Please Enter the Credentials Correctly!!!");
        }
        return;
    }
    public void towithdraw(String name, String accno, double amount)
    {
        withdraw(name, accno, amount);
        return;
    }
    public void getBalance(String name, String accno)
    {
        boolean found = false;
        for(int i = 0;i<Account_Number.length;i++)
        {
            if(accno.equals(Account_Number[i]) && name.equals(AccountHolder_Name[i]))
            {
                System.out.println("Balance: "+Balance[i]);
                found = true;
                break;
            }
        }
        if(found == false)
        {
            System.out.println("Please Enter the Credentials Correctly: ");
        }
        return;
    }  
}
class Bank
{
    public static void main(String[]args)
    {
        String name, accno;
        double amount;
        BankAccount obj = new BankAccount(4, "Z1234", "Zoho", 20000);
        Scanner java = new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter \"1\" to Deposit or Enter \"2\" to Withdraw or Enter \"3\" to view balance or Enter \"4\" to EXIT:");
        int choice = java.nextInt();
        java.nextLine();
        switch(choice)
        {
        case 1:
        {
          
            System.out.println("Enter the Account Holder Name: ");
            name = java.nextLine();
            System.out.println("Enter the Account No: ");
            accno = java.nextLine();
            System.out.println("Enter the amount to Deposit: ");
            amount = java.nextDouble();
            obj.todeposit(name, accno, amount);
            break;
        }
        case 2:
        {
            System.out.println("Enter the Account Holder Name: ");
            name = java.nextLine();
            System.out.println("Enter the Account No: ");
            accno = java.nextLine();
            System.out.println("Enter the amount to Withdraw: ");
            amount = java.nextDouble();
            obj.towithdraw(name, accno, amount);
            break;
        }
        case 3:
        {
            System.out.println("Enter the Account Holder Name: ");
            name = java.nextLine();
            System.out.println("Enter the Account No: ");
            accno = java.nextLine();
            obj.getBalance(name, accno);
            break;
        }
        case 4:
        {
            System.out.println("Shutting Down!!..");
            return;
        }
        default: 
        {
            System.out.println("Please Press the Valid Option!!!!");
        }
        }
        }
    }
}
//Write a car class with attributes make, model, and year. Add a  method to display car details. 
class Car
{
    String Make, Model;
    int year;
    public Car(String Make, String Model, int year)
    {
        this.Make = Make;
        this.Model = Model;
        this.year = year;
    }
    public void Disdetails()
    {
        System.out.println("Car: "+Make +" "+Model+" ( "+year+" )"); 
    }
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the Manufacturer: ");
        String make = java.nextLine();
        System.out.println("Enter the Model: ");
        String model = java.nextLine();
        System.out.println("Enter the year: ");
        int year = java.nextInt();
        Car obj = new Car(make, model, year);
        obj.Disdetails();
    }
}
//Inventory Management System
//Write a program using a Product class to manage an inventory. Allow adding products with attributes name, quantity, and price.
class Product
{
    String name, quantity;
    float price;
    String[]Name;
    String[]Quantity;
    float[]Price;
    int count=0;
    public Product(int size)
    {
        this.Name = new String[size];
        this.Quantity = new String[size];
        this.Price = new float[size];
    }

    public void addproduct(String name, String quantity, float price)
    {
        if(count<Name.length)
        {
            this.Name[count] =name;
            this.Quantity[count] = quantity;
            this.Price[count] = price;
            count++;
        }
        else{
            System.out.println("Inventory is full!!!");
        }
    }
    public void displayall()
    {
        if(count==0)
        {
            System.out.println("Inventory is Empty!!!!");
        }
        else{
            for(int i = 0;i<count;i++)
            {
                System.out.println("Product:" + Name[i]);
                System.out.println("Quantity:" + Quantity[i]);
                System.out.println("Price:" + Price[i]);
            }
        }
    }
    public void Searchfor(String productname)
    {
        for(int i = 0;i<count;i++)
        {
        if(productname.equals(Name[i]))
        {
        System.out.println("Product:" + Name[i]);
        System.out.println("Quantity:" + Quantity[i]);
        System.out.println("Price:" + Price[i]);
        }
        else
        {
            System.out.println("The product is not available!!");
        }
        }
    }
}
class Product1
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size of the Inventory: ");
        int addsize = java.nextInt();
        String Productname, Productquantity;
        int Price;
        Product obj = new Product(addsize);
        while(true)
        {
        System.out.println("Enter \"1\" to ADDPRODUCT\r\nEnter \"2\" to VIEWALLPRODUCT\r\n"
                             + "Enter \"3\" to SEARCHPRODUCT\r\n Enter \"4\" to close the Inventory"); 
        int option = java.nextInt();
        java.nextLine();
        switch(option)
        {
            case 1:
            {
                System.out.println("Enter the productname: ");
                Productname = java.nextLine();
                System.out.println("Enter the Contactnumber: ");
                Productquantity = java.nextLine();
                System.out.println("Enter the price of the product: ");
                Price = java.nextInt();
                java.nextLine();
                obj.addproduct(Productname, Productquantity, Price);
                break;
            }
            case 2:
            {
                obj.displayall();
                break;
            }
            case 3:
            {
                System.out.println("Enter the contactname to search: ");
                Productname = java.nextLine();
                obj.Searchfor(Productname);
                break;
            }
            case 4:
            {
                System.out.println("Closing Inventory!!!...");
                return;
            }
            default:
            {
                System.out.println("Enter some valid options!!!");
            }
        }
    }
    }
}
//Library Management System
//Build a library system using a Book class with attributes title, author, and avalilability. Allow checking out and returning books.
class Library
{
    String[]Books;
    String[]Author;
    int[]Availability;
    int count = 0;
    public Library(int size)
    {
        Books = new String[size];
        Author = new String[size];
        Availability = new int[size];
    }
    public void addbook(String book, String author, int avail)
    {
       boolean found = false;
        for(int i = 0;i<count;i++)
        {
            found = false;
            if((book.equals(Books[i])) && (author.equals(Author[i])))
            {
                Availability[i]+=avail;
                System.out.println("Book Added Successfully...");
                found = true;
                break;
            }
        }
        if(found == false)
        {
            if(count<Books.length)
            {
                Books[count] = book;
                Author[count] = author;
                Availability[count] = avail;
                System.out.println("Book Added Successfully...");
                count++;
            }
            else 
            {
                System.out.println("There is no Storage...");
            }
        }
        return;
    }
    public void checkingout(String book, String author, int avail)
    {   boolean found = false;
        for(int i = 0;i<count;i++)
        {
            if((book.equals(Books[i]))&&(author.equals(Author[i])))
            {
                found = true;
                if(avail<=Availability[i])
                {
                    System.out.println("Book Availability: "+ Availability[i]);
                    Availability[i]-=avail;
                    break;
                }
                else
                {
                    System.out.println("Book Availability :"+ Availability[i]);
                }
                break;
            }
        }
        if(found == false)
        {
            System.out.println("The Book is not available...");
        }
        return;
    }
    public void bookreturn(String book, String author, int bookreturn)
    {
        boolean found = false;
        for(int i = 0;i<count;i++)
        {
            if((book.equals(Books[i]))&&(author.equals(Author[i])))
            {
                System.out.println("Book Returned...");
                Availability[i]+=bookreturn;
                found = true;
                break;
            }

        }
        if(found == false)
        {
            System.out.println("You are returning a wrong book!!!!!");
        }
        return;
    }
    public void searchfor(String book, String author)
    {
        boolean found = false;
        for(int i = 0;i<count;i++)
        {
            if((book.equals(Books[i]))&&(author.equals(Author[i])))
            {
            System.out.println("Bookname: "+Books[i]);
            System.out.println("Authorname: "+Author[i]);
            System.out.println("Available: "+Availability[i]);
            found = true;
            break;
            }
        }
        if(found == false)
        {
            System.out.println("Sorry, The Book is not available...");
        }
        return;
    }
    public void viewallbooks()
    {
        for(int i = 0;i<count;i++)
        {
            System.out.println("Bookname: "+Books[i]);
            System.out.println("Authorname: "+Author[i]);
            System.out.println("Available: "+Availability[i]);
            System.out.println();
        }
        return;
    }
}
class Library2
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the Storage size: ");
        int size = java.nextInt();
        Library obj = new Library(size);
        String bookname, bookauthor;
        int avail, bookcount;
        while(true)
        {
            System.out.println("\nEnter \"1\" to ADDBOOK:\r\nEnter \"2\" to CHECKINGOUT:\r\n"
            + "Enter \"3\" to RETURNBOOK:\r\nEnter \"4\" to SEARCHFOR a book: \r\nEnter \"5\" to VIEWALL books: \r\n" 
            + "Enter \"6\" to EXIT: ");    
            int option = java.nextInt();
            java.nextLine();
            switch(option)
            {
                case 1:
                {
                    System.out.println("Enter the Bookname: ");
                    bookname = java.nextLine();
                    System.out.println("Enter the bookauthor: ");
                    bookauthor = java.nextLine();
                    System.out.println("Enter the count: ");
                    avail = java.nextInt();
                    obj.addbook(bookname, bookauthor, avail);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the Bookname: ");
                    bookname = java.nextLine();
                    System.out.println("Enter the bookauthor: ");
                    bookauthor = java.nextLine();
                    System.out.println("Enter the count: ");
                    avail = java.nextInt();
                    obj.checkingout(bookname, bookauthor, avail);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the Bookname: ");
                    bookname = java.nextLine();
                    System.out.println("Enter the bookauthor: ");
                    bookauthor = java.nextLine();
                    System.out.println("Enter the count: ");
                    bookcount = java.nextInt();
                    obj.bookreturn(bookname, bookauthor, bookcount);  
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the Bookname: ");
                    bookname = java.nextLine();
                    System.out.println("Enter the bookauthor: ");
                    bookauthor = java.nextLine();
                    obj.searchfor(bookname, bookauthor);
                    break;
                }
                case 5:
                {
                    obj.viewallbooks();
                    break;
                }
                case 6:
                {
                    System.out.println("Shut Downn....");
                    return;
                }
                default:
                {
                    System.out.println("Enter the valid option!!!");
                }
            }
        }
    }
}
// STUDENT MARK CLASS.....Create a class to store student marks for 3 subjects. Add a method to calculate the average marks.
class Mark
{
    String []Name;
    String []Rollno;
    float []Sub1;
    float []Sub2;
    float []Sub3;
    int count = 0;
    public Mark(int size)
    {
        Name = new String[size];
        Rollno = new String[size];
        Sub1 = new float[size];
        Sub2 = new float[size];
        Sub3 = new float[size];
    }
    public void Addmarks(String name, String rollno, float sub1, float sub2, float sub3)
    {
        boolean found = false;
        for(int i = 0;i<Name.length;i++)
        {
            found = false;
            if(name.equals(Name[i])&&rollno.equals(Rollno[i]))
            {
                System.out.println("Already Added, Please Enter the Credentials Correctly!!!");
                found = true;
                break;
            }    
        }
        if(found == false)
        {
            if(count<Name.length)
            {
            Name[count] = name;
            Rollno[count] = rollno;
            Sub1[count] = sub1;
            Sub2[count] = sub2;
            Sub3[count] = sub3;
            count++;
            System.out.println("Details Added Successfully...");
            }
            else
            {
                System.out.println("Storage is Full!!!");
            }
        }
        return;
    }
    public void avg(String name, String rollno)
    {
        boolean found = false;
        for(int i = 0;i<count;i++)
        {
            if(name.equals(Name[i])&&rollno.equals(Rollno[i]))
            {
                float avg = (Sub1[i] + Sub2[i] + Sub3[i]) / 3;
                System.out.println("The average of the student in 3 subjects: "+avg);
                found = true;
                break;
            }
        }
        if(found == false)
        {
            System.out.println("Enter the correct credentials...");
        }
        return;
    }
    public void viewall()
    {
        for(int i = 0;i<count;i++)
        {
            System.out.println("Name: "+ Name[i]);
            System.out.println("Rollno: "+ Rollno[i]);
            System.out.println("Sub1: "+ Sub1[i]);
            System.out.println("Sub2: "+ Sub2[i]);
            System.out.println("Sub3: "+ Sub3[i]);
        }
        return;
    }
}
class Mark2
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the storage limit: ");
        int size = java.nextInt();
        String name, rollno;
        float sub1, sub2, sub3;
        Mark obj = new Mark(size);
        while(true)
        {
          System.out.println("Enter \"1\" to AddMarks:\r\nEnter \"2\" to get the Average of a student:\r\nEnter \"3\" to view all marks:\n\r"+
          "Enter \"4\" to Exit:");
          int choice = java.nextInt();
          java.nextLine();
          switch(choice)
          {
            case 1:
            {
                System.out.println("Enter the name of the student: ");
                name = java.nextLine();
                System.out.println("Enter the rollno of the student: ");
                rollno = java.nextLine();
                System.out.println("Enter the mark of sub1: ");
                sub1 = java.nextFloat();
                System.out.println("Enter the mark of sub2: ");
                sub2 = java.nextFloat();
                System.out.println("Enter the mark of sub3: ");
                sub3 = java.nextFloat();
                obj.Addmarks(name, rollno, sub1, sub2, sub3);
                break;
            }
            case 2:
            {
                System.out.println("Enter the name of the student: ");
                name = java.nextLine();
                System.out.println("Enter the rollno of the student: ");
                rollno = java.nextLine();
                obj.avg(name, rollno);
                break;
            }
            case 3:
            {
                obj.viewall();
                break;
            }
            case 4:
            {
                System.out.println("Shutting Down!!!!");
                return;
            }
            default:
            {
                System.out.println("Enter the valid option!!!");
            }
          }
        }
    }
}
//TRAVEL AGENCY SYSTEM....Create a Travel Package class with attributes destination, days, and cost. 
//Add methods to display and update package details.
class Travel
{
    String[]Destination;
    int[]Days;
    double[]Cost;
    int count = 0;
    public Travel(int size)
    {
        Destination = new String[size];
        Days = new int[size];
        Cost = new double[size];
    }
    public void addpackage(String dest, int days, Double cost)
    {
        boolean found = false;
        for(int i = 0;i<count;i++)
        {
            found  = false;
            if(dest.equals(Destination[i])&&days==Days[i])
            {
                Cost[i]=cost;
                System.out.println("Cost of the Package updated successfully!!!..");
                found = true;
                break;
            }
            else if(dest.equals(Destination[i])&&cost==Cost[i])
            {
                Days[i]=days;
                System.out.println("Days of the Package updated successfully!!!..");
                found = true;
                break;
            }
        }
        if(found == false)
        {
        if(count<Destination.length)
        {
            Destination[count] = dest;
            Days[count] = days;
            Cost[count] = cost;System.out.println("Package Added successfully!!!..");

            count++;
        }
        else{
            System.out.println("Storage is full!!!!");
        }
    }
        return;
    }
    public void searchfor(String dest)
    {
        boolean found = false;
        for(int i = 0;i<count;i++)
        {
            if(dest.equals(Destination[i]))
            {
                System.out.println("Destination: "+ Destination[i]);
                System.out.println("Days: "+Days[i]);
                System.out.println("Cost: "+Cost[i]);
                found = true;
                break;
            }
        }
        if(found == false)
        {
            System.out.println("The Package for the Destination is not available!!!!");
        }
        return;
    }
    public void displayall()
    {
        for(int i = 0;i<count;i++)
        {
            System.out.println("Destination: "+ Destination[i]);
            System.out.println("Days: "+Days[i]);
            System.out.println("Cost: "+Cost[i]);
        }
        return;
    }
}
class Travel2
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = java.nextInt();
        String dest;
        int days;
        double cost;
        Travel obj = new Travel(size);
        while(true)
        {
            System.out.println("Enter \"1\" to ADD OR UPDATE Package:\n\rEnter \"2\" to Searchfor a DESTINATION:"+
            "\n\rEnter \"3\" to Display all:\n\rEnter \"4\" to EXIT: ");
            int choice = java.nextInt();
            java.nextLine();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the Destination Name: ");
                    dest = java.nextLine();
                    System.out.println("Enter the no. of days: ");
                    days = java.nextInt();
                    System.out.println("Enter the cost: ");
                    cost = java.nextDouble();
                    obj.addpackage(dest, days, cost);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the Destination Name: ");
                    dest = java.nextLine();
                    obj.searchfor(dest);
                    break;
                }
                case 3:
                {
                    obj.displayall();
                    break;
                }
                case 4:
                {
                    System.out.println("Shutting Down!!!");
                    return;
                }
                default:
                {
                    System.out.println("Enter the valid option...");
                }
            }
        }
    }
}
//SHOP BILLING SYSTEM.....Create a Bill class with attributes item_name, quantity and price_per_unit. 
//Write a method to calculate the total bill amount;
class Bill
{
    String[] Item;
    float[] Price;
    int count = 0;
    double Totalamt=0;
    public Bill(int size)
    {
        Item = new String[size];
        Price = new float[size];
    }
    public void Addproduct(String item, float price)
    {
        boolean found = false;
        for(int i = 0;i<count;i++)
        {
            found = false;
            if(item.equals(Item[i]))
            {
                Price[i] = price;
                System.out.println("Price of the Product updated Successfully!!!");
                found = true;
                break;
            }
        }
        if(found == false)
        {
            if(count<Item.length)
            {
                Item[count] = item;
                Price[count] = price;
                count++;
                System.out.println("The Product Added Successfully!!");
            }
            else
            {
                System.out.println("Storage is full!!!");
            }
        }
        return;
    }
    public void total(String[]item, int[]quantity)
    {
        for(int i = 0;i<item.length;i++)
        {
            for(int j = 0;j<Item.length;j++)
            {
            if(item[i].equals(Item[j]))
            {
                System.out.println("Item: "+Item[j]+"\tQuantity: "+quantity[i]+"\tPrice Per: "+ Price[j]+"\tTotalprice: "+quantity[i]*Price[j]);
                Totalamt+=quantity[i]*Price[j];
            }
        }
        }
        System.out.println("Total Amount= "+Totalamt);
        return;
    }
}
class Bill2
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = java.nextInt();
        String[]item = new String[size];
        int[]quantity = new int[size];
        String prodname;
        float price;
        Bill obj = new Bill(size);
        while(true)
        {
            System.out.println("Enter \"1\" to Add or Update Product:\r\nEnter \"2\" to Print Bill: "+
            "\r\nEnter \"3\" to Exit: ");
            int choice = java.nextInt();
            java.nextLine();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the product name: ");
                    prodname = java.nextLine();
                    System.out.println("Enter the Price for per unit: ");
                    price = java.nextFloat();
                    obj.Addproduct(prodname, price);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the no of products purchased and it should be less than size: ");
                    int n = java.nextInt();
                    java.nextLine();
                    System.out.println("Enter the productsname and quantity: ");
                    for(int i = 0, j=0;i<n&&j<n;i++,j++)
                    {
                        item[i] = java.nextLine();
                        quantity[j] = java.nextInt();
                        java.nextLine();
                    }
                    obj.total(item, quantity);
                    break;
                }
                case 3:
                {
                    System.out.println("Shutting Down!!!..");
                    return;
                }
                default:
                {
                    System.out.println("Please Enter a valid option!!!");
                }
            }
        }
    }
}