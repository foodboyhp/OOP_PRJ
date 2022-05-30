
package Data;

import java.awt.Point;
import java.util.ArrayList;

public class Map {
    private int Width;
    private int Height;
    private Point size;
    private ArrayList<Character> MapChar;
    private ArrayList<BaseSkill> CastingSkills;
    private ArrayList<BaseSkill> EffectingSkills;
    private ArrayList<Item> ItemList;
    public Tile[][] TileList ;
    public String Name;
}
