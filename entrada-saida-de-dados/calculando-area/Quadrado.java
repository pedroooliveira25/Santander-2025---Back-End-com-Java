import java.util.Scanner;

public class Quadrado {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

      System.out.print("Digite o tamanho da lateral de um quadrado, para calcular sua área");
      double lado = sc.nextDouble();

      double area = lado * lado;  
      System.out.println("Área do quadrado: " + area + " m²");
            
    sc.close();
  }

  
}
