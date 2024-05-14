package Pregunta1;
public class SelectColor implements Carta, Negra {
    public boolean isPlayable(Negra carta){
        return true;
    }

    @Override
    public boolean isPlayable(Carta carta) {
        return true;
    }

    public String selectColor(){
        // le pide al usuario un color
        return "algun color";
    }

    @Override
    public void play() {
        String color = selectColor();
        System.out.println("se jugó un cambio de color y se eligió"+ color);
    }
    
}
