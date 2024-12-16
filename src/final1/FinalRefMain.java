package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // 참조형 -> 참조값 주소(x001)..
        // data = new Data();

        // `참조 대상의 객체 값`은 `변경 가능`
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}

/**
 * (data.value는 final이 붙지 않았다)
 * 참조형 변수 data에 final이 붙으면 참조형 변수에 들어있는 '참조 값(주소)'를 다른 값으로 변경하지 못한다
 * == > 다른 객체는 참조할 수 없게 됨
 * 참조하는 대상의 값(data)는 변경할 수 있다. (final 아닐 시)
 */