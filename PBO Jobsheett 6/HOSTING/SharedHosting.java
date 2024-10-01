package HOSTING;

public class SharedHosting extends Hosting {
    private int numAccounts;

    public int getNumAccounts() {
        return numAccounts;
    }

    public void setNumAccounts(int numAccounts) {
        this.numAccounts = numAccounts;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\nNumber of Accounts: " + numAccounts;
    }
}
