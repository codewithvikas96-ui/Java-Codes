import java.awt.*;
import java.awt.event.*;

public class KeyDemo extends Frame implements KeyListener {

    Label l;

    KeyDemo() {
        // Create label
        l = new Label("Press any key...");
        l.setBounds(50, 100, 200, 30);

        // Add label to frame
        add(l);

        // Add KeyListener
        addKeyListener(this);

        // Frame settings
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    // When key is pressed
    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        // optional
    }

    public void keyTyped(KeyEvent e) {
        // optional
    }

    public static void main(String[] args) {
        new KeyDemo();
    }
}
