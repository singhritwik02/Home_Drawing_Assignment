package mainPackage;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class TestFrame extends Frame
{

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(100,100,100,100);
        g.setColor(Color.GRAY);
        g.fillRect(120,120,60,80);
        g.setColor(Color.BLACK);
        g.drawLine(100,100,150,50);
        g.drawLine(150,50,200,100);
        g.drawOval(140,70,20,20);
    }
}

class NewClass {
    public static void main(String[] args)
    {
      TestFrame frame = new TestFrame();
      frame.setTitle("New Frame");
      frame.setSize(500,500);
      frame.setVisible(true);
      frame.addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
              System.exit(0);
          }
      });

    }

}
