package labyrinth;

public class EnchantedMazeFactory extends MazeFactory {
    public Door makeDoor(Room room1, Room room2) {
        return new EnchantedDoor(room1, room2);
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Room makeRoom() {
        return new EnchantedRoom();
    }

    public MazePainter makePainter(Room room) {
        return new EnchantedMazePainter(room);
    }
}
