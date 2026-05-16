import java.util.Scanner;

public class areadapiramide {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double areaBase, areaLateral, areaTotal;

        System.out.println("CALCULO DA AREA DA PIRAMIDE");

        System.out.print("Digite o valor da area da base: ");
        areaBase = ler.nextDouble();

        System.out.print("Digite o valor da area lateral: ");
        areaLateral = ler.nextDouble();

        areaTotal = areaBase + areaLateral;

        System.out.println("A area total da piramide e igual a: " + areaTotal);

        ler.close();
    }
}