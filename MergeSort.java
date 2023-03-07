class MergeSort {
    public  void mergeSort(int[] arr,int lengthh) {
        if (lengthh < 2) {
            return;}
        int mid = lengthh / 2;
        int[] left_arr = new int[mid];
        int[] right_arr = new int[lengthh - mid];
        int k = 0;
        for (int i = 0; i < lengthh; ++i) {
            if (i < mid) {
                left_arr[i] = arr[i];
            } else {right_arr[k] = arr[i];
                k = k + 1;}}
        mergeSort(left_arr, mid);
        mergeSort(right_arr, lengthh-mid);
        merge(left_arr, right_arr, arr, mid, lengthh - mid);}
  public  void merge(int[] left_array, int[] right_array, int[] arr, int size_left, int size_right) {
    int i = 0, l = 0, r = 0;
    while (l < size_left && r < size_right) {
        if (left_array[l] < right_array[r]) {
            arr[i++] = left_array[l++];
        } else {arr[i++] = right_array[r++];}}
    while (l < size_left) {arr[i++] = left_array[l++];}
    while (r < size_right) {arr[i++] = right_array[r++];}}}