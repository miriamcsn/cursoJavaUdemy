package teoria;

// section 14 - inheritance, polymorphism, upcasting, downcasting, override, keywords protected, and final

import teoria.entities.Account;
import teoria.entities.BusinessAccount;
import teoria.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class AprendendoHeranca {

    public static void main(String[] args) {

/*
        Account acc = new Account(
                1001,
                "Alex",
                0.0);

        acc.deposit(100);
        System.out.println(acc.getBalance());
        acc.withdraw(10);
        System.out.println(acc.getBalance());
*/


/*        BusinessAccount bacc = new BusinessAccount(
                1002,
                "Maria",
                0.0,
                500.0);


        // UPCASTING

        Account acc1 = bacc;         // it's ok to do this because Account CONTAINS BusinessAccount
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

*//*
        System.out.println("acc: " + acc.toString());
        System.out.println("\nbacc: " + bacc.toString());
        System.out.println("\nacc1: " + acc1.toString());
        System.out.println("\nacc2: " + acc2.toString());
        System.out.println("\nacc3: " + acc3.toString());
*//*

        // DOWNCASTING

*//*
        BusinessAccount acc4 = acc2;  // error! why? explanation below:

        even having instancing acc2 as BusinessAccount, it's type
        is still Account. So the compiler alerts that we can't convert
        an Account type to BusinessAccount type -- the compiler can't know
        for sure if what acc2 contains is for sure of BusinessAccount type to
        place it securely into acc4.
        * How do I fix this? *
        we have to cast it manually, as seen below.
*//*

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

*//*
        BusinessAccount acc5 = (BusinessAccount) acc3; // error while executing! why? explanation below:

        In the code above, I'm trying to make a downcast of acc3 converting it into BusinessAccount type.
        However, acc3 is of SavingsAccount type, that extends Account but not BusinessAccount.
        So, when we ask to make a downcast to a Type that is not inherited by the class, the compiler
        initially does not complain, but when you run the application, it will throw the
        ClassCastException, that will alert you that SavingsAccount cannot be cast to BusinessAccount.
        * How do I fix this? *
        Before downcasting an object, first we have to know its type.
        That's why we use the word "instanceof". See below:
 *//*

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3; // agora sim
            acc5.loan(300.0);
            //System.out.println("Loan!");
        }
        else if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            //System.out.println("Update!");
        }
*/
/*
        Account acc6 = new Account(63452, "Míriam", 1000.0);
        acc6.withdraw(200.0);
        System.out.println("Saldo: " + acc6.getBalance());

        Account acc7 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println("Saldo: " + acc7.getBalance());

        Account acc8 = new BusinessAccount(293874, "Juliano", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println("Saldo: " + acc8.getBalance());
*/
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f", sum);

        for (Account acc : list) {
            acc.deposit(10.0);
            System.out.printf("Updated balance: %.2f%n", acc.getBalance());
        }
    }
}
