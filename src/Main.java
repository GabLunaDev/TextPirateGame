import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome de pirata: ");
        String name = in.next();

        Menu.MensagemInicial(name);

        System.out.println("\n");
        System.out.println(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "Você deseja jogar?[Y/N]"+ Colors.ANSI_RESET);
        char playGame = in.next().toLowerCase().charAt(0);

        if(playGame == 'y') {
            Gameplay.Choice1(name);
        }
        else {
            System.out.println(Colors.ANSI_BLUE + "\nQue pena! Vejo você na próxima, marujo!");
        }
    }
}
