package entities;

public interface IAccount {
    
    void toWithdraw(double value);

    void deposit(double value);

    void transfer(IAccount account, double value);

    void extract();

}
