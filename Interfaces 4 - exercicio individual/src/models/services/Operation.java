package models.services;

public interface Operation {
    double profit(double amount);
    double taxes(double amount);
    double investiment(double amount);
}
