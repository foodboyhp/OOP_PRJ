
package Data;

public class BaseSkill {
    private String Name;
    private int Power;
    private int CastingTime;
    private int CoolDown;
    private int Finished;
    private Character Owner;
    public void Cast(){}
    public void Effecting(){}
    public boolean CanUse(){
        return true;
    }
    public void Reset(){}
}
