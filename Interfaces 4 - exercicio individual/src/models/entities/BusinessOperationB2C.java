package models.entities;

public class BusinessOperationB2C extends BusinessOperation {

    private String customerName;      

    public BusinessOperationB2C() {}

    public BusinessOperationB2C(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public double profit(double amount) {
        return amount - taxes(amount) - investiment(amount);
    }

    @Override
    public double taxes(double amount) {
        return amount * 0.15;
    }

    @Override
    public double investiment(double amount) {
        return amount * 0.6;
    }  
    
    @Override
    public String toString() {
        return "\n\n" + "-------------------------" 
        + "\nBusinessOperation: B2B" 
        + "\nCustomer name:" + customerName
        + "\n"
        + "profit: " + profit(getValueContractpurchase())
        + "\n"
        + "taxes: " + "-8%, -7%  - " + taxes(getValueContractpurchase())
        + "\n"
        + "investment: " + "60%  - " + investiment(getValueContractpurchase());
    }
}
