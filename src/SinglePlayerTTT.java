import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SinglePlayerTTT {

    public static void SinglePlayer(){

        Main main = new Main();

        main.welcomeMessage();

        String [] game = new String[9];

        Arrays.fill(game, " ");

        Scanner scan = new Scanner(System.in);

        String first = "X";
        String computer = "O";

        Random random = new Random();

        boolean xOrder = true;
        int cnt = 0;
        gameloop: while(cnt < 5) {

            while(xOrder) {

                System.out.print("Player 1: ");

                int a = scan.nextInt();

                if (game[a - 1].equals(" ")) {

                    game[a - 1] = first;

                    System.out.printf("| %s | %s | %s |\n| %s | %s | %s |\n| %s | %s | %s |\n", game[0], game[1], game[2], game[3], game[4], game[5], game[6], game[7], game[8]);

                    xOrder = false;

                }
                else {

                    System.out.println("You can only draw to empty place. Try again!");

                }

                if ((game[0] == first && game[1] == first && game[2] == first) ||
                        (game[3] == first && game[4] == first && game[5] == first) ||
                        (game[6] == first && game[7] == first && game[8] == first) ||
                        (game[0] == first && game[3] == first && game[6] == first) ||
                        (game[1] == first && game[4] == first && game[7] == first) ||
                        (game[2] == first && game[5] == first && game[8] == first) ||
                        (game[0] == first && game[4] == first && game[8] == first) ||
                        (game[2] == first && game[4] == first && game[6] == first)) {

                    System.out.println("\n" + first +" Won!");
                    break gameloop;
                }
            }

            cnt++;

            if (cnt == 5) {
                break;
            }

            while (!xOrder) {

                int b = random.nextInt(9) + 1;

                if (game[b - 1].equals(" ")) {

                    System.out.print("Computer: " + b + "\n");

                    game[b - 1] = computer;

                    System.out.printf("| %s | %s | %s |\n| %s | %s | %s |\n| %s | %s | %s |\n", game[0], game[1], game[2], game[3], game[4], game[5], game[6], game[7], game[8]);

                    xOrder = true;
                }

                if ((game[0] == computer && game[1] == computer && game[2] == computer) ||
                        (game[3] == computer && game[4] == computer && game[5] == computer) ||
                        (game[6] == computer && game[7] == computer && game[8] == computer) ||
                        (game[0] == computer && game[3] == computer && game[6] == computer) ||
                        (game[1] == computer && game[4] == computer && game[7] == computer) ||
                        (game[2] == computer && game[5] == computer && game[8] == computer) ||
                        (game[0] == computer && game[4] == computer && game[8] == computer) ||
                        (game[2] == computer && game[4] == computer && game[6] == computer)) {

                    System.out.println("\n" + computer + " Won!");
                    break gameloop;

                }
            }
        }

        if (cnt == 5) System.out.println("\nEqual");
    }
}