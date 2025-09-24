package com.ohgiraffers.oop.mission.a_basic;

public class BankAccount {
    private String accountNumber;
    private long balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = "계좌번호 : 110-223-516210 신한";
    }

    public BankAccount(long balance) {
        this.balance = 1300000;
    }

    public void deposit(long inAmount) {
        balance = (balance + inAmount);
    }
    public void withdraw(long outAmount){
        if (outAmount > balance) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance = balance - outAmount;
        }
    }
    public void getBalance(long amount){
        System.out.println(balance);
    }

    public static void main(String[] args) {

    }
}
