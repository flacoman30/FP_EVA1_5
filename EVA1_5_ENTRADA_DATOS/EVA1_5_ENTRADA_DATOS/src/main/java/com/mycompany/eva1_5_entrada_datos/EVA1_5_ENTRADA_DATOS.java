/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author flac3 
 */
public class EVA1_5_ENTRADA_DATOS {

    public static void main(String[] args) {
        //TODO code application logic here 
        //DECLARAMOS VARIABLES
        String marca;
        String modelo;  
        int year;
        double precio;
        //¿como se captura?
        //SCANNER
        //Herramienta --) Clase: nos propociona muchas herramientas
        Scanner captura;//declaramos la herramienta,previamente 
                        //hay que importarla (hacer un import)
        captura = new Scanner(System.in);//creamos la herramienta
        
        // HAY QUE INDICARLE AL USUARIO QUE CAPTURAR
        System.out.println("introduce la marca del vehiculo:");
        //capturamos--)una asignacion
        marca = captura.nextLine();//Les regresa todo el texto hasta
                                   //se presiona la tecla "enter"
        System.out.println("introduce la modelo del vehiculo:");
        modelo = captura.nextLine();
        System.out.println("intruduce el año:");
        year = captura.nextInt();
        System.out.println("intruduce el precio");
        precio = captura.nextDouble();
        
        System.out.println("datos capturadora-------------------");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
        
        
    }     
        
      
}
