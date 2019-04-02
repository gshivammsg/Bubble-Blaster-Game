package in.gshivammsg.screens;

import in.gshivammsg.entity.Balloon;
import in.gshivammsg.entity.Bomb;
import in.gshivammsg.main.Game;
import in.gshivammsg.main.GamePanel;
import in.gshivammsg.resources.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Stage1 extends Screen {
    private java.util.List<Balloon> balloon = new ArrayList<Balloon>();
    private java.util.List<Bomb> bomb = new ArrayList<Bomb>();
    private int score = 0;
    private int miss = 0;
    private Random rand = new Random();

    public Stage1(GamePanel p) {
        super(p);
        this.balloonLimit = 10;
        this.balloon.add(new Balloon(0, 400, Resources.balloon1));
        this.balloon.add(new Balloon(120, 530, Resources.balloon2));
        this.balloon.add(new Balloon(480, 530, Resources.balloon1));
        this.balloon.add(new Balloon(240, 660, Resources.balloon1));
        this.balloon.add(new Balloon(480, 790, Resources.balloon1));
        this.balloon.add(new Balloon(480, 920, Resources.balloon1));

        this.bomb.add(new Bomb(380, 1020, Resources.bomb1));
        this.bomb.add(new Bomb(100, 790, Resources.bomb1));

        this.entities.addAll(this.balloon);
        this.entities.addAll(this.bomb);
        Resources.musicAudio.loop();

    }


    @Override
    public void update() {

        super.update();

        for (Balloon b1 : balloon) {
            if (b1.y <= -120) {
                b1.y = 620;
                if (b1.isVisible) {
                    this.miss += 1;
                }
                b1.x = rand.nextInt(Game.GAME_WIDTH - b1.width);
                b1.isVisible = true;

            }

            if (this.miss > this.balloonLimit) {
                Resources.musicAudio.stop();
                Resources.gameOver.play();
                this.gpanel.currentScreen = new GameOverScreen(this.gpanel);

            }
        }
        for (Bomb b2 : bomb) {
            if (b2.y <= -120) {
                b2.y = 620;
                b2.x = rand.nextInt(Game.GAME_WIDTH - b2.width);
            }

        }
    }

    public void draw(Graphics g) {

        g.setColor(Resources.skyColor);
        g.fillRect(0, 0, Game.GAME_WIDTH, Game.GAME_HEIGHT);
        super.draw(g);

        g.setColor(Color.orange);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Score :" + this.score, 490, 20);
        g.drawString("Miss :" + this.miss, 500, 35);

    }


    @Override
    public void onMousePress(int xCord, int yCord) {

        for (Balloon b1 : balloon) {
            if (b1.isVisible && (b1.x < xCord && xCord < (b1.x + b1.width))
                    && (b1.y < yCord && yCord < (b1.y + b1.width))) {
                this.score += 20;
                Resources.hitAudio.play();
                b1.isVisible = false;

            }
        }
        for (Bomb b2 : bomb) {
            if ((b2.x < xCord && xCord < (b2.x + b2.width))
                    && (b2.y < yCord && yCord < (b2.y + b2.width))) {
                Resources.musicAudio.stop();
                Resources.bombAudio.play();
                this.gpanel.currentScreen = new BlastScreen(this.gpanel);

            }

        }

        }
}
