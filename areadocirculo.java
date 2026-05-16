import java.util.Scanner;

public class areadocirculo {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double raio, area;

        System.out.println("CALCULO DA AREA DO CIRCULO");

        System.out.print("Digite o valor do raio do circulo: ");
        raio = ler.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do circulo e igual a: " + area);

        ler.close();
    }
}