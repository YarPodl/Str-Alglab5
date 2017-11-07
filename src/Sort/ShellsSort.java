package Sort;

import java.util.Arrays;
import java.util.Vector;

public class ShellsSort{       // Ошибка в алгоритме: вместо него - метод вставки
    public static Vector<int[]> sorting(int[] inMassive) {


        Vector<int[]> result = new Vector<>();
        int massive[] = new int[inMassive.length + 1];
        System.arraycopy(inMassive, 0, massive, 1, inMassive.length);
        result.add(Arrays.copyOfRange(massive, 1, massive.length));    // Запоминание промежуточного результата

        int t = (int) (Math.log(massive.length) / Math.log(2)) - 1;
        int i = 1;
        int h = 1;
        int j;
        while (i < t) {
            i++;
            h = 2 * h + 1;
        }
        do {
            int k = 1;
            do {
                i = h + k;
                do {
                    massive[0] = massive[i];
                    j = i - h;
                    while (massive[0] < massive[j]) {
                        massive[j + h] = massive[j];
                        j -= h;
                    }
                    massive[j + h] = massive[0];
                    i += h;
                } while (i <= massive.length - 1);
                k++;
                result.add(Arrays.copyOfRange(massive, 1, massive.length ));    // Запоминание промежуточного результата
            } while (k <= h);
            h = (h - 1) / 2;
        } while (h > 1);



        return result;
    }





    public static long[] setEfficiencyOfSorting(int[] massive) {

        long result[] = new long[3];
        result[2] = System.nanoTime();


        result[2] = System.nanoTime() - result[2];
        return result;
    }
}
