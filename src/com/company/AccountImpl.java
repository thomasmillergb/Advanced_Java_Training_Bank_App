package com.company;

/**
 * Created by G710 on 05/12/2016.
 */
public class AccountImpl implements Account {
    private TotalBalanceMonoState totalBalanceMonoState_;
    private int id;
    private int balance;

    public AccountImpl(int id, TotalBalanceMonoState totalBalanceMonoState) {
        balance = 0;
        this.id = id;
        totalBalanceMonoState_ = totalBalanceMonoState;
    }

    @Override
    public void depsit(int amount) {
        balance += amount;
        totalBalanceMonoState_.updateTotalBalance(amount);
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
        totalBalanceMonoState_.updateTotalBalance(-1 * amount);
    }

    public int getBalance() {
        return balance;
    }

    public int getID() {
        return id;
    }
}
