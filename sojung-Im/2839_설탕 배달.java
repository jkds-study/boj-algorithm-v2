import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        if(N % 5 == 0){
            count = N / 5;
        } else {
            for(int i=1;i<N/3;i++){
                if((N - 5*i) < 0){
                    break;
                }
                if((N - 5*i) % 3 == 0){
                    count = i + (N - 5*i) / 3;
                }
            }
            if(count < 1 && N % 3 == 0){
                count = N / 3;
            }
        }

        System.out.println(count > 0 ? count : -1);
        
        scanner.close();
    }
}