package poly.ex4;

/**
 * 순수 추상 클래스 : 모든 메서드가 추상 메서드인 클래스 = 본인이 가지는 기능이 없다
 */
public abstract class AbstractAnimal {

    public abstract void sound();
    public abstract void move();
}

/**
 * == 다형성을 위한 부모타입으로써 껍데기 역할만 제공
 * 1. 인스턴스를 생성할 수 없다
 * 2. 상속 시 자식은 모든 메서드를 오버라이딩 해야 한다
 * 3. 주로 다형성을 위해 사용된다
 */