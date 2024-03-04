package designpattern.facade;

public class Client {
    public static void main(String[] args) {
        BankServiceFacade bankService = new BankServiceFacade();
        bankService.createAccountAndApproveLoan();
        bankService.createAccount();
    }
}
