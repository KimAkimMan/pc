package com.kim;
import java.awt.*;  
import java.awt.event.*;  

public class BP1M1Posttest extends Frame implements ActionListener {
    
    TextField input1, input2, result;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnEquals, btnClear;
    String operator = "";

    public BP1M1Posttest() {
        setLayout(null);

     
        Label lblNum1 = new Label("Angka 1:");
        lblNum1.setBounds(50, 50, 50, 30);
        add(lblNum1);

        input1 = new TextField();
        input1.setBounds(120, 50, 100, 30);
        add(input1);

      
        Label lblNum2 = new Label("Angka 2:");
        lblNum2.setBounds(50, 100, 50, 30);
        add(lblNum2);

        input2 = new TextField();
        input2.setBounds(120, 100, 100, 30);
        add(input2);

    
        btnAdd = new Button("+");
        btnAdd.setBounds(50, 150, 50, 30);
        btnAdd.addActionListener(this);
        add(btnAdd);

        btnSubtract = new Button("-");
        btnSubtract.setBounds(110, 150, 50, 30);
        btnSubtract.addActionListener(this);
        add(btnSubtract);

        btnMultiply = new Button("*");
        btnMultiply.setBounds(170, 150, 50, 30);
        btnMultiply.addActionListener(this);
        add(btnMultiply);

        btnDivide = new Button("/");
        btnDivide.setBounds(230, 150, 50, 30);
        btnDivide.addActionListener(this);
        add(btnDivide);

    
        btnEquals = new Button("=");
        btnEquals.setBounds(290, 150, 50, 30);
        btnEquals.addActionListener(this);
        add(btnEquals);

     
        btnClear = new Button("Clear");
        btnClear.setBounds(50, 250, 100, 30);
        btnClear.addActionListener(this);
        add(btnClear);

      
        Label lblResult = new Label("Hasil:");
        lblResult.setBounds(50, 200, 50, 30);
        add(lblResult);

        result = new TextField();
        result.setBounds(120, 200, 100, 30);
        result.setEditable(false);
        add(result);

  
        setTitle("Kalkulator Sederhana");
        setSize(400, 350);
        setVisible(true);
    }

   
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == btnClear) {
            
                input1.setText("");
                input2.setText("");
                result.setText("");
                operator = "";
            } else if (e.getSource() == btnAdd) {
                operator = "+";
            } else if (e.getSource() == btnSubtract) {
                operator = "-";
            } else if (e.getSource() == btnMultiply) {
                operator = "*";
            } else if (e.getSource() == btnDivide) {
                operator = "/";
            } else if (e.getSource() == btnEquals) {
                int num1 = Integer.parseInt(input1.getText());
                int num2 = Integer.parseInt(input2.getText());
                int res = 0;

                switch (operator) {
                    case "+":
                        res = num1 + num2;
                        break;
                    case "-":
                        res = num1 - num2;
                        break;
                    case "*":
                        res = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            res = num1 / num2;
                        } else {
                            result.setText("Error (div by 0)");
                            return;
                        }
                        break;
                    default:
                        result.setText("Select an operator");
                        return;
                }
                result.setText(String.valueOf(res));
            }
        } catch (NumberFormatException ex) {
            result.setText("Input Error");
        }
    }

   
    public static void main(String[] args) {
        new BP1M1Posttest();
    }
}

