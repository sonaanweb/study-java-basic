package final1;

public class FinalLocalMain {

    public static void main(String[] args) {

        // final 지역 변수
        final int data1;
        data1 = 10; // final은 지역 변수에 설정할 경우 최초 한번만 할당 가능
        // data1 = 20; // 컴파일 오류

        // final 지역 변수2
        final int data2 = 10;
        // data2 = 20; // 컴파일 오류
        method(10);
    }

    static void method(final int parameter){    // 10 들어옴 - 고정
        // parameter = 20; // 컴파일 오류
    }
}
