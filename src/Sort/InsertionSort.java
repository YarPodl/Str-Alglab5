package Sort;

import java.util.Arrays;
import java.util.Vector;

public class InsertionSort {
    public static Vector<int[]> sorting(int[] inMassive) {


        Vector<int[]> result = new Vector<>();
        int massive[] = new int[inMassive.length + 1];
        for (int i = 0; i < inMassive.length; i++) {
            massive[i + 1] = inMassive[i];
        }
        result.add(Arrays.copyOfRange(massive, 1, massive.length));    // Запоминание промежуточного результата

        int i = 2;
        int j;
        do {
            massive[0] = massive[i];
            j = i - 1;
            while (massive[0] < massive[j]) {
                massive[j + 1] = massive[j];
                j--;
            }
            massive[j + 1] = massive[0];
            i++;
            result.add(Arrays.copyOfRange(massive, 1, massive.length));    // Запоминание промежуточного результата
        } while (i < massive.length);
        return result;
    }





    public static long[] setEfficiencyOfSorting(int[] inMassive) {

        long result[] = new long[3];
        //Arrays.fill(result, 0);
        result[2] = System.nanoTime();

        int massive[] = new int[inMassive.length + 1];
        for (int i = 0; i < inMassive.length; i++) {
            massive[i + 1] = inMassive[i];
        }

        int i = 2;
        int j;
        do {
            massive[0] = massive[i];
            j = i - 1;
            while (massive[0] < massive[j]) {
                result[0]++;
                massive[j + 1] = massive[j];
                j--;
            }
            massive[j + 1] = massive[0];
            i++;
            result[1]++;

        } while (i < massive.length);

        result[2] = System.nanoTime() - result[2];
        return result;
    }
}
