package Sort;

import java.util.Arrays;
import java.util.Vector;

public class ShellsSort{       // Ошибка в алгоритме: вместо него - метод вставки
    public static Vector<int[]> sorting(int[] massive) {


        Vector<int[]> result = new Vector<>();
        result.add(massive.clone());    // Запоминание промежуточного результата


        int t = (int) (Math.log(massive.length) / Math.log(2)) - 1; // количество интервалов
        int h  = 1;
        for(int i = 1; i < t; i++, h = 2*h + 1 );       // поиск первого интервала
        int j;
        while (h > 0){                                  // пока остались интевалы
            for(int i = h; i < massive.length ;i++){    // сортировка включением для элемеметов на расстоянии h
                int temp = massive[i];                  // Нужен ли "барьер" ? это вместо него
                for (j = i; j >= h && massive[j - h] > temp; j -= h)    // поиск места для вставки, приходится проверять j >= h
                {
                    massive[j] = massive[j - h];
                }
                massive[j] = temp;      // вставка
            }
            h = (h - 1) / 2;                // вычисление нового интервала (может их сразу запомнить?)
            result.add(massive.clone());    // Запоминание промежуточного результата
        }

        /*
        int massive[] = new int[inMassive.length + 1];
        System.arraycopy(inMassive, 0, massive, 1, inMassive.length);
        result.add(Arrays.copyOfRange(massive, 1, massive.length));    // Запоминание промежуточного результата



        int t = (int) (Math.log(massive.length - 1) / Math.log(2)) - 1;
        int h  = 1;
        for(int i = 1; i < t; i++, h = 2*h + 1 );
        int j;
        for(int i = h; i < massive.length - 2; i++ ){
            for(int i=h;i<massive.length;i++){
                int temp = massive[i];
                for (j = i; j >= h && massive[j - h] > temp; j -= h)
                {
                    massive[j] = massive[j - h];
                }
                massive[j] = temp;
            }
        }

        /*
        int t = (int) (Math.log(massive.length - 1) / Math.log(2)) - 1;
        int h  = 1;
        for(int i = 1; i < t; i++, h = 2*h + 1 );
        int j;
        while (h > 0){
            for (int i = h; i < massive.length - 2; i++){
                massive[0] = massive[i];
                j = i - h;
                while (massive[0] < massive[j])
                {
                    massive[j + h] = massive[j];
                    j -= h;
                }
                massive[j] = massive[0];
            }
            h = (h - 1) / 2;
            result.add(Arrays.copyOfRange(massive, 1, massive.length));    // Запоминание промежуточного результата
        }
        */

        /*
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
        */


        return result;
    }





    public static long[] setEfficiencyOfSorting(int[] massive) {

        long result[] = new long[3];
        result[2] = System.nanoTime();

        // result[0] количество сравнений
        // result[1] количество перестановок
        // result[2] время

        int t = (int) (Math.log(massive.length) / Math.log(2)) - 1;     // количество интервалов
        int h  = 1;
        for(int i = 1; i < t; i++, h = 2*h + 1 );                       // поиск первого интервала
        int j;
        while (h > 0){                              // пока остались интевалы
            for(int i = h; i < massive.length ;i++){    // сортировка включением для элемеметов на расстоянии h
                int temp = massive[i];                  // Нужен ли "барьер" ? это вместо него
                result[0]++;
                for (j = i; j >= h && massive[j - h] > temp; j -= h) // поиск места для вставки, приходится проверять j >= h
                {
                    result[0]++;
                    massive[j] = massive[j - h];
                }
                massive[j] = temp;      // вставка
                result[1]++;
            }
            h = (h - 1) / 2;        // вычисление нового интервала (может их сразу запомнить?)
        }

        result[2] = System.nanoTime() - result[2];
        return result;
    }
}
