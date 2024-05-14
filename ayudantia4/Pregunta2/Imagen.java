package Pregunta2;

public class Imagen extends Multimedia{
    public Imagen(int alto, int ancho){
        this.setResolucion(ancho, alto);
    }
    public int getAlto(){
        return alto;
    }
    public int getAncho(){
        return ancho;
    }
}
