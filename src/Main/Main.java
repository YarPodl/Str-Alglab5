package Main;

import Sort.Sort;
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
        myForm.button1.addActionListener(e -> {
            fill(start(new BubbleSort(), 10, 100), myForm.table1);
        });
        myForm.button2.addActionListener(e -> {
            fill(start(new OptionSort(), 10, 100), myForm.table2);
        });
        myForm.button3.addActionListener(e -> {
            fill(start(new InsertionSort(), 10, 100), myForm.table3);
        });
        myForm.button5.addActionListener(e -> {
            Vector<int[]> data = start(new LinearSorting(), 10, 10);
            myForm.table5.setModel(new DefaultTableModel(4, data.get(0).length + 1));
            for (int i = 1; i < data.get(0).length + 1; i++) {
                myForm.table5.getModel().setValueAt("№ " + Integer.toString(i), 0, i);
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


    static Vector<int[]> start(Sort method, int count, int max){

        Random random = new Random();
        int massive[] = new int[count];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(max) + 1;
        }

        return method.sorting(massive);

    }


}
