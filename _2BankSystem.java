import java.util.Scanner;

interface Account {
    void deposit(double amount);

    void withDrow(double amount);

    double getBalance();
}

abstract class BankAcount implements Account {
    protected double balance;

    public BankAcount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withDrow(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Not sufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAcount {
    private final double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }

    public void withDrow(double amount) {
        super.withDrow(amount);
    }
}

class CheckingAccount extends BankAcount {
    private static final double fee = 1.00;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    public void withDrow(double amount) {

        balance = balance - amount + fee;

    }
}

class BankSystem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the user name:");
        String name = sc.nextLine();
        System.out.println("enter the account number");
        int accountNumber = sc.nextInt();

        System.out.print("Choose account type (current: 1/savings:2): ");
        int accountType = sc.nextInt();

        Account account = null;
        if (accountType == 2) {
            System.out.print("Enter initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Enter interest rate: ");
            double interestRate = sc.nextDouble();
            account = new SavingsAccount(initialBalance, interestRate);
        } else if (accountType == 1) {
            System.out.print("Enter initial balance: ");
            double initialBalance = sc.nextDouble();
            account = new CheckingAccount(initialBalance);
        } else {
            System.out.println("Invalid account type");
            return;
        }

        while (true) {

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.println("Choose an option");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter deposit amount");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withDrow(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance:" + account.getBalance());
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Invalid choise");
            }
        }
    }
}