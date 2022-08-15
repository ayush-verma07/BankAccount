//Ayush Verma
//4B
import java.util.*;
public class BankAccountRunner
{
    public static void main(String[] args)
    {
        BankAccount a = new BankAccount("Florida", 110.0);
        BankAccount b = new BankAccount("Texas", 80.5);
        BankAccount c = new BankAccount("Abdul", 100000000000000.00);
        //1
        System.out.println("The largest balance's balue is --> " + Math.max(Math.max(a.getBalance(),b.getBalance()),c.getBalance()));

        //2
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a value for the double amount");
        double amount = console.nextDouble();
        a.withdraw(amount);
        System.out.println(a.getBalance());

        //3
        System.out.println("Enter a value for String owner first and then the Double balance");
        BankAccount d = new BankAccount(console.next(), console.nextDouble());
        System.out.println(d.getOwner());
        System.out.println(d.getBalance());



    }
}