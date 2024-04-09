import java.util.Scanner;

public class Pregunta3b {
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo:");
        int num = scan.nextInt();
        System.out.println("Los números primos entre 1 y " +Integer.toString(num)+ " son:");
        
        int divisores; // contador de divisores
        
        for(int j=2; j<=num; j++){// se recorre cada número entre 2 y num (1 NO es primo)
            divisores = 0; // se inicia/reinicia el contador para este j
            for (int i=1; i<=j; i++){// usamos el mismo ciclo, de antes, pero para contar los divisores
                if((j % i) == 0){
                    divisores++;
                }
            }
            if(divisores == 2){ // if j es primo
                System.out.println(j);
            }
        }

        scan.close();

    }
}
