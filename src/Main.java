import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.Scanner;

public class Main {

    public void welcomeMessage(){

        System.out.println("\nThe first player is X! The second player is O!\n");

        System.out.println("| 1 | 2 | 3 |\n| 4 | 5 | 6 |\n| 7 | 8 | 9 |\n");

        System.out.println("The first X starts to game!\nChoose where you want to draw ");
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Tic Tac Toe Game");

        System.out.println("\nHow many player do you want to play?");
        System.out.println("\n1 - Single player");
        System.out.println("2 - 2 players");

        while (true) {

            System.out.print("\nEnter 1 or 2: ");
            Scanner s = new Scanner(System.in);

            int player = s.nextInt();

            if(player == 1 || player == 2) {

                switch (player) {
                    case 1:
                        SinglePlayerTTT.SinglePlayer();
                        break;
                    case 2:
                        TwoPlayerTTT.TwoPlayer();
                        break;
                    default:

                }
                break;
            }
            else{
                System.out.println("You can only choose 1 or 2");
            }

        }
    }
}
