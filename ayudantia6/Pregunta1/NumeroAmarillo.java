package Pregunta1;

public class NumeroAmarillo extends Numero implements Amarilla {

    @Override
    public boolean isPlayable(Amarilla carta) {
        return true;
    }

    @Override
    public boolean isPlayable(Carta carta) {
        return false;
    }

    public boolean isPlayable(Numero carta){
        if (carta.getValue() == super.getValue()){
            return true;
        }
        return false;
    }
    
    @Override
    public void play() {
        System.out.println("se jugó "+Integer.toString(super.getValue())+ " amarillo");
    }

    
}
