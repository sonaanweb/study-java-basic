package oop.ex;

public class AccountMain {

    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(10000); // 입금
        account.withdraw(9000); // 출금
        account.withdraw(2000); // 잔액 부족
        System.out.println("잔고: " + account.balance);   // 1000
    }
}

// 해당 클래스에서 사용 된 메서드는 내부 작업만 수행해서 반환값 필요X
// == 따로 변수 값을 추가해 반환하는 결과를 저장하고 활용하는 코드가 아님