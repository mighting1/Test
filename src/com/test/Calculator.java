package com.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator implements ActionListener {
    GridLayout layout;
    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16;
    JSplitPane jsp;
    JFrame frame;
    JTextArea area;
    JPanel pane1, pane2;
    JTextField jtf;

    public Calculator() {
        frame = new JFrame("计算器");
        frame.setSize(new Dimension(400, 600));
        layout = new GridLayout(4, 4);
        pane1 = new JPanel(layout);
        jtf = new JTextField();
        jtf.setBounds(0, 0, 400, 200);
        button1 = new JButton("7");
        button2 = new JButton("8");
        button3 = new JButton("9");
        button4 = new JButton("/");
        button5 = new JButton("4");
        button6 = new JButton("5");
        button7 = new JButton("6");
        button8 = new JButton("*");
        button9 = new JButton("1");
        button10 = new JButton("2");
        button11 = new JButton("3");
        button12 = new JButton("+");
        button13 = new JButton(".");
        button14 = new JButton("0");
        button15 = new JButton("=");
        button16 = new JButton("-");
        pane1.add(button1);
        pane1.add(button2);
        pane1.add(button3);
        pane1.add(button4);
        pane1.add(button5);
        pane1.add(button6);
        pane1.add(button7);
        pane1.add(button8);
        pane1.add(button9);
        pane1.add(button10);
        pane1.add(button11);
        pane1.add(button12);
        pane1.add(button13);
        pane1.add(button14);
        pane1.add(button15);
        pane1.add(button16);
        jsp = new JSplitPane(JSplitPane.VERTICAL_SPLIT, jtf, pane1);
        frame.add(jsp);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);
        button16.addActionListener(this);
        jtf.addActionListener(this);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();
        if (obj instanceof JButton) {
            JButton button = (JButton) obj;
            if (button14 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "0");
                }
            }
            if (button9 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText("1");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "1");
                }
            }
            if (button10 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText("2");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "2");
                }
            }
            if (button11 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText("3");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "3");
                }
            }
            if (button5 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText("4");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "4");
                }
            }
            if (button6 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText("5");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "5");
                }
            }
            if (button7 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText("6");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "6");
                }
            }
            if (button1 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText("7");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "7");
                }
            }
            if (button2 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText("8");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "8");
                }
            }
            if (button3 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText("9");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "9");
                }
            }
            if (button13 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText("");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "");
                }
            }
            if (button12 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText("+");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "+");
                }
            }
            if (button16 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText("-");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "-");
                }
            }
            if (button8 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText("*");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "*");
                }
            }
            if (button4 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText("/");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + "/");
                }
            }
            if (button13 == button) {
                if (jtf.getText().equals("0")) {
                    jtf.setText("");
                    jtf.setText(".");
                    jtf.requestFocus();
                } else {
                    String str = jtf.getText();
                    jtf.setText(str + ".");
                }
            }
            //等号实现加减乘除功能
            if (button15 == button) {
                if (jtf.getText().indexOf("+") != -1) {
                    String str = jtf.getText();
                    int i = str.indexOf("+");
                    String s = str.substring(0, i);
                    String s1 = str.substring(i + 1, str.length());
                    Double d1 = Double.parseDouble(s);
                    Double d2 = Double.parseDouble(s1);
                    double result = d1 + d2;
                    String str1 = String.valueOf(result);
                    jtf.setText(str1);

                }

                    //减法运算
				else
                    if (jtf.getText().indexOf("-") != -1) {

                        String str = jtf.getText();
                        int i = str.indexOf("-");
                        String s = str.substring(0, i);
                        String s1 = str.substring(i + 1, str.length());
                        Double d1 = Double.parseDouble(s.trim());
                        Double d2 = Double.parseDouble(s1);
                        double result = d1 - d2;
                        String str1 = String.valueOf(result);
                        jtf.setText(str1);
                    }
                    //乘法运算
                    else if (jtf.getText().indexOf("*") != -1) {
                        String str = jtf.getText();
                        int i = str.indexOf("*");
                        String s = str.substring(0, i);
                        String s1 = str.substring(i + 1, str.length());
                        Double d1 = Double.parseDouble(s.trim());
                        Double d2 = Double.parseDouble(s1);
                        double result = d1 * d2;
                        String str1 = String.valueOf(result);
                        jtf.setText(str1);
                    } else if (jtf.getText().indexOf("/") != -1) {
                        String str = jtf.getText();
                        int i = str.indexOf("/");
                        String s = str.substring(0, i);
                        String s1 = str.substring(i + 1, str.length());
                        Double d1 = Double.parseDouble(s.trim());
                        Double d2 = Double.parseDouble(s1);
                        double result = d1 / d2;
                        String str1 = String.valueOf(result);
                        jtf.setText(str1);
                    } else {
                        jtf.setText("请选择要输入的运算符");
                    }
                }
            }

        }

        public static void main (String[]args){
            new Calculator();
        }
    }
