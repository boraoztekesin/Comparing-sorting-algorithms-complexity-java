import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;
import org.omg.Messaging.SyncScopeHelper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
        // X axis data

        int[] inputAxis = {512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 251282};

        // Create sample data for linear runtime
        double[][] yAxis = new double[4][10];
        yAxis[0] = new double[]{512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 251282};
        yAxis[1] = new double[]{300, 800, 1800, 3000, 7000, 15000, 31000, 64000, 121000, 231000};

        // Save the char as .png and show it
        showAndSaveChart("Sample Test", inputAxis, yAxis);*/
 String path="C:\\Users\\Bora\\Downloads\\TrafficFlowDataset.csv";
 String line="";
 int[] arr=new int[251281];

        ArrayList<Integer> input_arr=new ArrayList<Integer>();
 int i=0;
 try {
     BufferedReader bufferedReader=new BufferedReader(new FileReader(path));
     while ((line=bufferedReader.readLine()) !=null){
         String[] values=line.split(",");
         if(i>0) {
             arr[i-1] = Integer.parseInt(values[7]);
             input_arr.add(Integer.parseInt(values[7]));
         }
         i++;
     }
 }catch (FileNotFoundException e){
     e.printStackTrace();
 }catch (IOException e){
     e.printStackTrace();
 }
 int[] temp_arr=arr.clone();
 int[] arr_512=new int[512];
 int[]temp_512=new int[512];
for(int v=0;v<512;v++){
    arr_512[v]=arr[v];
    temp_512[v]=arr[v];
}
        int[] arr_1024=new int[1024];
        int[] temp_1024=new int[1024];
        for(int v=0;v<1024;v++){
            arr_1024[v]=arr[v];
            temp_1024[v]=arr[v];
        }
        int[] arr_2048=new int[2048];
        int[] temp_2048=new int[2048];
        for(int v=0;v<2048;v++){
            arr_2048[v]=arr[v];
            temp_2048[v]=arr[v];

        }
        int[] arr_4096=new int[4096];
        int[] temp_4096=new int[4096];
        for(int v=0;v<4096;v++){
            arr_4096[v]=arr[v];
            temp_4096[v]=arr[v];
        }
        int[] arr_8192=new int[8192];
        int[] temp_8192=new int[8192];
        for(int v=0;v<8192;v++){
            arr_8192[v]=arr[v];
            temp_8192[v]=arr[v];
        }
        int[] arr_16384=new int[16384];
        int[] temp_16384=new int[16384];
        for(int v=0;v<16384;v++){
            arr_16384[v]=arr[v];
           temp_16384[v]=arr[v];
        }
        int[] arr_32768=new int[32768];
        int[] temp_32768=new int[32768];
        for(int v=0;v<32768;v++){
            arr_32768[v]=arr[v];
            temp_32768[v]=arr[v];
        }
        int[] arr_65536=new int[65536];
        int[] temp_65536=new int[65536];
        for(int v=0;v<65536;v++){
            arr_65536[v]=arr[v];
            temp_65536[v]=arr[v];
        }
        int[] arr_131072=new int[131072];
        int[] temp_131072=new int[131072];
        for(int v=0;v<131072;v++){
            arr_131072[v]=arr[v];
            temp_131072[v]=arr[v];
        }

 /*CountingSort csr=new CountingSort();
        int k1=Arrays.stream(arr).max().getAsInt();
        int k2=Arrays.stream(arr).min().getAsInt();
        csr.countsort(arr,k1);
            System.out.println(k1+" : "+k2);
        System.out.println(k2);*/
/*PigeonholeSort pigeonholeSort=new PigeonholeSort();
        pigeonholeSort.pigeonhole_sort(arr);*/

  /*  InsertionSort is=new InsertionSort();
    is.sort(arr);*/
        CountingSort cs=new CountingSort();
        double[] counting_512_sorted=new double[10];
        double[] counting_1024_sorted=new double[10];
        double[] counting_2048_sorted=new double[10];
        double[] counting_4096_sorted=new double[10];
        double[] counting_8192_sorted=new double[10];
        double[] counting_16384_sorted=new double[10];
        double[] counting_32768_sorted=new double[10];
        double[] counting_65536_sorted=new double[10];
        double[] counting_131072_sorted=new double[10];
        double[] counting_251281_sorted=new double[10];
        double[] counting_512_rev=new double[10];
        double[] counting_1024_rev=new double[10];
        double[] counting_2048_rev=new double[10];
        double[] counting_4096_rev=new double[10];
        double[] counting_8192_rev=new double[10];
        double[] counting_16384_rev=new double[10];
        double[] counting_32768_rev=new double[10];
        double[] counting_65536_rev=new double[10];
        double[] counting_131072_rev=new double[10];
        double[] counting_251281_rev=new double[10];
        double cs_avg_512_sorted=0;
        double cs_avg_1024_sorted=0;
        double cs_avg_2048_sorted=0;
        double cs_avg_4096_sorted=0;
        double cs_avg_8192_sorted=0;
        double cs_avg_16384_sorted=0;
        double cs_avg_32768_sorted=0;
        double cs_avg_65536_sorted=0;
        double cs_avg_131072_sorted=0;
        double cs_avg_251281_sorted=0;
        double[] csavg_sorted=new double[10];
        double cs_avg_512_rev=0;
        double cs_avg_1024_rev=0;
        double cs_avg_2048_rev=0;
        double cs_avg_4096_rev=0;
        double cs_avg_8192_rev=0;
        double cs_avg_16384_rev=0;
        double cs_avg_32768_rev=0;
        double cs_avg_65536_rev=0;
        double cs_avg_131072_rev=0;
        double cs_avg_251281_rev=0;
        double[] csavg_rev=new double[10];





        double[] counting_512=new double[10];
        double[] csavg=new double[10];
        int k512_1=Arrays.stream(arr_512).max().getAsInt();
        int k512_2=Arrays.stream(arr_512).min().getAsInt();

        for (int x=0;x<20;x++){
        double start=System.currentTimeMillis();
        cs.countsort(arr_512);
        double end=System.currentTimeMillis();
        double start2=System.currentTimeMillis();
        cs.countsort(arr_512);
        double end2=System.currentTimeMillis();
            reverser(arr_512);
            double start3=System.currentTimeMillis();
            cs.countsort(arr_512);
            double end3=System.currentTimeMillis();
            if(x>9){
                counting_512[x-10]=end-start;
                counting_512_sorted[x-10]=end2-start2;
                counting_512_rev[x-10]=end3-start3;
            }
        arr_512=temp_512.clone();
}
        double cs_avg_512=0;
        for (int x=0;x<10;x++){
            cs_avg_512+=counting_512[x];
            cs_avg_512_sorted+=counting_512_sorted[x];
            cs_avg_512_rev+=counting_512_rev[x];
        }
        double[] counting_1024=new double[10];
        int k1024_1=Arrays.stream(arr_1024).max().getAsInt();
        int k1024_2=Arrays.stream(arr_1024).min().getAsInt();
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            cs.countsort(arr_1024);
            double end=System.currentTimeMillis();
            double start2=System.currentTimeMillis();
            cs.countsort(arr_1024);
            double end2=System.currentTimeMillis();
            reverser(arr_1024);
            double start3=System.currentTimeMillis();
            cs.countsort(arr_1024);
            double end3=System.currentTimeMillis();
            if(x>9){
                counting_1024[x-10]=end-start;
                counting_1024_sorted[x-10]=end2-start2;
                counting_1024_rev[x-10]=end3-start3;
            }

            arr_1024=temp_1024.clone();
        }

        double cs_avg_1024=0;
        for (int x=0;x<10;x++){
            cs_avg_1024+=counting_1024[x];
            cs_avg_1024_sorted+=counting_1024_sorted[x];
            cs_avg_1024_rev+=counting_1024_rev[x];
        }
        double[] counting_2048=new double[10];
        int k2048_1=Arrays.stream(arr_2048).max().getAsInt();
        int k2048_2=Arrays.stream(arr_2048).min().getAsInt();
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            cs.countsort(arr_2048);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            cs.countsort(arr_2048);
            double end2=System.currentTimeMillis();
            reverser(arr_2048);
            double start3=System.currentTimeMillis();
            cs.countsort(arr_2048);
            double end3=System.currentTimeMillis();
            if(x>9){counting_2048[x-10]=end-start;
                counting_2048_sorted[x-10]=end2-start2;
                counting_2048_rev[x-10]=end3-start3;
            }

            arr_2048=temp_2048.clone();
        }
        double cs_avg_2048=0;
        for (int x=0;x<10;x++){
            cs_avg_2048+=counting_2048[x];
            cs_avg_2048_sorted+=counting_2048_sorted[x];
            cs_avg_2048_rev+=counting_2048_rev[x];
        }
        double[] counting_4096=new double[10];
        int k4096_1=Arrays.stream(arr_4096).max().getAsInt();
        int k4096_2=Arrays.stream(arr_4096).min().getAsInt();
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            cs.countsort(arr_4096);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            cs.countsort(arr_4096);
            double end2=System.currentTimeMillis();
            reverser(arr_4096);
            double start3=System.currentTimeMillis();
            cs.countsort(arr_4096);
            double end3=System.currentTimeMillis();
            if(x>9){counting_4096[x-10]=end-start;
                counting_4096_sorted[x-10]=end2-start2;
                counting_4096_rev[x-10]=end3-start3;
            }

            arr_4096=temp_4096.clone();
        }
        double cs_avg_4096=0;
        for (int x=0;x<10;x++){
            cs_avg_4096+=counting_4096[x];
            cs_avg_4096_sorted+=counting_4096_sorted[x];
            cs_avg_4096_rev+=counting_4096_rev[x];
        }

        double[] counting_8192=new double[10];
        int k8192_1=Arrays.stream(arr_8192).max().getAsInt();
        int k8192_2=Arrays.stream(arr_8192).min().getAsInt();
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            cs.countsort(arr_8192);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            cs.countsort(arr_8192);
            double end2=System.currentTimeMillis();
            reverser(arr_8192);
            double start3=System.currentTimeMillis();
            cs.countsort(arr_8192);
            double end3=System.currentTimeMillis();
            if(x>9){counting_8192[x-10]=end-start;
                counting_8192_sorted[x-10]=end2-start2;
                counting_8192_rev[x-10]=end3-start3;}

            arr_8192=temp_8192.clone();
        }
        double cs_avg_8192=0;
        for (int x=0;x<10;x++){
            cs_avg_8192+=counting_8192[x];
            cs_avg_8192_sorted+=counting_8192_sorted[x];
            cs_avg_8192_rev+=counting_8192_rev[x];
        }

        double[] counting_16384=new double[10];
        int k16384_1=Arrays.stream(arr_16384).max().getAsInt();
        int k16384_2=Arrays.stream(arr_16384).min().getAsInt();
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            cs.countsort(arr_16384);
            double end=System.currentTimeMillis();
            double start2=System.currentTimeMillis();
            cs.countsort(arr_16384);
            double end2=System.currentTimeMillis();
            reverser(arr_16384);
            double start3=System.currentTimeMillis();
            cs.countsort(arr_16384);
            double end3=System.currentTimeMillis();
            if(x>9){  counting_16384[x-10]=end-start;
                counting_16384_sorted[x-10]=end2-start2;
                counting_16384_rev[x-10]=end3-start3;
            }

            arr_16384=temp_16384.clone();
        }
        double cs_avg_16384=0;
        for (int x=0;x<10;x++){
            cs_avg_16384+=counting_16384[x];
            cs_avg_16384_sorted+=counting_16384_sorted[x];
            cs_avg_16384_rev+=counting_16384_rev[x];
        }
        double[] counting_32768=new double[10];
        int k32768_1=Arrays.stream(arr_32768).max().getAsInt();
        int k32768_2=Arrays.stream(arr_32768).min().getAsInt();
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            cs.countsort(arr_32768);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            cs.countsort(arr_32768);
            double end2=System.currentTimeMillis();
            reverser(arr_32768);
            double start3=System.currentTimeMillis();
            cs.countsort(arr_32768);
            double end3=System.currentTimeMillis();
            if(x>9){counting_32768[x-10]=end-start;
                counting_32768_sorted[x-10]=end2-start2;
                counting_32768_rev[x-10]=end3-start3;}
            arr_32768=temp_32768.clone();
        }
        double cs_avg_32768=0;
        for (int x=0;x<10;x++){
            cs_avg_32768+=counting_32768[x];
            cs_avg_32768_sorted+=counting_32768_sorted[x];
            cs_avg_32768_rev+=counting_32768_rev[x];
        }
        double[] counting_65536=new double[10];
        int k65536_1=Arrays.stream(arr_65536).max().getAsInt();
        int k65536_2=Arrays.stream(arr_65536).min().getAsInt();
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            cs.countsort(arr_65536);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            cs.countsort(arr_65536);
            double end2=System.currentTimeMillis();
            reverser(arr_65536);
            double start3=System.currentTimeMillis();
            cs.countsort(arr_65536);
            double end3=System.currentTimeMillis();
            if(x>9){counting_65536[x-10]=end-start;
                counting_65536_sorted[x-10]=end2-start2;
                counting_65536_rev[x-10]=end3-start3;}
            arr_65536=temp_65536.clone();
        }
        double cs_avg_65536=0;
        for (int x=0;x<10;x++){
            cs_avg_65536+=counting_65536[x];
            cs_avg_65536_sorted+=counting_65536_sorted[x];
            cs_avg_65536_rev+=counting_65536_rev[x];
        }
        double[] counting_131072=new double[10];
        int k131072_1=Arrays.stream(arr_131072).max().getAsInt();
        int k131072_2=Arrays.stream(arr_131072).min().getAsInt();
        for (int x=0;x<20;x++){
            System.out.println("before"+arr_131072[1]);
            double start=System.currentTimeMillis();
            cs.countsort(arr_131072);
            double end=System.currentTimeMillis();
            System.out.println("after 1st sort"+arr_131072[1]);
            double start2=System.currentTimeMillis();
            cs.countsort(arr_131072);
            double end2=System.currentTimeMillis();
            System.out.println("after 2nd"+arr_131072[1]);
            reverser(arr_131072);
            System.out.println("after rev**"+arr_131072[1]);
            double start3=System.currentTimeMillis();
            cs.countsort(arr_131072);
            double end3=System.currentTimeMillis();
            System.out.println("after rev2"+arr_131072[1]);
            if(x>9){counting_131072[x-10]=end-start;
                counting_131072_sorted[x-10]=end2-start2;
                counting_131072_rev[x-10]=end3-start3;
            }
            arr_131072=temp_131072.clone();
        }
        double cs_avg_131072=0;
        for (int x=0;x<10;x++){
            cs_avg_131072+=counting_131072[x];
            cs_avg_131072_sorted+=counting_131072_sorted[x];
            cs_avg_131072_rev+=counting_131072_rev[x];
        }
        double[] counting_251281=new double[10];
        int k251281_1=Arrays.stream(arr).max().getAsInt();
        int k251281_2=Arrays.stream(arr).min().getAsInt();
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            cs.countsort(arr);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            cs.countsort(arr);
            double end2=System.currentTimeMillis();
            reverser(arr);
            double start3=System.currentTimeMillis();
            cs.countsort(arr);
            double end3=System.currentTimeMillis();
            if(x>9){ counting_251281[x-10]=end-start;
                counting_251281_sorted[x-10]=end2-start2;
                counting_251281_rev[x-10]=end3-start3;
            }

            arr=temp_arr.clone();
        }
        double cs_avg_251281=0;
        for (int x=0;x<10;x++){
            cs_avg_251281+=counting_251281[x];
            cs_avg_251281_sorted+=counting_251281_sorted[x];
            cs_avg_251281_rev+=counting_251281_rev[x];

        }
            System.out.println("cs1"+cs_avg_512);
        System.out.println(cs_avg_1024);
        System.out.println(cs_avg_2048);
        System.out.println(cs_avg_4096);
        System.out.println(cs_avg_8192);
        System.out.println(cs_avg_16384);
        System.out.println(cs_avg_32768);
        System.out.println(cs_avg_65536);
        System.out.println(cs_avg_131072);
        System.out.println(cs_avg_251281);

        System.out.println("cssorted1"+cs_avg_512_sorted);
        System.out.println(cs_avg_1024_sorted);
        System.out.println(cs_avg_2048_sorted);
        System.out.println(cs_avg_4096_sorted);
        System.out.println(cs_avg_8192_sorted);
        System.out.println(cs_avg_16384_sorted);
        System.out.println(cs_avg_32768_sorted);
        System.out.println(cs_avg_65536_sorted);
        System.out.println(cs_avg_131072_sorted);
        System.out.println(cs_avg_251281_sorted);
        System.out.println("crev"+cs_avg_512_rev);
        System.out.println(cs_avg_1024_rev);
        System.out.println(cs_avg_2048_rev);
        System.out.println(cs_avg_4096_rev);
        System.out.println(cs_avg_8192_rev);
        System.out.println(cs_avg_16384_rev);
        System.out.println(cs_avg_32768_rev);
        System.out.println(cs_avg_65536_rev );
        System.out.println(cs_avg_131072_rev);
        System.out.println(cs_avg_251281_rev);

//-----------------------------------------------
        InsertionSort is=new InsertionSort();
        double[] is_512=new double[10];
        double[] isavg=new double[10];
            double[] is_512_sorted=new double[10];
        double[] is_1024_sorted=new double[10];
        double[] is_2048_sorted=new double[10];
        double[] is_4096_sorted=new double[10];
        double[] is_8192_sorted=new double[10];
        double[] is_16384_sorted=new double[10];
        double[] is_32768_sorted=new double[10];
        double[] is_65536_sorted=new double[10];
        double[] is_131072_sorted=new double[10];
        double[] is_251281_sorted=new double[10];
     double[] is_512_rev=new double[10];
        double[] is_1024_rev=new double[10];
        double[] is_2048_rev=new double[10];
        double[] is_4096_rev=new double[10];
        double[] is_8192_rev=new double[10];
        double[] is_16384_rev=new double[10];
        double[] is_32768_rev=new double[10];
        double[] is_65536_rev=new double[10];
        double[] is_131072_rev=new double[10];
        double[] is_251281_rev=new double[10];
                double is_avg_512_sorted=0;
        double is_avg_1024_sorted=0;
        double is_avg_2048_sorted=0;
        double is_avg_4096_sorted=0;
        double is_avg_8192_sorted=0;
        double is_avg_16384_sorted=0;
        double is_avg_32768_sorted=0;
        double is_avg_65536_sorted=0;
        double is_avg_131072_sorted=0;
        double is_avg_251281_sorted=0;
        double[] isavg_sorted=new double[10];

        double is_avg_512_rev=0;
        double is_avg_1024_rev=0;
        double is_avg_2048_rev=0;
        double is_avg_4096_rev=0;
        double is_avg_8192_rev=0;
        double is_avg_16384_rev=0;
        double is_avg_32768_rev=0;
        double is_avg_65536_rev=0;
        double is_avg_131072_rev=0;
        double is_avg_251281_rev=0;
        double[] isavg_rev=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            is.sort(arr_512);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            is.sort(arr_512);
            double end2=System.currentTimeMillis();
            reverser(arr_512);
            double start3=System.currentTimeMillis();
            is.sort(arr_512);
            double end3=System.currentTimeMillis();
            if(x>9){ is_512[x-10]=end-start;
                is_512_sorted[x-10]=end2-start2;
                is_512_rev[x-10]=end3-start3;
            }
            arr_512=temp_512.clone();
        }
        double is_avg_512=0;
        for (int x=0;x<10;x++){
            is_avg_512+=is_512[x];
           is_avg_512_sorted+=is_512_sorted[x];
            is_avg_512_rev+=is_512_rev[x];
        }
        double[] is_1024=new double[10];

        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            is.sort(arr_1024);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            is.sort(arr_1024);
            double end2=System.currentTimeMillis();
            reverser(arr_1024);
            double start3=System.currentTimeMillis();
            is.sort(arr_1024);
            double end3=System.currentTimeMillis();
            if(x>9){ is_1024[x-10]=end-start;
                is_1024_sorted[x-10]=end2-start2;
                is_1024_rev[x-10]=end3-start3;
            }
            arr_1024=temp_1024.clone();
        }

        double is_avg_1024=0;
        for (int x=0;x<10;x++){
            is_avg_1024_sorted+=is_1024_sorted[x];
            is_avg_1024+=is_1024[x];
            is_avg_1024_rev+=is_1024_rev[x];
        }
        double[] is_2048=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            is.sort(arr_2048);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            is.sort(arr_2048);
            double end2=System.currentTimeMillis();
            reverser(arr_2048);
            double start3=System.currentTimeMillis();
            is.sort(arr_2048);
            double end3=System.currentTimeMillis();
            if(x>9){is_2048[x-10]=end-start;
                is_2048_sorted[x-10]=end2-start2;
                is_2048_rev[x-10]=end3-start3;}
            arr_2048=temp_2048.clone();
        }
        double is_avg_2048=0;
        for (int x=0;x<10;x++){
            is_avg_2048_sorted+=is_2048_sorted[x];
            is_avg_2048+=is_2048[x];
            is_avg_2048_rev+=is_2048_rev[x];
        }
        double[] is_4096=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            is.sort(arr_4096);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            is.sort(arr_4096);
            double end2=System.currentTimeMillis();
            reverser(arr_4096);
            double start3=System.currentTimeMillis();
            is.sort(arr_4096);
            double end3=System.currentTimeMillis();
            if(x>9){  is_4096[x-10]=end-start;
                is_4096_sorted[x-10]=end2-start2;
                is_4096_rev[x-10]=end3-start3;
            }
            arr_4096=temp_4096.clone();
        }
        double is_avg_4096=0;
        for (int x=0;x<10;x++){
            is_avg_4096+=is_4096[x];
            is_avg_4096_sorted+=is_4096_sorted[x];
            is_avg_4096_rev+=is_4096_rev[x];
        }

        double[] is_8192=new double[10];

        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            is.sort(arr_8192);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            is.sort(arr_8192);
            double end2=System.currentTimeMillis();
            reverser(arr_8192);
            double start3=System.currentTimeMillis();
            is.sort(arr_8192);
            double end3=System.currentTimeMillis();
            if(x>9){  is_8192[x-10]=end-start;
                is_8192_sorted[x-10]=end2-start2;
                is_8192_rev[x-10]=end3-start3;
            }
            arr_8192=temp_8192.clone();
        }
        double is_avg_8192=0;
        for (int x=0;x<10;x++){
            is_avg_8192+=is_8192[x];
            is_avg_8192_sorted+=is_8192_sorted[x];
            is_avg_8192_rev+=is_8192_rev[x];
        }

        double[] is_16384=new double[10];

        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            is.sort(arr_16384);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            is.sort(arr_16384);
            double end2=System.currentTimeMillis();
            reverser(arr_16384);
            double start3=System.currentTimeMillis();
            is.sort(arr_16384);
            double end3=System.currentTimeMillis();
            if(x>9){  is_16384[x-10]=end-start;  is_16384_sorted[x-10]=end2-start2;
                is_16384_rev[x-10]=end3-start3;}
            arr_16384=temp_16384.clone();
        }
        double is_avg_16384=0;
        for (int x=0;x<10;x++){
            is_avg_16384+=is_16384[x];
            is_avg_16384_sorted+=is_16384_sorted[x];
            is_avg_16384_rev+=is_16384_rev[x];
        }
        double[] is_32768=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
           is.sort(arr_32768);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            is.sort(arr_32768);
            double end2=System.currentTimeMillis();
            reverser(arr_32768);
            double start3=System.currentTimeMillis();
            is.sort(arr_32768);
            double end3=System.currentTimeMillis();
            if(x>9){ is_32768_sorted[x-10]=end2-start2; is_32768[x-10]=end-start;
                is_32768_rev[x-10]=end3-start3;}
            arr_32768=temp_32768.clone();
        }
        double is_avg_32768=0;
        for (int x=0;x<10;x++){
            is_avg_32768+=is_32768[x];
            is_avg_32768_sorted+=is_32768_sorted[x];
            is_avg_32768_rev+=is_32768_rev[x];
        }
        double[]is_65536=new double[10];

        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            is.sort(arr_65536);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            is.sort(arr_65536);
            double end2=System.currentTimeMillis();
            reverser(arr_65536);
            double start3=System.currentTimeMillis();
            is.sort(arr_65536);
            double end3=System.currentTimeMillis();
            if(x>9){is_65536[x-10]=end-start;  is_65536_sorted[x-10]=end2-start2;
                is_65536_rev[x-10]=end3-start3;}
            arr_65536=temp_65536.clone();
        }
        double is_avg_65536=0;
        for (int x=0;x<10;x++){
            is_avg_65536+=is_65536[x];
            is_avg_65536_sorted+=is_65536_sorted[x];
            is_avg_65536_rev+=is_65536_rev[x];
        }
        double[] is_131072=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            is.sort(arr_131072);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            is.sort(arr_131072);
            double end2=System.currentTimeMillis();
            reverser(arr_131072);
            double start3=System.currentTimeMillis();
            is.sort(arr_131072);
            double end3=System.currentTimeMillis();
            if(x>9){   is_131072[x-10]=end-start;  is_131072_sorted[x-10]=end2-start2;
                is_131072_rev[x-10]=end3-start3;}
            arr_131072=temp_131072.clone();
        }
        double is_avg_131072=0;
        for (int x=0;x<10;x++){
            is_avg_131072+=is_131072[x];
            is_avg_131072_sorted+=is_131072_sorted[x];
            is_avg_131072_rev+=is_131072_rev[x];
        }
        double[] is_251281=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
           is.sort(arr);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            is.sort(arr);
            double end2=System.currentTimeMillis();
            reverser(arr);
            double start3=System.currentTimeMillis();
            is.sort(arr);
            double end3=System.currentTimeMillis();
            if(x>9){ is_251281[x-10]=end-start;  is_251281_sorted[x-10]=end2-start2;
                is_251281_rev[x-10]=end3-start3;
            }
            arr=temp_arr.clone();
        }
        double is_avg_251281=0;
        for (int x=0;x<10;x++){
            is_avg_251281+=is_251281[x];
            is_avg_251281_sorted+=is_251281_sorted[x];
            is_avg_251281_rev+=is_251281_rev[x];
        }

        System.out.println("is1"+is_avg_512);
        System.out.println(is_avg_1024);
        System.out.println(is_avg_2048);
        System.out.println(is_avg_4096);
        System.out.println(is_avg_8192);
        System.out.println(is_avg_16384);
        System.out.println(is_avg_32768);
        System.out.println(is_avg_65536);
        System.out.println(is_avg_131072);
        System.out.println(is_avg_251281);
        System.out.println("issorted1"+is_avg_512_sorted);
        System.out.println(is_avg_1024_sorted);
        System.out.println(is_avg_2048_sorted);
        System.out.println(is_avg_4096_sorted);
        System.out.println(is_avg_8192_sorted);
        System.out.println(is_avg_16384_sorted);
        System.out.println(is_avg_32768_sorted);
        System.out.println(is_avg_65536_sorted);
        System.out.println(is_avg_131072_sorted);
        System.out.println(is_avg_251281_sorted);
        System.out.println("irev"+is_avg_512_rev);
        System.out.println(is_avg_1024_rev);
        System.out.println(is_avg_2048_rev);
        System.out.println(is_avg_4096_rev);
        System.out.println(is_avg_8192_rev);
        System.out.println(is_avg_16384_rev);
        System.out.println(is_avg_32768_rev);
        System.out.println(is_avg_65536_rev );
        System.out.println(is_avg_131072_rev);
        System.out.println(is_avg_251281_rev);
//-----------------------------------------
        //-----------------------------------------------
        MergeSort ms=new MergeSort();
        double[] ms_512=new double[10];
        double[] msavg=new double[10];
        double[] ms_512_sorted=new double[10];
        double[] ms_1024_sorted=new double[10];
        double[] ms_2048_sorted=new double[10];
        double[] ms_4096_sorted=new double [10];
        double[] ms_8192_sorted=new double[10];
        double[] ms_16384_sorted=new double[10];
        double[] ms_32768_sorted=new double[10];
        double[] ms_65536_sorted=new double[10];
        double[] ms_131072_sorted=new double[10];
        double[] ms_251281_sorted=new double[10];

        double[] ms_512_rev=new double[10];
        double[] ms_1024_rev=new double[10];
        double[] ms_2048_rev=new double[10];
        double[] ms_4096_rev=new double[10];
        double[] ms_8192_rev=new double[10];
        double[] ms_16384_rev=new double[10];
        double[] ms_32768_rev=new double[10];
        double[] ms_65536_rev=new double[10];
        double[] ms_131072_rev=new double[10];
        double[] ms_251281_rev=new double[10];
        double ms_avg_512_sorted=0;
        double ms_avg_1024_sorted=0;
        double ms_avg_2048_sorted=0;
        double ms_avg_4096_sorted=0;
        double ms_avg_8192_sorted=0;
        double ms_avg_16384_sorted=0;
        double ms_avg_32768_sorted=0;
        double ms_avg_65536_sorted=0;
        double ms_avg_131072_sorted=0;
        double ms_avg_251281_sorted=0;
        double[] msavg_sorted=new double[10];
        double ms_avg_512_rev=0;
        double ms_avg_1024_rev=0;
        double ms_avg_2048_rev=0;
        double ms_avg_4096_rev=0;
        double ms_avg_8192_rev=0;
        double ms_avg_16384_rev=0;
        double ms_avg_32768_rev=0;
        double ms_avg_65536_rev=0;
        double ms_avg_131072_rev=0;
        double ms_avg_251281_rev=0;
        double[] msavg_rev=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ms.mergeSort(arr_512,arr_512.length);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ms.mergeSort(arr_512,arr_512.length);
            double end2=System.currentTimeMillis();
            reverser(arr_512);
            double start3=System.currentTimeMillis();
            ms.mergeSort(arr_512,arr_512.length);
            double end3=System.currentTimeMillis();
            if(x>9){ ms_512[x-10]=end-start;
                ms_512_sorted[x-10]=end2-start2;
                ms_512_rev[x-10]=end3-start3;
            }
            arr_512=temp_512.clone();
        }
        double ms_avg_512=0;
        for (int x=0;x<10;x++){
            ms_avg_512+=ms_512[x];
            ms_avg_512_sorted+=ms_512_sorted[x];
            ms_avg_512_rev+=ms_512_rev[x];
        }
        double[] ms_1024=new double[10];

        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ms.mergeSort(arr_1024,arr_1024.length);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ms.mergeSort(arr_1024,arr_1024.length);
            double end2=System.currentTimeMillis();
            reverser(arr_1024);
            double start3=System.currentTimeMillis();
            ms.mergeSort(arr_1024,arr_1024.length);
            double end3=System.currentTimeMillis();
            if(x>9){ ms_1024[x-10]=end-start; ms_1024_sorted[x-10]=end2-start2;
                ms_1024_rev[x-10]=end3-start3;}
            arr_1024=temp_1024.clone();
        }

        double ms_avg_1024=0;
        for (int x=0;x<10;x++){
            ms_avg_1024+=ms_1024[x];
            ms_avg_1024_sorted+=ms_1024_sorted[x];
            ms_avg_1024_rev+=ms_1024_rev[x];
        }
        double[] ms_2048=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ms.mergeSort(arr_2048,arr_2048.length);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ms.mergeSort(arr_2048,arr_2048.length);
            double end2=System.currentTimeMillis();
            reverser(arr_2048);
            double start3=System.currentTimeMillis();
            ms.mergeSort(arr_2048,arr_2048.length);
            double end3=System.currentTimeMillis();
            if(x>9){ ms_2048[x-10]=end-start;   ms_2048_sorted[x-10]=end2-start2; ms_2048_rev[x-10]=end3-start3; }
            arr_2048=temp_2048.clone();
        }
        double ms_avg_2048=0;
        for (int x=0;x<10;x++){
            ms_avg_2048+=ms_2048[x];
            ms_avg_2048_sorted+=ms_2048_sorted[x];
            ms_avg_2048_rev+=ms_2048_rev[x];
        }
        double[] ms_4096=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ms.mergeSort(arr_4096,arr_4096.length);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ms.mergeSort(arr_4096,arr_4096.length);
            double end2=System.currentTimeMillis();
            reverser(arr_4096);
            double start3=System.currentTimeMillis();
            ms.mergeSort(arr_4096,arr_4096.length);
            double end3=System.currentTimeMillis();
            if(x>9){ ms_4096[x-10]=end-start;  ms_4096_sorted[x-10]=end2-start2; ms_4096_rev[x-10]=end3-start3;}
            arr_4096=temp_4096.clone();
        }
        double ms_avg_4096=0;
        for (int x=0;x<10;x++){
            ms_avg_4096+=ms_4096[x];
            ms_avg_4096_sorted+=ms_4096_sorted[x];
            ms_avg_4096_rev+=ms_4096_rev[x];
        }

        double[] ms_8192=new double[10];

        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ms.mergeSort(arr_8192,arr_8192.length);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ms.mergeSort(arr_8192,arr_8192.length);
            double end2=System.currentTimeMillis();
            reverser(arr_8192);
            double start3=System.currentTimeMillis();
            ms.mergeSort(arr_8192,arr_8192.length);
            double end3=System.currentTimeMillis();
            if(x>9){  ms_8192[x-10]=end-start;  ms_8192_sorted[x-10]=end2-start2; ms_8192_rev[x-10]=end3-start3;}
            arr_8192=temp_8192.clone();
        }
        double ms_avg_8192=0;
        for (int x=0;x<10;x++){
            ms_avg_8192+=ms_8192[x];
            ms_avg_8192_sorted+=ms_8192_sorted[x];
            ms_avg_8192_rev+=ms_8192_rev[x];
        }

        double[] ms_16384=new double[10];

        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ms.mergeSort(arr_16384,arr_16384.length);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ms.mergeSort(arr_16384,arr_16384.length);
            double end2=System.currentTimeMillis();
            reverser(arr_16384);
            double start3=System.currentTimeMillis();
            ms.mergeSort(arr_16384,arr_16384.length);
            double end3=System.currentTimeMillis();
            if(x>9){ ms_16384[x-10]=end-start;  ms_16384_sorted[x-10]=end2-start2;  ms_16384_rev[x-10]=end3-start3;}
            arr_16384=temp_16384.clone();
        }
        double ms_avg_16384=0;
        for (int x=0;x<10;x++){
            ms_avg_16384+=ms_16384[x];
            ms_avg_16384_sorted+=ms_16384_sorted[x];
            ms_avg_16384_rev+=ms_16384_rev[x];
        }
        double[] ms_32768=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ms.mergeSort(arr_32768,arr_32768.length);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ms.mergeSort(arr_32768,arr_32768.length);
            double end2=System.currentTimeMillis();
            reverser(arr_32768);
            double start3=System.currentTimeMillis();
            ms.mergeSort(arr_32768,arr_32768.length);
            double end3=System.currentTimeMillis();
            if(x>9){ms_32768[x-10]=end-start; ms_32768_sorted[x-10]=end2-start2; ms_32768_rev[x-10]=end3-start3; }
            arr_32768=temp_32768.clone();
        }
        double ms_avg_32768=0;
        for (int x=0;x<10;x++){
            ms_avg_32768+=ms_32768[x];
            ms_avg_32768_sorted+=ms_32768_sorted[x];
            ms_avg_32768_rev+=ms_32768_rev[x];
        }
        double[]ms_65536=new double[10];

        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ms.mergeSort(arr_65536,arr_65536.length);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ms.mergeSort(arr_65536,arr_65536.length);
            double end2=System.currentTimeMillis();
            reverser(arr_65536);
            double start3=System.currentTimeMillis();
            ms.mergeSort(arr_65536,arr_65536.length);
            double end3=System.currentTimeMillis();
            if(x>9){ms_65536[x-10]=end-start; ms_65536_sorted[x-10]=end2-start2;  ms_65536_rev[x-10]=end3-start3;}
            arr_65536=temp_65536.clone();
        }
        double ms_avg_65536=0;
        for (int x=0;x<10;x++){
            ms_avg_65536+=ms_65536[x];
            ms_avg_65536_sorted+=ms_65536_sorted[x];
            ms_avg_65536_rev+=ms_65536_rev[x];
        }
        double[] ms_131072=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ms.mergeSort(arr_131072,arr_131072.length);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ms.mergeSort(arr_131072,arr_131072.length);
            double end2=System.currentTimeMillis();
            reverser(arr_131072);
            double start3=System.currentTimeMillis();
            ms.mergeSort(arr_131072,arr_131072.length);
            double end3=System.currentTimeMillis();
            if(x>9){ ms_131072[x-10]=end-start;     ms_131072_sorted[x-10]=end2-start2; ms_131072_rev[x-10]=end3-start3;}
            arr_131072=temp_131072.clone();
        }
        double ms_avg_131072=0;
        for (int x=0;x<10;x++){
            ms_avg_131072+=ms_131072[x];
            ms_avg_131072_sorted+=ms_131072_sorted[x];
            ms_avg_131072_rev+=ms_131072_rev[x];
        }
        double[] ms_251281=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ms.mergeSort(arr,arr.length);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ms.mergeSort(arr,arr.length);
            double end2=System.currentTimeMillis();
            reverser(arr );
            double start3=System.currentTimeMillis();
            ms.mergeSort(arr  ,arr.length);
            double end3=System.currentTimeMillis();
            if(x>9){ms_251281[x-10]=end-start;   ms_251281_sorted[x-10]=end2-start2;  ms_251281_rev[x-10]=end3-start3;}
            arr=temp_arr.clone();
        }
        double ms_avg_251281=0;
        for (int x=0;x<10;x++){
            ms_avg_251281+=ms_251281[x];
            ms_avg_251281_sorted+=ms_251281_sorted[x];
            ms_avg_251281_rev+=ms_251281_rev[x];
        }

        System.out.println("ms1"+ms_avg_512);
        System.out.println(ms_avg_1024);
        System.out.println(ms_avg_2048);
        System.out.println(ms_avg_4096);
        System.out.println(ms_avg_8192);
        System.out.println(ms_avg_16384);
        System.out.println(ms_avg_32768);
        System.out.println(ms_avg_65536);
        System.out.println(ms_avg_131072);
        System.out.println(ms_avg_251281);
        System.out.println("ms1"+ms_avg_512_sorted);
        System.out.println(ms_avg_1024_sorted);
        System.out.println(ms_avg_2048_sorted);
        System.out.println(ms_avg_4096_sorted);
        System.out.println(ms_avg_8192_sorted);
        System.out.println(ms_avg_16384_sorted);
        System.out.println(ms_avg_32768_sorted);
        System.out.println(ms_avg_65536_sorted);
        System.out.println(ms_avg_131072_sorted);
        System.out.println(ms_avg_251281_sorted);
        System.out.println("mrev"+ms_avg_512_rev);
        System.out.println(ms_avg_1024_rev);
        System.out.println(ms_avg_2048_rev);
        System.out.println(ms_avg_4096_rev);
        System.out.println(ms_avg_8192_rev);
        System.out.println(ms_avg_16384_rev);
        System.out.println(ms_avg_32768_rev);
        System.out.println(ms_avg_65536_rev );
        System.out.println(ms_avg_131072_rev);
        System.out.println(ms_avg_251281_rev);
//-------------------------------------------------------
        PigeonholeSort ps=new PigeonholeSort();
        double[] ps_512=new double[10];
        double[] psavg=new double[10];
        double[] ps_512_sorted=new double[10];
        double[] ps_1024_sorted=new double[10];
        double[] ps_2048_sorted=new double[10];
        double[] ps_4096_sorted=new double[10];
        double[] ps_8192_sorted=new double[10];
        double[] ps_16384_sorted=new double[10];
        double[] ps_32768_sorted=new double[10];
        double[] ps_65536_sorted=new double[10];
        double[] ps_131072_sorted=new double[10];
        double[] ps_251281_sorted=new double[10];
        double[] ps_512_rev=new double[10];
        double[] ps_1024_rev=new double[10];
        double[] ps_2048_rev=new double[10];
        double[] ps_4096_rev=new double[10];
        double[] ps_8192_rev=new double[10];
        double[] ps_16384_rev=new double[10];
        double[] ps_32768_rev=new double[10];
        double[] ps_65536_rev=new double[10];
        double[] ps_131072_rev=new double[10];
        double[] ps_251281_rev=new double[10];
        double ps_avg_512_sorted=0;
        double ps_avg_1024_sorted=0;
        double ps_avg_2048_sorted=0;
        double ps_avg_4096_sorted=0;
        double ps_avg_8192_sorted=0;
        double ps_avg_16384_sorted=0;
        double ps_avg_32768_sorted=0;
        double ps_avg_65536_sorted=0;
        double ps_avg_131072_sorted=0;
        double ps_avg_251281_sorted=0;
        double[] psavg_sorted=new double[10];
        double ps_avg_512_rev=0;
        double ps_avg_1024_rev=0;
        double ps_avg_2048_rev=0;
        double ps_avg_4096_rev=0;
        double ps_avg_8192_rev=0;
        double ps_avg_16384_rev=0;
        double ps_avg_32768_rev=0;
        double ps_avg_65536_rev=0;
        double ps_avg_131072_rev=0;
        double ps_avg_251281_rev=0;
        double[] psavg_rev=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ps.sort(arr_512);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ps.sort(arr_512);
            double end2=System.currentTimeMillis();
            reverser(arr_512);
            double start3=System.currentTimeMillis();
            ps.sort(arr_512);
            double end3=System.currentTimeMillis();
            if(x>9){ps_512[x-10]=end-start;  ps_512_sorted[x-10]=end2-start2; ps_512_rev[x-10]=end3-start3; }
            arr_512=temp_512.clone();
        }
        double ps_avg_512=0;
        for (int x=0;x<10;x++){
            ps_avg_512+=ps_512[x];
            ps_avg_512_sorted+=ps_512_sorted[x];
            ps_avg_512_rev+=ps_512_rev[x];
        }
        double[] ps_1024=new double[10];

        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ps.sort(arr_1024);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ps.sort(arr_1024);
            double end2=System.currentTimeMillis();
            reverser(arr_1024);
            double start3=System.currentTimeMillis();
            ps.sort(arr_1024);
            double end3=System.currentTimeMillis();
            if(x>9){ ps_1024[x-10]=end-start; ps_1024_sorted[x-10]=end2-start2;ps_1024_rev[x-10]=end3-start3;}
            arr_1024=temp_1024.clone();
        }

        double ps_avg_1024=0;
        for (int x=0;x<10;x++){
            ps_avg_1024+=ps_1024[x];
            ps_avg_1024_sorted+=ps_1024_sorted[x];
            ps_avg_1024_rev+=ps_1024_rev[x];
        }
        double[] ps_2048=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ps.sort(arr_2048);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ps.sort(arr_2048);
            double end2=System.currentTimeMillis();
            reverser(arr_2048);
            double start3=System.currentTimeMillis();
            ps.sort(arr_2048);
            double end3=System.currentTimeMillis();
            if(x>9){ps_2048[x-10]=end-start;  ps_2048_sorted[x-10]=end2-start2; ps_2048_rev[x-10]=end3-start3;}
            arr_2048=temp_2048.clone();
        }
        double ps_avg_2048=0;
        for (int x=0;x<10;x++){
            ps_avg_2048+=ps_2048[x];
            ps_avg_2048_sorted+=ps_2048_sorted[x];
            ps_avg_2048_rev+=ps_2048_rev[x];
        }
        double[] ps_4096=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ps.sort(arr_4096);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ps.sort(arr_4096);
            double end2=System.currentTimeMillis();
            reverser(arr_4096);
            double start3=System.currentTimeMillis();
            ps.sort(arr_4096);
            double end3=System.currentTimeMillis();
            if(x>9){ps_4096[x-10]=end-start;  ps_4096_sorted[x-10]=end2-start2; ps_4096_rev[x-10]=end3-start3;}
            arr_4096=temp_4096.clone();
        }
        double ps_avg_4096=0;
        for (int x=0;x<10;x++){
            ps_avg_4096+=ps_4096[x];
            ps_avg_4096_sorted+=ps_4096_sorted[x];
            ps_avg_4096_rev+=ps_4096_rev[x];
        }

        double[] ps_8192=new double[10];

        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ps.sort(arr_8192);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ps.sort(arr_8192);
            double end2=System.currentTimeMillis();
            reverser(arr_8192);
            double start3=System.currentTimeMillis();
            ps.sort(arr_8192);
            double end3=System.currentTimeMillis();
            if(x>9){ps_8192[x-10]=end-start;  ps_8192_sorted[x-10]=end2-start2;ps_8192_rev[x-10]=end3-start3; }
            arr_8192=temp_8192.clone();
        }
        double ps_avg_8192=0;
        for (int x=0;x<10;x++){
            ps_avg_8192+=ps_8192[x];
            ps_avg_8192_sorted+=ps_8192_sorted[x];
            ps_avg_8192_rev+=ps_8192_rev[x];
        }

        double[] ps_16384=new double[10];

        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ps.sort(arr_16384);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ps.sort(arr_16384);
            double end2=System.currentTimeMillis();
            reverser(arr_16384);
            double start3=System.currentTimeMillis();
            ps.sort(arr_16384);
            double end3=System.currentTimeMillis();
            if(x>9){ ps_16384[x-10]=end-start;
                ps_16384_sorted[x-10]=end2-start2;
                ps_16384_rev[x-10]=end3-start3;}
            arr_16384=temp_16384.clone();
        }
        double ps_avg_16384=0;
        for (int x=0;x<10;x++){
            ps_avg_16384+=ps_16384[x];
            ps_avg_16384_sorted+=ps_16384_sorted[x];
            ps_avg_16384_rev+=ps_16384_rev[x];
        }
        double[] ps_32768=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ps.sort(arr_32768);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ps.sort(arr_32768);
            double end2=System.currentTimeMillis();
            reverser(arr_32768);
            double start3=System.currentTimeMillis();
            ps.sort(arr_32768);
            double end3=System.currentTimeMillis();
            if(x>9){ps_32768[x-10]=end-start; ps_32768_sorted[x-10]=end2-start2;
                ps_32768_rev[x-10]=end3-start3;}
            arr_32768=temp_32768.clone();
        }
        double ps_avg_32768=0;
        for (int x=0;x<10;x++){
            ps_avg_32768+=ps_32768[x];
            ps_avg_32768_sorted+=ps_32768_sorted[x];
            ps_avg_32768_rev+=ps_32768_rev[x];
        }
        double[]ps_65536=new double[10];

        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ps.sort(arr_65536);
            double end=System.currentTimeMillis();
            double start2=System.currentTimeMillis();
            ps.sort(arr_65536);
            double end2=System.currentTimeMillis();
            reverser(arr_65536);
            double start3=System.currentTimeMillis();
            ps.sort(arr_65536);
            double end3=System.currentTimeMillis();
            if(x>9){ps_65536[x-10]=end-start;
                ps_65536_sorted[x-10]=end2-start2;
                ps_65536_rev[x-10]=end3-start3;}
            arr_65536=temp_65536.clone();
        }
        double ps_avg_65536=0;
        for (int x=0;x<10;x++){
            ps_avg_65536+=ps_65536[x];
            ps_avg_65536_sorted+=ps_65536_sorted[x];
            ps_avg_65536_rev+=ps_65536_rev[x];
        }
        double[] ps_131072=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ps.sort(arr_131072);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ps.sort(arr_131072);
            double end2=System.currentTimeMillis();
            reverser(arr_131072);
            double start3=System.currentTimeMillis();
            ps.sort(arr_131072);
            double end3=System.currentTimeMillis();
            if(x>9){ ps_131072[x-10]=end-start;   ps_131072_sorted[x-10]=end2-start2;
                ps_131072_rev[x-10]=end3-start3;}
            arr_131072=temp_131072.clone();
        }
        double ps_avg_131072=0;
        for (int x=0;x<10;x++){
            ps_avg_131072+=ps_131072[x];
            ps_avg_131072_sorted+=ps_131072_sorted[x];
            ps_avg_131072_rev+=ps_131072_rev[x];
        }
        double[] ps_251281=new double[10];
        for (int x=0;x<20;x++){
            double start=System.currentTimeMillis();
            ps.sort(arr);
            double end=System.currentTimeMillis();

            double start2=System.currentTimeMillis();
            ps.sort(arr);
            double end2=System.currentTimeMillis();
            reverser(arr);
            double start3=System.currentTimeMillis();
            ps.sort(arr);
            double end3=System.currentTimeMillis();
            if(x>9){  ps_251281[x-10]=end-start;   ps_251281_sorted[x-10]=end2-start2; ps_251281_rev[x-10]=end3-start3;}
            arr=temp_arr.clone();
        }
        double ps_avg_251281=0;
        for (int x=0;x<10;x++){
            ps_avg_251281+=ps_251281[x];
            ps_avg_251281_sorted+=ps_251281_sorted[x];
            ps_avg_251281_rev+=ps_251281_rev[x];
        }

        System.out.println("ps1"+ps_avg_512);
        System.out.println(ps_avg_1024);
        System.out.println(ps_avg_2048);
        System.out.println(ps_avg_4096);
        System.out.println(ps_avg_8192);
        System.out.println(ps_avg_16384);
        System.out.println(ps_avg_32768);
        System.out.println(ps_avg_65536);
        System.out.println(ps_avg_131072);
        System.out.println(ps_avg_251281);
        System.out.println("pssorted1"+ps_avg_512_sorted);
        System.out.println(ps_avg_1024_sorted);
        System.out.println(ps_avg_2048_sorted);
        System.out.println(ps_avg_4096_sorted);
        System.out.println(ps_avg_8192_sorted);
        System.out.println(ps_avg_16384_sorted);
        System.out.println(ps_avg_32768_sorted);
        System.out.println(ps_avg_65536_sorted);
        System.out.println(ps_avg_131072_sorted);
        System.out.println(ps_avg_251281_sorted);
        System.out.println("prev"+ps_avg_512_rev);
        System.out.println(ps_avg_1024_rev);
        System.out.println(ps_avg_2048_rev);
        System.out.println(ps_avg_4096_rev);
        System.out.println(ps_avg_8192_rev);
        System.out.println(ps_avg_16384_rev);
        System.out.println( ps_avg_32768_rev);
        System.out.println(ps_avg_65536_rev );
        System.out.println(ps_avg_131072_rev);
        System.out.println(ps_avg_251281_rev);
//------------------------------------------
        int[] inputAxis = {512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 251282};

        // Create sample data for linear runtime
        double[][] yAxis = new double[4][10];
        yAxis[0] = new double[]{cs_avg_512/10,cs_avg_1024/10,cs_avg_2048/10,cs_avg_4096/10,cs_avg_8192/10,cs_avg_16384/10,cs_avg_32768/10,cs_avg_65536/10,cs_avg_131072/10,cs_avg_251281/10};
        yAxis[1] = new double[]{is_avg_512/10,is_avg_1024/10,is_avg_2048/10,is_avg_4096/10,is_avg_8192/10,is_avg_16384/10,is_avg_32768/10,is_avg_65536/10,is_avg_131072/10,is_avg_251281/10};
        yAxis[2] = new double[]{ms_avg_512/10,ms_avg_1024/10,ms_avg_2048/10,ms_avg_4096/10,ms_avg_8192/10,ms_avg_16384/10,ms_avg_32768/10,ms_avg_65536/10,ms_avg_131072/10,ms_avg_251281/10};
        yAxis[3] = new double[]{ps_avg_512/10,ps_avg_1024/10,ps_avg_2048/10,ps_avg_4096/10,ps_avg_8192/10,ps_avg_16384/10,ps_avg_32768/10,ps_avg_65536/10,ps_avg_131072/10,ps_avg_251281/10};

        showAndSaveChart("Random Test", inputAxis, yAxis);
        double[][] yAxis2 = new double[4][10];
        yAxis2[0] = new double[]{cs_avg_512_sorted/10,cs_avg_1024_sorted/10,cs_avg_2048_sorted/10,cs_avg_4096_sorted/10,cs_avg_8192_sorted/10,cs_avg_16384_sorted/10,cs_avg_32768_sorted/10,cs_avg_65536_sorted/10,cs_avg_131072_sorted/10,cs_avg_251281_sorted/10};
        yAxis2[1] = new double[]{is_avg_512_sorted/10,is_avg_1024_sorted/10,is_avg_2048_sorted/10,is_avg_4096_sorted/10,is_avg_8192_sorted/10,is_avg_16384_sorted/10,is_avg_32768_sorted/10,is_avg_65536_sorted/10,is_avg_131072_sorted/10,is_avg_251281_sorted/10};
        yAxis2[2] = new double[]{ms_avg_512_sorted/10,ms_avg_1024_sorted/10,ms_avg_2048_sorted/10,ms_avg_4096_sorted/10,ms_avg_8192_sorted/10,ms_avg_16384_sorted/10,ms_avg_32768_sorted/10,ms_avg_65536_sorted/10,ms_avg_131072_sorted/10,ms_avg_251281_sorted/10};
        yAxis2[3] = new double[]{ps_avg_512_sorted/10,ps_avg_1024_sorted/10,ps_avg_2048_sorted/10,ps_avg_4096_sorted/10,ps_avg_8192_sorted/10,ps_avg_16384_sorted/10,ps_avg_32768_sorted/10,ps_avg_65536_sorted/10,ps_avg_131072_sorted/10,ps_avg_251281_sorted/10};
        showAndSaveChart("Sorted Test", inputAxis, yAxis2);
        double[][] yAxis3 = new double[4][10];
        yAxis3[0] = new double[]{cs_avg_512_rev/10,cs_avg_1024_rev/10,cs_avg_2048_rev/10,cs_avg_4096_rev/10,cs_avg_8192_rev/10,cs_avg_16384_rev/10,cs_avg_32768_rev/10,cs_avg_65536_rev/10,cs_avg_131072_rev/10,cs_avg_251281_rev/10};
        yAxis3[1] = new double[]{is_avg_512_rev/10,is_avg_1024_rev/10,is_avg_2048_rev/10,is_avg_4096_rev/10,is_avg_8192_rev/10,is_avg_16384_rev/10,is_avg_32768_rev/10,is_avg_65536_rev/10,is_avg_131072_rev/10,is_avg_251281_rev/10};
        yAxis3[2] = new double[]{ms_avg_512_rev/10,ms_avg_1024_rev/10,ms_avg_2048_rev/10,ms_avg_4096_rev/10,ms_avg_8192_rev/10,ms_avg_16384_rev/10,ms_avg_32768_rev/10,ms_avg_65536_rev/10,ms_avg_131072_rev/10,ms_avg_251281_rev/10};
        yAxis3[3] = new double[]{ps_avg_512_rev/10,ps_avg_1024_rev/10,ps_avg_2048_rev/10,ps_avg_4096_rev/10,ps_avg_8192_rev/10,ps_avg_16384_rev/10,ps_avg_32768_rev/10,ps_avg_65536_rev/10,ps_avg_131072_rev/10,ps_avg_251281_rev/10};
        showAndSaveChart("Reverse Sorted Test", inputAxis, yAxis3);



    } public static int[] reverser(int[] arr){
        int size=arr.length;
        int i, k, temp;
        for (i = 0; i < size / 2; i++) {
            temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }
      return arr;

    }


    public static void showAndSaveChart(String title, int[] xAxis, double[][] yAxis) throws IOException {
        // Create Chart
        XYChart chart = new XYChartBuilder().width(800).height(600).title(title)
                .yAxisTitle("Time in Milliseconds").xAxisTitle("Input Size").build();

        // Convert x axis to double[]
        double[] doubleX = Arrays.stream(xAxis).asDoubleStream().toArray();

        // Customize Chart
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNE);
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
 double[] a = new double[0];
        // Add a plot for a sorting algorithm
        chart.addSeries("Counting Sort", doubleX , yAxis[0]);
        chart.addSeries("Insertion Sort", doubleX, yAxis[1]);
        chart.addSeries("Merge Sort", doubleX , yAxis[2]);
        chart.addSeries("Pigeonhole Sort", doubleX, yAxis[3]);


        // Save the chart as PNG
        BitmapEncoder.saveBitmap(chart, title + ".png", BitmapEncoder.BitmapFormat.PNG);

        // Show the chart
        new SwingWrapper(chart).displayChart();
    }
}
