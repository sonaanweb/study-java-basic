package extends1.ex2;

/**
 * 부모 클래스
 */
public class Car {

    public void move(){
        System.out.println("차를 이동합니다");
    }
}


/**
 * 자식 -> 'extends' -> 부모클래스 [방향]
 * 자식클래스는 부모클래스의 기능을 물려 받게 되지만,
 * 부모 클래스는 자식 클래스에 접근할 수 없다.
 * (+) 다중 상속은 지원하지 않는다. [extends 대상은 하나만!]
 * ---> 대신 인터페이스의 다중 구현을 허용해 문제를 피할 수 있다
 */