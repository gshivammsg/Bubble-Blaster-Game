package in.gshivammsg.main;

import javax.swing.*;

public class Game {

    public static final int GAME_HEIGHT = 600;
    public static final int GAME_WIDTH = 600;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        GamePanel panel = new GamePanel();
        frame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);



        JFrame frame1 = new JFrame();
        GamePanel panel1 = new GamePanel();
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
        frame1.add(panel1);
        frame1.pack();
        frame1.setVisible(true);

    }

}
