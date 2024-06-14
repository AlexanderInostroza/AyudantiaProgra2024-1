public class Main {
    public static void main(String[] args) {
    }

    public static int potencia(int base, int exponente){
        if(exponente == 0) return 1;
        return base * potencia(base, exponente - 1);
    }

    public static boolean palindromo(String palabra){
        if(palabra.length() <= 1) return true;
        return palabra.charAt(0) == palabra.charAt(palabra.length() - 1) 
            && palindromo(palabra.substring(1, palabra.length() - 1));
    }
}
