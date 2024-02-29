package com.mycompany.ejercicios_1;
import java.util.Scanner;

public class Ejercicios_1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la edad de Juan: ");
        double edjuan = scanner.nextDouble();
        double edalberto = (edjuan * 2) / 3;
        double edana = (edjuan * 4) / 3;
        double edmama = edana + edjuan + edalberto;
        
        System.out.println("La edad de Juan es: " + edjuan);
        System.out.println("La edad de Alberto es: " + edalberto);
        System.out.println("La edad de Ana es: " + edana);
        System.out.println("Entonces la edad de la mama de Juan es: " + edmama);
       
        scanner.close();
    }
}
