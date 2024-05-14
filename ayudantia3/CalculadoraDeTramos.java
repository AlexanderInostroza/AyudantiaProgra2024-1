
public class CalculadoraDeTramos {
    
    public static double tramoRecorrido(Auto auto, double tiempo){
        double tiempo_mov_unif;
        double distancia;
        if (tiempo > auto.getTiempoVelMax()){
            distancia  = auto.getAceleracion() * auto.getTiempoVelMax()* auto.getTiempoVelMax() * 0.5;
            tiempo_mov_unif = tiempo - auto.getTiempoVelMax();
            distancia = distancia + auto.getVelMax() * tiempo_mov_unif;
        }
        else{
            distancia = auto.getAceleracion() * tiempo * tiempo * 0.5;
        }
        return distancia;
    }
}
