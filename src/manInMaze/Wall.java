package manInMaze;

/**
 * Created by User on 26.04.2017.
 */
public class Wall extends Entity{

    private Grid grid;

    public Wall(int x, int y, int hits, Grid grid) {
        super(x, y, hits);
        this.grid = grid;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }
}
