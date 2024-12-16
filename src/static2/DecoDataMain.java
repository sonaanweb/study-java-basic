package static2;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        DecoData.staticCall();
        DecoData.staticCall();
        // 여러번 호출 시 import 클래스명 생략 가능 alt+enter
        // import static static2.DecoData.staticCall;

        System.out.println("2. 인스턴스 호출 1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출 2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // 인스턴스를 통한 접근 (권장X)
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}

/**
 * 1. 정적 호출
 * staticValue = 1
 * 2. 인스턴스 호출 1
 * instanceValue = 1
 * staticValue = 2
 * 3. 인스턴스 호출 2
 * instanceValue = 1
 * staticValue = 3
 */