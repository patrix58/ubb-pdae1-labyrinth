package labyrinth;

public class MazeFactory {
    public static Door makeDoor(Room room1, Room room2) {
        return new Door(room1, room2);
    }

    public static Wall makeWall() {
        return new Wall();
    }

    public static Room makeRoom() {
        return new Room();
    }
}
