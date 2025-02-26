import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class calcurlator implements ActionListener{

    JFrame frame;
    JTextField textfield;
    JButton[] numButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addBtn, subBtn, mulBtn, divBtn, negBtn;
    JButton decBtn, equBtn, delBtn, clrBtn;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    double num1 = 0;
    double num2 = 0;
    double result = 0;
    char operator;
    calcurlator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(25, 25, 350, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);

        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");
        decBtn = new JButton(".");
        equBtn = new JButton("=");
        delBtn = new JButton("Delete");
        clrBtn = new JButton("Clear");
        negBtn = new JButton("(-)");

        functionButtons[0] = addBtn;
        functionButtons[1] = subBtn;
        functionButtons[2] = mulBtn;
        functionButtons[3] = divBtn;
        functionButtons[4] = decBtn;
        functionButtons[5] = equBtn;
        functionButtons[6] = delBtn;
        functionButtons[7] = clrBtn;
        functionButtons[8] = negBtn;

        for(int i = 0; i < 9; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }
        for(int i = 0; i < 10; i++){
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
            numButtons[i].setFont(myFont);
            numButtons[i].setFocusable(false);
        }
        negBtn.setBounds(50, 430, 100, 50);
        delBtn.setBounds(150, 430, 100, 50);
        clrBtn.setBounds(250, 430, 100, 50);
        
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        
        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(addBtn);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(subBtn);
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(mulBtn);
        panel.add(decBtn);
        panel.add(numButtons[0]);  
        panel.add(equBtn);
        panel.add(divBtn);

        frame.add(panel);
        frame.add(textfield);
        frame.add(delBtn);
        frame.add(clrBtn);
        frame.add(negBtn);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        calcurlator calc = new calcurlator();

    }



    @Override
    public void actionPerformed(ActionEvent e){
        for(int i = 0; i < 10; i++){
            if(e.getSource() == numButtons[i]){
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource() == decBtn){
            textfield.setText(textfield.getText().concat("."));
        }
        if(e.getSource() == addBtn){
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }
        if(e.getSource() == subBtn){
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }
        if(e.getSource() == mulBtn){
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }
        if(e.getSource() == divBtn){
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }
        if(e.getSource() == equBtn){
            num2 = Double.parseDouble(textfield.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            

            }
            textfield.setText(String.valueOf(result));
            num1 = result;
        }
        if(e.getSource() == clrBtn){
            
            textfield.setText("");
        }
        if(e.getSource() == delBtn){
            String str = textfield.getText();

            textfield.setText("");
            for(int i = 0; i < str.length() - 1; i++){
                textfield.setText(textfield.getText() + str.charAt(i));
            }
        }
        if(e.getSource() == negBtn){
            double temp = Double.parseDouble(textfield.getText());
            temp *= -1;
            textfield.setText(String.valueOf(temp));
            
        }
    }
    
}
