
public class Tabuada {
    public static void main(String[] args) {
        
        int a = 1, b = 1;// a e o primeironumero 1x4 ele e o
        while (a <= 10) {// enquanto a for menor ou igaul a 10
            System.out.println("Tabuada do " + a);
            b = 1;
            while (b <= 10) {
                System.out.println(a + " x " + b + " = " + (a * b));
            b++;
            } //final do 2 loop
                   
a++; // repetir o loop
        } //final do 1 loop
    }
}