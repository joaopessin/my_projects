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
        String senhaCorreta = "ABC123", senhaInserida = "";

        System.out.println("\n--------------------------------------------------");
        System.out.print("\nInforme a senha: ");
        senhaInserida = entrada.next();

        if (senhaInserida.equals(senhaCorreta)) {
          if ((ptc >= pta) && (ptc >= ptd) && (ptc >= ptf)) { // 1. PTC
            System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);

            if ((pta >= ptd) && (pta >= ptf)) { // 2. PTA
              System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);

              if (ptd >= ptf) {
                System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);
                System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);
              } else {
                System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);
                System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);
              }

            } else if ((ptd >= pta) && (ptd >= ptf)) { // 2. PTD
              System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);

              if (pta >= ptf) {
                System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);
                System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);
              } else {
                System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);
                System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);
              }

            } else if ((ptf >= pta) && (ptf >= ptd)) { // 2. PTF
              System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);

              if (pta >= ptd) {
                System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);
                System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);
              } else {
                System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);
                System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);
              }
            }

          } else if ((pta >= ptc) && (pta >= ptd) && (pta >= ptf)) { // 1. PTA
            System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);

            if ((ptc >= ptd) && (ptc >= ptf)) { // 2. PTC
              System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);

              if (ptd >= ptf) {
                System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);
                System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);
              } else {
                System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);
                System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);
              }

            } else if ((ptd >= ptc) && (ptd >= ptf)) { // 2. PTD
              System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);

              if (ptc >= ptf) {
                System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);
                System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);
              } else {
                System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);
                System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);
              }

            } else if ((ptf >= ptc) && (ptf >= ptd)) { // 2. PTF
              System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);

              if (ptc >= ptd) {
                System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);
                System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);
              } else {
                System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);
                System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);
              }
            }

          } else if ((ptd >= ptc) && (ptd >= pta) && (ptd >= ptf)) {      // 1. PTD
            System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);

            if ((ptc >= pta) && (ptc >= ptf)) { // 2. PTC
              System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);

              if (pta >= ptf) {
                System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);
                System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);
              } else {
                System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);
                System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);
              }

            } else if ((pta >= ptc) && (pta >= ptf)) { // 2. PTA
              System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);

              if (ptc >= ptf) {
                System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);
                System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);
              } else {
                System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);
                System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);
              }

            } else if ((ptf >= ptc) && (ptf >= pta)) { // 2. PTF
              System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);

              if (pta >= ptc) {
                System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);
                System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);
              } else {
                System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);
                System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);
              }
            }

          } else if ((ptf >= ptc) && (ptf >= pta) && (ptf >= ptd)) {      // 1. PTF
            System.out.println("\n22. Luzia Santos  [PTF] | Votos: " + ptf);

            if ((ptc >= pta) && (ptc >= ptd)) { // 2. PTC
              System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);

              if (pta >= ptd) {
                System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);
                System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);
              } else {
                System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);
                System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);
              }

            } else if ((pta >= ptc) && (pta >= ptd)) { // 2. PTA
              System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);

              if (ptc >= ptd) {
                System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);
                System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);
              } else {
                System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);
                System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);
              }

            } else if ((ptd >= ptc) && (ptd >= pta)) { // 2. PTD
              System.out.println("\n12. Cláudia Amara [PTD] | Votos: " + ptd);

              if (pta >= ptc) {
                System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);
                System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);
              } else {
                System.out.println("\n45. Alisson Reis  [PTC] | Votos: " + ptc);
                System.out.println("\n13. José Ailton   [PTA] | Votos: " + pta);
              }
            }
          }

          int totalVotos = (ptc + ptd + pta + ptf);
          float metadeVotos = (totalVotos / 2);

          System.out.print("\n");

          if (ptc > metadeVotos) {
            System.out.println("\nAlisson Reis do partido PTC [45] GANHOU a eleição!");
          } else if (ptd > metadeVotos) {
            System.out.println("\nCláudia Amara do partido PTD [12] GANHOU a eleição!");
          } else if (pta > metadeVotos) {
            System.out.println("\nJosé Ailton do partido PTA [13] GANHOU a eleição!");
          } else if (ptf > metadeVotos) {
            System.out.println("\nLuzia Santos do partido PTF [22] GANHOU a eleição!");
          } else {
            System.out.println("\nHaverá 2º turno!");
          }

          System.out.print("\n");

        } else {
          System.out.println("\nSenha inválida!");

          opcaoUsuario = 0;
        }

      } else {
        continue;
      }

    }
  }
}
