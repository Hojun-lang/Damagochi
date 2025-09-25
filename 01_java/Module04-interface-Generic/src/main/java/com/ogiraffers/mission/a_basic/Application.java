package com.ogiraffers.mission.a_basic;

public class Application {
    public static void main(String[] args) {

        Notifier[] arr = {new EmailNotifier(), new KakaoNotifier(), new SmsNotifier()};

        for (Notifier notifier : arr) {

        }
    }

}
