import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, x;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        n = input.nextInt();

        if (n < 2) {
            System.out.println(n + " asal sayı değildir");
        } else {
            x = prime(n, 2);
            if (x == 1) {
                System.out.println(n + " asal sayıdır");
            } else {
                System.out.println(n + " asal sayı değildir");
            }
        }
    }
    static int prime(int y, int i) {
        if (i < y) {
            if (y % i != 0) {
                return (prime(y, ++i));
            } else {
                return 0;
            }
        }
        return 1;
    }
}
