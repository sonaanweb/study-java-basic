package static1;

public class Data3 {
    public String name;
    public static int count; // static 사용

    public Data3(String name){
        this.name = name;
        count++;    // static 정적 변수
    }
}

/**
 * [공용 변수 사용]
 * 변수 타입 앞에 static 키워드가 붙게되면 static 변수, 정적 변수, 클래스변수라 한다
 * 객체가 생성되면 생성자에서 정적 변수 count 값을 증가시킴
 *
 * ------------------------------------------------
 * 정리 * 멤버 변수의 종류
 * 1. 인스턴스 변수 : static이 붙지 않은 변수
 * 2. 클래스 변수 : static 변수 = 클래스 변수 = 정적 변수,
 * 자바 실행 시 딱 한 개 만들어지고 인스턴스와는 다르게 여러곳에서 공유하는 목적으로 사용 됨
 */