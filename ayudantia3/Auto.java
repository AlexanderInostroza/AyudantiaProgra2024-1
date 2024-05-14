
public class Auto{
    double velMax;
    double tiempo;

    public Auto(double velMax, double tiempo){
        this.velMax = velMax;
        this.tiempo = tiempo;
    }

    public double getVelMax(){
        return velMax;
    }

    public double getTiempoVelMax(){
        return tiempo;
    }

    public double getAceleracion(){
        return velMax/tiempo;
    }


}