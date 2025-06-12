public class Account {
    int accNumber;
    String accHolder;
    double accBalance;
}

class SavingsAccount extends Account{
    int deposit;
    int withdraw;
    int interest;
    int balance;

}

class CreditCard extends Account{
    int limitAmount;
}
