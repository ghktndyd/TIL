package designpattern.facade;

class BankServiceFacade {
    private Account account;
    private Loan loan;
    private Credit credit;

    public BankServiceFacade() {
        this.account = new Account();
        this.loan = new Loan();
        this.credit = new Credit();
    }

    public void createAccountAndApproveLoan() {
        account.createAccount();
        credit.checkCredit();
        if (loan.approveLoan()) {
            System.out.println("대출 진짜 성공");
        }
    }

    public void createAccount() {
        account.createAccount(); // 오직 계좌 관리 서브시스템과만 상호작용
    }
}
