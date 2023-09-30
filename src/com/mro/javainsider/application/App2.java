package com.mro.javainsider.application;

import com.mro.javainsider.account.Account2;

public class App2 {
    public static void main(String[] args) {
        Account2 a1 = new Account2("163708");
        a1.deposit(500);
        System.out.println(a1);

        int rc = a1.withdraw(2000);

        if(rc == -2){
            System.out.println("Withdraw error! Not enough funds.");
        }else if(rc == -1){
            System.out.println("Withdraw erro! Negative amount");
        }else if(rc == 1) {
            System.out.println("Withdraw success!");
            System.out.println(a1);
        }

    }
}
