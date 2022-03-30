import java.util.Vector;

public class Factura {

    Vector<Producto> productos = new Vector<>();

    public void meterProductos(Producto p){

    }

    public float totalFactura(){

        float resultado = 0;

        for(Producto unProducto: productos){
            resultado += unProducto.precioTotal();
        }

        return resultado;
    }

    public float aplicarIVA(){
        return 0;
    }
}
