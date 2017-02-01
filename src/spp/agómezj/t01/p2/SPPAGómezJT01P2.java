/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agómezj.t01.p2;
import java.util.Scanner;
/**
 *
 * @author Alberto
 */
public class SPPAGómezJT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculadora de superficie y perímetro de rectángulo
        //Variables
        double largo,altura, superficie, perímetro;
        System.out.println("Ingresar altura");
        Scanner entradaAltura = new Scanner(System.in);
        altura = entradaAltura.nextDouble();
        System.out.println("Ingresar largo");
        Scanner entradaLargo = new Scanner(System.in);
        largo = entradaLargo.nextDouble();
        //Calcular superficie
        superficie = (altura*largo);
        //Calcular perímetro
        perímetro = (altura*2+largo*2);
        System.out.println("Área=" + superficie);
        System.out.println("Perímetro=" + perímetro);
               
    }
    
}
