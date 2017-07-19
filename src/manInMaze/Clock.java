package manInMaze;


import java.applet.Applet;

public class Clock implements Runnable {
    String time;
    Applet apl;

    @Deprecated
    Clock() {
        new Thread(this).start();
    }


    Clock(Applet apl) {
        this.apl = apl;
        new Thread(this).start();
    }
    @Override
    public void run() {
        while (true) {
            time = Long.toString(System.currentTimeMillis());
            apl.repaint(0,0,100,10);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
