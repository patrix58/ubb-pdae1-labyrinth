package gui;

import javax.swing.*;
import java.awt.*;

public class GuiPanel extends JPanel {
    private boolean here;

    {
        here = false;
    }

    public void enter() {
        here = true;
        repaint();
    }

    public void exit() {
        here = false;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(here) {
            g.drawRect(0, 0, 10, 10);
        }
    }
}
