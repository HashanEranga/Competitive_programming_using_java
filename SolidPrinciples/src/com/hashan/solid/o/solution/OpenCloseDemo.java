package com.hashan.solid.o.solution;

import com.hashan.solid.o.solution.validator.MortageLoanValidator;
import com.hashan.solid.o.solution.loanhandler.LoanHandler;
import com.hashan.solid.o.solution.loanhandler.MortageLoanHandler;
import com.hashan.solid.o.solution.loanhandler.PersonalLoanHandler;
import com.hashan.solid.o.solution.validator.PersonalLoanValidator;

public class OpenCloseDemo {
    public static void main(String[] args) {
        LoanHandler personalLoan = new PersonalLoanHandler(new PersonalLoanValidator());
        User user = new User();
        personalLoan.approveLoan(user);

        LoanHandler mortageLoan = new MortageLoanHandler(new MortageLoanValidator());
        mortageLoan.approveLoan(user);
    }
}
