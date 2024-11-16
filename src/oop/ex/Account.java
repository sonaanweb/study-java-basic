package oop.ex;

public class Account {

    // 잔액
    int balance;

    // 입금
    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}


/**
 * (헷갈리는 개념 추가)
 * 메서드 타입 -메서드의 목적과 기대되는 결과에 따라 결정한다.
 *
 * 결과 값 반환 - 기본 데이터 타입, 객체
 * 성공/실패 여부 확인 - boolean
 * 특정 작업 실행(반환 값 없는 단순 실행) - void
 * 조건에 따라 특정 값 반환
 */