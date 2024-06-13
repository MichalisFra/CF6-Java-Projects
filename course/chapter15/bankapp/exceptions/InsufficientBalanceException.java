package gr.aueb.cf.OOPProjects.course.chapter15.bankapp.exceptions;

public class InsufficientBalanceException extends Exception {
    private static final long serialVersionUID = 1L;

    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient balance: " + balance + "for amount: " + amount);
    }
}
