import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = scanner.nextInt();
        int[] array = new int[N];

        for(int i=0;i<N;i++){
            array[i] = scanner.nextInt();
        }

        heapSort(array);

        for(int i=0;i<N;i++){
            // System.out.println(array[i]); // 시간초과
            sb.append(array[i]).append("\n");
        }
        System.out.println(sb);

        scanner.close();
    }
    private static void heapSort(int[] array){
        for(int i=array.length;i>0;i--){
            if(i < array.length) swap(array, i, 0);
            heapify(array, i);
        }
    }
    private static void heapify(int[] array, int lastIdx){
        for(int i=1;i<=lastIdx/2;i++){
            if((i*2-1) < lastIdx && array[i-1] < array[i*2-1]){
                swap(array, i-1, i*2-1);
                heapify(array, i*2-1);
            }
            if(i*2 < lastIdx && array[i-1] < array[i*2]){
                swap(array, i-1, i*2);
                heapify(array, i*2);
            }
        }
    }
    private static void swap(int array[], int idx1, int idx2){
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
