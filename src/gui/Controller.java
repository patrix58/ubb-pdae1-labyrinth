package gui;

import labyrinth.CannotException;
import labyrinth.Direction;
import labyrinth.MapSite;
import labyrinth.Room;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {
    private MainGui mainGui;
    private Room currentRoom;
    private GuiPanel currentElement;
    private GuiPanel[] guiElements;

    public Controller(Room currentRoom) {
        this.currentRoom = currentRoom;
        this.guiElements = new GuiPanel[Room.getIdInc()];
        for(int i = 0; i < guiElements.length; ++i) {
            guiElements[i] = new GuiPanel();
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
            currentRoom.setDirection(direction);
            currentRoom.enter();
            currentRoom = (Room) currentRoom.getSide(direction);
            currentElement.exit();
            currentElement = guiElements[currentRoom.getId()];
        } catch (CannotException ex) {
            mainGui.displayError(ex.getMessage());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}