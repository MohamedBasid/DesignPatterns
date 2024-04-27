package com.example.designpatterns.adaptor;

public class Razorpay {
    Razorpay() {

    }
    void createPayment(){
        System.out.println("Payment created via Razorpay");
    }

    void getStatus(){
        System.out.println("Razorpay status is displayed");
    }
}
