package GUI;

import java.awt.*;
import javax.swing.*;
/** Frame2c shows a frame with whose label displays the number of times
    its button is pushed */
public class Frame2c extends JFrame
{ private Counter count;  // address of model object
  private JLabel label = new JLabel("count = 0");  // label for the frame

  /** Constructor  Frame2c creates a frame with a label and button
    * @param c - the model object, a counter */
  public Frame2c(Counter c) 
  { count = c;
    Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
      cp.add(label);
      cp.add(new CountButton("OK", count, this)); // the button-controller
      cp.add(new ExitButton("Exit Button"));
    setTitle("Example2");
    setSize(200, 300);
    setVisible(true);
  }

  /** update revises the view */
  public void update()
  { label.setText("count = " + count.countOf()); }

  public static void main(String[] args)
  { Counter model = new Counter(0);
    Frame2c view = new Frame2c(model);
  }

}