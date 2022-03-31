package co.endava.app;


import co.endava.datos.Comida;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;



import java.time.LocalDate;


class AdministradorProductosTest {

    @BeforeAll
    public void init() {

    }

    @Test
    public void testDescuento() {

        double porcentajeControl = 10;
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now().plusDays(2));
        Double descuento = p3.getDescuento();
        Double percentProduct = descuento * 100 / p3.getPrecio();

        assertEquals(porcentajeControl, percentProduct);
    }



}