package Sort;

import java.util.Arrays;
import java.util.Vector;

public class InsertionSort {
    public static Vector<int[]> sorting(int[] inMassive) {


        Vector<int[]> result = new Vector<>();
        int massive[] = new int[inMassive.length + 1];      // копирование в другой массив для создания барьера
        System.arraycopy(inMassive, 0, massive, 1, inMassive.length);
        result.add(Arrays.copyOfRange(massive, 1, massive.length));    // Запоминание промежуточного результата

        int i = 2;
        int j;
        do {
            massive[0] = massive[i];        // постановка барьера
            j = i - 1;
            while (massive[0] < massive[j]) {   // поиск места для вставки
                massive[j + 1] = massive[j];
                j--;
            }
            massive[j + 1] = massive[0];    // вставвка
            i++;
            result.add(Arrays.copyOfRange(massive, 1, massive.length));    // Запоминание промежуточного результата
        } while (i < massive.length);
        return result;
    }





    public static long[] setEfficiencyOfSorting(int[] inMassive) {

        long result[] = new long[3];
        result[2] = System.nanoTime();

        // result[0] количество сравнений
        // result[1] количество перестановок
        // result[2] время

        int massive[] = new int[inMassive.length + 1];      // копирование в другой массив для создания барьера
        System.arraycopy(inMassive, 0, massive, 1, inMassive.length);

        int i = 2;
        int j;
        do {
            massive[0] = massive[i];    // постановка барьера
            j = i - 1;
            while (massive[0] < massive[j]) {   // поиск места для вставки
                result[0]++;
                massive[j + 1] = massive[j];
                j--;
            }
            massive[j + 1] = massive[0];    // вставвка
            i++;
            result[1]++;

        } while (i < massive.length);

        result[2] = System.nanoTime() - result[2];
        return result;
    }
}
