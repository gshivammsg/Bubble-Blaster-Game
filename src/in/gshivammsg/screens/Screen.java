package in.gshivammsg.screens;

import in.gshivammsg.entity.Entity;
import in.gshivammsg.main.GamePanel;

import java.awt.*;
import java.util.ArrayList;

abstract public class Screen {

    protected GamePanel gpanel;
    protected java.util.List<Entity> entities = new ArrayList<>();
    protected int balloonLimit;


    public Screen(GamePanel p){

        super();
        this.gpanel = p;

    }

    public void update(){
        for(Entity e :this.entities){
            e.update();
        }
    }
    public void draw(Graphics g) {
        for(Entity e: entities) {
            if(e.isVisible) {
                g.drawImage(e.image, e.x, e.y, null);
            }
        }
    }
    public void onMousePress(int xCord, int yCord) {

    }

    public void onKeyPress(int keyCode) {

    }



}
