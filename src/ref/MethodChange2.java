package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
        System.out.println("dataA = " + dataA); // x001
        changeReference(dataA);
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 20
    }

    static void changeReference(Data dataX){ // dataA의 `참조값`이 넘어옴
        System.out.println("dataX = " + dataX); // x001
        dataX.value = 20;
    }
}

/**
 * Data 인스턴스를 생성하고 참조값을 dataA 변수에 담고 value에 숫자 10을 할당한 상태
 * 1. 메서드 호출
 * 메서드를 호출할 때 매개변수 dataX에 변수 dataA의 값을 전달 (int dataX = dataA)
 * dataX를 통해서도 x001에 있는 Data 인스턴스에 접근 가능해짐
 * 2. 메서드 안에서 값 변경
 * x001 인스턴스에 접근하고 그 안에 있는 value 값 20으로 변경
 * dataA, dataX는 모두 같은 x001 인스턴스를 참조하기 때문에 둘다 value 20 값
 */