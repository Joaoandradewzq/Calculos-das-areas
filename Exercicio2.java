import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] numeros = new int[5];

        int maior, menor, soma = 0;
        double media;

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = leia.nextInt();
        }

        maior = numeros[0];
        menor = numeros[0];

        for (int i = 0; i < 5; i++) {

            soma += numeros[i];

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        int amplitude = maior - menor;

        media = (double) soma / 5;

        System.out.println("Amplitude: " + amplitude);

        System.out.println("Média aritmética: " + media);

        System.out.println("Conjunto em ordem inversa:");

        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        leia.close();
    }
}