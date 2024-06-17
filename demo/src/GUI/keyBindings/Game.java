package GUI.keyBindings;

import javax.swing.*;
import java.awt.event.*;

public class Game {

  JFrame frame;
  JLabel label;

  Action upAction;
  Action downAction;
  Action leftAction;
  Action rightAction;

  Game(){

    frame = new JFrame("Key Bindings Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setLayout(null);

    label = new JLabel();
    label.setBounds(50, 50, 100, 100);
    label.setOpaque(true);
    label.setBackground(java.awt.Color.RED);
    frame.add(label);

    upAction = new UpAction();
    downAction = new DownAction();
    leftAction = new LeftAction();
    rightAction = new RightAction();

    label.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "upAction");
    label.getActionMap().put("upAction", upAction);

    label.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "downAction");
    label.getActionMap().put("downAction", downAction);

    label.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "leftAction");
    label.getActionMap().put("leftAction", leftAction);

    label.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "rightAction");
    label.getActionMap().put("rightAction", rightAction);

    frame.setVisible(true);

  }
  
  public class UpAction extends AbstractAction{
    
    @Override
    public void actionPerformed(ActionEvent e){
      label.setLocation(label.getX(), label.getY() - 10);
    }
  }

  public class DownAction extends AbstractAction{
    
    @Override
    public void actionPerformed(ActionEvent e){
      label.setLocation(label.getX(), label.getY() + 10);
    }
  }

  public class LeftAction extends AbstractAction{
    
    @Override
    public void actionPerformed(ActionEvent e){
      label.setLocation(label.getX() - 10, label.getY());
    }
  }

  public class RightAction extends AbstractAction{
    
    @Override
    public void actionPerformed(ActionEvent e){
      label.setLocation(label.getX() + 10, label.getY());
    }
  }

}
