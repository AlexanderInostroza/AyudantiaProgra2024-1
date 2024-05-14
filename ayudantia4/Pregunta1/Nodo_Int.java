package Pregunta1;
public class Nodo_Int extends Nodo{
    int value;

    public Nodo_Int(int value){
        this.value = value;
    }

    public String toString(){
        return Integer.toString(value);
    }
}
