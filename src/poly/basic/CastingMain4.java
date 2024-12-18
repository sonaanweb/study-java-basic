package poly.basic;

/**
 * instanceOf
 */
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child){ // parent에 들어가 있는 게 Child로 부터 생성된 인스턴스라면
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent; // 다운 캐스팅 o
            child.childMethod();
        }
    }
}