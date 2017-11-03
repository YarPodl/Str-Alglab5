package Sort;

import java.util.ArrayList;

public class bubbleSort implements Sort {
    public ArrayList<int[]> sorting(int[] massive){


        ArrayList<int[]> result = new ArrayList<>();
        result.add(massive);    // Запоминание промежуточного результата
        boolean t = true;       // Признак отсортированности
        for (int j = massive.length - 1; t ; j--) {
            t = false;
            for (int i = 0; i <= j; i++) {
                if (massive[i] > massive[i + 1]) {
                    t = true;
                    int tmp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = tmp;
                    result.add(massive);  // Запоминание промежуточного результата
                }
            }
        }
        return result;
    }
}
