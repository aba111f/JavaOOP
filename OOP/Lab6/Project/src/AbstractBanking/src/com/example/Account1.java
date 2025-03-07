/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractBanking.src.com.example;

import Java.util.Date;
import Java.util.*;

/**
 *
 * @author hans
 */
public abstract class Account1 {
    protected double balance;

    public Account1() {
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract boolean withdraw(double amount) ;
    
}
