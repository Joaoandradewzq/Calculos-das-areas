import java.util.Scanner;

public class calculoretangulo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a, b;

        System.out.println("digite o valor da altura do seu retangulo:");
        a = ler.nextInt();

        System.out.println("digite o valor da base do seu retangulo:");
        b = ler.nextInt();

        System.out.println("a area do seu retangulo e = " + (b * a));


    }
}