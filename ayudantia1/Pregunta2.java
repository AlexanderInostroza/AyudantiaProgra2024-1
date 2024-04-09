import java.util.Scanner;


class Pregunta2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int input = scan.nextInt();
        int input_copia = 0 + input;

        int largo = 0; // largo del numero
        while(input_copia != 0){
            largo ++;
            input_copia = input_copia / 10;
        }
        
        int potencia_de_10 = 1; // potencia de 10 para separar el número en mitades
        for(int i = 0; i < largo/2; i++){
            potencia_de_10 = potencia_de_10 * 10;
        }
        
        boolean par = largo % 2 == 0; // paridad del largo del input

        int mitad_izq, mitad_der;
        mitad_izq = input / (potencia_de_10 * 10); // 123456 / (1000*10) = 12
        if(par){
            mitad_der = input % (potencia_de_10 / 10); // 123456 % (1000/10) = 56
        }else{
            mitad_der = input % (potencia_de_10); // 1234567 % 1000 = 567
        }

        int suma_izq=0, suma_der=0;
        for(int i=0; i < largo/2; i++){ // ciclo para sumar mitades
            suma_izq = suma_izq + mitad_izq % 10; // se suma el ultimo digito
            suma_der = suma_der + mitad_der % 10; // se suma el ultimo digito
            mitad_izq = mitad_izq / 10; // se elimina el ultimo digito
            mitad_der = mitad_der / 10; // se elimina el ultimo digito
        }

        System.out.println("suma izq = "+Integer.toString(suma_izq));
        System.out.println("suma der = "+Integer.toString(suma_der));
        
        if(suma_izq == suma_der){
            System.out.println("Balanceado");
        }else{
            System.out.println("No balanceado");
        }

        scan.close();
    }
}