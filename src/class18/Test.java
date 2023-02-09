package class18;

public class Test {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.accountNumber=3578543567876l;
        ba.money=1000;

        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);
        System.out.println("---- Creating an Object ");

        Checking check=new Checking();
        check.accountNumber=5765;
        check.money=780;
        check.interest=0;

        check.deposit();
        check.transfer();

        System.out.println("---- Creating an Object of Savings account");

        Savings save=new Savings();
        save.accountNumber=8758585985l;
        save.money=7657;
        save.profit=100;

        save.deposit();
        save.takeProfit();
    }
}
