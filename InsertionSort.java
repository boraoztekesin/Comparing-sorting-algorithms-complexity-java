public class InsertionSort {
    void sort(int arr[])
    {int lenn = arr.length;
        for (int i = 1; i < lenn; ++i) {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = k;
        }}}
