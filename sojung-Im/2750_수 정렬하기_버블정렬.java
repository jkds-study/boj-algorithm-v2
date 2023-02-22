import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int array[] = new int[N];
        for(int i=0;i<N;i++){
            array[i] = scanner.nextInt();
        }

        for(int i=1;i<N;i++){
            for(int j=0;j<N-i;j++){
                if(array[j] > array[j+1]){
                    swap(array, j, j+1);
                }
            }
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