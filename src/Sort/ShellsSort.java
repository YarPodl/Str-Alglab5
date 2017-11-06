package Sort;

import java.util.Vector;

public class ShellsSort implements Sort {       // Ошибка в алгоритме: вместо него - метод вставки
    public Vector<int[]> sorting(int[] massive) {


        Vector<int[]> result = new Vector<>();
        result.add(massive.clone());    // Запоминание промежуточного результата


        return result;
    }





    public long[] setEfficiencyOfSorting(int[] massive) {

        long result[] = new long[3];
        result[2] = System.nanoTime();


        result[2] = System.nanoTime() - result[2];
        return result;
    }
}
