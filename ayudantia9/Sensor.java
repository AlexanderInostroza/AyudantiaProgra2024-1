import java.util.Random;

public class Sensor {
    Random rand;

    public Sensor(){
        this(123);
    }

    public Sensor(int seed){
        rand = new Random(seed);
    }

    public Double getValue(){
        return rand.nextDouble()*15 - 5;
    }
    
}
