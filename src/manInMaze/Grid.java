package manInMaze;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by User on 26.04.2017.
 */
/*
    <applet code="TestApp" width=500 height=500>
    </applet>
 */
public class Grid extends Applet{
    private Man man;
    private Monster monster;
    private Wall wall;

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
}
