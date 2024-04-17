package Pregunta2;

public class Character {
    private int healthPoints;
    private int defensePoints;
    private int evasionPoints;
    private int attackPoints;
    private int accuracyPoints;
    private Helm helm;


    public Character(){
        healthPoints = defensePoints = evasionPoints = attackPoints = accuracyPoints = 0;
        helm = null;
    }

    public void setHelm(Helm helm){}
    public void getHelm(){}


    public void equip(Equipment equpipment){}
    public void unequip(Equipment equipment){}

}
