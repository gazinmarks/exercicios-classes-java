package exercicio_poo;

public class BankAccount {

    private String nameHolder;
    private final int numberAccount;
    private double accountBalance;


    public BankAccount(int numberAccount, String nameHolder) {
        this.numberAccount = numberAccount;
        this.nameHolder = nameHolder;
    }

    public BankAccount(int numberAccount, String nameHolder, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.nameHolder = nameHolder;
        addDeposit(initialDeposit);
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void addDeposit(double deposit) {
        accountBalance += deposit;
    }

    public void withdrawDeposit(double deposit) {
        int tax = 5;
        accountBalance -= deposit + tax;
    }

    public String toString() {
        return "Account: "
                + numberAccount
                + ", Holder: "
                + nameHolder + ", Balance: $ "
                + String.format("%.2f", accountBalance);
    }

}
