package GUI.JLayeredPane;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.BorderLayout;


public class Main {

  public static void main(String[] args) {

    // JLayeredPane = Swing container that provides a third dimension for positioning components
    //                Allows you to control the Z-order of components, depth

    

    JLayeredPane pane = new JLayeredPane();
    pane.setBounds(0,0,500,500);
    
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(new BorderLayout(10,10));
    frame.setVisible(true);

    JLabel label1 = new JLabel();
    label1.setOpaque(true);
    label1.setBackground(java.awt.Color.RED);
    label1.setBounds(50,50,200,200);

    JLabel label2 = new JLabel();
    label2.setOpaque(true);
    label2.setBackground(java.awt.Color.GREEN);
    label2.setBounds(100,100,200,200);

    JLabel label3 = new JLabel();
    label3.setOpaque(true);
    label3.setBackground(java.awt.Color.BLUE);
    label3.setBounds(150,150,200,200);

    pane.add(label1, JLayeredPane.DEFAULT_LAYER);
    pane.add(label2, JLayeredPane.PALETTE_LAYER);
    
    // pane.add(label3, JLayeredPane.MODAL_LAYER);
    // pane.add(label3, JLayeredPane.POPUP_LAYER);
    // pane.add(label3, JLayeredPane.DRAG_LAYER);
    pane.add(label3, Integer.valueOf(0)); // Int

  }
  
}
