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
        System.out.println("Digite o valor: ");
        int valor1 = scanner.nextInt();
        if(valor1%2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }   
}
