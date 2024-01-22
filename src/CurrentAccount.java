public class CurrentAccount implements Account{
    private double balance;
    private double overdrafLimit;

    public CurrentAccount(double overdrafLimit){
        this.balance=0;
        this.overdrafLimit=overdrafLimit;
    }
    @Override
    public void deposit(double amount) {
        this.balance+=amount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=balance+overdrafLimit){
            this.balance-=amount;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    @Override
    public double calcularIntereses() {
        //Agregando una tasa de interes del 1% pra cuentas corrientes
        double interestRate = 0.01;
        return balance*interestRate;
    }
}
