package access;

public class BankAccount {

    private int balance; // 잔고 데이터

    public BankAccount() {  // alt + ins generate -> selectNone 기본생성자 생성
        balance = 0;
    }

    // public 메서드: deposit 입금
    public void deposit(int amount){
        if(isAmountValid(amount)){  // == true
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다");
        }
    }

    // public 메서드 : withdraw 출금
    public void withdraw(int amount){
        if(isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액거나 잔액이 부족합니다");
        }
    }

    // public 메서드 : getBalance 잔고
    public int getBalance(){
        return balance;
    }

    // private - 입금 유효성 내부 검증
    private boolean isAmountValid(int amount){
        return amount > 0;
    }
}
