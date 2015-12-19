
public class Transaction {
    private java.util.Date mDate;
    private char mType;
    private double mAmount;
    private double mBalance;
    private String mDescription;
    
    public Transaction(char type, double amount, double balance, String description) {
        mType = type;
        mAmount = amount;
        mBalance = balance;
        mDescription = description;
        mDate = new java.util.Date();
    }

    public char getType() {
        return mType;
    }
    
    public void setType(char type) {
        mType = type;
    }
    
    public double getAmount() {
        return mAmount;
    } 
    
    public void setAmount(double amount) {
        mAmount = amount;
    }

    public double getBalance() {
        return mBalance;
    }
    
    public void setBalance(double balance) {
        mBalance = balance;
    }
    
    public String getDescription() {
        return mDescription;
    }
    
    public void setDescription(String description) {
        mDescription = description;
    }
    
    public java.util.Date getDate() {
        return mDate;
    }
    
    
}