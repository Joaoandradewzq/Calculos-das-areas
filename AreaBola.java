import java.util.Scanner;

public class AreaBola {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double raio, area;

        System.out.println("CALCULO DA AREA DA BOLA");

        System.out.print("Digite o valor do raio da bola: ");
        raio = ler.nextDouble();

        area = 4 * Math.PI * Math.pow(raio, 2);

        System.out.println("A area total da bola e igual a: " + area);

        ler.close();
    }
}