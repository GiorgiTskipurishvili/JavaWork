import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("აირჩიეთ ქვემოთ ჩამოთვლილთაგან");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");

        int choose = scan.nextInt();

        System.out.println("შეიყვანეთ ორი რიცხვი");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (choose == 1){
            System.out.println("პასუხი არის " + add(x,y));
        } else if (choose == 2) {
            System.out.println("პასუხი არის " + sub(x,y));
        } else if (choose == 3) {
            System.out.println("პასუხი არის " + mul(x,y));
        } else if (choose == 4) {
            System.out.println("პასუხი არის " + div(x,y));
        }else{
            System.out.println("თქვენს მიერ არჩეული რიცხვი არ მოიძებნა");
        }


    }

    //addition
    public static int add(int x, int y){
        int ans;
        ans = x+y;
        return ans;
    }

    //substraction
    public static int sub(int x, int y){
        int ans;
        ans = x-y;
        return ans;
    }

    //multiplication
    public static int mul(int x, int y){
        int ans;
        ans = x*y;
        return ans;
    }


    //division
    public static int div(int x, int y){
        int ans;
        ans = x/y;
        return ans;
    }

}
