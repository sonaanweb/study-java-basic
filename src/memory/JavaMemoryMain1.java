package memory;

public class JavaMemoryMain1 {

    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end"); // ctrl+w extend selection


    }

    static void method1(int m1){
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);   // 계산 후 cal 넘김
        System.out.println("method1 end");
    }

    static void method2(int m2){
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}

/** 스택구조 실행 - 후입선출(==선입후출)
 * main start
 * method1 start
 * method2 start
 * method2 end
 * method1 end
 * main end
 */