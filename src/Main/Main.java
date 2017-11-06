package Main;

import Sort.BubbleSort;
import Sort.OptionSort;
import Sort.InsertionSort;
import Sort.LinearSorting;

import java.util.Random;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {
    public static void main(String[] args) {
        MyForm myForm = new MyForm();
        Random random = new Random();

        myForm.button1.addActionListener(e -> {
            int massive[] = new int[10];
            for (int i = 0; i < massive.length; i++) {
                massive[i] = random.nextInt(100);
            }
            fill(BubbleSort.sorting(massive), myForm.table1);
        });

        myForm.button2.addActionListener(e -> {
            int massive[] = new int[10];
            for (int i = 0; i < massive.length; i++) {
                massive[i] = random.nextInt(100);
            }
            fill(OptionSort.sorting(massive), myForm.table2);
        });

        myForm.button3.addActionListener(e -> {
            int massive[] = new int[10];
            for (int i = 0; i < massive.length; i++) {
                massive[i] = random.nextInt(100);
            }
            fill(InsertionSort.sorting(massive), myForm.table3);
        });

        myForm.button4.addActionListener(e -> {
            int massive[] = new int[10];
            for (int i = 0; i < massive.length; i++) {
                massive[i] = random.nextInt(100);
            }
            fill(BubbleSort.sorting(massive), myForm.table4);
        });

        myForm.button5.addActionListener(e -> {
            int massive[] = new int[10];
            for (int i = 0; i < massive.length; i++) {
                massive[i] = random.nextInt(10);
            }
            Vector<int[]> data = LinearSorting.sorting(massive);
            myForm.table5.setModel(new DefaultTableModel(4, data.get(0).length + 1));
            for (int i = 1; i < data.get(0).length + 1; i++) {
                myForm.table5.getModel().setValueAt("№ " + Integer.toString(i - 1), 0, i);
            }
            myForm.table5.getModel().setValueAt("Исходный", 1, 0);
            myForm.table5.getModel().setValueAt("Счетчик", 2, 0);
            myForm.table5.getModel().setValueAt("Результат", 3, 0);
            for (int i = 1; i < 4; i++) {
                for (int j = 1; j < data.get(0).length + 1; j++) {
                    myForm.table5.getModel().setValueAt(Integer.toString(data.get(i - 1)[j - 1]), i, j);
                }
            }
        });


        myForm.button6.addActionListener(e -> {




            myForm.table6.setModel(new DefaultTableModel(6, 4));

            myForm.table6.getModel().setValueAt("Количество сравнений", 0, 1);
            myForm.table6.getModel().setValueAt("Количество перестановок", 0, 2);
            myForm.table6.getModel().setValueAt("Время", 0, 3);

            myForm.table6.getModel().setValueAt("Прямой обмен", 1, 0);
            myForm.table6.getModel().setValueAt("Прямой выбор", 2, 0);
            myForm.table6.getModel().setValueAt("Прямое включение", 3, 0);
            myForm.table6.getModel().setValueAt("Сортировка Шелла", 4, 0);
            myForm.table6.getModel().setValueAt("Линейная сортировка", 5, 0);



            int count = 1000;

            int massive[] = new int[count];
            for (int i = 0; i < massive.length; i++) {
                massive[i] = random.nextInt(count);
            }
            long data[][] = new long[5][];
            data[0] = BubbleSort.setEfficiencyOfSorting(massive.clone());
            data[1] = OptionSort.setEfficiencyOfSorting(massive.clone());
            data[2] = InsertionSort.setEfficiencyOfSorting(massive.clone());
            data[3] = //BubbleSort.setEfficiencyOfSorting(massive.clone());
            data[4] = LinearSorting.setEfficiencyOfSorting(massive.clone());
            for (int i = 1; i < data.length + 1; i++) {
                for (int j = 1; j < data[0].length + 1; j++) {
                    myForm.table6.getModel().setValueAt(Long.toString(data[i - 1][j - 1]), i, j);
                }
            }
        });




    }

    static void fill( Vector<int[]> data, JTable out){
        out.setModel(new DefaultTableModel(data.size() + 1, data.get(0).length + 1));


        for (int i = 1; i < data.get(0).length + 1; i++) {
            out.getModel().setValueAt("№ " + Integer.toString(i), 0, i);
        }
        for (int i = 1; i < data.size() + 1; i++) {
            out.getModel().setValueAt("Шаг " + Integer.toString(i - 1), i, 0);
            for (int j = 1; j < data.get(0).length + 1; j++) {
                out.getModel().setValueAt(Integer.toString(data.get(i - 1)[j - 1]), i, j);
            }
        }
    }
}
