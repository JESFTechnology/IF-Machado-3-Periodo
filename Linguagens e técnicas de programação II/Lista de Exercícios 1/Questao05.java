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
        System.out.println("Digite o primeiro valor");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o segundo valor");
        int valor2 = scanner.nextInt();
        System.out.println("Digite o terceiro valor");
        int valor3 = scanner.nextInt();
        if(valor1 > valor2){
            if(valor1 > valor3){
                System.out.println("1º");
            }else if(valor1 != valor3)
            {
                System.out.println("3º");
            }else{
                System.out.println("1º e 3º tem mesmo valor");
            }
        }else if(valor1 != valor2 || valor2 != valor3){
            if(valor2 == valor1){
                System.out.println("1º e 2º");
            }
            else if(valor2 > valor3)
            {
                System.out.println("2º");
            }
            else if(valor2 != valor3)
            {
                System.out.println("3º");
            }else{
                System.out.println("2º e 3º tem mesmo valor");
            }
        }else{
            System.out.println("Todos iguais");
        }
    }   
}
