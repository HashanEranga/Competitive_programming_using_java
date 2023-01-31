package com.hashan.solid.o.problem;

import com.hashan.solid.o.problem.validator.MortageLoanValidator;
import com.hashan.solid.o.problem.validator.PersonalLoanValidator;

public class LoanHandler {
    public PersonalLoanValidator personalValidator;
    public MortageLoanValidator mortageValidator;

    {
        personalValidator = new PersonalLoanValidator();
        mortageValidator = new MortageLoanValidator();
    }
    public void approvePersonalLoan(User user){
        if(personalValidator.isValidUserForPersonalLoan(user)) {
            System.out.println("Personal Loan Validated");
        }
        else System.out.println("Personal Loan not validated");
    }

    public void approveMortageLoan(User user){
        if(mortageValidator.isValidUserForMortage(user)){
            System.out.println("Mortage loan validated");
        }
        else System.out.println("Mortage Loan not validated");
    }
}
