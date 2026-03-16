// Q Create AWT application that print mouse coordinates on puse pressed event


import java.awt.*;
import java.awt.event.*;

public class MouseCoordinates extends Frame implements MouseListener {

    Label l;

    MouseCoordinates(){

        l = new Label("Click anywhere to see coordinates");

        setLayout(new FlowLayout());
        add(l);

        addMouseListener(this);

        setSize(400,300);
        setVisible(true);
    }

    public void mousePressed(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        l.setText("Mouse Pressed at: (" + x + ", " + y + ")");
    }

    public void mouseClicked(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}

    public static void main(String args[]){
        new MouseCoordinates();
    }
}
