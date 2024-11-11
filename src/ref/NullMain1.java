package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;   // null 할당 - 참조 대상 X
        System.out.println("1. data = " + data);

        data = new Data();  // 객체 생성 참조값 할당
        System.out.println("2. data = " + data);

        data = null;    // 다시 주소지 제거 null 대입
        System.out.println("3. data = " + data);    // null
    }
}

/**
 * GC(가비지 컬렉션)- "아무도 참조하지 않는 인스턴스의 최후"
 * data에 null 할당. x001 data 인스턴스를 아무도 참조하지 않는다. 그러므로 해당 인스턴스에 다시 접근할 방법이 없다.
 * 이렇게 아무도 참조하지 않는 인스턴스는 사용되지 않고 메모리 용량만 차지한다.
 * 자바는 이런 과정을 자동으로 처리해준다. JVM의 GC가 더 이상 사용하지 않는 인스턴스라 판단하고 해당 인스턴스를 자동으로 메모리에서 제거
 */