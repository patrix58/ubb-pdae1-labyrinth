package labyrinth;

import java.util.Random;

public class Maze<T extends MazeFactory> {
    private static int[] x = {0, 0, 1, -1};
    private static int[] y = {1, -1, 0, 0};
    private static Direction[] d = {Direction.EAST, Direction.WEST, Direction.SOUTH, Direction.NORTH};
    private static Direction[] od = {Direction.WEST, Direction.EAST, Direction.NORTH, Direction.SOUTH};

    public Maze() {
        Room[][] rooms = new Room[4][4];
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                rooms[i][j] = T.makeRoom();
            }
        }
        Random random = new Random();
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                for(int k = 0; k < 4; ++k) {
                    int ii = i + x[k];
                    int jj = j + y[k];
                    if(ii < 0 || jj < 0 || ii >= 4 || jj >= 4) {
                        rooms[i][j].setSide(d[k], T.makeWall());
                        continue;
                    }
                    MapSite other = rooms[ii][jj].getSide(od[k]);
                    if (other == null) {
                        if (random.nextBoolean()) {
                            rooms[i][j].setSide(d[k], T.makeDoor(rooms[i][j], rooms[ii][jj]));
                        } else {
                            rooms[i][j].setSide(d[k], T.makeWall());
                        }
                    } else {
                        rooms[i][j].setSide(d[k], other);
                    }
                }
            }
        }
    }
}
