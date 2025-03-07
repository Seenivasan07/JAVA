import java.util.Scanner;
public class Encap
{
    public static void main(String[]args)
    {}
}
class Encapsulation {
    String name;
    private String Accno;
    private int pin;
    private int balance = 0;
    public Encapsulation(String name, String Accno, int pin)    //here, used constructor so, it automatically called when object for the class is created.
    {
        this.name = name; 
        this.Accno = Accno;
        this.pin = pin;
    }
    private void deposit(int amt) // declared deposit as private. so, it can only access from the same class
    {
        System.out.println("Old Balance: "+ balance);
        this.balance = balance + amt;
        System.out.println("Deposit: "+amt+"\n"+"New Balance: "+ balance);
    }
    private void withdraw(int amt)// declared withdraw as private. so, it can only access from the same class
    {
        if(balance>amt)
        {
        System.out.println("Old Balance: "+ balance);
        this.balance = balance - amt;
        System.out.println("Deposit: "+amt+"\n"+"New Balance: "+ balance);
        }
        else
        {
            System.out.println("You Don't have sufficient amount and your balance is: "+ balance);
        }

    }
    public String changeAccname (String newaccname)
    {
        System.out.println("Old User Name: "+ name);
        this.name = newaccname;
        System.out.println("New User Name: "+ name);
        return name;
    }
    public int changepin(int oldpin, int newpin)
    {
        if(this.pin == oldpin)
        {
            this.pin = newpin;
            System.out.println("New Pin Generated Successfully!!!");
        }
        else{
            System.out.println("Your old pin is not matched. Enter the correct pin!!!!");
        }
        return pin;
    }
    /* Here this [PerformTransaction] method is used to access the methods deposit and withdraw in the class */
    public void PerformTransaction(int pin, int action, int amt)
    {
        if(this.pin == pin)
        {
            if(action == 1)
            {
                deposit(amt);
            }
            else if(action == 2)
            {
                withdraw(amt);
            }
        }
        else{
            System.out.println("The Entered pin is wrong...");
        }
    }
    public int getbalance()
    {
        return balance;
    }
}
class Encaps 
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the Account Holder Name: ");
        String name = java.nextLine();
        System.out.println("Enter the pin: ");
        int pin = java.nextInt();
        Encapsulation obj = new Encapsulation(name,"J7A7V7A7",pin);
        System.out.println("Account has been created Succesfully!!!");
        System.out.println("Your Account Number: J7A7V7A7");

        System.out.println("Enter \" 1 \" for Deposit or Enter \" 2 \" for Withdraw: ");
        int action = java.nextInt();
        System.out.println("Enter the amount: ");
        int amount = java.nextInt();
        obj.PerformTransaction(pin,action,amount);


    }
}


