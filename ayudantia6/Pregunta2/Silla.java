package Pregunta2;

public class Silla extends Muebles {
    int precio;
    int stock;
    String nombre;

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public String getTipo() {
        return "Silla";
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
}
