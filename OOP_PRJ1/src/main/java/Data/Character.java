
package Data;

public class Character {
    private int HP;
    private int MP;
    private int ATK;
    private int DEF;
    private String Name;
    private int HP_MAX = 10000;
    private int Special;
    private int Speed;
    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getSpecial() {
        return Special;
    }

    public void setSpecial(int Special) {
        this.Special = Special;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }
    public void Character(){}
    public void Move(){}
    public boolean CheckCollision(){
        return true;
    }
    public void SpecialSkill(){}
}
