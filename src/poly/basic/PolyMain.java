package poly.basic;

public class PolyMain {

    public static void main(String[] args) {

        // 1 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 2 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 3 부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        /**
         * child 인스턴스를 만들어 child, parent가 메모리상에 모두 생성
         * 이 참조 값을 부모 타입에 담을 수 있다 = [자바 허용]
         * 즉 부모 타입은 자신, 자신을 기준으로 모든 자식 타입을 참조할 수 있다. [다형적 참조]
         * 반대로 자식 타입은 부모 타입을 담을 수 없다.
         */
        // Child child1 = new Parent(); 컴파일 오류 - 자식은 부모를 담을 수 없다.
        // poly.childMethod(); 컴파일 오류 - `자식의 기능`은 호출할 수 없다.
        // ㄴ 다형적 참초의 한계 : 기능까지 호출하려면 `캐스팅`이 필요하다.
    }
}
