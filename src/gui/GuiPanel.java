package gui;

import labyrinth.Direction;
import labyrinth.MazePainter;
import labyrinth.Room;
import labyrinth.Wall;

import javax.swing.*;
import java.awt.*;

public class GuiPanel extends JPanel {
    private boolean here;
    private MazePainter painter;

    GuiPanel(MazePainter painter) {
        here = false;
        this.painter = painter;
        setBorder(painter.getBorder());
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
        painter.paint(g);
    }
}
