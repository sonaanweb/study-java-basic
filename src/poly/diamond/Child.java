package poly.diamond;

// implements (구현)의 경우에는 다중구현 허용
public class Child implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    // 같은 메서드 구현은 하나만
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
