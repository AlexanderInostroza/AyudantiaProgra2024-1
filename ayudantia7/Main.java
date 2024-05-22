import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        String input;
        while(true){
            System.out.print("input: ");
            try{
                input = scan.nextLine();
                if (input.equals("correcto")){
                    flag = true;
                    break;
                }
            }
            catch(Exception e){            
                continue;
            }
        }
        if (flag) throw new Exception("Exception");
    }
}
