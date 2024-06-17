package GUI.DragAndDrop;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel{
  
  final int WIDTH = 400;
  final int HEIGHT = 300;

  Point corner;
  Point prevPt;

  DragPanel(){
    corner = new Point(0, 0);
    ClickListener clickListener = new ClickListener();
    DragListener dragListener = new DragListener();
    this.addMouseListener(clickListener);
    this.addMouseMotionListener(dragListener);
  }

  @Override
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawRect(corner.x, corner.y, WIDTH, HEIGHT);
  }

  class ClickListener extends MouseAdapter {
    public void mousePressed(MouseEvent e) {
      prevPt = e.getPoint();
    }
  }


  class DragListener extends MouseMotionAdapter {
    public void mouseDragged(MouseEvent e) {
      if(e.getX() > corner.x && e.getY() > corner.y && e.getX() < corner.x + WIDTH && e.getY() < corner.y + HEIGHT){
        Point currentPt = e.getPoint();
        corner.translate(currentPt.x - prevPt.x, currentPt.y - prevPt.y);
        prevPt = currentPt;
        repaint();
      }
    }
  }
}
