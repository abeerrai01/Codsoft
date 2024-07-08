import java.util.Scanner;


public class AtmInterface
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(1000.0); // Initialize account with $1000
        ATM atm = new ATM(account);
        atm.start();
    }
}
class BankAccount
{
    public double balance;

    public BankAccount(double iBalance)
    {
        if (iBalance >= 0)
        {
            this.balance = iBalance;
        } else
        {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else
        {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount)
    {
        if (amount > 0)
        {
            if (amount <= balance)
            {
                balance -= amount;
                System.out.println("Withdrew: ₹" + amount);
                return true;
            } else
            {
                System.out.println("Insufficient funds. Try again.");
                return false;
            }
        }
        else
        {
            System.out.println("Withdrawal amount should be positive.");
            return false;
        }
    }
}
class ATM
{
    public BankAccount acc;

    public ATM(BankAccount account)
    {
        this.acc = account;
    }

    public void displayMenu()
    {
        System.out.println("\nATM Menu:");
        System.out.println("1: Withdraw");
        System.out.println("2: Deposit");
        System.out.println("3: Check Balance");
        System.out.println("4: Exit");
    }

    public void withdraw(double amount)
    {
        if (acc.withdraw(amount))
        {
            System.out.println("Please take your cash.");
        }
    }

    public void deposit(double amount)
    {
        acc.deposit(amount);
    }

    public void checkBalance()
    {
        System.out.println("Current balance: " + acc.getBalance());
    }

    public void start()
    {
        Scanner in = new Scanner(System.in);
        boolean run = true;
        while (run)
        {
            displayMenu();
            System.out.print("Choose An Option From Atm Menu: ");
            int c = in.nextInt();
            switch (c)
            {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = in.nextDouble();
                    withdraw(withdraw);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = in.nextDouble();
                    deposit(deposit);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    run = false;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
