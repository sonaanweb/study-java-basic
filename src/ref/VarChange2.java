package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;     // `참조값` 읽어서 `b`에 들어간다

        System.out.println("dataA 참조값 = " + dataA);
        System.out.println("dataB 참조값 = " + dataB); // ref...참조값 같음 x001
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value); // 10 10

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); // 둘다 x001
        System.out.println("dataB.value = " + dataB.value); // 20 20

        // dataB 변경
        dataA.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value); // 30 30

        /**
         * 같은 `참조값`을 가르키고, 인스턴스는 하나이므로 그 하나의 인스턴스가 바뀐 것
         * 인스턴스를 복사하는 것이 아닌 [변수에 들어있는 참조값만 복사]하는 것이라는 걸 유의
         * = 두 변수는 같은 객체 인스턴스 참조
         */
    }
}
