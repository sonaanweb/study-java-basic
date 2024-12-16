package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++; // 정적 변수에 접근 - 같은 클래스 소속
        staticMethod(); // 정적 메서드 접근 - 같은 클래스 소속

//      instanceValue++; // 인스턴스 변수 접근, 컴파일 에러
//      instanceMethod(); // 인스턴스 메서드 접근, 컴파일 에러
    }

    public void instanceCall(){
        instanceValue++; // 본인 인스턴스 변수 접근
        instanceMethod(); // 본인 인스턴스 메서드 접근

        staticValue++;  // 정적 변수 접근 = DecoData.staticValue...
        staticMethod(); // 정적 변수 접근
    }

    private void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
}

/**
 * static은 static만 접근 가능
 * 인스턴스는 모든 곳에서 static 호출 가능, 인스턴스 변수도 접근 가능
 */