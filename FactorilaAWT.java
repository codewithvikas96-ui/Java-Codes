// Q Create AWT application to print factorial of number

import java.awt.*;
import java.awt.event.*;

public class FactorialAWT extends Frame implements ActionListener{

    Label l1,l2;
    TextField t1,t2;
    Button b;

    FactorialAWT(){
        setLayout(new GridLayout(3,2));

        l1 = new Label("Enter Number: ");
        l2 = new Label("Result: ");

        t1 = new TextField();
        t2 = new TextField();
        t2.setEditable(false);

        b = new Button("Calculate");

        add(l1); add(t1);
        add(l2); add(t2);
        add(b);

        b.addActionListener(this);

        setTitle("Factorial Calculator");
        setSize(300,100);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e){
        int num = Integer.parseInt(t1.getText());
        Long fact = 1L;

        for(int i = 1; i <= num; i++){
            fact *= i;
        }
        t2.setText(String.valueOf(fact));
    }

    public static void main(String[] args){
        new FactorialAWT();
    }
}
