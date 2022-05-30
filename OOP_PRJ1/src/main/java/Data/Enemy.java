
package Data;

import java.awt.Rectangle;


public class Enemy {
    private double X;
    private double Y;
    private int Width;
    private int Height;
    private int bgwidth;
    private int bgheight;
    private double MaxHP;
    private double HP;
    private double ATK;
    private double DEF;
    private double RunningSpeed;
    private double AttackSpeed;
    private double Range;
    private boolean isDead;
    private Rectangle r;
    private int[] Dx;
    private int[] Dy;

    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int Width) {
        this.Width = Width;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }

    public int getBgwidth() {
        return bgwidth;
    }

    public void setBgwidth(int bgwidth) {
        this.bgwidth = bgwidth;
    }

    public int getBgheight() {
        return bgheight;
    }

    public void setBgheight(int bgheight) {
        this.bgheight = bgheight;
    }

    public double getMaxHP() {
        return MaxHP;
    }

    public void setMaxHP(double MaxHP) {
        this.MaxHP = MaxHP;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getATK() {
        return ATK;
    }

    public void setATK(double ATK) {
        this.ATK = ATK;
    }

    public double getDEF() {
        return DEF;
    }

    public void setDEF(double DEF) {
        this.DEF = DEF;
    }

    public double getRunningSpeed() {
        return RunningSpeed;
    }

    public void setRunningSpeed(double RunningSpeed) {
        this.RunningSpeed = RunningSpeed;
    }

    public double getAttackSpeed() {
        return AttackSpeed;
    }

    public void setAttackSpeed(double AttackSpeed) {
        this.AttackSpeed = AttackSpeed;
    }

    public double getRange() {
        return Range;
    }

    public void setRange(double Range) {
        this.Range = Range;
    }
    
    public void getRenderX(){
    
    }
    
    public void getRenderY(){
    
    }
    
    public Rectangle getBox(){
    
        return null;
    
    }
    
    public boolean isDead(){
        return true;
    }
    
    
}
