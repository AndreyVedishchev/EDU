package manInMaze;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by User on 26.04.2017.
 */
/*
    <applet code="TestApp" width=500 height=500>
    </applet>
 */
public class Grid extends Applet implements MouseListener {
    private Man man;
    private Monster monster;
    private Wall wall;
    private String msg = "?";
    private int x = 200;
    private int y = 200;

    public void init(){
        addMouseListener(this); //добавили слушателя
    }

    public void paint(Graphics g) {
        g.drawString(msg, x, y);
    }

    public Grid() {

    }
    public Grid(Man man, Monster monster, Wall wall) throws HeadlessException {
        this.man = man;
        this.monster = monster;
        this.wall = wall;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public Man getMan() {
        return man;
    }

    public Monster getMonster() {
        return monster;
    }

    public Wall getWall() {
        return wall;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        e.getX();//координата X щелчка
        e.getY();//координата Y шелчка
        msg = "" + e.getButton();
        x++;
        y++;
        repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
