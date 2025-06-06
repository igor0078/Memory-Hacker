import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Mario {
    int x, y, width, height;
    int velX = 0;
    int velY = 0;
    boolean onGround = false;

    public Mario(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 40;
        this.height = 50;
    }

    public void update(ArrayList<Platform> platforms) {
        velY += 1; // gravity
        x += velX;
        y += velY;
        onGround = false;

        for (Platform p : platforms) {
            if (new Rectangle(x, y, width, height).intersects(p.getBounds())) {
                if (velY > 0) {
                    y = p.y - height;
                    velY = 0;
                    onGround = true;
                }
            }
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            velX = -5;
        }
        if (key == KeyEvent.VK_RIGHT) {
            velX = 5;
        }
        if (key == KeyEvent.VK_SPACE && onGround) {
            velY = -15;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            velX = 0;
        }
    }
}
