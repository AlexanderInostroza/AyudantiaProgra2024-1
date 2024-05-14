package Pregunta1;
public class LuchadorA { 
    int hp; 
    int dmg; 
 
    public LuchadorA(){ 
        hp = 500; 
        dmg = 50; 
    } 
 
    public void golpear(LuchadorB luchadorB){ 
        //luchadorB.hp = luchadorB.hp - 50;
        luchadorB.recibirGolpe(dmg);
        //if (luchadorB.hp <= 0){ 
        if (luchadorB.estaMuerto()){
            System.out.println("Gana luchador A"); 
        }
    }
    public void recibirGolpe(int dmg){
        hp = hp - dmg;
    }
    public boolean estaMuerto(){
        return hp <= 0;
    }
} 

  
