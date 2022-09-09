import java.util.Scanner;

public class Voting {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int opcaoUsuario = 0, branco = 0, nulo = 0, ptc = 0, pta = 0, ptd = 0, ptf = 0;

    while (opcaoUsuario != 1 && opcaoUsuario != 2) {
      System.out.println("\n--------------------------------------------------");
      System.out.println("\"Urna Eleitoral\"\n");
      System.out.println("[1] Votar | [2] Apurar votos");
      System.out.print("\nOpção: ");
      opcaoUsuario = entrada.nextInt();

      int opcaoVoto = 0, limiteCorrigirVoto = 0;

      if (opcaoUsuario == 1) { // Votar
        while (opcaoVoto != 1 && opcaoVoto != 2) {
          System.out.println("\n--------------------------------------------------");
          System.out.println("\n[1] Escolher candidato | [2] Votar em branco");
          System.out.print("\nOpção: ");
          opcaoVoto = entrada.nextInt();

          int numeroCandidato = 0, confirmarVoto = 0;

          if (opcaoVoto == 1) { // Escolher candidato
            System.out.println("\n--------------------------------------------------");
            System.out.println(
                "\n[45] Alisson Reis  -  PTC\n[13] José Ailton   -  PTA\n[12] Cláudia Amara -  PTD\n[22] Luzia Santos  -  PTF");
            System.out.print("\nOpção: ");
            numeroCandidato = entrada.nextInt();

            switch (numeroCandidato) {
              case 45:
                while (confirmarVoto != 1 && confirmarVoto != 2) {
                  System.out.println("\n--------------------------------------------------");
                  System.out.println("Confirmação de voto: [45] Alisson Reis - PTC\n");
                  System.out.println("[1] Confirmar | [2] Corrigir");
                  System.out.print("\nOpção: ");
                  confirmarVoto = entrada.nextInt();

                  if (confirmarVoto == 1) {
                    ptc++;
                    System.out.println("\nVoto em Alisson Reis do partido PTC confirmado!");

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

                break;

              case 13:
                while (confirmarVoto != 1 && confirmarVoto != 2) {
                  System.out.println("\n--------------------------------------------------");
                  System.out.println("Confirmação de voto: [13] José Ailton - PTA\n");
                  System.out.println("[1] Confirmar | [2] Corrigir");
                  System.out.print("\nOpção: ");
                  confirmarVoto = entrada.nextInt();

                  if (confirmarVoto == 1) {
                    pta++;
                    System.out.println("\nVoto em José Ailton do partido PTA confirmado!");

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

                break;

              case 12:
                while (confirmarVoto != 1 && confirmarVoto != 2) {
                  System.out.println("\n--------------------------------------------------");
                  System.out.println("Confirmação de voto: [12] Cláudia Amara -  PTD\n");
                  System.out.println("[1] Confirmar | [2] Corrigir");
                  System.out.print("\nOpção: ");
                  confirmarVoto = entrada.nextInt();

                  if (confirmarVoto == 1) {
                    ptd++;
                    System.out.println("\nVoto em Cláudia Amara do partido PTD confirmado!");

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

                break;

              case 22:
                while (confirmarVoto != 1 && confirmarVoto != 2) {
                  System.out.println("\n--------------------------------------------------");
                  System.out.println("Confirmação de voto: [22] Luzia Santos  -  PTF\n");
                  System.out.println("[1] Confirmar | [2] Corrigir");
                  System.out.print("\nOpção: ");
                  confirmarVoto = entrada.nextInt();

                  if (confirmarVoto == 1) {
                    ptf++;
                    System.out.println("\nVoto em Luzia Santos do partido PTF confirmado!");

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

                break;

              default:
                while (confirmarVoto != 1 && confirmarVoto != 2) {
                  System.out.println("\n--------------------------------------------------");
                  System.out.println("Confirmação de voto: Nulo\n");
                  System.out.println("[1] Confirmar | [2] Corrigir");
                  System.out.print("\nOpção: ");
                  confirmarVoto = entrada.nextInt();

                  if (confirmarVoto == 1) {
                    nulo++;
                    System.out.println("\nVoto em Nulo confirmado!");

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

            }

            opcaoUsuario = 0;
          } else if (opcaoVoto == 2) { // Votar em branco
            while (confirmarVoto != 1 && confirmarVoto != 2) {
              System.out.println("\n--------------------------------------------------");
              System.out.println("Confirmação de voto: Branco\n");
              System.out.println("[1] Confirmar | [2] Corrigir");
              System.out.print("\nOpção: ");
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
