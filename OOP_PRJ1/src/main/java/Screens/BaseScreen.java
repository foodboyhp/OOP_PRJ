
package Screens;

import java.awt.Graphics;

public interface BaseScreen {
       /*String Name;
       boolean Active;
       boolean Show;
       boolean grabFocus;
       boolean Removed;*/
       void HandleInput(char key);
       void Update();
       void KeyUp(String key);
       void Draw(Graphics g);
       void Unload();
}
