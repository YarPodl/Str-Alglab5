package Sort;


import java.util.Vector;

public class BubbleSort implements Sort {
    public Vector<int[]> sorting(int[] massive){


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
}
