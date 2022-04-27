package entities;

public class SavingsAccount extends Account {

    public SavingsAccount(Client client, Bank bank) {
        super(client, bank);
    }

    @Override
    public void extract() {
        System.out.println();
        System.out.println("Extrato Conta Poupança;");
        super.infoCommon();
    }
    
}
