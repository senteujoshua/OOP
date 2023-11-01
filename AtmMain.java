
import java.util.Scanner;

//import java.util.Scanner;
class ATM {
    private double balance;
    public ATM(double initialBalance) {
        balance = initialBalance;
    }
    public void getBalance()
    {
        System.out.println("The balance is\t"+balance);
    }
    public void Setdeposit(double amount)
    {
        balance+=amount;
        System.out.println( "Deposited:"+amount);
        getBalance();
    }
    public void setWithdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            getBalance();
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}
class BankAccount{
    int acNo;
    String acName,acPhone,acEmail;
    double acBal;
    public BankAccount(int acNo,String acName,String acPhone,String acEmail,double acBal){
        this.acNo=acNo;
        this.acName=acName;
        this.acPhone=acPhone;
        this.acEmail=acEmail;
        this.acBal=acBal;
    }
    public void accountholder(){
        System.out.println("Account Number:"  + acNo);
        System.out.println("Account Holder Name:"+ acName);
        System.out.println("Account Holder Address"+acEmail);
        System.out.println("Account Holder Phone"+acPhone);
        System.out.println("Account Holder Balance"+acBal);
    }
  private double balance;
  public BankAccount(double initialBalance) {
    balance = initialBalance;
  }
  public void getBalance()
  {
    System.out.println("The balance is\t"+balance);
  }
  public void Setdeposit(double amount)
  {
    balance+=amount;
    System.out.println( "Deposited:"+amount);
    getBalance();
  }

}
class CurrAcc extends BankAccount{
    public CurrAcc(int acNo,String acName,String acPhone,String acEmail,double acBal){
        super(acNo,acName,acPhone,acEmail,acBal);
    }

}
public class AtmMain {
    public static void main(String[] args) {
        // Create an ATM object with an initial balance of $1000
        ATM atm = new ATM(1000.0);
        Scanner scanner = new Scanner(System.in);
        CurrAcc holder1= new CurrAcc(24345,"Senteu","0115265472","senteujoshua@gmail.com",45000);
      System.out.println("SAVING ACCOUNT DETAILS\t");
      holder1.accountholder();
      holder1.Setdeposit(3000);
      holder1.getBalance();




        for(int count =0;count<4;count++) {
            int maxTrials = 3;
            String correctPin = "8280";


            for (int attempt = 1; attempt <= maxTrials; attempt++) {
                System.out.print("Enter your PIN: ");
                String enteredPin = scanner.next();

                if (enteredPin.equals(correctPin)) {
                    System.out.println("PIN is correct. Access granted!");
                    boolean isRunning = true;
                    while (isRunning) {
                        System.out.println("\nATM Menu:");
                        System.out.println("1. Check Balance");
                        System.out.println("2. Make a Deposit");
                        System.out.println("3. Make a Withdrawal");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice (1-4): ");
                        int choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                atm.getBalance();
                                break;
                            case 2:
                                System.out.print("Enter the deposit amount: $");
                                double depositAmount = scanner.nextDouble();
                                atm.Setdeposit(depositAmount);
                                break;
                            case 3:
                                System.out.print("Enter the withdrawal amount: $");
                                double withdrawalAmount = scanner.nextDouble();
                                atm.setWithdraw(withdrawalAmount);
                                break;
                            case 4:
                                isRunning = false;
                                System.out.println("Thank you for using the ATM.");
                                break;
                            default:
                                System.out.println("Invalid choice. Please select 1-4.");
                        }
                    }
                }
                else {
                    System.out.println("Incorrect PIN. Attempts remaining: " + (maxTrials - attempt));
                }

                if (attempt == maxTrials) {
                    System.out.println("Card Blocked.");
                }
            }


        }









        scanner.close();
    }
}

