public class Pregunta2 {
    public static void main(String[] args){
        String texto = "ntqcloz npdlc";
        String cifrado = Cifrar(texto, 15);
        System.out.println(cifrado);

    }
    public static String Cifrar(String texto, int n){
        String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String letra;
        String retorno = "";
        for(int i=0; i<texto.length(); i++){
            letra = texto.substring(i, i+1);
            boolean flag_letra = false;
            for(int j=0; j<alfabeto.length; j++){
                if(alfabeto[j].equals(letra)){
                    flag_letra = true;
                    int k = j + n;
                    while (k<0) k = k + alfabeto.length;
                    k = k % alfabeto.length;
                    retorno = retorno.concat(alfabeto[k]);                    
                }
            }
            if (!flag_letra){
                retorno = retorno.concat(letra);
            }
        }
        return retorno;
    }
}
