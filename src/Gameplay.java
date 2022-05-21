import java.util.Scanner;

public class Gameplay extends Main {
    public static Scanner input = new Scanner(System.in);
    public static int choice1;

    public static void Choice1(String name) {
        Menu.FirstChallenge(name);
        do {
            choice1 = input.nextInt();
            switch (choice1) {
                case 1:
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_BLACK + Colors.ANSI_PURPLE_BACKGROUND +
                            "Você escolheu o barco com pequena avaria no casco, porém com as duas velas em ótimo estado!" + Colors.ANSI_RESET);
                    break;
                case 2:
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_BLACK + Colors.ANSI_BLUE_BACKGROUND +
                            "Você escolheu o barco com caso em perfeito estado, porém algumas velas com defeito!" + Colors.ANSI_RESET);
                    break;
                case 3:
                    System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_BLACK + Colors.ANSI_RED_BACKGROUND +
                            "Você escolheu o barco com caso em perfeito estado, porém algumas velas com defeito!" + Colors.ANSI_RESET);
                    break;
                default:
                    System.out.print(Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED +"Barco inválido!"+Colors.ANSI_RESET+"\nPor favor insira corretamente o valor ao barco de sua escolha: ");
                    break;
            }
        } while (choice1 != 1 && choice1 != 2 && choice1 != 3);
    }


}
