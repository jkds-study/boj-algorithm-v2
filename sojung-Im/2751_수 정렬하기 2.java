import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<N;i++){
            list.add(scanner.nextInt());
        }

        Collections.sort(list);

        for(int i=0;i<N;i++){
            // System.out.println(list.get(i)); // 시간초과
            sb.append(list.get(i)).append(i < N-1 ? "\n" : "");
        }
        System.out.println(sb);

        scanner.close();
    }
}
