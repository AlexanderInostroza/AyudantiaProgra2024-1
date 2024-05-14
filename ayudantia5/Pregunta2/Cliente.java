package Pregunta2;
public class Cliente {
    Carrito carrito;
    int dinero;
    
    public Cliente(){
        carrito = new Carrito();
        dinero = 9999999;
    }

    public boolean Pagar(int monto){
        if (monto < dinero){
            dinero = dinero - monto;
            return true;
        }
        return false;
    }

    public Producto primeProducto(){
        return carrito.sacarPrimerProducto();
    }

    public boolean carritoVacio(){
        return carrito.estaVacio();
    }
}
