package Pregunta2;

public class CalculadoraDePiscinas {
    int x;
    int y;
    int z; // altura

    // Constructor vacío
    public CalculadoraDePiscinas(){
        x = 0;
        y = 0;
        z = 0;
    }

    // Constructor con dimensiones
    public CalculadoraDePiscinas(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Precio bajo la cotización de la empresa A
    public int precioEmpresaA(){
        int val = 10000 * x * y * z;
        return val;
    }

    // Precio bajo la cotización de la empresa B
    public int precioEmpresaB(){
        int val = 15000 * (2*x*z + 2*y*z + x*y);
        return val;
    }
}
