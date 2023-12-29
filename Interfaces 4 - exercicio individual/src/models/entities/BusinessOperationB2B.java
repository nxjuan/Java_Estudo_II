package models.entities;


public class BusinessOperationB2B extends BusinessOperation{

    private String companyName;    
    
    public BusinessOperationB2B(){}

    public BusinessOperationB2B(String companyName) {
        this.companyName = companyName;
    }

    public BusinessOperationB2B(double valueContractpurchase, Business business, String companyName) {
        super(valueContractpurchase, business);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public double profit(double amount) {
        return amount - taxes(amount) - investiment(amount);
    }

    @Override
    public double taxes(double amount) {
        return amount * 0.25;
    }

    @Override
    public double investiment(double amount) {
        return amount * 0.3;
    }
    
    @Override
    public String toString() {
        return "\n\n" + "-------------------------" 
        + "\nBusinessOperation: B2B" 
        + "\nCompany Name:" + companyName
        + "\n"
        + "profit: " + profit(getValueContractpurchase())
        + "\n"
        + "taxes: " + "-18%, -7%  = " + taxes(getValueContractpurchase())
        + "\n"
        + "investment: " + "30%  = " + investiment(getValueContractpurchase());
    }
}
