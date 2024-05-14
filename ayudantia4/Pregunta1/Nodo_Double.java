package Pregunta1;
public class Nodo_Double extends Nodo{
    double value;

    public Nodo_Double(double value){
        this.value = value;
    }

    public String toString(){
        return Double.toString(value);
    }
    
}
