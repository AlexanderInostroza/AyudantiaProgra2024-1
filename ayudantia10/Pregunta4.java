public class Pregunta4 {
    public static double[] n_values(double a, double b, int n){
        double diferencia = b-a;
        double interval_size = diferencia/n;
        double[] arr = new double[n];
        for(int i=0; i<n; i++){
            arr[i] = Function.eval(a + n * interval_size);
        }
        return arr;
    }
}

class Function{

    public static double eval(double x){
        return x*x + 2;
    }
}