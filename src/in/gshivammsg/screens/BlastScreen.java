package in.gshivammsg.screens;

import in.gshivammsg.main.GamePanel;
import in.gshivammsg.resources.Resources;

import java.awt.*;

public class BlastScreen extends Screen {
    public BlastScreen(GamePanel p) {
        super(p);
    }
    public void draw(Graphics g) {

        g.setColor(Color.red);
        g.fillRect(0,0,600,600);
        g.drawImage(Resources.blast,8,5,null);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Game Over. Press any key to continue", 10, 20);



    }
    @Override
    public void onKeyPress(int keyCode) {
        this.gpanel.currentScreen = new Stage1(this.gpanel);
    }

}
