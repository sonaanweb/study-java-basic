package oop;

public class ValueObjectMain {

    /**
     * 분리 후
     */
    public static void main(String[] args) {
        ValueData valueData = new ValueData();  // 생성
        valueData.add();    // 메서드 호출 사용
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자 = " + valueData.value);
    }
}

// 클래스는 속성(데이터, 멤버 변수) 기능(메서드) 정의할 수 있다.
// 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있다.
// 객체 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수이다.