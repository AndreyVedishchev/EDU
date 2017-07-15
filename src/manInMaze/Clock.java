package manInMaze;

import java.applet.Applet;

public class Clock extends Applet implements Runnable {
    String time;

    Clock() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            time = Long.toString(System.currentTimeMillis());
        }
    }
}
