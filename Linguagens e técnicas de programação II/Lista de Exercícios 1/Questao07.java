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
        System.out.println("Digite o valor");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número positivo.");
        } else {
            System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");
            for (int i = 1; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
