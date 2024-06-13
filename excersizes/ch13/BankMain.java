package gr.aueb.cf.OOPProjects.excersizes.ch13;

import gr.aueb.cf.OOPProjects.excersizes.ch13.bankapp.Account;
import gr.aueb.cf.OOPProjects.excersizes.ch13.bankapp.JointAccount;
import gr.aueb.cf.OOPProjects.excersizes.ch13.bankapp.OverdraftAccount;

public class BankMain {

    public static void main(String[] args) {

        Account mike = new Account(1,"Michael", "F.","123",1000);
        JointAccount mikeAndTom = new JointAccount(100, "Mich","Tom","F.","A.", "123","321", 2000);


        try {
            mike.withdraw(1200, "123");
        }catch (Exception e) {
            System.out.println("You have just overdrafted. Have fun!");
            OverdraftAccount mikeOD = new OverdraftAccount(mike);
            mikeOD.withdraw(1200,mike);
            System.out.println("Your overdraft balance: " + mikeOD.getOverdraftBalance());
        }

        System.out.println(mike.getBalance());

    }
}
