import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Gameplay extends Main {
    public static Scanner input = new Scanner(System.in);
    public static void Choice1 (String name){
        Menu.FirstChallenge(name);
        int choice1 = input.nextInt();
        switch(choice1){
            case 1:
                System.out.println("Você escolheu o barco com pequena avaria no casco, porém com as duas velas em ótimo estado!");
            break;
        }
    }


}
