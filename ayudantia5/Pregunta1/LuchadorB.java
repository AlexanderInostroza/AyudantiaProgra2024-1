package Pregunta1;
 
public class LuchadorB { 
    int hp; 
    int dmg; 
 
    public LuchadorB(){ 
        hp = 500; 
        dmg = 50; 
    } 
 
    public void golpear(LuchadorA luchadorA){ 
        //luchadorA.hp = luchadorA.hp - 50;
        luchadorA.recibirGolpe(dmg);
        //if (luchadorA.hp <= 0){ 
        if (luchadorA.estaMuerto()){
            System.out.println("Gana luchador B"); 
        } 
    }

    public void recibirGolpe(int dmg){
        hp = hp - dmg;
    }
    public boolean estaMuerto(){
        return hp <= 0;
    }
} 