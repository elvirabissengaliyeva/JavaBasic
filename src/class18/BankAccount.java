package class18;

public class BankAccount {
    long accountNumber;
    double money;
    void deposit(){
        System.out.println("Deposit");

    }
}
class Checking extends BankAccount {

    double interest;

    void transfer() {
        System.out.println("transfer method from Checking class");
    }
}
class Savings extends BankAccount{
        double profit;
        void takeProfit(){
            System.out.println("Profit Method from Savings class");
        }

    }
    class SuperSavings extends Savings{

    void superSaving(){
        System.out.println("");
    }

    }

