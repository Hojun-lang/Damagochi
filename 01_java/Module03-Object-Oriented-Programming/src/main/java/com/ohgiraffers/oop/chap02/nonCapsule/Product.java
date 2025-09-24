package com.ohgiraffers.oop.chap02.nonCapsule;

public class Product {
    public double payment;

    public String selling(){
        if(payment == 0){
            return "냅둬유 그냥 개나 주게";
        } else if (payment < 0) {
            return "장사는 뭐더러혀 어차피 넘주는데";
        } else {
            return payment + " 에 가지고 가려면 그러던가";

        }
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
}
