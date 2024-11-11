package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();  // bigData.data 에 new Data 만들어 참조값을 넘겨줌
        System.out.println("bigdata.count=" + bigData.count);
        System.out.println("bigdata.data=" + bigData.data);

        System.out.println("bigdata.data.value=" + bigData.data.value);
    }
}