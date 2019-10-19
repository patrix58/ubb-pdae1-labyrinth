package labyrinth;

public class Maze<T extends MazeFactory> {
    private Room room;

    private static int[] x = {0, 0, 1, -1};
    private static int[] y = {1, -1, 0, 0};
    private static Direction[] d = {Direction.EAST, Direction.WEST, Direction.SOUTH, Direction.NORTH};

    public Maze() {
        Room[][] rooms = new Room[4][4];
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                rooms[i][j] = T.makeRoom();
            }
        }
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                for(int k = 0; k < 4; ++k) {
                    int ii = i + x[k];
                    int jj = j + y[k];
                    if(ii < 0 || jj < 0 || ii >= 4 || jj >= 4) {
                        rooms[i][j].setSide(d[k], T.makeWall());
                        continue;
                    }
                    Door door = T.makeDoor(rooms[i][j], rooms[ii][jj]);
                    rooms[i][j].setSide(d[k], door);
                }
            }
        }
        room = rooms[0][0];
    }

    public Room getRoom() {
        return room;
    }
}
