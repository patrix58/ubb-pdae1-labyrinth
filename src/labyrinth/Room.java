package labyrinth;

import java.util.HashMap;

public class Room implements MapSite {
    private static int ID_INC = 0;
    public final static HashMap<Integer, Room> rooms = new HashMap<>();

    private int id;
    private MapSite[] sides;

    {
        id = ID_INC++;
        sides = new MapSite[4];
        rooms.put(id, this);
    }

    public static int getIdInc() {
        return ID_INC;
    }

    public int getId() {
        return id;
    }

    @Override
    public void enter() {
        System.out.println("Entered room with id = " + id);
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
