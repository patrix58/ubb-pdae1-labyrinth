// kppe0433
import labyrinth.EnchantedMaze;
import labyrinth.Maze;
import labyrinth.MazeFactory;

public class Main {
    public static void main(String[] args) {
        new Maze(new MazeFactory()); // simple maze
//        new EnchantedMaze(); // enchanted maze
        /*
            Explanation:
            Locked - locked door
            K - key in that room
            NUMBER - the id number of the room
            The field is generated randomly, so sometimes there is no solution.
         */
    }
}
