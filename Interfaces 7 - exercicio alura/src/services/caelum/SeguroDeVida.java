package caelum;
public class SeguroDeVida implements Tributavel{

    private double amount;
    private String titular;
    private int numeroApolice;    

    public SeguroDeVida(double amount, String titular, int numeroApolice) {
        this.amount = amount;
        this.titular = titular;
        this.numeroApolice = numeroApolice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }    

    @Override
    public double getValorImposto() {
        return 42 + amount * 0.02;
    }

    public String getTipo(){
        return "Seguro de Vida";
    }
}


