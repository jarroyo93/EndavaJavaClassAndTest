/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.app;

import co.endava.datos.Bebida;
import co.endava.datos.Comida;
import co.endava.datos.Producto;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author dsanchez
 */
public class AdministradorProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Método main donde se inicializa el programa
        Producto p1 = new Producto(101, "Café", 1500); //Se crea un objeto p1 instanciando la clase Producto
        Producto p2 = new Producto(102, "Azucar", 2500); //Se crea un objeto p2 instanciando la clase Producto
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now().plusDays(2)); //Se crea un objeto p3 instanciando la clase Producto
        Producto p4 = new Bebida(104, "Té", 1800); //Se crea un objeto p4 instanciando la clase Producto
        
        System.out.println(p1.getPrecio()); //Se imprime el precio del objeto p1
        System.out.println(p2.getPrecio()); //Se imprime el precio del objeto p2
        System.out.println("Fecha: "+ p3.getFechaVencimiento() +  ", Precio: "+ p3.getPrecio() + ", Dcto: " + p3.getDescuento()); //Se imprimen los atributos del objeto p3
        System.out.println("Precio: "+ p4.getPrecio() + ", Dcto: " + p4.getDescuento()); //Se imprimen los atributos del objeto p4
        
        Producto p5 = new Producto(105, "Agua", 1800); //Se crea el objeto p5
        if (p5 == null) { //Se valida si el objeto p5 es nulo
            System.out.println("El objeto está nulo"); //Si el objeto es nulo, se imprime esta cadena indicándolo
        } else {
            if (p5.getNombre() == null) { //Si el objeto p5 tiene el nombre nulo se especifica en una cadena
                System.out.println("El nombre está nulo");
            } else {
                System.out.println(p5.getNombre()); //Si el nombre no es nulo, este se imprime en consola
            }
        }
        BigDecimal numero = BigDecimal.ZERO; //Se define e inicializa una variable de tipo Big Decimal
        try { //Se define un try para ejecutar el bloque de código
            numero = BigDecimal.valueOf(Long.parseLong("140"));  //Se realiza un parseo de la variable número con el método ValueOf que  devuelve el valor primitivo de un objeto String como un tipo de dato cadena
        } catch (Exception e){ //Se captura la excepción en caso tal haya algún problema en la ejecución
            numero = BigDecimal.ONE;
            System.out.println("No se pudo convertir " + e);
        }
        System.out.println(numero); //Se imprime la variable número
    }
    
}
