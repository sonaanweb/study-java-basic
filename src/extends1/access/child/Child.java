package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 1; // `상속 관계` or 같은 패키지
        // defaultValue = 1; 다른 패키지 접근 불가, 컴파일 오류
        // privateValue = 1; 외부 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); // 상속 관계 or 같은 패키지
        // default, privateMethod 접근 불가

        printParent(); // publicMethod 접근 가능
    }
}

/**
 * 본인 타입에 없으면 부모 타입에서 기능을 찾는데, 이 때 접근 제어자가 영향을 준다.
 * 객체 내부에서는 자식과 부모가 구분되어있기 때문.
 * ==> 결국 자식 타입에서 부모 타입의 기능을 호출할 때, 부모 입장에서는 외부 호출한 것과 같아진다.
 */