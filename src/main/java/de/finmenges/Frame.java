package de.finmenges;

import javax.swing.*;

public class Frame extends JFrame {
    JButton switch1 = new JButton("1");
    JButton switch2 = new JButton("2");
    JButton switch3 = new JButton("3");
    JButton switch4 = new JButton("4");
    JButton switch5 = new JButton("5");
    JButton switch6 = new JButton("6");
    JButton switch7 = new JButton("7");
    JButton switch8 = new JButton("8");
    JButton switch9 = new JButton("9");

    JTextField dmxAdressInput = new JTextField();
    public Frame() {
        this.setSize(300,100);
        this.setLayout(null);
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        this.setTitle("DipCalc");
        this.setDefaultCloseOperation(3);


        switch1.setBounds(10,10,20,20);
        switch1.setFocusPainted(false);
        this.add(switch1);


        switch2.setBounds(30, 10, 20,20);
        switch2.setFocusPainted(false);
        this.add(switch2);


        switch3.setBounds(50, 10, 20,20);
        switch3.setFocusPainted(false);
        this.add(switch3);


        switch4.setBounds(70, 10, 20,20);
        switch4.setFocusPainted(false);
        this.add(switch4);


        switch5.setBounds(90, 10, 20,20);
        switch5.setFocusPainted(false);
        this.add(switch5);


        switch6.setBounds(110, 10, 20,20);
        switch6.setFocusPainted(false);
        this.add(switch6);


        switch7.setBounds(130, 10, 20,20);
        switch7.setFocusPainted(false);
        this.add(switch7);


        switch8.setBounds(150, 10, 20,20);
        switch8.setFocusPainted(false);
        this.add(switch8);


        switch9.setBounds(170, 10, 20,20);
        switch9.setFocusPainted(false);
        this.add(switch9);


        // creating background


        JButton backGroundSwitch1 = new JButton();
        backGroundSwitch1.setBounds(10,10,20,40);
        backGroundSwitch1.setEnabled(false);
        this.add(backGroundSwitch1);

        JButton backGroundSwitch2 = new JButton();
        backGroundSwitch2.setBounds(30, 10, 20,40);
        backGroundSwitch2.setEnabled(false);
        this.add(backGroundSwitch2);

        JButton backGroundSwitch3 = new JButton();
        backGroundSwitch3.setBounds(50, 10, 20,40);
        backGroundSwitch3.setEnabled(false);
        this.add(backGroundSwitch3);

        JButton backGroundSwitch4 = new JButton();
        backGroundSwitch4.setBounds(70, 10, 20,40);
        backGroundSwitch4.setEnabled(false);
        this.add(backGroundSwitch4);

        JButton backGroundSwitch5 = new JButton();
        backGroundSwitch5.setBounds(90, 10, 20,40);
        backGroundSwitch5.setEnabled(false);
        this.add(backGroundSwitch5);

        JButton backGroundSwitch6 = new JButton();
        backGroundSwitch6.setBounds(110, 10, 20,40);
        backGroundSwitch6.setEnabled(false);
        this.add(backGroundSwitch6);

        JButton backGroundSwitch7 = new JButton();
        backGroundSwitch7.setBounds(130, 10, 20,40);
        backGroundSwitch7.setEnabled(false);
        this.add(backGroundSwitch7);

        JButton backGroundSwitch8 = new JButton();
        backGroundSwitch8.setBounds(150, 10, 20,40);
        backGroundSwitch8.setEnabled(false);
        this.add(backGroundSwitch8);

        JButton backGroundSwitch9 = new JButton();
        backGroundSwitch9.setBounds(170, 10, 20,40);
        backGroundSwitch9.setEnabled(false);
        this.add(backGroundSwitch9);

        dmxAdressInput.setBounds(210, 17,50,25);
        this.add(dmxAdressInput);

        dmxAdressInput.addActionListener(a -> {
            try {
                if (Integer.parseInt(dmxAdressInput.getText()) >= 0 && Integer.parseInt(dmxAdressInput.getText()) < 512) {
                    resetDipSwitches();
                    String binCode;
                    binCode = Integer.toBinaryString(Integer.parseInt(dmxAdressInput.getText()));
                    char[] binCodeArray = binCode.toCharArray();
                    //swap characters in string
                    for (int i = 0; i < binCodeArray.length; i++) {
                        if (binCodeArray[i] == '1') {
                            setDipSwitch(binCodeArray.length - i, true);
                        }
                    }
                }
                else {
                    dmxAdressInput.setText("Error");
                    resetDipSwitches();
                }
            } catch (Exception e){
                dmxAdressInput.setText("Error");
                resetDipSwitches();
            }
        });

        this.setVisible(true);
    }
    //Java 8... :(
    public void setDipSwitch(int dipSwitchID, boolean on) {
        if (on) {
            switch (dipSwitchID) {
                case 1:
                    switch1.setBounds(10, 10, 20, 20);
                    break;
                case 2:
                    switch2.setBounds(30, 10, 20, 20);
                    break;
                case 3:
                    switch3.setBounds(50, 10, 20, 20);
                    break;
                case 4:
                    switch4.setBounds(70, 10, 20, 20);
                    break;
                case 5:
                    switch5.setBounds(90, 10, 20, 20);
                    break;
                case 6:
                    switch6.setBounds(110, 10, 20, 20);
                    break;
                case 7:
                    switch7.setBounds(130, 10, 20, 20);
                    break;
                case 8:
                    switch8.setBounds(150, 10, 20, 20);
                    break;
                case 9:
                    switch9.setBounds(170, 10, 20, 20);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + dipSwitchID);
            }
        }
        if (!on) {
            switch (dipSwitchID) {
                case 1:
                    switch1.setBounds(10, 30, 20, 20);
                    break;
                case 2:
                    switch2.setBounds(30, 30, 20, 20);
                    break;
                case 3:
                    switch3.setBounds(50, 30, 20, 20);
                    break;
                case 4:
                    switch4.setBounds(70, 30, 20, 20);
                    break;
                case 5:
                    switch5.setBounds(90, 30, 20, 20);
                    break;
                case 6:
                    switch6.setBounds(110, 30, 20, 20);
                    break;
                case 7:
                    switch7.setBounds(130, 30, 20, 20);
                    break;
                case 8:
                    switch8.setBounds(150, 30, 20, 20);
                    break;
                case 9:
                    switch9.setBounds(170, 30, 20, 20);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + dipSwitchID);
            }
        }
    }

    public void resetDipSwitches() {
        for (int i = 1; i <= 9; i++) {
            setDipSwitch(i, false);
        }
    }
}
