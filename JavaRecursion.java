import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n number");
        n = scan.nextInt();

        int result = sum(n);
        System.out.println(result);


    }

    private static int sum(int k) {
        if (k>0){
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
