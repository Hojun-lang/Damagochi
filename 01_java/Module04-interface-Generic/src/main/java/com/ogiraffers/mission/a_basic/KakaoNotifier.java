package com.ogiraffers.mission.a_basic;

public class KakaoNotifier implements Notifier{
    @Override
    public String send(String message) {
        return ("[카카오톡 알림] : " + message);
    }
}
