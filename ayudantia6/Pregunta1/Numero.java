package Pregunta1;

public abstract class Numero implements Carta {
    protected int value;

    public int getValue(){
        return value;
    }

    public boolean isPlayable(Numero carta){
        if (carta.getValue() == this.getValue()){
            return true;
        }
        return false;
    }

}
