package com.company;

import java.util.List;

/**
 * Created by G710 on 05/12/2016.
 */
public class Teller {

    public Teller() {
    }

    public void work(List<Account> accounts) throws InterruptedException {
        for (Account account :
                accounts) {
            int amount = (int) (Math.random() * 100);
            if(Math.random() > 0.50){
                Thread.sleep(50L);
                account.depsit(amount);
            }
            else{
                account.withdraw(amount);
            }
            System.out.println(account.getID() +"  :  " + account.getBalance());
        }
    }
}
