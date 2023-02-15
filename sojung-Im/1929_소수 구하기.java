import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        boolean prime;

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
                System.out.println(i);
            }
        }
        scanner.close();
    }
}