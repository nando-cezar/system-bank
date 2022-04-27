package entities;

import java.util.List;

public class Bank {
    
    private String name;
    private List<IAccount> accounts;

    public Bank(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(IAccount account) {
        this.accounts.add(account);
    }

    @Override
    public String toString() {
        return  this.name;
    }

}
