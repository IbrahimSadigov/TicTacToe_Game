import java.util.Arrays;
import java.util.Scanner;

public class TwoPlayerTTT {

    public static void TwoPlayer() {

        Main main = new Main();

        main.welcomeMessage();

        String [] game = new String[9];

        Arrays.fill(game, " ");

        Scanner scan = new Scanner(System.in);

        String first = "X";
        String second = "O";

        boolean xOrder = true;
        int cnt = 0;
        gameloop: while(cnt < 5) {

                while(xOrder) {

                    System.out.print("Player 1: ");

                    int a = scan.nextInt();

                    if (game[a - 1].equals(" ")) {

                        game[a - 1] = "X";

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

                if (cnt == 5) break;

                while (!xOrder) {

                    System.out.print("Player 2: ");

                    int b = scan.nextInt();

                    if (game[b - 1].equals(" ")) {

                        game[b - 1] = "O";

                        System.out.printf("| %s | %s | %s |\n| %s | %s | %s |\n| %s | %s | %s |\n", game[0], game[1], game[2], game[3], game[4], game[5], game[6], game[7], game[8]);

                        xOrder = true;
                    }
                    else {
                        System.out.println("You can only draw to empty place. Try again!");
                    }

                    if ((game[0] == second && game[1] == second && game[2] == second) ||
                            (game[3] == second && game[4] == second && game[5] == second) ||
                            (game[6] == second && game[7] == second && game[8] == second) ||
                            (game[0] == second && game[3] == second && game[6] == second) ||
                            (game[1] == second && game[4] == second && game[7] == second) ||
                            (game[2] == second && game[5] == second && game[8] == second) ||
                            (game[0] == second && game[4] == second && game[8] == second) ||
                            (game[2] == second && game[4] == second && game[6] == second)) {

                        System.out.println("\n" + second + " Won!");
                        break gameloop;

                    }
                }
            }

        if (cnt == 5) System.out.println("\nEqual");
    }
}