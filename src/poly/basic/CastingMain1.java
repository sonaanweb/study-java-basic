package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다. - 컴파일 오류
        // poly.childMethod();

        // 다운 캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly; // poly를 child 타입으로 변경 후 대입
        child.childMethod();

        /**
         * 업캐스팅 : 부모 타입으로 변경
         * 다운캐스팅 : 자식 타입으로 변경
         * [중요] 참조 값의 타입이 변경되는 것이지 본래 타입이 변경되는 것은 아니다
         */

        // [+] 일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
    }
}
