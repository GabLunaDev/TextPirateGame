import java.util.Scanner;

public class Gameplay extends Main {
    public static Scanner input = new Scanner(System.in);
    public static int choice1;
    public static int choices;

    public static char quizPirata;

    public static void Choice1(String name) {
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
                        }
                    } while (choices != 1 && choices != 2);
                    break;
                case 2:
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_WHITE + Colors.ANSI_BLUE_BACKGROUND +
                            "Você escolheu o barco com casco em perfeito estado, porém algumas velas com defeito!" + Colors.ANSI_RESET);
                    break;
                case 3:
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_WHITE + Colors.ANSI_RED_BACKGROUND +
                            "Você escolheu o barco com casco em perfeito estado, porém algumas velas com defeito!" + Colors.ANSI_RESET);
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

        System.out.println("Você conseguiu responder corretamente todas as perguntas! Com isso os residentes da ilha lhe ajudaram a consertar o barco ao ponto de ficar perfeito!" +
                "Logo após o conserto você e sua tripulação partem de volta a sua jornada pelo tesouro perdido de Akassia!");
    }

    public static void tempestadePosIlhaPirata(){

    }

    public static void tapaCasco() {
        Menu.caseBarco1TapaCasco();

        System.out.println("\nObrigado pelos seus serviços marujo!");
    }


}
