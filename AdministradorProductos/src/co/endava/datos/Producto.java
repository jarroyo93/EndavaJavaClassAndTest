/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

/**
 *
 * @author cafajardo
 */
public class Producto {
    
    private int id;
    private String nombre;
    private double precio;
    
    public Producto() {
    }
    
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public int getId() {
        return id;
    } //Se define el método get de la variable ID para acceder a esta

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    } //Se define el método get de la variable Nombre para acceder a esta

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Se define el método set de la variable Nombre para cambiar su valor

    public double getPrecio() {
        return precio;
    } //Se define el método get de la variable Precio para acceder a esta

    public void setPrecio(double precio) { //Se define el método set de la variable Nombre para cambiar su valor
        if (precio < 0) { //Se valida que el precio no sea negativo
            System.out.println("No se permiten precios negativos");
        } else {
            this.precio = precio; //Si el precio es mayor o igual a 0 se retorna
        }
    }
    
    public double getDescuento(){ //Se obtiene el descuento del 10% del precio
        return precio * 0.1d;
    }
    
    @Override
    public String toString() {
        return id + ", " + nombre + ", " + precio;
    } //Se sobreescribe el mpetodo tostring para definir una estructura de devolución de una cadena
}
