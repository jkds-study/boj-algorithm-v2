import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        boolean prime;
        int min = 10000;
        int sum = 0;

        for(int i=M;i<=N;i++){
            prime = true;
            if(i == 1){
                prime = false;
            } else {
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i % j == 0){
                        prime = false;
                        break;
                    }
                }
            }
            if(prime){
                sum += i;
                if(min > i){
                    min = i;
                }
            }
        }

        if(sum > 0){
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }

        scanner.close();
    }
}