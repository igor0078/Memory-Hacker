import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    Timer timer;
    Mario mario;
    ArrayList<Platform> platforms;

    public GamePanel() {
        mario = new Mario(100, 100);
        platforms = new ArrayList<>();

        platforms.add(new Platform(0, 550, 800, 50));
        platforms.add(new Platform(200, 400, 100, 20));
        platforms.add(new Platform(400, 300, 100, 20));

        this.setBackground(Color.CYAN);
        this.setFocusable(true);
        this.addKeyListener(this);

        timer = new Timer(16, this); // ~60 FPS
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        mario.draw(g);

        for (Platform p : platforms) {
            p.draw(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mario.update(platforms);
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        mario.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        mario.keyReleased(e);
    }

    @Override
    public void keyTyped(KeyEvent e) {}
}
