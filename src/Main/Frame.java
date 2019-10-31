package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Shape.Command;


public class Frame extends JFrame {
   JPanel contentPane;
   BorderLayout borderLayout1 = new BorderLayout();
   Canvas canvas=new Canvas();
   JPanel jPanel1 = new JPanel();
   JButton boxButton = new JButton();
   JButton circleButton = new JButton();
   JButton stringButton = new JButton();
   JButton undoButton = new JButton();
   JButton redoButton = new JButton();
   private Command cmd;
   public Frame() {
      super();
      try {
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         jbInit();
      } catch(Exception exception) {
         exception.printStackTrace();
      }
   }

   public Command getController() {
      return cmd;
   }


   /**
    * Component initialization.
    *
    * @throws java.lang.Exception
    */
   private void jbInit() throws Exception {
      contentPane = (JPanel) getContentPane();
      contentPane.setLayout(borderLayout1);
      canvas.setBackground(Color.white);
      canvas.setVisible(true);
      setSize(new Dimension(800, 600));
      setTitle("HW2 GUI");
      jPanel1.setPreferredSize(new Dimension(100, 200));
      boxButton.setText(" Box  ");
      circleButton.setText("Circle");
      stringButton.setText("Hello World");
      undoButton.setText("Undo");
      redoButton.setText("Redo");
      contentPane.add(canvas, java.awt.BorderLayout.CENTER);
      contentPane.add(jPanel1, java.awt.BorderLayout.WEST);
      jPanel1.add(circleButton);
      jPanel1.add(boxButton);
      jPanel1.add(stringButton);
      jPanel1.add(undoButton);
      jPanel1.add(redoButton);
      cmd=new Command();
      canvas.addMouseListener(new MouseAdapter() {
         //@Override
         public void mousePressed(MouseEvent e) {
            cmd.canvasClicked( (int) e.getPoint().getX(),
               (int) e.getPoint().getY());
            canvas.shapes=cmd.getShapes();
            canvas.repaint();
         }
      });
      //Function for each button
      //Action listener adds functionility to buttons
      circleButton.addActionListener(new ActionListener() {      

         //@Override
         public void actionPerformed(ActionEvent e) {
            cmd.cirClicked();
         }
      });
      boxButton.addActionListener(new ActionListener() {

         //@Override
         public void actionPerformed(ActionEvent e) {
            cmd.boxClicked();
         }
      });
      
      stringButton.addActionListener(new ActionListener() {

          //@Override
          public void actionPerformed(ActionEvent e) {
             cmd.stringClicked();
          }
       });
      
      redoButton.addActionListener(new ActionListener() {

          //@Override
          public void actionPerformed(ActionEvent e) {
             cmd.redoClicked();
          }
       });
      
      undoButton.addActionListener(new ActionListener() {

          //@Override
          public void actionPerformed(ActionEvent e) {
             cmd.undoClicked();
        	  
          }
       });



   }
}
