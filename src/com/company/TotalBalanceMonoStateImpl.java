package com.company;

/**
 * Created by G710 on 05/12/2016.
 */
public class TotalBalanceMonoStateImpl implements TotalBalanceMonoState {

    private static int totalBalance_;

    @Override
    public int getTotalBalance() {
        return totalBalance_;
    }

    @Override
    public void updateTotalBalance(int amount) {

        totalBalance_ += amount;
    }
}
