package manInMaze;

/**
 * Created by User on 26.04.2017.
 */
public class Monster extends Entity implements IFightable, IMoveable {

    private Grid grid;

    public Monster(int x, int y, int hits, Grid grid) {
        super(x, y, hits);
        this.grid = grid;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void hit() {

    }

    @Override
    public void move(Direction d) {

    }
}
