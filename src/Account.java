// BankSystem.java
abstract class Account {
    private String accNumber;
    private String accHolder;
    private double balance;

    public Account(String accNumber, String accHolder, double balance) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance or invalid amount");
    }

    public void showBalance() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Current Balance: $" + balance);
    }

    // Getters and setters
    public String getAccNumber() { return accNumber; }
    public String getAccHolder() { return accHolder; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}

// Subclass: SavingAccount
class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accNumber, String accHolder, double balance, double interestRate) {
        super(accNumber, accHolder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    public void showSavingDetails() {
        super.showBalance();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CreditCardAccount
class CreditCardAccount extends Account {
    private double limitAmount;
    private String expDate;
    private boolean validation;

    public CreditCardAccount(String accNumber, String accHolder, double balance,
                             double limitAmount, String expDate, boolean validation) {
        super(accNumber, accHolder, balance);
        this.limitAmount = limitAmount;
        this.expDate = expDate;
        this.validation = validation;
    }

    public double getLimitAmount() { return limitAmount; }
    public String getExpDate() { return expDate; }
    public boolean isValidation() { return validation; }

    public void showCreditCardDetails() {
        super.showBalance();
        System.out.println("Limit Amount: $" + limitAmount);
        System.out.println("Expiry Date: " + expDate);
        System.out.println("Validation: " + (validation ? "Valid" : "Invalid"));
    }
}
