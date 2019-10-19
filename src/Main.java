import gui.Controller;
import labyrinth.Maze;
import labyrinth.MazeFactory;

public class Main {
    public static void main(String[] args) {
        Maze<MazeFactory> maze = new Maze<>();
        Controller controller = new Controller(maze.getRoom());
    }
}
