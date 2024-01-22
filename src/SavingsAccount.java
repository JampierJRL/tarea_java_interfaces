public class SavingsAccount implements Account{
    private double balance;
    private double interesRate;

    public SavingsAccount(double interesRate){
        this.balance=0;
        this.interesRate=interesRate;
    }
    @Override
    public void deposit(double amount) {
        this.balance+=amount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=balance){
            this.balance-=amount;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    @Override
    public double calcularIntereses() {
        return balance*interesRate;
    }
}
