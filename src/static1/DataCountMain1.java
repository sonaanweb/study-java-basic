package static1;

/**
 * 생성된 객체의 누적된 값을 찾고 싶을 때 - * 틀린_예시_
 */
public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count); // 1

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data2.count); // 1
    }
}


/**
 * 결과 : A count = 1 , B count = 1...
 * 객체를 생성할 때 마다 인스턴스는 새로 만들어진다.
 * 인스턴스에 포함된 count 변수도 새로 만들어지므로 원하는 답을 구할 수 없다.
 */