package com.ogiraffers.chap01.section03;

/*
* 인터페이스 Deep Dive - 상속 계층도와 설계 간편화
*
* - 전자기기는 다양한 특성과 기능을 가지는데, 상속만으로 모든 기능을 정의하면 불필요한 기능까지 물려받거나
*   유연성이 떨어질 수 있다.
* - 예 : 모든 기기에 충전을 상속한다면 TV도 충전해야 하는 비현실적 상황 발생.
* - 인터페이스로 특정 기능(충전)을 분리하면 필요한 기기만 선택적으로 가져갈 수 있어 설계가 깔끔해진다.
*
* 설계 과정 :
* 1. Device로 기본 계층 구축
*   - 모든 전자기기는 전원을 켜고 끄는 기본 동작이 필요 -> Device를 추상 클래스로 정의해 공통 동작 보장.
*   - 역할 : 전자기기라는 큰 범주를 설정하고, 하위 계층으로 특성을 나눌 준비
*   - 비유 : 전자기기 공장에서 기본 모델 설계도를 만드는 단계!
*
* 2) PortAbleDevice와 FixedDevice로 특성 분리
*   - 휴대 기기(SmartPhone, Laptop)은 이동 가능, 고정 기기(TV)는 고정 설치 -> 계층도를 나누어 특성을 구체화
*   - 역할 : 상속으로 각 기기의 기본 동작(전원 방식)을 다르게 정의해 계층적 관리 가능.
*   - 비유 : 공장에서 휴대용과 고정형 라인으로 생산 분리
*
* 3) Rechargeable 인터페이스로 충전 관점 분리
*   - 모든 휴대 기기가 충전 가능한 것은 아님 (예 : 배터리 없는 mp3플레이어)
*   - SmartPhone, Laptop은 충전 필요, TV는 불필요 -> RechargeAble을 인터페이스로 분리해 선택적 적용
*   - 역할 : 상속 계층 밖에서 충전 기능을 정의해 필요한 기기만 가져가도록 유연성 확보
*   - 비유 : 공장에서 충전 옵션을 별도 부품으로 만들어 필요한 모델에만 장착
*
* 설계의 장점
* - 계층도 (Device -> PortAble/Fixed) 전원 동작 기기 유형을 체계적으로 정리
* - 인터페이스(RechargeAble) : 충전이라는 관점을 독립적으로 정의해 불필요한 결합 방지
* - 결과 : SmartPhone과 Laptop은 충전 가능, TV는 충전 없이 고정 기기로 유지 -> 설계 간결, 확장 쉬움
*
* 실무 연계
* - 상속 계층으로 기본 구조를 잡고, 인터페이스로 특정 기능을 모듈화하면 기기 추가(예 : Tablet), 기능 확장(예 : ConnectAble)용이.
* - 예 : 스마트폰에만 무선 충전 추가시 RechargeAble 확장 가능
* */

import com.ogiraffers.chap01.section03.model.*;

public class Application {
    public static void main(String[] args) {
        System.out.println("=== 기기 특징과 충전 관점 ===");
        Device smartPhone = new SmartPhone("Galaxy");
        Device laptop = new Laptop("Mac");
        Device tv = new TV("OLED");
        // 상속에서 기본 동작
        smartPhone.powerOn();
        laptop.powerOn();
        tv.powerOn();
        // 인터페이스 관점 (충전)
        ((Rechargeable) smartPhone).recharge();
        ((Rechargeable) laptop).recharge();

        // 유연한 어플리캐이션 조작이 가능
        Device[] devices = {smartPhone, laptop, tv};
        for (Device device : devices) {
            device.powerOn();
            if (device instanceof Rechargeable) { // Rechargeable 인터페이스를 받았다면
                ((Rechargeable) device).recharge(); // recharge메서드를 실행해라.
            }
            device.powerOff();
        }
    }
}
