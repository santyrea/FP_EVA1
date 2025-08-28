/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_operaciones;

/**
 *
 * @author diego
 */
public class Eva1_6_operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // AREA DE UN CIRCULO
        // DECLARACION DE VARIABLES
        double area;
        double radio;
        double pi;
        // INICIALIZACION
        pi = 3.1416;
        radio = 5;
        area = pi * radio * radio;
        // IMPRIMIR
        System.out.println("el valor de un circulo de radio es:");
        System.out.println(area);
        //NUEVO CIRCULO RADIO 100
        radio = 100;
        area = pi * radio * radio;
        
        System.out.println("el valor de un circulo de radio 100");
        System.out.println(area);
        
    }
    
}
