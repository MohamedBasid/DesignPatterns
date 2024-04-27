package com.example.designpatterns.adaptor;

public class Main {
    public static void main(String[] args) {
        PaymentAdapter paymentAdapter = new PaytmAdaptor();
        paymentAdapter.makePayment();
        paymentAdapter.getStatus();
    }
}
