package static2.ex;

import static static2.ex.MathArrayUtils.*;

/**
 * 요구사항: 객체 생성 X, 인스턴스 생성 접근 불가
 * sum = 15
 * average = 3.0 (double)
 * min = 1
 * max = 5
 */
public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        System.out.println("sum = " + sum(values));
        System.out.println("average = " + average(values));
        System.out.println("min = " + min(values));
        System.out.println("max = " + max(values));
    }
}
