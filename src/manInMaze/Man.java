package manInMaze;

/**
 * Created by User on 26.04.2017.
 */
public class Man extends Entity implements IMoveable {

    Grid grid;

    public Man(int x, int y, int hits, Grid grid) {
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
    public void move(Direction d) {
        switch (d){
            case NORTH:
                y++;
                break;
            case SOUTH:
                y--;

                break;
            case EAST:
                x++;
                break;
            case WEST:
                x--;
                break;
        }
    }
}
