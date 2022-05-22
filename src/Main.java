import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Solicita nome do usuário
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome de pirata: ");
        String name = in.next();

        //Chama o primeiro menu para o usuario, contando um pouco da hitória.
        Menu.MensagemInicial(name);

        //Pergunta ao usuário se ele deseja jogar.
        System.out.println("\n");
        System.out.println(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "Você deseja jogar?[Y/N]"+ Colors.ANSI_RESET);
        char playGame = in.next().toLowerCase().charAt(0);

        //Inicio de Gameplay ou Mensagem de te vejo na próxima.
        while(playGame == 'y') {
            //Inicia a Gameplay
            Gameplay.IniciarGameplay(name);
            if(Gameplay.gameOver){
                System.out.println(Colors.ANSI_BOLD_TEXT+ Colors.ANSI_UNDELINED_TEXT+ Colors.ANSI_RED+ "Você deseja tentar novamente?[Y/N]"+ Colors.ANSI_RESET);
                playGame = in.next().toLowerCase().charAt(0);
            }
        }
        System.out.println("\n"+ Colors.ANSI_BOLD_TEXT+Colors.ANSI_BLACK +Colors.ANSI_YELLOW_BACKGROUND+ "=============CRÉDITOS=============" + Colors.ANSI_RESET);
        System.out.println("Obrigado por jogar "+ Colors.ANSI_UNDELINED_TEXT+ Colors.ANSI_BOLD_TEXT + Colors.ANSI_CYAN +"TextPirateGame"+ Colors.ANSI_RESET+ "!");
        System.out.println("Jogo desenvolvido por "+ Colors.ANSI_BOLD_TEXT + Colors.ANSI_PURPLE +"Gabriel de Luna."+ Colors.ANSI_RESET);
    }
}
