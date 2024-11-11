package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigdata.count=" + bigData.count);   // 초기값 0
        System.out.println("bigdata.data=" + bigData.data); // 참조형 초기값 null

        // NullPointerException
        System.out.println("bigdata.data.value=" + bigData.data.value);
        // x001 null.value 참조할 곳 없으므로.
    }
}