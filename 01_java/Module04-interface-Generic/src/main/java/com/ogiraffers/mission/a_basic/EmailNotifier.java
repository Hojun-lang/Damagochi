package com.ogiraffers.mission.a_basic;

public class EmailNotifier implements Notifier {
    @Override
    public String send(String message) {
        return ("[이메일 알림 : " + message);
    }
}
