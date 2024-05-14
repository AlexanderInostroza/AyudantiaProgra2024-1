package Pregunta2;
import java.util.ArrayList;
import java.util.List;

public class Cola {
    List<Cliente> lista;
    
    public Cola(){
        lista = new ArrayList<Cliente>();
    }

    public void encolar(Cliente cliente){
        lista.add(cliente);
    }

    public Cliente primerCliente(){
        Cliente primer_cliente = lista.get(0);
        lista.remove(0);
        return primer_cliente;
    }
    
}
