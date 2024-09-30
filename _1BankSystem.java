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
                        System.out.println("Not safficient balance");
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

class BankSystem {
        public static void main(String[] args) {
                SavingsAccount sv = new SavingsAccount(5000, 0.05);
                CheckingAccount ca = new CheckingAccount(5000);

                sv.deposit(2000);
                sv.withDrow(1000);
                sv.addInterest();
                System.out.println("Savings Account Balance: " + sv.getBalance());

                ca.deposit(2000);
                ca.withDrow(1000);
                System.out.println("Checking Account Balance: " + ca.getBalance());
        }
}