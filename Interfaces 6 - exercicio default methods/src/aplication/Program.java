package aplication;


import java.util.Scanner;

import entities.BrazilianYear;
import entities.YearOfDrive;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Write how many years old do you have: ");
        int idade = 5;

        YearOfDrive utd =  (YearOfDrive) new BrazilianYear(idade);

        System.out.println("Can drive? " + utd);
        sc.close();
    }
}
