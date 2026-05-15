import java.util.Scanner;

public class Exercicio1 {

    public static boolean primo(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] A = new int[10];

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            A[i] = leia.nextInt();
        }

        System.out.println("Números primos do vetor:");

        for (int i = 0; i < 10; i++) {
            if (primo(A[i])) {
                System.out.println(A[i]);
            }
        }

        leia.close();
    }
}