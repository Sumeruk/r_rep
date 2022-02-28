package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


  public class FrameMain extends JFrame {
    private JTextArea textArea;
    private JPanel panelMain;
    private JButton buttonDrawTriangle;
    private JSpinner spinnerDepthOfRecursion;

    public FrameMain() {

      this.setTitle("Task_12");
      this.setContentPane(panelMain);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(true);
      this.pack();this.setBounds(20,50,1500,750);


      textArea.setFont(new Font("Monospaced", Font.PLAIN, 10));

      buttonDrawTriangle.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
          textArea.setText(null);
          DrawTriangle drawingTriangle = new DrawTriangle();

          int n = (int) spinnerDepthOfRecursion.getValue();
          if (n == 1) {
            String[][] array1 = DrawTriangle.drawFirstTriangle();
            for (int i = 0; i < array1.length; i++) {
              for (int j = 0; j < array1[0].length; j++) {
                textArea.append(array1[i][j]);
              }
              textArea.append("\n");
            }
          } else if (n < 1) {
            textArea.append("Введите значение >= 1");
          } else {
            String[][] array = DrawTriangle.drawTriangle(DrawTriangle.drawFirstTriangle(), n);
            for (int i = 0; i < array.length; i++) {
              for (int j = 0; j < array[0].length; j++) {
                textArea.append(array[i][j]);
              }
              textArea.append("\n");
            }
          }
        }
      });
    }
  }
