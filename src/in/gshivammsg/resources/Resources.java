package in.gshivammsg.resources;


import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;

public class Resources {

    public static Image balloon1;
    public static Image balloon2;
    public static Image balloon3;
    public static Image balloon4;
    public static Image balloon5;
    public static Image balloon6;
    public static Image balloon7;
    public static Image welcome;
    public static Image overGame;
    public static Image blast;



    public static Image bomb1;
    public static Image bomb2;

    public static AudioClip bombAudio;
    public static AudioClip hitAudio;
    public static AudioClip musicAudio;
    public static AudioClip gameOver;


    public static Color skyColor;





    public static void load(){
        skyColor = new Color(103, 194, 255);

        try {
            balloon1 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/gshivammsg/resources/images/balloon1.png"));
            balloon2 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/gshivammsg/resources/images/balloon2.png"));
            balloon3 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/gshivammsg/resources/images/balloon1.png"));
            balloon4 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/gshivammsg/resources/images/balloon1.png"));
            balloon5 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/gshivammsg/resources/images/balloon2.png"));
            balloon6 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/gshivammsg/resources/images/balloon1.png"));
            balloon7 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/gshivammsg/resources/images/balloon1.png"));
            bomb1 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/gshivammsg/resources/images/bomb.png"));
            bomb2 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/gshivammsg/resources/images/bomb.png"));
            overGame = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/gshivammsg/resources/images/over.png"));
            welcome = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/gshivammsg/resources/images/welcome.png"));
            blast = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("in/gshivammsg/resources/images/boom.png"));

            bombAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("in/gshivammsg/resources/audios/bomb.wav"));
            gameOver = Applet.newAudioClip(Resources.class.getClassLoader().getResource("in/gshivammsg/resources/audios/gameover.wav"));

            musicAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("in/gshivammsg/resources/audios/music.wav"));
            hitAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("in/gshivammsg/resources/audios/hit.wav"));

        } catch (IOException e) {

        }
    }

}
