import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int array[] = new int[N];

        for(int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }

        for(int i=0;i<N;i++){
            int maxIdx = i;
            for(int j=i+1;j<N;j++){
                if(array[maxIdx] < array[j]){
                    swap(array, maxIdx, j);
                }
            }
        }
        System.out.println(array[k-1]);

        scanner.close();
    }
    
    private static void swap(int array[], int idx1, int idx2){
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
