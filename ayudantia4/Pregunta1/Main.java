package Pregunta1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Nodo> lista = new ArrayList<Nodo>();
        Nodo nodo1 = new Nodo_Double(1.0);
        Nodo nodo2 = new Nodo_String("uno");
        Nodo nodo3 = new Nodo_Int(1);
        lista.add(nodo1);
        lista.add(nodo2);
        lista.add(nodo3);
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i).toString());
        }

    }
}
