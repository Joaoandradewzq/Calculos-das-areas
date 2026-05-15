import java.util.Scanner;

public class Exercicio3 {

    public static int inverterNumero(int num) {

        int invertido = 0;

        while (num > 0) {
            invertido = invertido * 10 + (num % 10);
            num /= 10;
        }

        return invertido;
    }

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite 5 números:");

        for (int i = 0; i < 5; i++) {
            A[i] = leia.nextInt();
            B[i] = inverterNumero(A[i]);
        }

        System.out.print("A = {");

        for (int i = 0; i < 5; i++) {

            System.out.print(A[i]);

            if (i < 4) {
                System.out.print(", ");
            }
        }

        System.out.println("}");

        System.out.print("B = {");

        for (int i = 0; i < 5; i++) {

            System.out.print(B[i]);

            if (i < 4) {
                System.out.print(", ");
            }
        }

        System.out.println("}");

        leia.close();
    }
}