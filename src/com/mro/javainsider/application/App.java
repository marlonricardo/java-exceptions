package com.mro.javainsider.application;

import com.mro.javainsider.account.Account;

public class App {
    public static void main(String[] args) {
        Account a1 = new Account("163708");
        a1.deposit(500);
        System.out.println(a1);
        if(!a1.withdraw(600)){
            System.out.println("Withdraw error! Enough funds.");
        }
        System.out.println(a1);

    }
}
