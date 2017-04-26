package manInMaze;

/**
 * Created by User on 26.04.2017.
 */
public class Monster extends Entity implements IFightable, IMoveable {

    public Monster(int x, int y, int hits) {
        super(x, y, hits);
    }

    @Override
    public void hit() {

    }

    @Override
    public void move(Direction d) {

    }
}
