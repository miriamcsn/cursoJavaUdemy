package exercicios.s09e01.util;

public class BankAccount {

    private final int number;
    private String holder;
    private double balance;

    // constructors

    public BankAccount(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);  // encapsulamento
    }

    public BankAccount(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    // getters and setters

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }


    // métodos

    public void deposit(double deposit) {
        balance += deposit;
        // estou encapsulando a regra de deposito em apenas um método - caso mude no futuro, muda só aqui!
    }

    public void withdraw(double withdraw) {
        balance -= withdraw + 5;  // taxa de 5 reais toda vez que fizer um saque
    }

    @Override
    public String toString() {
        return 	"Account: "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
