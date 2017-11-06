package Main;


import javax.swing.*;
import java.awt.*;

public class MyForm extends JFrame {

    public JTabbedPane tabbedPane;

    public JPanel panel1 = new JPanel();
    public JPanel panel2 = new JPanel();
    public JPanel panel3 = new JPanel();
    public JPanel panel4 = new JPanel();
    public JPanel panel5 = new JPanel();
    public JPanel panel6 = new JPanel();


    public JTable table1 = new JTable();
    public JTable table2 = new JTable();
    public JTable table3 = new JTable();
    public JTable table4 = new JTable();
    public JTable table5 = new JTable();
    public JTable table6 = new JTable();

    public JButton button1 = new JButton("Продемонстрировать");
    public JButton button2 = new JButton("Продемонстрировать");
    public JButton button3 = new JButton("Продемонстрировать");
    public JButton button4 = new JButton("Продемонстрировать");
    public JButton button5 = new JButton("Продемонстрировать");
    public JButton button6 = new JButton("Продемонстрировать");

    public MyForm() {
        super();
        setMinimumSize(new Dimension(300, 300));
        setSize(800, 400);
        setVisible(true);
        setTitle("Лабораторня работа №5. Алгоритмы внутренней сортировки");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        setLayout(new BorderLayout());


        /*
        Vector<Vector<Integer>> tableData = new Vector<>();
        tableData.add(new Vector<>());
        tableData.get(0).add(11);
        tableData.get(0).add(12);
        tableData.get(0).add(13);
        tableData.get(0).add(14);

        tableData.add(new Vector<>());
        tableData.get(1).add(21);
        tableData.get(1).add(22);
        tableData.get(1).add(23);
        tableData.get(1).add(24);*/









        panel1.setLayout(new BorderLayout());
        panel1.add(button1, BorderLayout.NORTH);
        panel1.add(new JScrollPane(table1));

        panel2.setLayout(new BorderLayout());
        panel2.add(button2, BorderLayout.NORTH);
        panel2.add(table2);

        panel3.setLayout(new BorderLayout());
        panel3.add(button3, BorderLayout.NORTH);
        panel3.add(table3);

        panel4.setLayout(new BorderLayout());
        panel4.add(button4, BorderLayout.NORTH);
        panel4.add(table4);

        panel5.setLayout(new BorderLayout());
        panel5.add(button5, BorderLayout.NORTH);
        panel5.add(table5);

        panel6.setLayout(new BorderLayout());
        panel6.add(button6, BorderLayout.NORTH);
        panel6.add(table6);


        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Прямой обмен", panel1);
        tabbedPane.addTab("Прямой выбор", panel2);
        tabbedPane.addTab("Прямое включение", panel3);
        tabbedPane.addTab("Сортировка Шелла", panel4);
        tabbedPane.addTab("Линейная сортировка", panel5);
        tabbedPane.addTab("Характеристика", panel6);
        add(tabbedPane);
        revalidate();
    }
}


/*
package Main;

import javax.swing.*;
import java.awt.*;

public class MyForm extends JFrame {

    public JPanel buttonPanel = new JPanel();
    public JPanel Panel = new JPanel();
    public JButton button = new JButton("Продемонстрировать");
    public ButtonGroup buttonGroup = new ButtonGroup();
    JRadioButton radioButton0 = new JRadioButton("Прямой обмен", true);
    JRadioButton radioButton1 = new JRadioButton("Прямой выбор");
    JRadioButton radioButton2 = new JRadioButton("Прямое включение");
    JRadioButton radioButton3 = new JRadioButton("Сортировка Шелла");
    JRadioButton radioButton4 = new JRadioButton("Линейная сортировка");
    JRadioButton radioButton5 = new JRadioButton("Характеристика");

    public MyForm() {
        super();
        setMinimumSize(new Dimension(300, 300));
        setSize(850, 400);
        setVisible(true);
        setTitle("Лабораторня работа №5. Алгоритмы внутренней сортировки");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        buttonPanel.add(radioButton0);
        buttonPanel.add(radioButton1);
        buttonPanel.add(radioButton2);
        buttonPanel.add(radioButton3);
        buttonPanel.add(radioButton4);
        buttonPanel.add(radioButton5);

        buttonGroup.add(radioButton0);
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);
        buttonGroup.add(radioButton5);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));





        add(buttonPanel);
        add(Panel);
        add(button, BoxLayout.Y_AXIS);
        add( Box.createVerticalStrut(10));


        revalidate();
    }
}


*/