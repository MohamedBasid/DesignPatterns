package com.example.designpatterns.facade;

public class NotifyHelper {
    void sendEmail() {
        System.out.println("Email sent");
    }
    void sendSMS() {
        System.out.println("SMS sent");
    }
    void sendWhatsapp(){
        System.out.println("Watsapp message sent");
    }
    void setReminder() {
        System.out.println("Reminder set");
    }
}
