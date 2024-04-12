package Pregunta1;

public class Perro {
    String nombre;
    String raza;
    String dueño;
    int edad;

    // Constructor vacío, puede settear valores genéricos como nombre = ""
    public Perro(){
        this.nombre = "";
        raza  = "";
        dueño = "";
        edad = 0;
    }

    // Constructor
    public Perro(String nombre, String raza, String dueño, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.dueño = dueño;
        this.edad = edad;
    }

    // métodos setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public void setDueño(String dueño){
        this.dueño = dueño;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    // métodos getters
    public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    public String getDueño(){
        return this.dueño;
    }
    public int getEdad(){
        return this.edad;
    }
}