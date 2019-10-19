package gui;

import labyrinth.Direction;
import labyrinth.Room;
import labyrinth.Wall;

import javax.swing.*;
import java.awt.*;

public class GuiPanel extends JPanel {
    private static int ID_INC = 0;

    private int id;
    private boolean here;

    {
        id = ID_INC++;
        here = false;
        Room room = Room.rooms.get(id);
        setBorder(BorderFactory.createMatteBorder(
                room.getSide(Direction.NORTH) instanceof Wall ? 1 : 0,
                room.getSide(Direction.WEST) instanceof Wall ? 1 : 0,
                room.getSide(Direction.SOUTH) instanceof Wall ? 1 : 0,
                room.getSide(Direction.EAST) instanceof Wall ? 1 : 0,
                Color.BLACK
        ));
    }

    void enter() {
        here = true;
        repaint();
    }

    void exit() {
        here = false;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(here) {
            g.drawRect(0, 0, 10, 10);
        }
        g.drawString(Integer.toString(id), 50, 50);
    }
}
