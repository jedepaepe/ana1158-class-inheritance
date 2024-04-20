package bank;

public class SavingAccount extends Account {
    private double limit;

    public SavingAccount(double limit) {
        this.limit = limit;
    }

    @Override
    public boolean transaction(double amount) {
        if (solde + amount < limit) return false;

        solde += amount;
        return true;
    }
}
