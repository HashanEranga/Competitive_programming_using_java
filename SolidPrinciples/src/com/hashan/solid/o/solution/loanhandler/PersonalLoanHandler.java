package com.hashan.solid.o.solution.loanhandler;

import com.hashan.solid.o.solution.User;
import com.hashan.solid.o.solution.validator.Validator;

public class PersonalLoanHandler implements LoanHandler {

    private final Validator validator;

    public PersonalLoanHandler(Validator validator){
        this.validator = validator;
    }
    @Override
    public void approveLoan(User user) {
        if(validator.isValid(user)) System.out.println("Personal Loan validated");
        else System.out.println("Personal loan not validated");
    }
}
