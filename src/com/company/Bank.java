package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by G710 on 05/12/2016.
 */
public class Bank {


    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<>();
        TotalBalanceMonoState totalBalanceMonoState = new TotalBalanceMonoStateImpl();
        IntStream.range(0, 100).forEach(a -> accounts.add(new AccountImpl(a, totalBalanceMonoState)));
        List<Teller> teller = new LinkedList<>();
        teller.add(new Teller());
        teller.add(new Teller());
        teller.add(new Teller());
        teller.add(new Teller());  teller.add(new Teller());
        teller.add(new Teller());

        teller.parallelStream()
                .forEach(t -> {
                    try {
                        t.work(accounts);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

//        IntStream.range(0, 100).forEach(a -> {
//            try {
//                teller.work(accounts);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
    }

}
