/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class ExerciciosJava {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite o valor para descobrir seu fatorial: ");
        int valor1 = scanner.nextInt();
        int r = 1;
        for(int i = valor1; i > 0; i--){
            r = r*i;
        }
        System.out.println("Fatorial: "+r);
    }   
}
