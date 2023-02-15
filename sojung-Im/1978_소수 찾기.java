import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = N;
        for(int i=0;i<N;i++){
            int num = scanner.nextInt();

            if(num == 1){
                count--;
            } else {
                for(int j=2;j<=Math.sqrt(num);j++){
                    if(num % j == 0){
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);

        scanner.close();
    }
}