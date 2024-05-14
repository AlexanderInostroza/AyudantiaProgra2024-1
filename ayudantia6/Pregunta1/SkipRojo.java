package Pregunta1;

public class SkipRojo extends Skip implements Roja {

    @Override
    public boolean isPlayable(Roja carta) {
        return true;
    }

    public boolean isPlayable(Carta carta){
        return false;
    }
    
}
