package polymorphisms;

public class Bank extends Account{

    double balance = 2000000;

    @Override
    public void AccountOpen(){
        System.out.println("Hdfc Bank Account");
    }

    @Override
    public void Balance(){
        System.out.println("Total Balance");
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.AccountOpen();
        bank.Balance();
    }
}
