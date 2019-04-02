package in.gshivammsg.screens;

import in.gshivammsg.main.GamePanel;
import in.gshivammsg.resources.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GameOverScreen extends Screen {

    public GameOverScreen(GamePanel panel) {

        super(panel);
    }

    public void update(){

    }
    public void draw(Graphics g) {



        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Game Over. Press any key to continue", 10, 20);
        g.drawImage(Resources.overGame,30,100,null);
    }
    @Override
    public void onKeyPress(int keyCode) {
        if(keyCode== KeyEvent.VK_RIGHT){
        this.gpanel.currentScreen = new Stage1(this.gpanel);
        }
    }

}
