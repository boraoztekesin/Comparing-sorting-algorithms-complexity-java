import java.util.Arrays;
public class PigeonholeSort {
    public void sort(int arr[])
    {int n=arr.length;
        int min = arr[0];
        int max = arr[0];
        int r, i, j, index;
        for(int a=0; a<n; a++)
        {if(arr[a] > max)
                max = arr[a];
            if(arr[a] < min)
                min = arr[a];}
        r = max - min + 1;
        int[] hole = new int[r];
        Arrays.fill(hole, 0);
        for(i = 0; i<n; i++)
            hole[arr[i] - min]++;
        index = 0;
        for(j = 0; j<r; j++)
            while(hole[j]-->0)
                arr[index++]=j+min;}}
