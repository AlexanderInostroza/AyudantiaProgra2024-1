package Pregunta2;
import java.util.ArrayList;
import java.util.List;

public class Cajera {
    List<Producto> empaquetamiento;
    int caja;
    
    public Cajera(){
        empaquetamiento = new ArrayList<Producto>();
        caja = 0;
    }

    public int escanearCarrito(Cliente cliente){
        int total = 0;
        while(!cliente.carritoVacio()){
            Producto productoActual = cliente.primeProducto();
            total = total + productoActual.getPrecio();
            empaquetamiento.add(productoActual);
        }
        return total;
    }

    public void cobrar(Cliente cliente){
        int monto = escanearCarrito(cliente);
        boolean pagoValido = cliente.Pagar(monto);
        if (pagoValido){ caja = caja + monto;}   
    }
}
