package manInMaze;

import java.applet.Applet;
import java.awt.*;

public class Clock extends Grid implements Runnable {
    String time;

    public Clock() {
        super();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                time = Long.toString(System.currentTimeMillis());
                Thread.sleep(1000);
                repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

//    public void paint(Graphics g) {
//        g.drawString(time, 10, 10);
//    }
}
