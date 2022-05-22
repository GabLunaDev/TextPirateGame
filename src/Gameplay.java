import java.util.Scanner;

public class Gameplay extends Main {
    public static Scanner input = new Scanner(System.in);
    public static int choice1;
    public static int choices;

    public static boolean gameOver;

    public static char quizPirata;

    public static void IniciarGameplay(String name) {
        Menu.FirstChallenge(name);
        do {
            choice1 = input.nextInt();
            switch (choice1) {
                case 1:
                    Menu.caseBarco1();
                    do {
                        choices = input.nextInt();
                        switch (choices) {
                            case 1:
                                tapaCasco();
                                break;
                            case 2:
                                ilhaPiratas();
                                break;
                            default:
                                System.out.print(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "\nEscolha inválida!" + Colors.ANSI_RESET + "\nPor favor insira corretamente o valor de sua escolha: ");
                                break;
                        }
                    } while (choices != 1 && choices != 2);
                    break;
                case 2:
                    Menu.casoBarco2();
                    System.out.print("\nDigite qual decisão deseja tomar: ");
                    do {
                        choices = input.nextInt();
                        switch (choices) {
                            case 1:
                                Menu.casoContinuarViagemBarco2();
                                gameOverClass(1);
                                break;
                            case 2:
                                Menu.cidadeMercantil();
                                calculosCidadeMercantil();
                                break;
                            default:
                                System.out.print(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "\nEscolha inválida!" + Colors.ANSI_RESET + "\nPor favor insira corretamente o valor de sua escolha: ");
                                break;
                        }
                    }while(choices != 1 && choices != 2);
                    break;
                default:
                    System.out.print(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "\nBarco inválido!" + Colors.ANSI_RESET + "\nPor favor insira corretamente o valor ao barco de sua escolha: ");
                    break;
            }
        } while (choice1 != 1 && choice1 != 2 && choice1 != 3);
    }

    public static void ilhaPiratas() {
        Menu.caseBarco1Ilha();
        do {
            int index = 1;
            while (index == 1) {
                System.out.println(Colors.ANSI_YELLOW + Colors.ANSI_UNDELINED_TEXT + "Primeira Pergunta:" + Colors.ANSI_RESET + " Qual maior ser vivo marítimo conhecido?");
                System.out.println("[a] - Baleia Azul;");
                System.out.println("[b] - Tubarão Branco;");
                System.out.println("[c] - Água Viva;");
                System.out.println("[d] - Lula Colossal;");
                quizPirata = input.next().toLowerCase().charAt(0);
                if (quizPirata == 'b' || quizPirata == 'c' || quizPirata == 'd') {
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Resposta errada!" + Colors.ANSI_RESET);
                    System.out.println("Tente novamente:");
                } else index = 0;
                if(quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd'){
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Alternativa Inválida!" + Colors.ANSI_RESET);
                    System.out.println("Selecione uma alternativa válida:");
                }
            }
        } while (quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd');

        do {
            int index = 1;
            while (index == 1) {
                System.out.println(Colors.ANSI_YELLOW + Colors.ANSI_UNDELINED_TEXT + "Segunda Pergunta:" + Colors.ANSI_RESET + " Qual o nome do protagonista da série de filmes Piratas do Caribe?");
                System.out.println("[a] - Jack Foster;");
                System.out.println("[b] - Jack Clark;");
                System.out.println("[c] - Jack Sparrow;");
                System.out.println("[d] - Jack Holland;");
                quizPirata = input.next().toLowerCase().charAt(0);
                if (quizPirata == 'a' || quizPirata == 'b' || quizPirata == 'd') {
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Resposta errada!" + Colors.ANSI_RESET);
                    System.out.println("Tente novamente:");
                } else index = 0;
                if(quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd'){
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Alternativa Inválida!" + Colors.ANSI_RESET);
                    System.out.println("Selecione uma alternativa válida:");
                }
            }
        } while (quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd');

        do {
            int index = 1;
            while (index == 1) {
                System.out.println(Colors.ANSI_YELLOW + Colors.ANSI_UNDELINED_TEXT + "Terceira Pergunta:" + Colors.ANSI_RESET + " Qual o pirata mais famoso do mundo?");
                System.out.println("[a] - Henry Every;");
                System.out.println("[b] - Edward Teach;");
                System.out.println("[c] - Jack Sparrow;");
                System.out.println("[d] - Leonardo Dicaprio;");
                quizPirata = input.next().toLowerCase().charAt(0);
                if (quizPirata == 'a' || quizPirata == 'c' || quizPirata == 'd') {
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Resposta errada!" + Colors.ANSI_RESET);
                    System.out.println("Tente novamente:");
                } else index = 0;
                if(quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd'){
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Alternativa Inválida!" + Colors.ANSI_RESET);
                    System.out.println("Selecione uma alternativa válida:");
                }
            }

        } while (quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd');

        do {
            int index = 1;
            while (index == 1) {
                System.out.println(Colors.ANSI_YELLOW + Colors.ANSI_UNDELINED_TEXT + "Quarta Pergunta:" + Colors.ANSI_RESET + " Quantos oceanos existem?");
                System.out.println("[a] - 3;");
                System.out.println("[b] - 5;");
                System.out.println("[c] - 6;");
                System.out.println("[d] - 4;");
                quizPirata = input.next().toLowerCase().charAt(0);
                if (quizPirata == 'a' || quizPirata == 'c' || quizPirata == 'd') {
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Resposta errada!" + Colors.ANSI_RESET);
                    System.out.println("Tente novamente:");
                } else index = 0;
                if(quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd'){
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Alternativa Inválida!" + Colors.ANSI_RESET);
                    System.out.println("Selecione uma alternativa válida:");
                }
            }
        } while (quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd');

        do {
            int index = 1;
            while (index == 1) {
                System.out.println(Colors.ANSI_YELLOW + Colors.ANSI_UNDELINED_TEXT + "Quinta Pergunta:" + Colors.ANSI_RESET + " Qual o maior oceano do mundo?");
                System.out.println("[a] - Oceano Atlântico;");
                System.out.println("[b] - Oceano Ártico;");
                System.out.println("[c] - Oceano Índico;");
                System.out.println("[d] - Oceano Pacífico;");
                quizPirata = input.next().toLowerCase().charAt(0);
                if (quizPirata == 'a' || quizPirata == 'b' || quizPirata == 'c') {
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Resposta errada!" + Colors.ANSI_RESET);
                    System.out.println("Tente novamente:");
                } else index = 0;
                if(quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd'){
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Alternativa Inválida!" + Colors.ANSI_RESET);
                    System.out.println("Selecione uma alternativa válida:");
                }
            }
        } while (quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd');

        do {
            int index = 1;
            while (index == 1) {
                System.out.println(Colors.ANSI_YELLOW + Colors.ANSI_UNDELINED_TEXT + "Sexta Pergunta:" + Colors.ANSI_RESET + " O mar ocupa quantos porcento da área total da terra?");
                System.out.println("[a] - 50%;");
                System.out.println("[b] - 81,22%;");
                System.out.println("[c] - 71%;");
                System.out.println("[d] - 63%;");
                quizPirata = input.next().toLowerCase().charAt(0);
                if (quizPirata == 'a' || quizPirata == 'b' || quizPirata == 'd') {
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Resposta errada!" + Colors.ANSI_RESET);
                    System.out.println("Tente novamente:");
                } else index = 0;

                if(quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd'){
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Alternativa Inválida!" + Colors.ANSI_RESET);
                    System.out.println("Selecione uma alternativa válida:");
                }
            }
        } while (quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd');

        System.out.println("\nVocê conseguiu responder corretamente todas as perguntas! Com isso os residentes da ilha lhe ajudaram a consertar o barco ao ponto de ficar perfeito!" +
                "\nLogo após o conserto você e sua tripulação partem de volta a sua jornada pelo tesouro perdido de Akassia!");

        tempestadePosIlhaPirata();
    }

    public static void tempestadePosIlhaPirata(){

        Menu.tempestadePosIlha();
        System.out.print("\nDigite sua decisão: ");
        do {
            choices = input.nextInt();

            switch (choices) {
                case 1:
                    continuarTempestade();
                    break;
                case 2:
                    pararNaIlha();
                    break;
                default:
                    System.out.println("");
                    System.out.println(Colors.ANSI_RED + Colors.ANSI_BOLD_TEXT + "Decisão inválida" + Colors.ANSI_RESET);
                    System.out.print("Por favor digite o valor de uma decisão válida: ");
                    break;
            }
        }while(choices != 1 && choices != 2);
    }

    public static void pararNaIlha(){
        Menu.casoPararIlhaTempestade();
        ilhaTesouroDeAkassia();
    }

    public static void continuarTempestade(){
        Menu.casoContinuarTempestade();
        System.out.println("\nObrigado pelos seus serviços marujo!");
        gameOverClass(1);
    }

    public static void tapaCasco() {
        Menu.caseBarco1TapaCasco();
        System.out.println("\nObrigado pelos seus serviços marujo!\n");
        gameOverClass(1);
    }
    public static void calculosCidadeMercantil(){
        do {
            int index = 1;
            while (index == 1) {
                System.out.println(Colors.ANSI_YELLOW + Colors.ANSI_UNDELINED_TEXT + "Primeiro Cliente:" + Colors.ANSI_RESET + " Ele quer duas tábuas de madeira que custam T$ 6,75 cada." +
                        "\nQual das alternativas corresponde a quanto o primeiro cliente deverá pagar?");
                System.out.println("[a] - T$ 13,00;");
                System.out.println("[b] - T$ 13,50;");
                System.out.println("[c] - T$ 15,45;");
                System.out.println("[d] - T$ 13,30;");
                quizPirata = input.next().toLowerCase().charAt(0);
                if (quizPirata == 'a' || quizPirata == 'c' || quizPirata == 'd') {
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Resposta errada!" + Colors.ANSI_RESET);
                    System.out.println("Tente novamente:");
                } else index = 0;

                if(quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd'){
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Alternativa Inválida!" + Colors.ANSI_RESET);
                    System.out.println("Selecione uma alternativa válida:");
                }
            }
        } while (quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd');
        do {
            int index = 1;
            while (index == 1) {
                System.out.println(Colors.ANSI_YELLOW + Colors.ANSI_UNDELINED_TEXT + "Segundo Cliente:" + Colors.ANSI_RESET + " Ele deseja 5 velas que custam T$ 35,00 cada, porém, já avia pago T$ 25,00 anteriormente adiantado" +
                        "\nQual das alternativas corresponde a quanto o segundo cliente deverá pagar?");
                System.out.println("[a] - T$ 150,00;");
                System.out.println("[b] - T$ 175,00;");
                System.out.println("[c] - T$ 165,00;");
                System.out.println("[d] - T$ 180,00;");
                quizPirata = input.next().toLowerCase().charAt(0);
                if (quizPirata == 'b' || quizPirata == 'c' || quizPirata == 'd') {
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Resposta errada!" + Colors.ANSI_RESET);
                    System.out.println("Tente novamente:");
                } else index = 0;

                if(quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd'){
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Alternativa Inválida!" + Colors.ANSI_RESET);
                    System.out.println("Selecione uma alternativa válida:");
                }
            }
        } while (quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd');
        do {
            int index = 1;
            while (index == 1) {
                System.out.println(Colors.ANSI_YELLOW + Colors.ANSI_UNDELINED_TEXT + "Terceiro Cliente:" + Colors.ANSI_RESET + " Ele quer um barco completo avaliado em T$ 7360, porém, quer dividido em 23 meses" +
                        "\nQual das alternativas corresponde a quanto o terceiro cliente deverá pagar por mês?");
                System.out.println("[a] - T$ 330,00;");
                System.out.println("[b] - T$ 340,00;");
                System.out.println("[c] - T$ 320,00;");
                System.out.println("[d] - T$ 350,00;");
                quizPirata = input.next().toLowerCase().charAt(0);
                if (quizPirata == 'a' || quizPirata == 'b' || quizPirata == 'd') {
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Resposta errada!" + Colors.ANSI_RESET);
                    System.out.println("Tente novamente:");
                } else index = 0;

                if(quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd'){
                    System.out.println("");
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "Alternativa Inválida!" + Colors.ANSI_RESET);
                    System.out.println("Selecione uma alternativa válida:");
                }
            }
        } while (quizPirata != 'a' && quizPirata != 'b' && quizPirata != 'c' && quizPirata != 'd');
        System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_BLUE+ "\nVocê conseguiu pontos com o vendedor e ele lhe deu, em troca do seu serviço, as duas velas que desejava!\n"+ Colors.ANSI_RESET);
        invasaoPirata();
    }
    public static void invasaoPirata(){
        Menu.invasaoPirataPosCidadeMercantil();
        System.out.print("\nDigite sua decisão: ");
        do {
            choices = input.nextInt();

            switch (choices) {
                case 1:
                    System.out.println("\nVocê acertou em cheio a embarcação inimiga, isso fez com que os rivais ficassem desesperados." +
                            "\nOutra pessoa da sua tripulação conseguiu salvar seu companheiro e todos saíram vivos da situação e os inimigos derrotados!");
                    System.out.println("Depois da invasão, após dois dias, vocês conseguiram chegar a ilha onde o teseouro estava escondido!");
                    ilhaTesouroDeAkassia();
                    break;
                case 2:
                    Menu.casoOpiteMatarOCapitao();
                    gameOverClass(1);
                    break;
                default:
                    System.out.println("");
                    System.out.println(Colors.ANSI_RED + Colors.ANSI_BOLD_TEXT + "Decisão inválida" + Colors.ANSI_RESET);
                    System.out.print("Por favor digite o valor de uma decisão válida: ");
                    break;
            }
        }while(choices != 1 && choices != 2);
    }

    public static void ilhaTesouroDeAkassia(){
        Menu.ilhaTesouroAkassia();
        System.out.print("\nDigite a escolha a se tomar: ");
        do {
            choices = input.nextInt();
            switch (choices) {
                case 1:
                    System.out.println("\nVocês percorrem boa parte da costa da ilha e chegam ao ponto declarado no mapa." +
                            "\nA operação de escavação logo se inicia, até um de seus tripulantes gritar "+ Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "'ENCONTRAMOS!'" + Colors.ANSI_RESET +
                            "\nTodos vocês comemoram o achado e voltam felizes e ansiosos para casa para contar a novidade as pessoas da vila!");
                    System.out.println("Vocês chegam a vila e reconstroem ela mais robusta e criam mais equipamentos para se protejer. Sua tripulação e você" +
                            "ficam conhecidos como salvadores da vila pirata!");

                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_PURPLE+"Fim"+ Colors.ANSI_RESET);
                    gameOverClass(0);
                    break;
                case 2:
                    System.out.println("");
                    System.out.println(Colors.ANSI_RED+ Colors.ANSI_BOLD_TEXT +"GAME OVER" + Colors.ANSI_RESET);
                    System.out.println("Logo ao adentrar a floresta, vocês tiveram o azar de encontrar onças selvagens em busca de refeições" +
                            "Vocês tentam lutar contra as onças, porém sem êxito.");
                    gameOverClass(1);
                    break;
                default:
                    System.out.println("");
                    System.out.println(Colors.ANSI_RED + Colors.ANSI_BOLD_TEXT + "Decisão inválida" + Colors.ANSI_RESET);
                    System.out.print("Por favor digite o valor de uma decisão válida: ");
                    break;
            }
        }while(choices != 1 && choices != 2);

    }
    public static void gameOverClass(int i){
        if(i == 1) {
            gameOver = true;
        }
        else {
            gameOver = false;
        }
    }
}
