package Pregunta1;

public abstract class Skip {

    public void play(){
        System.out.println("Siguiente jugador pierde su turno");
    }

    public boolean isPlayable(Skip skip){
        return true;
    }
    
}
