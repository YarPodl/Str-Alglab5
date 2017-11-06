package Sort;

import java.util.Arrays;
import java.util.Vector;

public class LinearSorting implements Sort {
    public Vector<int[]> sorting(int[] massive) {


        Vector<int[]> result = new Vector<>();
        result.add(massive.clone());    // Запоминание промежуточного результата

        int i = 0;
        int b[] = new int[massive.length + 1];      // В алгоритме ошибка!!!!!! шаг 6 недоступен
        Arrays.fill(b, 0);
        while (i < massive.length){
            b[massive[i]]++;
            i++;
        }
        result.add(b.clone());
        i = 0;          // индекс элемента в massive
        int j = 0;      // индекс массива b
        while (i < massive.length){     // пока не добавлены все элементы
            while (b[j] > 0){           // пока остались числа j
                massive[i] = j;         // вставить j в массив
                i++;                    // следующее поле массива
                b[j]--;                 // осталось на одно меньше чисел j
            }
            j++;        // смотрим следующее число
        }

        result.add(massive.clone());



        return result;
    }





    public long[] setEfficiencyOfSorting(int[] massive) {

        long result[] = new long[3];
        result[2] = System.nanoTime();

        int i = 0;
        int b[] = new int[massive.length + 1];      // В алгоритме ошибка!!!!!! шаг 6 недоступен
        Arrays.fill(b, 0);
        while (i < massive.length){
            b[massive[i]]++;
            i++;
        }
        i = 0;          // индекс элемента в massive
        int j = 0;      // индекс массива b
        while (i < massive.length){     // пока не добавлены все элементы
            while (b[j] > 0){           // пока остались числа j
                massive[i] = j;         // вставить j в массив
                i++;                    // следующее поле массива
                b[j]--;                 // осталось на одно меньше чисел j
                result[0]++;
                result[1]++;
            }
            j++;        // смотрим следующее число
        }

        result[2] = System.nanoTime() - result[2];
        return result;
    }
}
