package models.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.entities.BusinessOperation;
import models.entities.BusinessOperationB2B;
import models.entities.BusinessOperationB2C;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<BusinessOperation> list = new ArrayList<>();

        System.out.println("Operation type: ");
        System.out.print("\n1. Business\n2. Payment\n3. charge\n-> ");
        int type = sc.nextInt();

        while(true){
            switch (type){
                case 1:
                    System.out.println("Business type: ");
                    System.out.print("1. BUSINESS TO BUSINESS\n2. BUSINESS TO CUSTOMER\n-> ");
                    int businessType = sc.nextInt();
                    if(businessType == 1){
                        System.out.print("Company name: ");
                        sc.nextLine();
                        String companyName = sc.nextLine();
                        System.out.print("Investiment: ");
                        double investment = sc.nextDouble();
                        list.add(new BusinessOperation(investment, new BusinessOperationB2B(companyName)));
                    }
                    if(businessType == 2){
                        System.out.print("Customer name: ");
                        sc.nextLine();
                        String customerName = sc.nextLine();
                        System.out.print("Investiment: ");
                        double investment = sc.nextDouble();
                        list.add(new BusinessOperation(investment, new BusinessOperationB2C(customerName)));
                    }
                    if(businessType != 1 && businessType != 2){
                        System.out.println("Error, invalid value");
                    }break;
                }
            System.out.println("New operation? (y/n)");
            char v = sc.next().charAt(0);
            if(v == 'n'){
                break;
            }
        }

        for(BusinessOperation i : list){
            System.out.println(i.toString());
        }
        sc.close();
    }
}
