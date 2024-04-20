import bank.CurrentAccount;
import bank.SavingAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner("10 20 -100 33");
        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            System.out.println(value);
        }

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.solde = 1_000_000_000;

        SavingAccount savingAccount = new SavingAccount(500);
        System.out.println("acceptée " + savingAccount.transaction(-1_000));
    }
}