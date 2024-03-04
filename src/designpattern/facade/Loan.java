package designpattern.facade;

public class Loan {
    public boolean approveLoan() {
        System.out.println("대출 자격 심사 중...");
        return true; // 단순화를 위해 항상 승인된다고 가정
    }
}

