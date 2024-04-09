import java.util.Scanner;

class Pregunta1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // objeto scanner
        
        // HORA INICIAL
        System.out.println("Hora inicial?");
        int hora_i = scan.nextInt();
        if (hora_i < 0 || hora_i >=24){
            System.out.println("error");
            scan.close();
            return;
        }
        
        System.out.println("Minutos inicial?");
        int minutos_i = scan.nextInt();
        if (minutos_i < 0 || minutos_i >= 60){
            System.out.println("error");
            scan.close();
            return;
        }
        
        System.out.println("segundos inicial?");
        int segundos_i = scan.nextInt();
        if (segundos_i < 0 || segundos_i >= 60){
            System.out.println("error");
            scan.close();
            return;
        }
        
        // HORA FINAL
        System.out.println("Hora final?");
        int hora_f = scan.nextInt();
        if (hora_f < 0 || hora_f >=24){
            System.out.println("error");
            scan.close();
            return;
        }
        
        System.out.println("Minutos final?");
        int minutos_f = scan.nextInt();
        if (minutos_f < 0 || minutos_f >= 60){
            System.out.println("error");
            scan.close();
            return;
        }
        
        System.out.println("segundos final?");
        int segundos_f = scan.nextInt();
        if (segundos_f < 0 || segundos_f >= 60){
            System.out.println("error");
            scan.close();
            return;
        }
        
        // horas en segundos
        int tiempo_i = hora_i * 3600 + minutos_i * 60 + segundos_i; 
        int tiempo_f = hora_f * 3600 + minutos_f * 60 + segundos_f;
        
        int diferencia = tiempo_f - tiempo_i;
        
        int diferencia_de_HH = diferencia/3600;
        int diferencia_de_MM = (diferencia%3600)/60;
        int diferencia_de_SS = (diferencia%60);
        
        System.out.print(diferencia_de_HH);
        System.out.print(":");
        System.out.print(diferencia_de_MM);
        System.out.print(":");
        System.out.print(diferencia_de_SS);

        scan.close();
    }
}