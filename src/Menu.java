public class Menu {
    public static void MensagemInicial(String name) {
        System.out.println(Colors.ANSI_YELLOW + "\n ██████╗ █████╗  ██████╗ █████╗      █████╗  ██████╗     ████████╗███████╗███████╗ ██████╗ ██╗   ██╗██████╗  ██████╗ \n" +
                "██╔════╝██╔══██╗██╔════╝██╔══██╗    ██╔══██╗██╔═══██╗    ╚══██╔══╝██╔════╝██╔════╝██╔═══██╗██║   ██║██╔══██╗██╔═══██╗\n" +
                "██║     ███████║██║     ███████║    ███████║██║   ██║       ██║   █████╗  ███████╗██║   ██║██║   ██║██████╔╝██║   ██║\n" +
                "██║     ██╔══██║██║     ██╔══██║    ██╔══██║██║   ██║       ██║   ██╔══╝  ╚════██║██║   ██║██║   ██║██╔══██╗██║   ██║\n" +
                "╚██████╗██║  ██║╚██████╗██║  ██║    ██║  ██║╚██████╔╝       ██║   ███████╗███████║╚██████╔╝╚██████╔╝██║  ██║╚██████╔╝\n" +
                " ╚═════╝╚═╝  ╚═╝ ╚═██═╝╚═╝  ╚═╝     ╚═╝  ╚═╝ ╚═════╝        ╚═╝   ╚══════╝╚══════╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ \n" +
                "                                                                                                                     " + Colors.ANSI_RESET);
        System.out.printf("O tesouro de " + Colors.ANSI_BOLD_TEXT + Colors.ANSI_CYAN + "Akassia" + Colors.ANSI_RESET + " e um dos mais antigos do mundo. Muitas pessoas tentaram encontrálo, porem, nenhuma das pessoas tiveram exito nesse percurso. \n" +
                "Monstros, mares de ondas colossais, redemoinhos, entre outros empecilhos foram encontrados pelos caçadores de tesouros. Voce, " + Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "%s" + Colors.ANSI_RESET + ", foi incentivado\n" +
                "por toda uma família de piratas que buscam contribuir para a construcao da sua vila que foi destruida em uma disputa territorial. Tome cuidado, viajante.\n" +
                "O caminho é um dos mais tortuosos que você um dia ousou seguir!", name);
    }

    public static void FirstChallenge(String name) {
        System.out.println("\nVocê foi convocado pela a anciã da vila á encontrar o tesouro perdido de Akassia, para ajudar a reconstruir a vila de piratas" +
                "\nEla lhe deu essa missão pela sua bravura e determinação. Para a jornada ela ofereceu alguns barcos para você escolher." +
                "\nAqui vai a lista deles:");
        System.out.println(Colors.ANSI_PURPLE + "1 - Barco com pequena avaria no casco, porém com as duas velas em ótimo estado;" + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + "2 - Barco com caso em perfeito estado, porém algumas velas com defeito;" + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_RED + "3 - Barco com casco, aparentemente, perfeito. Porém com apenas uma vela;" + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_YELLOW + "\nAlgumas informações:" + Colors.ANSI_RESET + "\nO " + Colors.ANSI_BOLD_TEXT + Colors.ANSI_PURPLE + "barco 1" + Colors.ANSI_RESET + " se move de forma mais rápida, porém pode ocorrer do casco se romper;\n" +
                "O " + Colors.ANSI_BOLD_TEXT + Colors.ANSI_BLUE + "barco 2" + Colors.ANSI_RESET + " se move de maneira mais lenta, por causa do estado de suas velas;\n" +
                "O " + Colors.ANSI_BOLD_TEXT + Colors.ANSI_RED + "barco 3" + Colors.ANSI_RESET + " é o intermediário entre os dois primeiros tanto em velocidade quanto em risco de lhe deixar a deriva, e é mais propenso" +
                "A ataques de piratas inimigos;");

        System.out.print("\nEscolha um dos barcos[1|2|3]: ");
    }

    public static void caseBarco1(){
        System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_WHITE + Colors.ANSI_PURPLE_BACKGROUND +
                "Você escolheu o barco com pequena avaria no casco, porém com as duas velas em ótimo estado!" + Colors.ANSI_RESET);

        System.out.println("\nVocê parte para sua jornada em direção do tesouro de Akassia a toda velocidade! Porém no caminho percebe " +
                "que o barco começa a andar de forma mais lenta, e nota que os ventos não mudaram de direção,\nmuito menos diminuiram a " +
                "sua velocidade. Parece que o barco está ficando mais pesado ao decorrer do tempo, você toma a decisão de " +
                "investigar \no que está acontecendo e vê ao descer na parte de estoque de comidas do barco um furo na parte " +
                "onde havia a avaria na qual o transporte tinha, você tem duas opções: " +
                Colors.ANSI_BOLD_TEXT + Colors.ANSI_PURPLE +"\n[1] - Tapar o buraco paliativamente com alguns suprimentos encontrados no barco, ter a noção de que você pode utilizar esse metódo só mais uma vez, e seguir viagem." +
                Colors.ANSI_BOLD_TEXT + Colors.ANSI_BLUE +"\n[2] - Ir á uma ilha próxima, onde existe outra vila de piratas que tem fama de histórico de violência."+ Colors.ANSI_RESET);

        System.out.println("Qual das opções você escolhe:");
    }

    public static void caseBarco1Ilha(){
        System.out.println("\nVocê chega na ilha e se depara com os piratas habitantes. Com o decorrer da interação você percebe que o que havia escutado sobre eles era falso.\n" +
                "Mas eles só iriam lhe ajudar se você repondesse uma série de perguntas chamadas "+ Colors.ANSI_BOLD_TEXT + Colors.ANSI_PURPLE + "QUIZPIRATA");
    }

    public static void tempestadePosIlha(){
        System.out.println("Vocês continuam a viagem por mais uma semana, nesse meio tempo vocês conhecem novas cidades");
    }

    public static void caseBarco1TapaCasco(){
        System.out.println("");
        System.out.println(Colors.ANSI_RED+ Colors.ANSI_BOLD_TEXT +"GAME OVER" + Colors.ANSI_RESET);
        System.out.println("Após o conserto paliativo da navegação, especificamente 3 dias, você se depara com uma tempestade e isso acaba completamente com o seus planos e com sua vida. " +
                "\nO casco rompe novamente mas a entrada de água é mais violenta, você não consegue acabar com o problema de acaba afundando junto com sua tripulação.");
    }

}
