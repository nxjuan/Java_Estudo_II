package caelum;


public class ContaPolpanca implements Tributavel{
    private double amount;

    public ContaPolpanca(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double getValorImposto() {
        return 0.0;
    } 
}
