package memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);      // 지역 변수 - 스택 프레임에 포함
        method2(data1);  // 1에서 2를 호출하면서 Data data2 매개변수에 x001 참조값 넘김
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value = " + data2.getValue());
        System.out.println("method2 end");
    }
}

/**
 * main start
 * method1 start
 * method2 start
 * data.value = 10
 * method2 end
 * method1 end
 * main end
 *
 * 메서드 종료 시 스택프레임이 제거되며 지역변수도 함께 제거
 */