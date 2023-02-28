import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int[][] array = new int[N][2];
        for (int i=0; i<N; i++) {
            array[i][0] = in.nextInt();
            array[i][1] = in.nextInt();
        }

        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
            }
        });

        for (int i=0; i<N; i++) {
            System.out.println(array[i][0] + " " + array[i][1]);
        }
    }
}
