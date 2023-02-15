import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if(N > 1){
            while(N > 1){
                for(int i=2;i<=N;i++){
                    if(N % i == 0){
                        System.out.println(i);
                        N /= i;
                        break;
                    }
                }
            }
        }

        scanner.close();
    }
}