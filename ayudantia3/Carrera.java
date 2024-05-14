
public class Carrera {
    double distancia;
    Auto[] autos;
    int cantidad_de_autos;

    public Carrera(double distancia){
        this.distancia = distancia;
        autos = new Auto[10];
        cantidad_de_autos = 0;
    }

    public void addAuto(Auto auto){
        if(cantidad_de_autos == 10){
            return;
        }
        autos[cantidad_de_autos] = auto;
        cantidad_de_autos++;
    }

    public void verCarrera(double tiempo){
        double distancia_recorrida;
        double porcentaje;
        for(int i=0; i<cantidad_de_autos; i++){
            distancia_recorrida = CalculadoraDeTramos.tramoRecorrido(autos[i], tiempo);
            porcentaje = distancia_recorrida*100.0/distancia;
            System.out.println("Auto "+Integer.toString(i+1)+": "+ Double.toString(porcentaje)+" %");
        }
    }
}