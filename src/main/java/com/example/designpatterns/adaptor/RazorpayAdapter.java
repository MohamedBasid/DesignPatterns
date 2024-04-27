package com.example.designpatterns.adaptor;

public class RazorpayAdapter implements PaymentAdapter {

    Razorpay razorpay = new Razorpay();

    @Override
    public void makePayment() {
        razorpay.createPayment();
    }

    @Override
    public void getStatus() {
        razorpay.getStatus();
    }
}
