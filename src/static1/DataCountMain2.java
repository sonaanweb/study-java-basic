package static1;

public class DataCountMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter();    // 생성 -> 넘김 -> 생성자 안에서 count++
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);
    }
}

/**
 * Counter 인스턴스를 `공용으로 사용해 `객체를 생성할 때마다 값을 정확하게 증가시킴
 * 그러나, Data2 클래스와 관련된 일인데 Counter라는 별도 클래스를 추가로 사용해야함
 * 생성자 매개변수도 따로 추가되어 복잡해지는 단점
 */