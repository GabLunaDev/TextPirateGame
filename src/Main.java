import java.util.Scanner;

public class Main {
    private static void MensagemInicial(String name) {
        System.out.println("\n ██████╗ █████╗  ██████╗ █████╗      █████╗  ██████╗     ████████╗███████╗███████╗ ██████╗ ██╗   ██╗██████╗  ██████╗ \n" +
                "██╔════╝██╔══██╗██╔════╝██╔══██╗    ██╔══██╗██╔═══██╗    ╚══██╔══╝██╔════╝██╔════╝██╔═══██╗██║   ██║██╔══██╗██╔═══██╗\n" +
                "██║     ███████║██║     ███████║    ███████║██║   ██║       ██║   █████╗  ███████╗██║   ██║██║   ██║██████╔╝██║   ██║\n" +
                "██║     ██╔══██║██║     ██╔══██║    ██╔══██║██║   ██║       ██║   ██╔══╝  ╚════██║██║   ██║██║   ██║██╔══██╗██║   ██║\n" +
                "╚██████╗██║  ██║╚██████╗██║  ██║    ██║  ██║╚██████╔╝       ██║   ███████╗███████║╚██████╔╝╚██████╔╝██║  ██║╚██████╔╝\n" +
                " ╚═════╝╚═╝  ╚═╝ ╚═██═╝╚═╝  ╚═╝    ╚═╝  ╚═╝ ╚═════╝        ╚═╝   ╚══════╝╚══════╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ \n" +
                "                                                                                                                     ");
        System.out.printf("O tesouro de Akassia e um dos mais antigos do mundo. Muitas pessoas tentaram encontralo, porem, nenhuma das pessoas tiveram exito nesse percurso. \n" +
                "Monstros, mares de ondas colossais, redemoinhos, entre outros empecilhos foram encontrados pelos caçadores de tesouros. Voce, %s, foi incentivado\n" +
                "por toda uma família de piratas que buscam contribuir para a construcao da sua vila que foi destruida em uma disputa territorial. Tome cuidado, viajante.\n" +
                "O caminho é um dos mais tortuosos que você um dia ousou seguir!", name);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome de pirata: ");
        String name = in.next();

        MensagemInicial(name);
    }
}
