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
    public JPanel spinnerPanel = new JPanel();

    public JSpinner spinner = new JSpinner();
    public SpinnerNumberModel spinnerModel;


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
        setSize(800, 500);
        setVisible(true);
        setTitle("Лабораторня работа №5. Алгоритмы внутренней сортировки");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setLayout(new BorderLayout());






        Font font = new Font("Arial", 0, 16);
        table1.setFont(font);
        table1.setRowHeight(25);
        table2.setFont(font);
        table2.setRowHeight(25);
        table3.setFont(font);
        table3.setRowHeight(25);
        table4.setFont(font);
        table4.setRowHeight(25);
        table5.setFont(font);
        table5.setRowHeight(25);
        table6.setFont(font);
        table6.setRowHeight(25);





        panel1.setLayout(new BorderLayout());
        panel1.add(button1, BorderLayout.NORTH);
        panel1.add(table1);

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
        spinnerModel = new SpinnerNumberModel(1000, 1, 1000000, 1);
        spinner.setModel(spinnerModel);
        spinnerPanel.add(new JLabel("Число элементов "));
        spinnerPanel.add(spinner);
        panel6.add(spinnerPanel, BorderLayout.SOUTH);
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
