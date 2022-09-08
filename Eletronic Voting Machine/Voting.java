import java.util.Scanner;

public class Voting {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int opcaoUsuario = 0, branco = 0, nulo = 0;

    while (opcaoUsuario != 1 && opcaoUsuario != 2) {
      System.out.println("\n--------------------------------------------------");
      System.out.println("\"Urna Eleitoral\"\n");

      System.out.println("[1] Votar | [2] Apurar votos");
      System.out.print("Opção: ");
      opcaoUsuario = entrada.nextInt();

      int opcaoVoto = 0, limiteCorrigirVoto = 0;

      if (opcaoUsuario == 1) {  // Votar
        while (opcaoVoto != 1 && opcaoVoto != 2) {
          System.out.println("\n--------------------------------------------------");
          System.out.println("\n[1] Escolher candidato | [2] Votar em branco");
          System.out.print("Opção: ");
          opcaoVoto = entrada.nextInt();

          int numeroCandidato = 0, confirmarVoto = 0;

          if (opcaoVoto == 1) { // Escolher candidato
            System.out.println("Opção 1.");

            opcaoUsuario = 0;
          } else if (opcaoVoto == 2) {  // Votar em branco
            while (confirmarVoto != 1 && confirmarVoto != 2) {
              System.out.println("\n--------------------------------------------------");
              System.out.println("Confirmação de voto: Branco\n");

              System.out.println("[1] Confirmar | [2] Corrigir");
              System.out.print("Opção: ");
              confirmarVoto = entrada.nextInt();

              if (confirmarVoto == 1) {
                branco++;

                System.out.println("\nVoto em Branco confirmado!");
                break;
              } else if (confirmarVoto == 2) {
                limiteCorrigirVoto++;

                if (limiteCorrigirVoto != 3) {
                  System.out.println("\nQuantidade de tentativas disponíveis: " + (3 - limiteCorrigirVoto));
                  opcaoVoto = 0;
                } else {
                  System.out.println("\nNúmero máximo de tentativas atingido!");
                  opcaoUsuario = 0;
                }

              } else {
                continue;
              }
            }

            opcaoUsuario = 0;
          } else {
            continue;
          }

        }

      } else if (opcaoUsuario == 2) { // Apurar votos
        System.out.println("Opção 2.");
      } else {
        continue;
      }

    }
  }
}
