package Pregunta2;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    List<Producto> lista;
    
    public Carrito(){
        lista = new ArrayList<Producto>();
    }

    public void addProducto(Producto producto){
        lista.add(producto);
    }
    public Producto sacarPrimerProducto(){
        Producto primer_producto = lista.get(0);
        lista.remove(0);
        return primer_producto;
    }

    public boolean estaVacio(){
        return lista.isEmpty();
    }
}
