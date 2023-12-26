package models.entities;

import java.time.LocalDate;

public class Installment {
    LocalDate duoDate;
    double amount;

    public Installment() {
    }

    public Installment(LocalDate duoDate, double amount) {
        this.duoDate = duoDate;
        this.amount = amount;
    }

    public LocalDate getDuoDate() {
        return duoDate;
    }

    public void setDuoDate(LocalDate duoDate) {
        this.duoDate = duoDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
