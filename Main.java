import java.util.Scanner;

class BankAccount{
    int acNo;
    String acName, acPhone, acEmail;
    double acBal;
    public BankAccount(int acNo, String acName, String acPhone, String acEmail, double acBal ){
        this.acNo = acNo;
        this.acName = acName;
        this.acPhone = acPhone;
        this.acEmail = acEmail;
        this.acBal = acBal;
    }
    public void accountHolder(){
        System.out.println("Account Number: " + acNo);
        System.out.println("Account Holder Name : " + acName);
        System.out.println("Account Holder Address " + acPhone);
        System.out.println("Account Holder Phone: " + acEmail);
        System.out.println("Account Holder Balance: " + acBal);

    }
    public void deposit(double amount){
        acBal += amount;
        System.out.println("Deposited: $" + amount);
    }
    public void displayBalance(){
        System.out.println("Account Number: " + acNo + " Balance: "+ acBal);

    }
}
class SavingsAccount extends BankAccount{
    public SavingsAccount(int acNo, String acName, String acPhone, String acEmail, double acBal){
        super(acNo, acName, acPhone, acEmail, acBal);
    }
}
class CurrentAccount extends BankAccount{
    public CurrentAccount(int acNo, String acName, String acPhone, String acEmail, double acBal){
        super(acNo, acName, acPhone, acEmail, acBal);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("CURRENT ACCOUNT DETAILS");
        CurrentAccount sac= new CurrentAccount(1001, "PeterSmith", "081000000", "admin@gmail.com", 0.0);
        sac.accountHolder();
        System.out.print("\nEnter the amount to deposit: ");
        double amt = in.nextDouble();
        System.out.println("\n");
        sac.deposit(amt);
        sac.accountHolder();

}
}
