package com.example.designpatterns.facade;

public class Notifier {
    NotifyHelper notifyHelper = new NotifyHelper();

    public void notifyUs() {
        notifyHelper.sendEmail();
        notifyHelper.sendSMS();
        notifyHelper.sendWhatsapp();
        notifyHelper.setReminder();
    }
}
