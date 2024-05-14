package Pregunta2;

public class Multimedia {
    int duracion; // segundos
    int ancho; // pixeles
    int alto; // pixeles
    int calidad_sonido; // kbps

    public void setDuracion(int value){
        duracion = value;
    }

    public void setResolucion(int ancho, int alto){
        this.alto = alto;
        this.ancho = ancho;
    }

    public void setCalidadDeSonido(int value){
        calidad_sonido = value;
    }
}
