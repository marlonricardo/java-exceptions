package com.mro.javainsider.account;

public class Account {
    private String number;
    private double balance;

    public Account(String number){
        this.number = number;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public boolean withdraw(double amount){
        if(balance - amount >= amount){
            this.balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
