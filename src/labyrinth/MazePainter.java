package labyrinth;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MazePainter {
    protected Room room;

    public MazePainter(Room room) {
        this.room = room;
    }

    public Border getBorder() {
        return BorderFactory.createMatteBorder(
                room.getSide(Direction.NORTH) instanceof Wall ? 1 : 0,
                room.getSide(Direction.WEST) instanceof Wall ? 1 : 0,
                room.getSide(Direction.SOUTH) instanceof Wall ? 1 : 0,
                room.getSide(Direction.EAST) instanceof Wall ? 1 : 0,
                Color.BLACK
        );
    }

    public void paint(Graphics g) {
        g.drawString(Integer.toString(room.getId()), 50, 50);
    }
}
