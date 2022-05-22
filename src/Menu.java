public class Menu {

    // Mensagem inicial do usuário
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
    //Escolha de Barcos
    public static void FirstChallenge(String name) {
        System.out.println("\nVocê foi convocado pela a anciã da vila á encontrar o tesouro perdido de Akassia, para ajudar a reconstruir a vila de piratas" +
                "\nEla lhe deu essa missão pela sua bravura e determinação. Para a jornada ela ofereceu alguns barcos para você escolher." +
                "\nAqui vai a lista deles:");
        System.out.println(Colors.ANSI_PURPLE + "1 - Barco com pequena avaria no casco, porém com as duas velas em ótimo estado;" + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + "2 - Barco com caso em perfeito estado, porém algumas velas com defeito;" + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_YELLOW + "\nAlgumas informações:" + Colors.ANSI_RESET + "\nO " + Colors.ANSI_BOLD_TEXT + Colors.ANSI_PURPLE + "barco 1" + Colors.ANSI_RESET + " se move de forma mais rápida, porém pode ocorrer do casco se romper;\n" +
                "O " + Colors.ANSI_BOLD_TEXT + Colors.ANSI_BLUE + "barco 2" + Colors.ANSI_RESET + " se move de maneira mais lenta, por causa do estado de suas velas;\n");

        System.out.print("\nEscolha um dos barcos[1|2]: ");
    }

    //Caso escolha o barco 1
    public static void caseBarco1(){
        System.out.println("\n"+Colors.ANSI_BOLD_TEXT + Colors.ANSI_WHITE + Colors.ANSI_PURPLE_BACKGROUND +
                "Você escolheu o barco com pequena avaria no casco, porém com as duas velas em ótimo estado!" + Colors.ANSI_RESET);

        System.out.println("\nVocê parte para sua jornada em direção do tesouro de Akassia a toda velocidade! Porém no caminho percebe " +
                "que o barco começa a andar de forma mais lenta, e nota que os ventos não mudaram de direção,\nmuito menos diminuiram a " +
                "sua velocidade. Parece que o barco está ficando mais pesado ao decorrer do tempo, você toma a decisão de " +
                "investigar \no que está acontecendo e vê ao descer na parte de estoque de comidas do barco um furo na parte " +
                "onde havia a avaria na qual o transporte tinha, você tem duas opções: " +
                Colors.ANSI_BOLD_TEXT + Colors.ANSI_PURPLE +"\n[1] - Tapar o buraco paliativamente com alguns suprimentos encontrados no barco, ter a noção de que você pode utilizar esse metódo só mais uma vez, e seguir viagem." +
                Colors.ANSI_BOLD_TEXT + Colors.ANSI_BLUE +"\n[2] - Ir á uma ilha próxima, onde existe outra vila de piratas que tem fama de histórico de violência."+ Colors.ANSI_RESET);

        System.out.print("Qual das opções você escolhe: ");
    }
    //Na escolha do barco 1; Caso Opite a escolha de ir a ilha
    public static void caseBarco1Ilha(){
        System.out.println("\nVocê chega na ilha e se depara com os piratas habitantes. Com o decorrer da interação você percebe que o que havia escutado sobre eles era falso.\n" +
                "Mas eles só iriam lhe ajudar se você repondesse uma série de perguntas chamadas "+ Colors.ANSI_BOLD_TEXT + Colors.ANSI_PURPLE + "QUIZPIRATA");
    }

    //Caso Opite a escolha de ir a ilha; Mensagem sobre a Tempestade
    public static void tempestadePosIlha(){
        System.out.println("\nVocês continuam a viagem por mais uma semana, nesse meio tempo vocês conhecem novas cidades, compram novos suprimentos" +
                "\naté o momento está correndo de forma tranquila, porém, depois de sairem de uma cidade a 5 dias de viagem do destino final" +
                "\nsua tripulação notifica uma possível tempestade mais a frente, por vocês estarem muito próximos de chegar ao tesouro, alguns" +
                "\nmembros da sua tripulação pede para você continuar a viagem e continuar pela tempestade por medo de ter outros piratas atrás do tesouro." +
                "\nJá outros membros expõe uma ideia contrária, eles solicitão uma parada em uma ilha próxima que está inabitada, para esperar a passagem" +
                "\nda tempestade.");
        System.out.println("\nQual das decisões você irá tomar?");
        System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_CYAN+"[1] - Continuar viagem pela tempestade"+ Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_BLUE+"[2] - Parar na ilha inabitada e esperar a tempestade passar"+ Colors.ANSI_RESET);
    }

    public static void casoContinuarTempestade(){
        System.out.println("");
        System.out.println(Colors.ANSI_RED+ Colors.ANSI_BOLD_TEXT +"GAME OVER" + Colors.ANSI_RESET);
        System.out.println("Você opita por continuar e enfrentar a tempestade. Após alguns minutos navegando você se depara com a indomável força da natureza." +
                "\nAs ondas gigantes começam a se formar, os ventos estão descontrolados, o céu antes brilhante e azul se tornou escuro transformando-se" +
                "\nem noite. Você e sua tripulação são logo engolidos por uma onda gigante, trazendo você ao fim do caminho.");
    }

    public static void casoPararIlhaTempestade(){
        System.out.println("\nVocês param na ilha, passam metade de um dia nela até notarem que a tempestade passou e logo em seguida partem ao ultimo destino"+
                "\no tesouro de Akassia!");
    }

    public static void caseBarco1TapaCasco(){
        System.out.println("");
        System.out.println(Colors.ANSI_RED+ Colors.ANSI_BOLD_TEXT +"GAME OVER" + Colors.ANSI_RESET);
        System.out.println("Após o conserto paliativo da navegação, especificamente 3 dias, você se depara com uma tempestade e isso acaba completamente com o seus planos e com sua vida. " +
                "\nO casco rompe novamente mas a entrada de água é mais violenta, você não consegue acabar com o problema de acaba afundando junto com sua tripulação.");
    }


    public static void casoBarco2(){
        System.out.println("\n"+Colors.ANSI_BOLD_TEXT + Colors.ANSI_WHITE + Colors.ANSI_BLUE_BACKGROUND +
                "Você escolheu o barco com casco em perfeito estado, porém algumas velas com defeito!" + Colors.ANSI_RESET);

        System.out.println("\nVocê e sua tripulação sobem no barco, o abastece com suprimentos e logo partem para sua jornada a ilha do tesouro de Akassia!");
        System.out.println("Depois de percorrer um período de 2 semenas em direção ao objetivo final você se depara com as velas aumentando cada vez mais suas avarias." +
                "\nUma parte da sua tripulação pede para que você continue a viagem e os outros pedem para parar em uma cidade próxima de onde vocês estão" +
                "\npara pedir ajuda a trocar as velas");
        System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_BLUE + "[1] - Seguir viagem sem se preocupar com essa avaria;"+ Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_YELLOW + "[2] - Parar na cidade e pedir ajuda para trocar as velas;"+ Colors.ANSI_RESET);
    }

    public static void cidadeMercantil(){
        System.out.println("\nVocê e seus tripulantes chegam a cidade e logo vão a procura das novas velas para o barco, um de seus subordinados encontra um senhor" +
                "\nvendendo velas novinhas em folha, porém, ele não aceita o tipo de moeda que vocẽs utilizam na vila de vocês, mas o senhor propõem que o ajude" +
                "\na vender a sua mercadoria e você ficará encarregado pelos calculos de venda do senhor.\n");
    }
    public static void casoContinuarViagemBarco2(){
        System.out.println("");
        System.out.println(Colors.ANSI_RED+ Colors.ANSI_BOLD_TEXT +"GAME OVER" + Colors.ANSI_RESET);
        System.out.println("Ao longo de 3 dias a situação das velas foram piorando ao ponto de serem inutilizadas completamente." +
                "\nVocê e sua tripulação ficaram a deriva no mar por dias até acabar o estoque de comida e morrerem de calor e fome!");
    }

    public static void invasaoPirataPosCidadeMercantil(){
        System.out.println("Após a troca das velas você e sua tripulação seguem viagem rumo ao destino final. Vocês comemoram o conserto do barco e tudo está a sair como planejado." +
                "\nDepois de 2 dias vocês quase estão chegando a ilha do tesouro perdido de Akassia, porém, enquanto vocês descansavam no meio da noite" +
                "\num grupo de piratas inimigos invadem o barco e começam a saquealo, você e o resto da tripulação acorda após o grito de um de seus aliados" +
                "\nanunciando que o barco havia sido invadido e loo em seguida todos começam o confronto versus os invasores." +
                "\nVocê nota que o barco inimigo não está tão longe, ele está uma distância suficiente para acertá-lo em cheio." +
                "\nposteriormente a essa analise você nota um dos seus tripulantes correndo risco de vida nas mãos do capitão dos inimigos e você precisa tomar uma decisão:");
        System.out.println(Colors.ANSI_BOLD_TEXT+Colors.ANSI_PURPLE+"[1] - Atirar imediatamente na embarcação inimiga;"+Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BOLD_TEXT+Colors.ANSI_GREEN+"[2] - Atirar contra o capitão inimigo, assim salvando seu companheiro de viagem;"+Colors.ANSI_RESET);
    }

    public static void casoOpiteMatarOCapitao(){
        System.out.println("");
        System.out.println(Colors.ANSI_RED+ Colors.ANSI_BOLD_TEXT +"GAME OVER" + Colors.ANSI_RESET);
        System.out.println("Você conseguiu salvar o seu colega de tripulação, mas com a morte do capitão inimigo eles atiraram contra o seu barco." +
                "\n Mesmo com o restante dos inimigos dentro para lhe derrotar. E foi o que aconteceu.");
    }

    public static void ilhaTesouroAkassia(){
        System.out.println(Colors.ANSI_BOLD_TEXT + Colors.ANSI_BLUE + "\nVocê chegou a ilha do tesouro de Akassia!" + Colors.ANSI_RESET);
        System.out.println("\nAo chegar a ilha você e sua tripulação pegam o mapa para ir atrás do tesouro, ansiosos para chegar em sua vila e contar a todos sua jornada," +
                "\ne usufruir de todo o tesouro para reconstruir a vila destruida! Vocês tem que tomar a decisão entre dois caminhos possíveis, nenhum dos dois aparentam" +
                "\nter benefícios ou malefícios:");
        System.out.println(Colors.ANSI_BOLD_TEXT+ Colors.ANSI_RED_BACKGROUND+"[1] Ir pela direita, cobrindo a costa da ilha até chegar no local marcado do tesouro;"+Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BOLD_TEXT+ Colors.ANSI_CYAN_BACKGROUND+"[2] Ir pela esquerda, seguir pela floresta e seguir de forma mais direta ao tesouro;"+Colors.ANSI_RESET);
    }
}
