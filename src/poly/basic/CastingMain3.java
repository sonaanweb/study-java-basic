package poly.basic;

/**
 * 다운 캐스팅의 한계점
 */
public class CastingMain3 {

    public static void main(String[] args) {
        Parent parent1 = new Child(); // Child 생성 - 자식, 부모 둘 다 생성
        Child child1 = (Child) parent1; // 다운 캐스팅
        child1.childMethod(); // 문제 없음 = child1은 원래 child 타입

        Parent parent2 = new Parent(); // Parent 생성 - 자식 타입 없음
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastingException
        child2.childMethod(); // 실행 불가
        // * Parent 인스턴스 속에는 Child 자체가 없기 때문에 캐스팅 불가함.
    }
}

/**
 * 컴파일 오류 - > 변수명 오타, 잘못된 클래스 이름 사용 등 자바 실행 전 발생하는 오류. IDE에서 즉시 확인 가능
 * 런타임 오류 - > 실행되고 있는 시점에서 발생하는 오류.
 */