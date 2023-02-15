import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            int n = scanner.nextInt();
            int count = n;
            if(n > 0){
                for(int i=n+1;i<=2*n;i++){
                    for(int j=2;j<=Math.sqrt(i);j++){
                        if(i % j == 0){
                            count--;
                            break;
                        }
                    }
                }
                System.out.println(count);
            } else {
                break;
            }
        }

        scanner.close();
    }
}