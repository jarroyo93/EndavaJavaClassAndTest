/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalDate;

/**
 *
 * @author cafajardo
 */
public class Comida extends Producto{
    private LocalDate fechaVencimiento; //Se define la variable fechaVencimiento como privada para cumplir con el pilar de encapsulación de POO

    public Comida(int id, String nombre, double precio, LocalDate fechaVencimiento) { //Se inicializan los parámetros con SUPER excepto fechaVencimiento
        super(id, nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    } //Se definen el get de FechaVencimiento para acceder al valor de dicha variable

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    } //Se define el método set de la variable fechaVencimiento para cambiar su valor

    @Override
    public double getDescuento() { //Se define el método de descuento
        if (fechaVencimiento.equals(LocalDate.now())) { //Si la fechaVencimiento es igual a la fecha actual del sistema entonces retorna el descuento

            return super.getDescuento();

        } 
        else {

            return 0;
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + fechaVencimiento;
    } //Se sobreescribe el mpetodo tostring para definir una estructura de devolución de una cadena
}
