package gr.aueb.cf.OOPProjects.course.chapter15.bankapp;

import gr.aueb.cf.OOPProjects.course.chapter15.bankapp.exceptions.InsufficientBalanceException;
import gr.aueb.cf.OOPProjects.course.chapter15.bankapp.exceptions.NegativeAmountException;
import gr.aueb.cf.OOPProjects.course.chapter15.bankapp.exceptions.SsnNotValidException;

import java.time.LocalDateTime;

public class OverdraftAccount extends Account {

    public OverdraftAccount() {

    }

    public OverdraftAccount(String iban, User holder, double balance) {
        super(iban, holder, balance);
    }

    @Override
    public void withdraw(double amount, String ssn) throws InsufficientBalanceException, SsnNotValidException, NegativeAmountException {

        try {
            if (amount < 0) {
                throw new NegativeAmountException(amount);
            }
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }
            setBalance(getBalance() - amount);

            //Logging
            System.out.println("Success in withdrawing. Amount: " + amount + ", ssn: " + ssn);
        }catch (SsnNotValidException | NegativeAmountException e){
            System.err.println("Error: " + e.getMessage() + ", " + LocalDateTime.now());
            throw e;
        }
    }


}
