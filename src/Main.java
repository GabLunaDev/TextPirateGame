import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome de pirata: ");
        String name = in.next();

        Menu.MensagemInicial(name);

        System.out.println("\nVocê deseja jogar?[Y/N]");
        char playGame = in.next().toLowerCase().charAt(0);

        if(playGame == 'y') {
            Gameplay.Choice1(name);
        }
        else {
            System.out.println("Que pena! Vejo você da próxima marujo!");
        }
    }
}
