/*package Main;

import javax.swing.*;
import java.awt.*;

public class MyForm extends JFrame {

    public JTabbedPane tabbedPane;
    public JPanel table1 = new JPanel();
    public JPanel table2 = new JPanel();
    public JPanel table3 = new JPanel();
    public JPanel table4 = new JPanel();
    public JPanel table5 = new JPanel();
    public JPanel table6 = new JPanel();

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



        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Прямой обмен", table1);
        tabbedPane.addTab("Прямой выбор", table2);
        tabbedPane.addTab("Прямое включение", table3);
        tabbedPane.addTab("Сортировка Шелла", table4);
        tabbedPane.addTab("Линейная сортировка", table5);
        tabbedPane.addTab("Характеристика", table6);

        add(tabbedPane);
        button1.setMinimumSize(new Dimension(40,10));
        add(button1, BoxLayout.Y_AXIS);


        revalidate();
    }
}
*/


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


