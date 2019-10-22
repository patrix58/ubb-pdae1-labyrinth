package labyrinth;

public class MazeFactory {
    public Door makeDoor(Room room1, Room room2) {
        return new Door(room1, room2);
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Room makeRoom() {
        return new Room();
    }

    public MazePainter makePainter(Room room) {
        return new MazePainter(room);
    }
}
