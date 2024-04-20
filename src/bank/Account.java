package bank;

public class Account {
    public double solde = 0;

    public boolean transaction(double amount) {
        solde += amount;
        return true;
    }
}
