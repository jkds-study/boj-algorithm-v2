import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[5];

        for(int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int i=0;i<5;i++){
            int minIdx = i;
            for(int j=i+1;j<5;j++){
                if(array[minIdx] > array[j]){
                    swap(array, minIdx, j);
                }
            }
            sum += array[i];
        }
        System.out.println(sum);
        System.out.println(sum/5);
        System.out.println(array[2]);

        scanner.close();
    }
    
    private static void swap(int array[], int idx1, int idx2){
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}