package Sort;

import java.util.Vector;

public class OptionSort implements Sort {
    public Vector<int[]> sorting(int[] massive) {


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
}
