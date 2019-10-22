package labyrinth;

import gui.Controller;

import java.util.Random;

public class Maze {
    protected static int[] x = {0, 0, 1, -1};
    protected static int[] y = {1, -1, 0, 0};
    protected static Direction[] d = {Direction.EAST, Direction.WEST, Direction.SOUTH, Direction.NORTH};
    protected static Direction[] od = {Direction.WEST, Direction.EAST, Direction.NORTH, Direction.SOUTH};
    
    protected Room[][] rooms;

    public Maze(MazeFactory factory) {
        rooms = new Room[4][4];
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                rooms[i][j] = factory.makeRoom();
            }
        }
        Random random = new Random();
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                for(int k = 0; k < 4; ++k) {
                    int ii = i + x[k];
                    int jj = j + y[k];
                    if(ii < 0 || jj < 0 || ii >= 4 || jj >= 4) {
                        rooms[i][j].setSide(d[k], factory.makeWall());
                        continue;
                    }
                    MapSite other = rooms[ii][jj].getSide(od[k]);
                    if (other == null) {
                        if (random.nextBoolean()) {
                            rooms[i][j].setSide(d[k], factory.makeDoor(rooms[i][j], rooms[ii][jj]));
                        } else {
                            rooms[i][j].setSide(d[k], factory.makeWall());
                        }
                    } else {
                        rooms[i][j].setSide(d[k], other);
                    }
                }
            }
        }
        new Controller(factory);
    }
}
