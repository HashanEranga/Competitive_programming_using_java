package com.hashan.solid.o.problem;

public class OpenCloseDemo {
    public static void main(String[] args) {
        LoanHandler loanHandler = new LoanHandler();
        User user = new User();
        loanHandler.approvePersonalLoan(user);
        loanHandler.approveMortageLoan(user);
    }

}
