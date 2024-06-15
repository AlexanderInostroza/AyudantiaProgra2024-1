public class Pregunta1 {

    public static int Fib(int n){
        if(n <= 1) return n;
        return Fib(n-1) + Fib(n-2);
    }

    public static int BinToDec(int n){
        if(n == 0) return 0;
        return n % 10 + 2 * BinToDec(n/10);
    }

    public static void Ordenar(int[] arr, int n){
        if(n == 1) return;
        // buscar el maximo
        int i_max = 0;
        for(int i=0; i<n; i++){
            if (arr[i] > arr[i_max]) i_max = i;
        }
        int aux = arr[n-1];
        arr[n-1] = arr[i_max];
        arr[i_max] = aux;
        // llamado recursivo
        Ordenar(arr, n-1);
    }

    public static int SumaAuxiliar(int[] arr, int i){
        if(i == arr.length) return 0;
        return arr[i] + SumaAuxiliar(arr, i+1);
    }

    public static int Suma(int[] arr){
        return SumaAuxiliar(arr, 0);
    }
}
