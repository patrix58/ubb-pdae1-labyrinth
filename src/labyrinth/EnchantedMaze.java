package labyrinth;

public class EnchantedMaze extends Maze {

    public EnchantedMaze() {
        super(new EnchantedMazeFactory());
        ((EnchantedRoom)rooms[0][1]).setKey((Door) rooms[2][2].getSide(Direction.EAST));
    }
}
