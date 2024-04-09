import java.util.Scanner;

public class Pregunta3a{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo:");
        int num = scan.nextInt();
        System.out.println("Los divisores de " +Integer.toString(num)+ " son:");

        for (int i=1; i<=num; i++){
            if((num % i) == 0){ // if i es divisor de num
                System.out.println(i);
            }
        }

        scan.close();
    }

}