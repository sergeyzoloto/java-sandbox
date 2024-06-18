package GUI.Gtaphics2D;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{

  MyPanel() {

    this.setPreferredSize(new Dimension(800, 500));
  
  }

  @Override
  public void paint(Graphics g) {

    Image image = new ImageIcon("demo/src/GUI/labels/image.jpg").getImage();
    
    Graphics2D g2D = (Graphics2D) g;

    g2D.drawImage(image, 0, 0, null);
    
    g2D.setPaint(Color.RED);
    g2D.setStroke(new BasicStroke(5));

    // Starts from the top left corner
    g2D.drawLine(0, 0, 500, 500);
    g2D.drawLine(500, 0, 0, 500);
    g2D.drawRect(0, 0, 100, 200);

    g2D.setPaint(Color.BLUE);
    g2D.fillRect(150, 150, 100, 100);
    g2D.drawOval(300, 300, 100, 100);

    g2D.setPaint(Color.GREEN);
    g2D.fillOval(100, 300, 100, 100);
    g2D.drawArc(200, 200, 100, 100, 0, 180);
    g2D.fillArc(300, 200, 100, 100, 0, 180);

    g2D.setPaint(Color.BLACK);
    int[] xPoints = {150, 250, 350};
    int[] yPoints = {400, 300, 400};
    g2D.drawPolygon(xPoints, yPoints, 3);

    g2D.setFont(new Font("Arial", Font.BOLD, 50));
    g2D.drawString("Hello World", 100, 100);

  }
}
