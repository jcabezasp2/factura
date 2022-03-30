import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    String nombre = "pan";
    float precio = 0.50f;
    int cantidad = 1;
    Producto producto;

    @BeforeEach
    void setUp() {
         producto = new Producto(nombre, precio, cantidad);
    }

    @Test
    void testNuevo() {


        assertEquals(nombre,producto.getNombre());
        assertEquals(precio,producto.getPrecio());
        assertEquals(cantidad,producto.getCantidad());
    }

    @Test
    void precioTotal() {
        float expected = this.precio * this.cantidad;
        float actual = producto.precioTotal();
        assertEquals(expected, actual);
    }

   }


