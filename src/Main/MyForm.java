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


