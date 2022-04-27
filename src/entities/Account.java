package entities;

public abstract class Account implements IAccount{
    
    private static final int AGENCY_ = 1;
    private static int SEQUENTIAL = 1;

    private Client client;
    private Bank bank;

    protected int agency;
    protected int number;
    protected double balance;


    public Account(Client client, Bank bank){
        this.client = client;
        this.bank = bank;
        this.agency = Account.AGENCY_;
        this.number = SEQUENTIAL++;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void toWithdraw(double value) {
        this.balance -= value;
    }

    @Override
    public void deposit(double value) {
        this.balance += value;    
    }

    @Override
    public void transfer(IAccount destinationAccount, double value) {
        this.toWithdraw(value);
        destinationAccount.deposit(value);
    }

    protected void infoCommon(){
        System.out.println(String.format("Cliente: %s", this.client));
        System.out.println(String.format("Banco: %s", this.bank));
        System.out.println(String.format("Agencia: %d", this.agency));
        System.out.println(String.format("Numero da conta: %d", this.number));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }

}
