package extends1.ex2;

/**
 * 자식 클래스
 */
public class ElectricCar extends Car{
    
    public void charge(){
        System.out.println("차를 충전합니다");
    }
}


/**
 * 객체 생성 시 상속 관계에 있는 car까지 포함해 인스턴스 생성
 * 즉, 단순하게 부모의 필드와 메서드만 물려 받는 게 아닌 부모 클래스도 함께 포함해 생성된다.
 * 내부에서는 부모와 자식의 공간이 구분된다.
 */