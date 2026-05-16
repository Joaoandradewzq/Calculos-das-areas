import java.util.Scanner;

public class calculotriangulo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a, b, c;

        System.out.println("digite o valor da altura do seu triangulo:");
        a = ler.nextDouble();

        System.out.println("digite o valor da base do seu triangulo:");
        b = ler.nextDouble();

        c = (a * b);

        System.out.println("a area do seu triangulo e = " + (c / 2));


    }
}