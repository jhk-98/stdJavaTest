package com.example.interfaceprograms;

public class BankAccount {
    private double balance;
    private int accountNumber;
    private static int lastAssignedNumber = 1000;

    public BankAccount(double balance){
        this.balance = balance;
        lastAssignedNumber++;
        accountNumber = lastAssignedNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public static double average(BankAccount[] objects){
        if(objects.length == 0){
            return 0;
        }
        else{
            double sum =0;
            for (BankAccount obj : objects){
                sum = sum + obj.getBalance();
            }
            return sum / objects.length;
        }
    }
}
