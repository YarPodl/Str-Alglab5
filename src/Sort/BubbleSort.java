package Sort;


import java.util.Vector;

public class BubbleSort {
    public static Vector<int[]> sorting(int[] massive){


        Vector<int[]> result = new Vector<>();
        result.add(massive.clone());    // Запоминание промежуточного результата
        boolean t = true;       // Признак отсортированности


        int j = massive.length - 2;
        while (t){
            t = false;
            int i = 0;
            while (i <= j){
                if (massive[i] > massive[i + 1]){
                    t = true;
                    int tmp = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = tmp;

                }
                i++;
            }
            j--;
            result.add(massive.clone());  // Запоминание промежуточного результата
        }


        /*
        for (int j = massive.length - 2; t ; j--) {
            t = false;
            for (int i = 0; i <= j; i++) {
                if (massive[i] > massive[i + 1]) {
                    t = true;
                    int tmp = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = tmp;

                }
            }
            result.add(massive.clone());  // Запоминание промежуточного результата
        }
        */


        return result;
    }





    public static long[] setEfficiencyOfSorting(int[] massive) {

        long result[] = new long[3];
        result[2] = System.nanoTime();




        boolean t = true;       // Признак отсортированности
        int j = massive.length - 2;
        while (t){
            t = false;
            int i = 0;
            while (i <= j){
                result[0]++;
                if (massive[i] > massive[i + 1]){
                    t = true;
                    int tmp = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = tmp;
                    result[1]++;
                }
                i++;
            }
            j--;

        }


        result[2] = System.nanoTime() - result[2];
        return result;
    }
}
