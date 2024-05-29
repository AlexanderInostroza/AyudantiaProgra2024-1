import java.io.*;

public class Main{
    public static void main(String[] args) {
        String contenido = "";
        // lectura de un archivo
        try(InputStream input_file = new FileInputStream("texto_de_prueba.txt")){
            System.out.printf("Tamaño del archivo: %d \n", input_file.available());
            int i=-1;
            i = input_file.read();
            while(i != -1){
                // System.out.print((char)i);
                if(i != '\r') contenido = Character.toString(i) + contenido; // manejo del \r 
                i = input_file.read();
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (IOException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
        

        // Escritura de un archivo 
        try(OutputStream output_file = new FileOutputStream("texto_invertido.txt")){
            byte[] buffer = contenido.getBytes(); // texto a bytes
            output_file.write(buffer, 0, buffer.length);
            System.out.println("\nArchivo escrito exitosamente.");
        } catch (IOException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }

    }
}