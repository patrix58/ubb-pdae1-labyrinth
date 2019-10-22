package labyrinth;

import java.awt.*;

public class EnchantedMazePainter extends MazePainter {
    public EnchantedMazePainter(Room room) {
        super(room);
    }


    private boolean condition(Direction direction) {
        return room.getSide(direction) instanceof Door && !((Door) room.getSide(direction)).isOpen();
    }

    @Override
    public void paint(Graphics g) {
        String symbol;
        if (((EnchantedRoom) room).hasKey()) {
            symbol = "K " + room.getId() + " ";
        } else {
            symbol = room.getId()+" ";
        }

        StringBuilder s = new StringBuilder();
        if (condition(Direction.NORTH)) {
            s.append("Locked");
        }
        s.append("\n");
        if (condition(Direction.WEST)) {
            s.append("Locked ");
        }
        s.append(symbol);
        if (condition(Direction.EAST)) {
            s.append("Locked");
        }
        s.append("\n");
        if (condition(Direction.SOUTH)) {
            s.append("Locked");
        }

        g.drawString(s.toString(), 10, 10);
    }
}
