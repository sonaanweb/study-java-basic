package poly.ex.pay1;

/**
 * 무조건 false를 반환하는 null 대체 클래스
 */
public class DefaultPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("결제수단이 없습니다");
        return false;
    }
}
