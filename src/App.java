import entities.Bank;
import entities.CheckingAccount;
import entities.Client;
import entities.IAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        
        IAccount ca = new CheckingAccount(
            new Client("Iris Souza Cezar"),
            new Bank("Banco do Brasil")
            );
        IAccount sa = new SavingsAccount(
            new Client("Luís Fernando Cezar dos Santos"),
            new Bank("Bradesco")
            );

        ca.extract();
        sa.extract();
    }
}
