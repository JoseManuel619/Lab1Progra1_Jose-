/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1progra1_josemolina;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Lab1Progra1_JoseMolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner (System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.print("ingrese el primer numero: ");
        num1 = lea.nextInt();
        System.out.print("ingrese el segundo numero: ");
        num2 = lea.nextInt();
        
        int suma = 0;
        int resta = 0;
        int multi = 0;
        int div =0; 
        
        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;
               
        System.out.println("la suma de" + num1 + " + " +num2+ "es "+ suma);
        System.out.println("la resta de" + num1 + " - " +num2+ "es "+ resta);
        System.out.println("la suma de" + num1 + " + " +num2+ "es "+ multi);
        System.out.println("la suma de" + num1 + " + " +num2+ "es "+ div);
    }
    
}
