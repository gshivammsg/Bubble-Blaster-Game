package in.gshivammsg.entity;

import in.gshivammsg.main.GamePanel;
import in.gshivammsg.resources.Resources;

import java.awt.*;

public class Bomb extends Entity {

    public Bomb(int x, int y, Image i) {
        super(x, y);
        this.height = 97;
        this.width = 95;
        this.yVel -= 4;
        this.image = i;

    }

    @Override
    public void update() {
        super.update();


        }


}
