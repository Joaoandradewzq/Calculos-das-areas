import java.util.Scanner;

public class AreaCaixa {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double comprimento, largura, altura, area;

        System.out.println("CALCULO DA AREA DA CAIXA");

        System.out.print("Digite o comprimento da caixa: ");
        comprimento = ler.nextDouble();

        System.out.print("Digite a largura da caixa: ");
        largura = ler.nextDouble();

        System.out.print("Digite a altura da caixa: ");
        altura = ler.nextDouble();

        area = 2 * (
                comprimento * largura +
                comprimento * altura +
                largura * altura
        );

        System.out.println("A area total da caixa e igual a: " + area);

        ler.close();
    }
}