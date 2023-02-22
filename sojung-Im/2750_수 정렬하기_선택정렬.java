import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int array[] = new int[N];
        for(int i=0;i<N;i++){
            array[i] = scanner.nextInt();
        }

        for(int i=0;i<N-1;i++){
            int minIndex = i;
            for(int j=i+1;j<N;j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }

        for(int i=0;i<N;i++){
            System.out.println(array[i]);
        }

        scanner.close();
    }

    private static void swap(int array[], int idx1, int idx2){
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}