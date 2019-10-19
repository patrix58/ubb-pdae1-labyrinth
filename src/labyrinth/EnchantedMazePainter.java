package labyrinth;

import java.awt.*;

public class EnchantedMazePainter extends MazePainter {
    public EnchantedMazePainter(Room room) {
        super(room);
    }

    @Override
    public void paint(Graphics g) {
        if (((EnchantedRoom) room).hasKey()) {
            g.drawString("K", 50, 50);
        } else {
            super.paint(g);
        }
    }
}
