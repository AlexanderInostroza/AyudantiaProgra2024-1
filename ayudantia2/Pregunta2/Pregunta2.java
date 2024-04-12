package Pregunta2;

import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese x:");
        int x = scan.nextInt();

        System.out.print("Ingrese y:");
        int y = scan.nextInt();

        System.out.print("Ingrese z:");
        int z = scan.nextInt();

        CalculadoraDePiscinas calc = new CalculadoraDePiscinas(x,y,z);

        System.out.print("Precio de la empresa A: ");
        System.out.println(calc.precioEmpresaA());

        System.out.print("Precio de la empresa B: ");
        System.out.println(calc.precioEmpresaB());

    }
}
