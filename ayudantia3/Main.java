
public class Main {

    public static void main(String[] args) {
        Auto auto1, auto2, auto3, auto4;
        auto1 = new Auto(25, 60);
        auto2 = new Auto(20, 30);
        auto3 = new Auto(10, 5);
        auto4 = new Auto(100, 200);

        Carrera carrera = new Carrera(100);
        carrera.addAuto(auto1);
        carrera.addAuto(auto2);
        carrera.addAuto(auto3);
        carrera.addAuto(auto4);
        for(double t = 0; t < 20.0; t = t + 1.0){
            System.out.println("\nTiempo "+Double.toString(t));
            carrera.verCarrera(t);
        }
    }
    
}
