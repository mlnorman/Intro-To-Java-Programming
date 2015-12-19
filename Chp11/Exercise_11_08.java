import java.util.ArrayList;

public class Exercise_11_08 {
    public static void main(String[] args) {
        Account ac = new Account(1122, 1000.0, "George");
        ac.setAnnualInterestRate(1.5);
        
        ac.deposit(30.0);
        ac.deposit(40);
        ac.deposit(50);
        ac.withdraw(5);
        ac.withdraw(4);
        ac.withdraw(2);
    
        System.out.printf("%s Account #%d%nInterest rate: %.2f%n" +
                          "Balance: %.2f%n" +
                          "Transactions: %n", 
                          ac.getName(),
                          ac.getId(),
                          ac.getAnnualInterestRate(),
                          ac.getBalance());
                          
        ArrayList<Transaction> transactions = ac.getTransactions();
        for (Transaction trans : transactions) {
            System.out.printf("%nTransaction date: %s%n" + 
                              "Transaction type: %s%n" +
                              "Transaction amount: %.2f%n" +
                              "Transaction description: %s%n" +
                              "Balance after transaction: %.2f%n", 
                              trans.getDate().toString(),
                              trans.getType(),
                              trans.getAmount(),
                              trans.getDescription(),
                              trans.getBalance());
        }
    }
}