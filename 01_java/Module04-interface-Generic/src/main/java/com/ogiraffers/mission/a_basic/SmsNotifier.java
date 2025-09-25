package com.ogiraffers.mission.a_basic;

public class SmsNotifier implements Notifier {
    @Override
    public String send(String message) {
       return ("[SMS 알림] : " + message);
    }
}
