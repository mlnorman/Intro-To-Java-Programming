import java.util.ArrayList;

class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions;

    public Account() {
        dateCreated = new java.util.Date();
        transactions = new ArrayList<Transaction>();
    }

    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }
    
    public Account(int id, double balance, String n) {
        this(id, balance);
        this.name = n;
    }

    public String getName() {
        return name; 
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        Transaction t = new Transaction('W', amount, this.balance, "Withdraw from account.");
        transactions.add(t);
    }

    public void deposit(double amount) {
        this.balance += amount;
        Transaction t = new Transaction('D', amount, this.balance, "Deposit to account.");
        transactions.add(t);
    }
}