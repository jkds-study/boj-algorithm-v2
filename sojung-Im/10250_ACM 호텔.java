import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0;i<T;i++){
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();

            int floor = N % H;
            int room = (int) Math.ceil(N / (double) H);
            System.out.println((floor > 0 ? floor : H) + (room > 9 ? "" + room : "0" + room));
        }

        scanner.close();
    }
}