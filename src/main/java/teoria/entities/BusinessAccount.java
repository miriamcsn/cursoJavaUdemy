package teoria.entities;

// class related to AprendendoHeranca

public class BusinessAccount extends Account {

    // in order to Class BusinessAccount to work,
    // it's necessary to add the standard constructor
    // in Account class: don't forget this!

    private Double loanLimit;

    // constructors

    public BusinessAccount() {
        super();
        // this super(); makes sure that the BusinessAccount objects
        // instanced with the standard constructor will follow the logic
        // included in the superclass' standard constructor too.
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);  // inheriting the constructors of the superclass Account :)
        this.loanLimit = loanLimit;
    }

    // getters and setters for BusinessAccount class
    // OBS: BusinessAccount objects inherit Account's getters and setters too!

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    // methods

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    @Override
    public String toString() {
        return "BusinessAccount{" +
                "balance=" + balance +
                ", loanLimit=" + loanLimit +
                '}';
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
