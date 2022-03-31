/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalTime;

/**
 *
 * @author cafajardo
 */
public class Bebida extends Producto {  //Definition de la clase Bebida que hereda de la clase producto
    
    public Bebida(int id, String nombre, double precio){
        super(id, nombre, precio);
    } //Se inicializan los parámetros de la clase con el método SUPER
    
    @Override  //Se utiliza esta anotación para sobreescribir el método que viene de la clase que hereda
    public double getDescuento() {
        LocalTime now = LocalTime.now();  //Se inicializa la variable now con la fecha actual del sistema
        if (now.isAfter(LocalTime.of(17, 0)) && now.isBefore(LocalTime.of(18, 0))) { //Se utilizan los método IsAfter y isBefore  para comprobar si la instancia actual de la fecha es posterior a la fecha especificada.
            return this.getPrecio() * 0.2d;  //Se retorna el descuento del 20% del precio
        } else {
            return 0; //En caso tal la condición no cumpla con el if, cae en el else y se retorna 0
        }
    }
}
