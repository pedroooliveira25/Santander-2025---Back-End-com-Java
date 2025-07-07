import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número e veja a tabuda!");
        int numero = sc.nextInt();

        System.out.println("Número: " + numero);
        for (int n = 1; n <= 10; n++ ) {
        System.out.println( numero + "x" + n + "=" + (numero * n));
        }
        sc.close();
    }
}