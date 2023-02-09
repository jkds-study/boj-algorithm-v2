import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int room = 1;
        int num = 1;

        while(num < N){
            num += (++room - 1) * 6;
        }

        System.out.println(room);
        
        scanner.close();
    }
}