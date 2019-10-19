package labyrinth;

public class Room implements MapSite {
    private static int ID_INC = 0;

    private int id;
    private MapSite[] sides;
    private Direction direction;

    {
        id = ++ID_INC;
        sides = new MapSite[4];
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public static int getIdInc() {
        return ID_INC;
    }

    public int getId() {
        return id;
    }

    @Override
    public void enter() {
        getSide(direction).enter();
    }

    public MapSite getSide(Direction direction) {
        switch (direction) {
            case EAST: return sides[0];
            case WEST: return sides[1];
            case NORTH: return sides[2];
            case SOUTH: return sides[3];
        }
        return null;
    }

    public void setSide(Direction direction, MapSite side) {
        switch (direction) {
            case EAST: sides[0] = side; break;
            case WEST: sides[1] = side; break;
            case NORTH: sides[2] = side; break;
            case SOUTH: sides[3] = side; break;
        }
    }
}
