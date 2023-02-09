import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = 1; // 대각선 그룹
        int num = 1;
        int index;

        while(num < X){
            num += ++N;
        }
        index = X-(num-N+1); // 대각선 그룹 내 index

        if(N % 2 == 0){ // 짝수
            System.out.println((1+index) + "/" + (N-index));
        } else { // 홀수
            System.out.println((N-index) + "/" + (1+index));
        }
        
        scanner.close();
    }
}