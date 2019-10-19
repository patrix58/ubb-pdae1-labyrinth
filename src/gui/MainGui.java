package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class MainGui extends JFrame {
    private GuiPanel[] elements;

    public MainGui(GuiPanel[] elements) {
        this.elements = elements;

        int size = 1;
        while(size*size <= elements.length) ++size;
        --size;

        setLayout(new GridLayout(size, size));
        for(GuiPanel panel: elements) {
            add(panel);
        }

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        setVisible(true);
    }

    public void displayError(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}
