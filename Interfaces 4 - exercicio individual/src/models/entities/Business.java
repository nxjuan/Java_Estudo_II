package models.entities;

public abstract class Business {
    
    private double valueContractpurchase;

    public Business(){

    }

    public Business(double valueContractpurchase) {
        this.valueContractpurchase = valueContractpurchase;
    }

    public double getValueContractpurchase() {
        return valueContractpurchase;
    }     
}
