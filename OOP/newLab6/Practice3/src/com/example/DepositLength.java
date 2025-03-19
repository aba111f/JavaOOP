package com.example;

public class DepositLength {
    
    private int days;

    private DepositLength(int days){
        this.days = days;
    }


    public int getDays(){
        return days;
    }

    public static DepositLength THREE_MONTH(){
        return new DepositLength(90);
    }
    public static DepositLength SIX_MONTH(){
        return new DepositLength(180);
    }

    public static void main(String[] args){
    }
   
}
