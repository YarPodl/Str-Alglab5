package Main;

import Sort.bubbleSort;
import Sort.Sort;

import java.util.Random;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MyForm myForm = new MyForm();
        myForm.button1.addActionListener(e -> {
            start(new bubbleSort(), myForm.table1, 10);
        });




    }
    static void start(Sort method, JTable out, int count){
        final int maxNumber = 100;

        Random random = new Random();
        int massive[] = new int[count];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(maxNumber);
        }
        out.setModel(new MyTableModel(method.sorting(massive)));
    }


}
