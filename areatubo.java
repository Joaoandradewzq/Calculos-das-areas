import java.util.Scanner;

public class areatubo {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double raio, altura, area;

        System.out.println("CALCULO DA AREA DO TUBO");

        System.out.print("Digite o valor do raio do tubo: ");
        raio = ler.nextDouble();

        System.out.print("Digite o valor da altura do tubo: ");
        altura = ler.nextDouble();

        area = 2 * Math.PI * raio * (raio + altura);

        System.out.println("A area total do tubo e igual a: " + area);

        ler.close();
    }
}