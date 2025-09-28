/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author csong
 */
public class AccountDirectory {

    private ArrayList<Account> accounts;

    public AccountDirectory() {
        this.accounts = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
    public Account addAccount() {
        Account a = new Account();
        accounts.add(a);
        return a;
    }
    
    public void removeAccount(Account acc) {
        accounts.remove(acc);
    }
    
    public Account searchAccount(String accountNumber) {
        for (Account a: accounts) {
            if (a.getAccountNumber().contains(accountNumber)) {
                return a;
            }
        }
        return null;
    }

}
