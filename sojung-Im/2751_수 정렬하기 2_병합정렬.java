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

        mergeSort(array, 0, N-1);

        for(int i=0;i<N;i++){
            // System.out.println(array[i]); // 시초과
            sb.append(array[i]).append(i < N-1 ? "\n" : "");
        }
        System.out.println(sb);

        scanner.close();
    }
    private static void mergeSort(int[] array, int startIdx, int endIdx){
        if(startIdx < endIdx){
            int middleIdx = (startIdx + endIdx) / 2;

            mergeSort(array, startIdx, middleIdx);
            mergeSort(array, middleIdx + 1, endIdx);

            int left = startIdx;
            int right = middleIdx + 1;
            int[] temp = new int[endIdx - startIdx + 1];
            int tempIdx = 0;

            while(left <= middleIdx && right <= endIdx){
                if(array[left] < array[right]){
                    temp[tempIdx++] = array[left++];
                } else {
                    temp[tempIdx++] = array[right++];
                }
            }

            while(left <= middleIdx){ // left 원소만 남은 경우
                temp[tempIdx++] = array[left++];
            }
            while(right <= endIdx){ // right 원소만 남은 경우
                temp[tempIdx++] = array[right++];
            }

            System.arraycopy(temp, 0, array, startIdx, temp.length);
        }
    }
}
