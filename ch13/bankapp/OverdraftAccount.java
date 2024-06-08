package gr.aueb.cf.OOPProjects.ch13.bankapp;

public class OverdraftAccount {
    private Account overDrAccount;
    private JointAccount overDrJointAccount;
    private double overdraftBalance;

    public OverdraftAccount(){

    }

    public OverdraftAccount(Account overDrAccount) {
        this.overDrAccount = overDrAccount;

    }

    public OverdraftAccount(JointAccount overDrJointAccount, double overdraftBalance) {

    }

    public Account getOverDrAccount() {
        return overDrAccount;
    }

    public void setOverDrAccount(Account overDrAccount) {
        this.overDrAccount = overDrAccount;
    }

    public JointAccount getOverDrJointAccount() {
        return overDrJointAccount;
    }

    public void setOverDrJointAccount(JointAccount overDrJointAccount) {
        this.overDrJointAccount = overDrJointAccount;
    }

    public double getOverdraftBalance() {
        return overdraftBalance;
    }

    public void setOverdraftBalance(double overdraftBalance) {
        this.overdraftBalance = overdraftBalance;
    }

    @Override
    public String toString() {
        return "OverdraftAccount{" +
                "overDrAccount=" + overDrAccount +
                ", overDrJointAccount=" + overDrJointAccount +
                ", overdraftBalance=" + overdraftBalance +
                '}';
    }

   //Public API
    public void withdraw(double amount, Account account){
        this.overdraftBalance = amount - account.getBalance();
        account.setBalance(0);
    }

    public void withdraw(double amount, JointAccount jointAccount){
        this.overdraftBalance = amount - jointAccount.getBalance();
        jointAccount.setBalance(0);
    }
}
