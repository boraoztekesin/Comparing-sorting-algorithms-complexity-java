import java.util.*;
class CountingSort {
        void countsort(int[] array) {
            int min = Arrays.stream(array).min().getAsInt();
            int max = Arrays.stream(array).max().getAsInt();
            int r = max - min + 1;
            int[] count = new int[r];
            int[] output = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                count[array[i] - min]++;
            }
            for (int i = 1; i < count.length; i++) {
                count[i] += count[i - 1];
            }
            for (int i = array.length - 1; i >= 0; i--) {
                output[count[array[i] - min] - 1] = array[i];
                count[array[i] - min]--;
            }
            for (int i = 0; i < array.length; i++) {
                array[i] = output[i];
            }
        }    }