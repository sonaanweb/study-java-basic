package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {

        InterfaceA a = new Child(); // 부모는 자식을 담을 수 있다
        a.methodA();
        a.methodCommon();

        /**
         * Child.methodA
         * Child.methodCommon
         * 오버라이딩 된 게 호출된다
         */

        InterfaceB b = new Child();
        b.methodB();
        a.methodCommon();
    }
}