package teoria.entities;

// class related to AprendendoHeranca

public abstract class Account {

    private Integer number;
    private String holder;
    protected Double balance;
/*
    protected makes sure that all subclasses inherited from this class
    will be able to access and modify this argument.
    - if the argument were private, would be only visible into the Account class.
    Not even the inherited/extended classes would be able to access it;
    - if the argument were public, every class in the project would be able to access,
    that would be a security breach.

*/

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    // balance can only be set by the methods below:

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
