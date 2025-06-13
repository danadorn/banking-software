// Main.java
public class Main {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount("S123", "Alice", 1000.0, 2.5);
        sa.deposit(500);
        sa.withdraw(200);
        sa.showSavingDetails();

        System.out.println();

        CreditCardAccount ca = new CreditCardAccount("C456", "Bob", 300.0, 1000.0, "12/25", true);
        ca.deposit(150);
        ca.withdraw(100);
        ca.showCreditCardDetails();
    }
}
