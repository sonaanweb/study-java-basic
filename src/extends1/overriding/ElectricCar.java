package extends1.overriding;

/**
 * 자식 클래스
 */
public class ElectricCar extends Car {

    @Override   // 어노테이션이 없어도 동작하지만 코드의 명확성을 위해 붙여줘야한다
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다");
    }
    
    public void charge(){
        System.out.println("차를 충전합니다");
    }
}

/**
 * 메서드 `오버라이딩(=재정의)` : 부모클래스의 기능을 새로 재정의하는 것. 상속관계에서 사용
 * cf. 메서드 `오버로딩` : 메서드 이름이 같고 매개변수(파라미터)가 다른 메서드를 여러개 정의하는 것
 */