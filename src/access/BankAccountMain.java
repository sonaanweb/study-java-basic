package access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());
    }
}

// 입금, 출금, 잔고만 사용자가 알면 된다. 이외 논리 검증들은 private