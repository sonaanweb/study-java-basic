package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근 (권장X)
        Data3 data3 = new Data3("C");
        System.out.println(data3.count); // 접근 후 -> static이 있으면 찾아감
    }
}

/**
 * 객체를 담는 변수명이 아닌 `클래스명에 .dot 사용`. 클래스에 직접 접근하는 것과 같은 형태
 * static이 붙은 멤버 변수는 메서드 영역에서 관리한다. (틀)
 */