public class Pregunta3 {
    
    public static int binarySearch(int[] arr, int num, int pos_i, int pos_f){
        if(pos_f - pos_i == 1){
            if (arr[pos_i] == num) return pos_i;
            return -1;
        }
        int mitad = (pos_f+pos_i)/2;
        if (arr[mitad] == num) return mitad;
        if (num < arr[mitad]) return binarySearch(arr, num, pos_i, mitad);
        return binarySearch(arr, num, mitad+1, pos_f);
    }
}
