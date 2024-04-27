package com.example.designpatterns.adaptor;

public class PaytmAdaptor implements PaymentAdapter{

    Paytm paytm = new Paytm();
    @Override
    public void makePayment() {
        paytm.paymentCreator();
    }

    @Override
    public void getStatus() {
        paytm.findStatus();
    }
}
