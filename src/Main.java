import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, k;
        int total = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayiyi giriniz(n) : ");
        n = input.nextInt();
        System.out.print("Ussu giriniz(k) : ");
        k = input.nextInt();

        for ( int i =1; i<=k; i++) {
            total *= n;
        }
        System.out.println("Cevap : " +total);

    }
}