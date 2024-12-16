package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
        // 인스턴스 객체 생성 막음 - - -> static 바로 불러쓰도록
    }
    
    public static int sum(int[] values) {
        int total = 0;
        for(int value : values){
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
       return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values){
            if (value < minValue){
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values){
            if (value > maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }
}
