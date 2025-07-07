import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int mesAtual = 07;
    int anoAtual = 2025;
    int meses = 12;

    System.out.println("Digite seu nome completo: ");
      String nome = sc.nextLine();
    System.out.println("Digite seu DIA que você nasceu: ");
      int dia = sc.nextInt();
    System.out.println("Digite o MÊS que você nasceu (EXP: 01, 02, 03..): ");
      int mes = sc.nextInt();
    System.out.println("Digite o ANO que você nasceu: ");
      int ano = sc.nextInt();

      int anos = anoAtual - ano;
      int idadeEmMeses = meses - mes + mesAtual;

    String dataDeNascimento = dia + "/" + mes + "/" + ano; 
      System.out.println(dataDeNascimento);

       if (mes <= mesAtual) { 
        System.out.println("Seu NOME é " + nome);
        System.out.println("Nasceu no DIA " + dia);
        System.out.println("Tem " + anos + " anos e " + (meses - mes) + " meses.");
        
      }
        else {
        System.out.println("Seu nome é " + nome); 
        System.out.println("Nasceu no DIA " + dia);
        System.out.println("Tem " + (anos - 1) + " anos e " + idadeEmMeses + " meses.");
    }
    sc.close();
  }
  
}