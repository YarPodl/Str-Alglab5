package Sort;

import java.util.Vector;

public class ShellsSort {
    public class OptionSort implements Sort {
        public Vector<int[]> sorting(int[] massive) {


            Vector<int[]> result = new Vector<>();
            result.add(massive.clone());    // Запоминание промежуточного результата


            return result;
        }
    }
}
