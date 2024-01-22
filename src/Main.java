//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(0.05);
        CurrentAccount currentAccount = new CurrentAccount(500);

        myBank.addAccount(savingsAccount);
        myBank.addAccount(currentAccount);

        //Deposito simulando
        savingsAccount.deposit(1000);
        currentAccount.deposit(2000);

        savingsAccount.withdraw(200);
        currentAccount.withdraw(500);

        // Imprimimos saldo de cuentas
        System.out.println("Saldo de la cuenta de ahorros: " + savingsAccount.calcularIntereses());
        System.out.println("Saldo de la cuenta corriente: " + currentAccount.calcularIntereses());
    }
}