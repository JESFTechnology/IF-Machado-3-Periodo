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
        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2= scanner.nextInt();
        int resultado = valor1+valor2;
        System.out.println("Resultado: "+valor1+"+"+valor2+"="+resultado);
    }
    
}
