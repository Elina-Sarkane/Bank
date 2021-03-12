package entity;

public class User {
    public String accountNumber;
    public String pinCode;
    private double balance;
    public String name;
    public String gender;

    public User(String accountNumber, String pinCode, double balance, String name, String gender) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.balance = balance;
        this.name = name;
        this.gender = gender;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setDebit(double balance1){
        this.balance = balance1;
    }
}
