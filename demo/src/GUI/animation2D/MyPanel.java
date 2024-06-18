package GUI.animation2D;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.Timer;

public class MyPanel extends JPanel implements ActionListener{

  final int WIDTH = 500;
  final int HEIGHT = 500;
  Timer timer;
  int xVelocity = 5;
  int yVelocity = 5;
  int x = 0;
  int y = 0;

  JPanel panel;
  
  MyPanel() {

    panel = new JPanel();
    this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    this.setBackground(Color.BLACK);
    this.setVisible(true);

    // Timer
    timer = new Timer(100, this);
    timer.start();

  }

  @Override
  public void paint (Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(Color.RED);
    g2d.fillRect(x, y, 50, 50);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (x + 50 > WIDTH || x < 0) {
      xVelocity = -xVelocity;
    }
    if (y + 50 > HEIGHT || y < 0) {
      yVelocity = -yVelocity;
    }
    x += xVelocity;
    y += yVelocity;
    repaint();
    
  }
  
}
