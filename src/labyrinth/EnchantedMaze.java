package labyrinth;

import java.util.Random;

public class EnchantedMaze extends Maze<EnchantedMazeFactory> {

    public EnchantedMaze() {
//        EnchantedRoom[][] rooms = new EnchantedRoom[4][4];
//        for(int i = 0; i < 4; ++i) {
//            for(int j = 0; j < 4; ++j) {
//                rooms[i][j] = EnchantedMazeFactory.makeRoom();
//            }
//        }
//        Random random = new Random();
//        for(int i = 0; i < 4; ++i) {
//            for(int j = 0; j < 4; ++j) {
//                for(int k = 0; k < 4; ++k) {
//                    int ii = i + x[k];
//                    int jj = j + y[k];
//                    if(ii < 0 || jj < 0 || ii >= 4 || jj >= 4) {
//                        rooms[i][j].setSide(d[k], EnchantedMazeFactory.makeWall());
//                        continue;
//                    }
//                    MapSite other = rooms[ii][jj].getSide(od[k]);
//                    if (other == null) {
//                        if (random.nextBoolean()) {
//                            EnchantedDoor door = EnchantedMazeFactory.makeDoor(rooms[i][j], rooms[ii][jj]);
//                            if (i > 1 && j > 1 && random.nextBoolean()) {
//                                int iii, jjj;
//                                do {
//                                    iii = random.nextInt(i);
//                                    jjj = random.nextInt(j);
//                                } while (rooms[iii][jjj].hasKey());
//                                rooms[i][j].setKey(door);
//                            }
//                            rooms[i][j].setSide(d[k], door);
//                        } else {
//                            rooms[i][j].setSide(d[k], EnchantedMazeFactory.makeWall());
//                        }
//                    } else {
//                        rooms[i][j].setSide(d[k], other);
//                    }
//                }
//            }
//        }
    }
}
