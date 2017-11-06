package Sort;

import java.util.Vector;

public class OptionSort {
    public static Vector<int[]> sorting(int[] massive) {


        Vector<int[]> result = new Vector<>();
        result.add(massive.clone());    // Запоминание промежуточного результата

        int j = massive.length - 1; // Количество сортируемых в данном проходе
        while (j > 0) {
            int M = massive[0];         // Максимальный элемент
            int k = 0;                  // Индекс максимального
            int i = 1;
            while (i <= j) {
                if (M < massive[i]) {
                    M = massive[i];
                    k = i;
                }
                i++;
            }
            int tmp = massive[j];  // Согласно алгоритму: i !!!!!!!!!!!!
            massive[j] = massive[k];
            massive[k] = tmp;
            j--;
            result.add(massive.clone());  // Запоминание промежуточного результата
        }
        return result;
    }





    public static long[] setEfficiencyOfSorting(int[] massive) {

        long result[] = new long[3];
        result[2] = System.nanoTime();

        int j = massive.length - 1; // Количество сортируемых в данном проходе
        while (j > 0) {
            int M = massive[0];         // Максимальный элемент
            int k = 0;                  // Индекс максимального
            int i = 1;
            while (i <= j) {
                result[0]++;
                if (M < massive[i]) {
                    M = massive[i];
                    k = i;
                }
                i++;
            }
            result[1]++;
            int tmp = massive[j];  // Согласно алгоритму: i !!!!!!!!!!!!
            massive[j] = massive[k];
            massive[k] = tmp;
            j--;
        }

        result[2] = System.nanoTime() - result[2];
        return result;
    }
}
