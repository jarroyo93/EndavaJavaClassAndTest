package co.endava.app;


import co.endava.datos.Bebida;
import co.endava.datos.Comida;
import co.endava.datos.Producto;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;



import java.time.LocalDate;
import java.util.ArrayList;


class AdministradorProductosTest {

    @Test
    public void testDescuento() {

        double porcentajeControl = 10;
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now());
        Double descuento = p3.getDescuento();
        Double percentProduct = descuento * 100 / p3.getPrecio();

        assertEquals(porcentajeControl, percentProduct);
    }

    @Test
    public void testTypeVar() {
        Producto p2 = new Producto(102, "Azucar", 2500);

        Object id = p2.getId();
        Object nombre = p2.getNombre();
        Object precio = p2.getPrecio();

        String ide = id.getClass().toString();
        String name = nombre.getClass().toString();
        String price = precio.getClass().toString();

        assertEquals("class java.lang.Integer", ide);
        assertEquals("class java.lang.String", name);
        assertEquals("class java.lang.Double", price);






    }


}