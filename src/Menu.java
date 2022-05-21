public class Menu {
    public static void MensagemInicial(String name) {
        System.out.println(Colors.ANSI_YELLOW + "\n ██████╗ █████╗  ██████╗ █████╗      █████╗  ██████╗     ████████╗███████╗███████╗ ██████╗ ██╗   ██╗██████╗  ██████╗ \n" +
                "██╔════╝██╔══██╗██╔════╝██╔══██╗    ██╔══██╗██╔═══██╗    ╚══██╔══╝██╔════╝██╔════╝██╔═══██╗██║   ██║██╔══██╗██╔═══██╗\n" +
                "██║     ███████║██║     ███████║    ███████║██║   ██║       ██║   █████╗  ███████╗██║   ██║██║   ██║██████╔╝██║   ██║\n" +
                "██║     ██╔══██║██║     ██╔══██║    ██╔══██║██║   ██║       ██║   ██╔══╝  ╚════██║██║   ██║██║   ██║██╔══██╗██║   ██║\n" +
                "╚██████╗██║  ██║╚██████╗██║  ██║    ██║  ██║╚██████╔╝       ██║   ███████╗███████║╚██████╔╝╚██████╔╝██║  ██║╚██████╔╝\n" +
                " ╚═════╝╚═╝  ╚═╝ ╚═██═╝╚═╝  ╚═╝    ╚═╝  ╚═╝ ╚═════╝        ╚═╝   ╚══════╝╚══════╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ \n" +
                "                                                                                                                     " + Colors.ANSI_RESET);
        System.out.printf("O tesouro de "+ Colors.ANSI_BOLD_TEXT+ Colors.ANSI_CYAN +"Akassia"+ Colors.ANSI_RESET +" e um dos mais antigos do mundo. Muitas pessoas tentaram encontralo, porem, nenhuma das pessoas tiveram exito nesse percurso. \n" +
                "Monstros, mares de ondas colossais, redemoinhos, entre outros empecilhos foram encontrados pelos caçadores de tesouros. Voce, "+ Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED +"%s"+ Colors.ANSI_RESET + ", foi incentivado\n" +
                "por toda uma família de piratas que buscam contribuir para a construcao da sua vila que foi destruida em uma disputa territorial. Tome cuidado, viajante.\n" +
                "O caminho é um dos mais tortuosos que você um dia ousou seguir!", name);
    }

    public static void FirstChallenge(String name){
        System.out.println("Você foi convocado pela a anciã da vila á encontrar o tesouro perdido de Akassia, para ajudar a reconstruir a vila de piratas" +
                "\n Ela lhe deu essa missão pela sua bravura e determinação. Para a jornada ela ofereceu alguns barcos para você escolher." +
                "\nAqui vai a lista deles:");
        System.out.println("1 - Barco com pequena avaria no casco, porém com as duas velas em ótimo estado;");
        System.out.println("2 - Barco com caso em perfeito estado, porém algumas velas com defeito;");
        System.out.println("3 - Barco com casco, aparentemente, perfeito. Porém com apenas uma vela;");
        System.out.println("Algums informações:\n O barco 1 se move de forma mais rápida, porém pode ocorrer do casco se romper;\n" +
                "O barco 2 se move de maneira mais lenta, por causa do estado de suas velas;\n" +
                "O barco 3 é o intermediário entre os dois primeiros tanto em velocidade quanto em risco de lhe deixar a deriva, e é mais propenso" +
                "A ataques de piratas inimigos;");
    }




}
