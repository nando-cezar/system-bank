package entities;

public class CheckingAccount extends Account {

    public CheckingAccount(Client client, Bank bank) {
        super(client, bank);
    }

    @Override
    public void extract() {
        System.out.println();
        System.out.println("Extrato Conta Corrente;");
        super.infoCommon();
    }
    
}
