package gr.aueb.cf.OOPProjects.excersizes.ch13.bankapp;

public class JointAccount {
    private int id;
    private String firstNameOne;
    private String firstNameTwo;
    private String lastNameOne;
    private String lastNameTwo;
    private String SSNOne;
    private String SSNTwo;
    private double balance;


    public JointAccount(){

    }

    public JointAccount(int id, String firstNameOne, String firstNameTwo,
                        String lastNameOne, String lastNameTwo,
                        String SSNOne, String SSNTwo, double balance) {
        this.id = id;
        this.firstNameOne = firstNameOne;
        this.firstNameTwo = firstNameTwo;
        this.lastNameOne = lastNameOne;
        this.lastNameTwo = lastNameTwo;
        this.SSNOne = SSNOne;
        this.SSNTwo = SSNTwo;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstNameOne() {
        return firstNameOne;
    }

    public void setFirstNameOne(String firstNameOne) {
        this.firstNameOne = firstNameOne;
    }

    public String getFirstNameTwo() {
        return firstNameTwo;
    }

    public void setFirstNameTwo(String firstNameTwo) {
        this.firstNameTwo = firstNameTwo;
    }

    public String getLastNameOne() {
        return lastNameOne;
    }

    public void setLastNameOne(String lastNameOne) {
        this.lastNameOne = lastNameOne;
    }

    public String getLastNameTwo() {
        return lastNameTwo;
    }

    public void setLastNameTwo(String lastNameTwo) {
        this.lastNameTwo = lastNameTwo;
    }

    public String getSSNOne() {
        return SSNOne;
    }

    public void setSSNOne(String SSNOne) {
        this.SSNOne = SSNOne;
    }

    public String getSSNTwo() {
        return SSNTwo;
    }

    public void setSSNTwo(String SSNTwo) {
        this.SSNTwo = SSNTwo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "JointAccount{" +
                "id=" + id +
                ", firstNameOne='" + firstNameOne + '\'' +
                ", firstNameTwo='" + firstNameTwo + '\'' +
                ", lastNameOne='" + lastNameOne + '\'' +
                ", lastNameTwo='" + lastNameTwo + '\'' +
                ", SSNOne='" + SSNOne + '\'' +
                ", SSNTwo='" + SSNTwo + '\'' +
                ", balance=" + balance +
                '}';
    }

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
            e.printStackTrace();
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
        return this.SSNOne.equals(ssn) || this.SSNTwo.equals(ssn);
    }
}

