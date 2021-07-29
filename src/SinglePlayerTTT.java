import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SinglePlayerTTT {

    public static void main(String[] args) {

        System.out.println("Welcome to Tic Tac Toe Game\n");

        System.out.println("The first player is X!\nThe second player is O!\n");

        System.out.println("| 1 | 2 | 3 |\n| 4 | 5 | 6 |\n| 7 | 8 | 9 |\n");

        int a, b;

        String [] game = new String[9];

        Arrays.fill(game, " ");

        Scanner scan = new Scanner(System.in);

        System.out.println("The first X starts to game!\nChoose where you want to draw ");

        Boolean isFull = false;

        Boolean xOrder = true;

        int cnt = 0;

        Random random = new Random();

        gameloop: while(cnt < 5) {

            while(xOrder == true) {

                System.out.print("Player 1: ");

                a = scan.nextInt();

                if (game[a - 1].equals(" ")) {

                    game[a - 1] = "X";

                    System.out.printf("| %s | %s | %s |\n| %s | %s | %s |\n| %s | %s | %s |\n", game[0], game[1], game[2], game[3], game[4], game[5], game[6], game[7], game[8]);

                    xOrder = false;

                }
                else {
                    System.out.println("You can only draw to empty place. Try again!");
                }

                if ((game[0] == "X" && game[1] == "X" && game[2] == "X") ||
                        (game[3] == "X" && game[4] == "X" && game[5] == "X") ||
                        (game[6] == "X" && game[7] == "X" && game[8] == "X") ||
                        (game[0] == "X" && game[3] == "X" && game[6] == "X") ||
                        (game[1] == "X" && game[4] == "X" && game[7] == "X") ||
                        (game[2] == "X" && game[5] == "X" && game[8] == "X") ||
                        (game[0] == "X" && game[4] == "X" && game[8] == "X") ||
                        (game[2] == "X" && game[4] == "X" && game[6] == "X")) {

                    System.out.println("\nFirst Player Won!");
                    break gameloop;
                }
            }

            for (int i = 0; i < game.length; i++) {

                isFull = false;

                if (game[i] == " ") {
                    isFull = true;
                } else
                    isFull = false;
            }

            cnt++;

            if (cnt == 5) {
                break;
            }

            while (xOrder == false) {

                b = random.nextInt(9) + 1;

                System.out.print("Player 2: " + b + "\n");

                if (game[b - 1].equals(" ")) {

                    game[b - 1] = "O";

                    System.out.printf("| %s | %s | %s |\n| %s | %s | %s |\n| %s | %s | %s |\n", game[0], game[1], game[2], game[3], game[4], game[5], game[6], game[7], game[8]);

                    xOrder = true;
                }
                else {
                    System.out.println("You can only draw to empty place. Try again!");
                }

                if ((game[0] == "O" && game[1] == "O" && game[2] == "O") ||
                        (game[3] == "O" && game[4] == "O" && game[5] == "O") ||
                        (game[6] == "O" && game[7] == "O" && game[8] == "O") ||
                        (game[0] == "O" && game[3] == "O" && game[6] == "O") ||
                        (game[1] == "O" && game[4] == "O" && game[7] == "O") ||
                        (game[2] == "O" && game[5] == "O" && game[8] == "O") ||
                        (game[0] == "O" && game[4] == "O" && game[8] == "O") ||
                        (game[2] == "O" && game[4] == "O" && game[6] == "O")) {

                    System.out.println("\nSecond Player Won!");
                    break gameloop;

                }
            }
        }

        if (isFull = true && cnt == 5){
            System.out.println("\nEqual");
        }
    }
}