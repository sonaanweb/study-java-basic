package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩 불가
        poly.method(); // 메서드 오버라이딩 가능
    }
}

/**
 * Child -> Child
 * value = child
 * Child.method
 *
 * Parent -> Parent
 * value = parent
 * Parent.method
 *
 * Parent -> Child
 * value = parent
 * Child.method
 */

/**
 * poly 변수는 Parent 타입. Parent 타입에서 기능을 찾아 실행
 * -> poly.method() 호출하려 했더니 Child.method로 오버라이딩 된 게 있다면,
 * 인스턴스 안에서 오버라이딩 된 메서드는 `항상 우선권`을 가진다
 */