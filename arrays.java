
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
int  n, a, x = 1;


System.out.println("Digite o primeiro numero");

n = ler.nextInt();
System.out.println("Digite o segundo numero");

a = ler.nextInt();
System.out.println("o valor e = "  + (a * n));

x = (a * n);

if (x > 50) {
    System.out.println("numero maior que 50");
}

else if (x < 100) { 
System.out.println("numero menor que 100");
}
while (x > 10) {
    System.out.println("perfeito" + (x)); 
x--;

    
}

 
   }   
}