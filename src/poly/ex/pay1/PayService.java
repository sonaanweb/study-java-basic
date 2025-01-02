package poly.ex.pay1;

/**
 * 변하지 않는 부분
 */
public class PayService {

    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        // 결제 수단 선택(find 개념)
        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        // 실행
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}