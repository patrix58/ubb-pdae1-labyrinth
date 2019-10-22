package gui;

import labyrinth.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {
    private MainGui mainGui;
    private Room currentRoom;
    private GuiPanel currentElement;
    private GuiPanel[] guiElements;

    public Controller(MazeFactory factory){
        this.currentRoom = Room.rooms.get(0);
        this.guiElements = new GuiPanel[Room.getIdInc()];
        for(int i = 0; i < guiElements.length; ++i) {
            guiElements[i] = new GuiPanel(factory.makePainter(Room.rooms.get(i)));
        }
        this.currentElement = guiElements[currentRoom.getId()];
        mainGui = new MainGui(guiElements);
        mainGui.addKeyListener(this);
        currentElement.enter();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        Direction direction;
        if (key == KeyEvent.VK_LEFT) {
            direction = Direction.WEST;
        } else

        if (key == KeyEvent.VK_RIGHT) {
            direction = Direction.EAST;
        } else

        if (key == KeyEvent.VK_UP) {
            direction = Direction.NORTH;
        } else

        if (key == KeyEvent.VK_DOWN) {
            direction = Direction.SOUTH;
        } else return;

        try {
            MapSite side = currentRoom.getSide(direction);
            if(side instanceof Door) {
                ((Door) side).setFromRoom(currentRoom);
            }
            side.enter();
            currentRoom = ((Door) side).getOtherRoom();
            currentElement.exit();
            currentElement = guiElements[currentRoom.getId()];
            currentElement.enter();
        } catch (CannotException ex) {
            mainGui.displayError(ex.getMessage());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
