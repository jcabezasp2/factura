import static org.junit.jupiter.api.Assertions.*;

class FacturaTest {

    Producto producto1 = new Producto("pan", 0.60f, 3);
    Producto producto2 = new Producto("yogur", 1.5f, 2);
    Producto producto3 = new Producto("Coliflor", 1.89f, 1);
    Factura factura;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        factura = new Factura();
        factura.meterProductos(producto1);
        factura.meterProductos(producto2);
        factura.meterProductos(producto3);
    }

    @org.junit.jupiter.api.Test
    void totalFactura() {
        float esperado = producto1.precioTotal() + producto2.precioTotal() + producto3.precioTotal();
        float actual = factura.totalFactura();
        assertEquals(esperado, actual);
    }

    @org.junit.jupiter.api.Test
    void aplicarIVA() {

        float expected = (producto1.precioTotal() + producto2.precioTotal() + producto3.precioTotal()) * 1.21f;
        float actual = factura.aplicarIVA();

        assertEquals(expected, actual);
    }
}