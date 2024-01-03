package caelum;


public class ContaCorrente implements Tributavel{

    private double amount;

    public ContaCorrente(double amount) {
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
        return amount * 0.01;
    }
}
