package com.hashan.solid.o.solution.loanhandler;

import com.hashan.solid.o.solution.User;
import com.hashan.solid.o.solution.validator.Validator;

public class MortageLoanHandler implements LoanHandler{
    private final Validator validator;

    public MortageLoanHandler(Validator validator){
        this.validator = validator;
    }
    @Override
    public void approveLoan(User user) {
        if(validator.isValid(user)) System.out.println("Mortage Payment Validated");
        else System.out.println("Mortage Payment not validated");
    }
}
