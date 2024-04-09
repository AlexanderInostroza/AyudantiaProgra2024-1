import java.util.Scanner;

public class Pregunta4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = scan.nextInt();
        int num_copia = 0+num;
        int suma = 0;
        int ultimo_digito, factorial;
        // Separar el número en cifras
        while (num_copia != 0){
            ultimo_digito = num_copia % 10;

            factorial = 1;
            while(ultimo_digito > 1){
                factorial = factorial * ultimo_digito;
                ultimo_digito = ultimo_digito - 1;
            }

            suma = suma + factorial;

            num_copia = num_copia / 10;
        }

        if ( suma == num){
            System.out.println("Es fuerte");
        }else{
            System.out.println("No es fuerte.");
        }

        scan.close();
    }
}
