package Pregunta2;

public class Video extends Multimedia {

    public Video(int ancho, int alto, int duracion){
        setResolucion(ancho, alto);
        setDuracion(duracion);
    }

    public int getAlto(){
        return alto;
    }
    public int getAncho(){
        return ancho;
    }

    public int getDuracion(){
        return duracion;
    }
    
}
