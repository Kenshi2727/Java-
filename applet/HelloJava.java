import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class HelloJava extends Applet implements ActionListener{
    public void init(){
        Button b = new Button("Click me");
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Button Clicked");
    }
    public void paint(Graphics g){
        g.drawString("Hello Java", 20, 20);
    }
}