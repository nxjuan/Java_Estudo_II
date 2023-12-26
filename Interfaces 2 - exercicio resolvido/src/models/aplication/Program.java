package models.aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import models.entities.Contract;
import models.entities.Installment;
import models.services.ContractServices;
import models.services.PayPalService;


public class Program {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (DD/MM/YYYY): ");
        LocalDate data = LocalDate.parse(sc.next(), dtf);
        System.out.print("Valor do contrato: ");
        double amount = sc.nextDouble();
        
        Contract contract = new Contract(number, data, amount);

        System.out.print("Entre com o numero de parcelas: ");
        int parcelas =  sc.nextInt();

        ContractServices service = new ContractServices(new PayPalService());
        service.processContract(contract, parcelas);

        System.out.println("Parcelas: ");
        for(Installment i : contract.getInstallments()){
            System.out.println(i.getDuoDate() + " - " + i.getAmount());
        }        

        sc.close();
    }
}
