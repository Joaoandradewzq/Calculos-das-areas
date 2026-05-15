import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

    
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

  
        System.out.print("Digite um número para verificar se existe no conjunto: ");
        int valor = scanner.nextInt();


        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + valor + " existe no conjunto.");
        } else {
            System.out.println("O número " + valor + " nao existe no conjunto.");
        }

        scanner.close();
    }