package labyrinth;

public class EnchantedMazeFactory extends MazeFactory {
    public static EnchantedDoor makeDoor(Room room1, Room room2) {
        return new EnchantedDoor(room1, room2);
    }

    public static Wall makeWall() {
        return new Wall();
    }

    public static EnchantedRoom makeRoom() {
        return new EnchantedRoom();
    }

    public static EnchantedMazePainter makePainter(Room room) {
        return new EnchantedMazePainter(room);
    }
}
