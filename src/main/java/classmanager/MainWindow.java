/*
 * Created by JFormDesigner on Sat Aug 15 14:23:14 CEST 2020
 */

package classmanager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author unknown
 */
public class MainWindow extends JFrame implements ActionListener {
    public MainWindow() {
        initComponents();

        Gender[] genders = Gender.values();
        for (Gender gender : genders) {
            comboBox1gender.addItem(gender);
        }
        button1.addActionListener(this);
    }

    private void initComponents() {



        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pawel
        panel1 = new JPanel();
        labelHeadLineForm = new JLabel();
        hSpacer1 = new JPanel(null);
        labelName = new JLabel();
        panel4 = new JPanel();
        textField1name = new JTextField();
        labelsurname = new JLabel();
        panel3 = new JPanel();
        textField2lastname = new JTextField();
        labelGender = new JLabel();
        panel5 = new JPanel();
        comboBox1gender = new JComboBox();
        labelage = new JLabel();
        panel7 = new JPanel();
        spinner1yearborn = new JSpinner();
        labelQ = new JLabel();
        panel6 = new JPanel();
        checkBox1Quarantine = new JCheckBox();
        panel8 = new JPanel();
        panel9 = new JPanel();
        button1 = new JButton();
        panel10 = new JPanel();
        panel11 = new JPanel();
        panel2 = new JPanel();
        Result = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1, 2));

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
            . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder
            . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .
            awt .Font .BOLD ,12 ), java. awt. Color. red) ,panel1. getBorder( )) )
            ; panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062or\u0064er" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
            ;
            panel1.setLayout(new GridLayout(12, 3, 1, 1));

            //---- labelHeadLineForm ----
            labelHeadLineForm.setText("Student Form:");
            labelHeadLineForm.setFont(labelHeadLineForm.getFont().deriveFont(labelHeadLineForm.getFont().getStyle() | Font.BOLD));
            panel1.add(labelHeadLineForm);
            panel1.add(hSpacer1);

            //---- labelName ----
            labelName.setText("Name:");
            panel1.add(labelName);

            //======== panel4 ========
            {
                panel4.setLayout(new GridLayout());
                panel4.add(textField1name);
            }
            panel1.add(panel4);

            //---- labelsurname ----
            labelsurname.setText("Last name:");
            panel1.add(labelsurname);

            //======== panel3 ========
            {
                panel3.setLayout(new GridLayout());
                panel3.add(textField2lastname);
            }
            panel1.add(panel3);

            //---- labelGender ----
            labelGender.setText("Gender:");
            panel1.add(labelGender);

            //======== panel5 ========
            {
                panel5.setLayout(new GridLayout());
                panel5.add(comboBox1gender);
            }
            panel1.add(panel5);

            //---- labelage ----
            labelage.setText("Year born:");
            panel1.add(labelage);

            //======== panel7 ========
            {
                panel7.setLayout(new GridLayout());

                //---- spinner1yearborn ----
                spinner1yearborn.setModel(new SpinnerNumberModel(1920, 1920, 2020, 1));
                panel7.add(spinner1yearborn);
            }
            panel1.add(panel7);

            //---- labelQ ----
            labelQ.setText("Quarantined");
            panel1.add(labelQ);

            //======== panel6 ========
            {
                panel6.setLayout(new GridLayout());
                panel6.add(checkBox1Quarantine);
            }
            panel1.add(panel6);

            //======== panel8 ========
            {
                panel8.setLayout(new GridLayout());
            }
            panel1.add(panel8);

            //======== panel9 ========
            {
                panel9.setLayout(new GridLayout());
            }
            panel1.add(panel9);

            //---- button1 ----
            button1.setText("Submit");
            panel1.add(button1);

            //======== panel10 ========
            {
                panel10.setLayout(new GridLayout());
            }
            panel1.add(panel10);

            //======== panel11 ========
            {
                panel11.setLayout(new GridLayout());
            }
            panel1.add(panel11);
        }
        contentPane.add(panel1);

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayout(1, 1));

            //---- Result ----
            Result.setText("text");
            panel2.add(Result);
        }
        contentPane.add(panel2);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pawel
    private JPanel panel1;
    private JLabel labelHeadLineForm;
    private JPanel hSpacer1;
    private JLabel labelName;
    private JPanel panel4;
    private JTextField textField1name;
    private JLabel labelsurname;
    private JPanel panel3;
    private JTextField textField2lastname;
    private JLabel labelGender;
    private JPanel panel5;
    private JComboBox comboBox1gender;
    private JLabel labelage;
    private JPanel panel7;
    private JSpinner spinner1yearborn;
    private JLabel labelQ;
    private JPanel panel6;
    private JCheckBox checkBox1Quarantine;
    private JPanel panel8;
    private JPanel panel9;
    private JButton button1;
    private JPanel panel10;
    private JPanel panel11;
    private JPanel panel2;
    private JLabel Result;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
