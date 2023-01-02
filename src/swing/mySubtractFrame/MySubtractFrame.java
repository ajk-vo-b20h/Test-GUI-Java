package swing.mySubtractFrame;
//Quelle: https://www.youtube.com/watch?v=1nQyuroMERQ

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySubtractFrame extends JFrame implements ActionListener{
    private JLabel txtMin = null;
    private JLabel txtSub = null;
    private JLabel txtRes = null;
    private JLabel txtResVal = null;
    private JTextField inpMin = null;
    private JTextField inpSub = null;
    private JButton btCalc = null;

    public static void main(String[] args) {
        new MySubtractFrame();
    }
    public MySubtractFrame(){
        initialize();
        setElements();
        setVisible(true);
    }
    private void initialize(){
        setTitle("Subtraktion");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        getContentPane().setLayout(new java.awt.GridBagLayout());
    }

    private void setElements(){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 0.80;
        gbc.weighty = 0.33;
        txtMin = new JLabel("Minuend:");
        add(txtMin, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 0.80;
        gbc.weighty = 0.33;
        txtSub = new JLabel("Subtrahend:");
        add(txtSub, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 0.80;
        gbc.weighty = 0.33;
        txtRes = new JLabel("Ergebnis:");
        add(txtRes, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 0.80;
        gbc.weighty = 0.33;
        txtResVal = new JLabel("0");
        add(txtResVal, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 0.20;
        gbc.weighty = 0.33;
        inpMin = new JTextField("", 3);
        add(inpMin, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weightx = 0.20;
        gbc.weighty = 0.33;
        inpSub = new JTextField("", 3);
        add(inpSub, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0.20;
        gbc.weighty = 0.33;
        btCalc = new JButton("calc");
        btCalc.addActionListener(this);
        add(btCalc, gbc);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btCalc) {
            int iSub = Integer.parseInt(inpSub.getText());
            int iMin = Integer.parseInt(inpMin.getText());
            txtResVal.setText(String.valueOf(iMin - iSub));
        }
    }
}

