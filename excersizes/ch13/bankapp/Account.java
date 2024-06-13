package gr.aueb.cf.OOPProjects.excersizes.ch13.bankapp;

public class Account {
    private int id;
    private String firstname;
    private String lastname;
    public String ssn;
    private double balance;

    public Account(){

    }

    public Account(int id, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", balance=" + balance +
                '}';
    }


    //Public API
    public void deposit(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Negative Amount Exception");
            }
            balance += amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraws an amount of money from an {@link gr.aueb.cf.chapter13.model.Account} based on a valid
     * ssn.
     * @param amount
     *          the amount of money to be withdrawn.
     * @param ssn
     *          the user's social security number
     * @throws Exception
     *          if the balance is insufficient,
     *          or if the SSN is not valid.
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("SSN not valid exception");
            }

            if (amount > balance) {
                throw new Exception("Insufficient Balance exception");
            }

            balance -= amount;
            System.out.println("Deposit of " + amount + " successful.");

        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the balance of the {@link gr.aueb.cf.chapter13.model.Account}
     * @return
     */
    public double getAccountBalance() {
        System.out.println("Return of account balance successful.");
        return getBalance();
    }



    private  boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}


