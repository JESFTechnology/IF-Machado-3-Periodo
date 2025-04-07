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
        /*
         * Faça um programa que imprima a tabuada de um número fornecido pelo usuário.
         * 
         */
        System.out.println("Digite o primeiro valor");
        int valor1 = scanner.nextInt();
        System.out.println("----------Tabuada----------");
        for(int i = 0; i <= 10; i++){
            System.out.println(i+"+"+valor1+"="+(i+valor1));
        }
        System.out.println("---------------------------");
        for(int i = 0; i <= 10; i++){
            System.out.println(i+"-"+valor1+"="+(i-valor1));
        }
        System.out.println("---------------------------");
        for(int i = 0; i <= 10; i++){
            System.out.println(i+"*"+valor1+"="+(i*valor1));
        }
        System.out.println("---------------------------");
        
    }
}
