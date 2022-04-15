import java.util.Scanner;

public class Coordinates {
    public static void boardPrinting() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        String[] p = new String[40];
        String[] r = new String[]{"\u001B[31m" + "@" + "\u001B[0m","\u001B[31m" + "@" + "\u001B[0m","\u001B[31m" + "@" + "\u001B[0m","\u001B[31m" + "@" + "\u001B[0m"};
        String[] y = new String[]{"\u001B[33m" + "@" + "\u001B[0m","\u001B[33m" + "@" + "\u001B[0m","\u001B[33m" + "@" + "\u001B[0m","\u001B[33m" + "@" + "\u001B[0m"};
        String[] b = new String[]{"\u001B[34m" + "@" + "\u001B[0m","\u001B[34m" + "@" + "\u001B[0m","\u001B[34m" + "@" + "\u001B[0m","\u001B[34m" + "@" + "\u001B[0m"};
        String[] g = new String[]{"\u001B[32m" + "@" + "\u001B[0m","\u001B[32m" + "@" + "\u001B[0m","\u001B[32m" + "@" + "\u001B[0m","\u001B[32m" + "@" + "\u001B[0m"};
        for (int i = 0; i < 40; i++)
            p[i] = " ";
        int position = 1;
        int[] pPosition = { 0, 1, 1, 1, 1 };
        p[position] = "+";
        String board = "      -----              ###   ###   ###              -----\n" + "     | " + r[0] + " " + r[1] + " |            # " + p[8] + " # # " + p[9] + " # # " + p[10] + " #            | " + y[0] + " " + y[1] + " |\n" + "     | " + r[2] + " " + r[3] + " |             ###   ###   ###             | " + y[2] + " " + y[3] + " |\n" + "      -----             # " + p[7] + " #       # " + p[11] + " #             -----\n" + "                         ###         ###\n" + "                        # " + p[6] + " #       # " + p[12] + " #\n" + "                         ###         ###\n" + "                        # " + p[5] + " #       # " + p[13] + " #\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ###\n" + "# " + p[0] + " # # " + p[1] + " # # " + p[2] + " # # " + p[3] + " # # " + p[4] + " #       # " + p[14] + " # # " + p[15] + " # # " + p[16] + " # # " + p[17] + " # # " + p[18] + " #\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ###\n" + " ###                                                         ###\n" + "# " + p[39] + " #                                                       # " + p[19] + " #\n" + " ###                                                         ###\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ### \n" + "# " + p[38] + " # # " + p[37] + " # # " + p[36] + " # # " + p[35] + " # # " + p[34] + " #       # " + p[24] + " # # " + p[23] + " # # " + p[22] + " # # " + p[21] + " # # " + p[20] + " #\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ### \n" + "                        # " + p[33] + " #       # " + p[25] + " #\n" + "                         ###         ###\n" + "                        # " + p[32] + " #       # " + p[26] + " #\n" + "                         ###         ###\n" + "      -----             # " + p[31] + " #       # " + p[27] + " #             -----\n" + "     | " + b[0] + " " + b[1] + " |             ###   ###   ###             | " + g[0] + " " + g[1] + " |\n" + "     | " + b[2] + " " + b[3] + " |            # " + p[30] + " # # " + p[29] + " # # " + p[28] + " #            | " + g[2] + " " + g[3] + " |\n" + "      -----              ###   ###   ###              -----\n";
        System.out.println(board);


        while (true) {
            for(int j = 1; j <= Menu.numberOfPlayers; j++) {
                if (pPosition[1] == pPosition[2])
                    p[pPosition[1]] = "+";
                if (pPosition[1] == pPosition[3])
                    p[pPosition[1]] = "+";
                if (pPosition[1] == pPosition[4])
                    p[pPosition[1]] = "+";
                if (pPosition[2] == pPosition[3])
                    p[pPosition[2]] = "+";
                if (pPosition[2] == pPosition[4])
                    p[pPosition[2]] = "+";
                if (pPosition[3] == pPosition[4])
                    p[pPosition[3]] = "+";
                System.out.println("Czas na gracza o imieniu " + Menu.playerNames[j]);
                System.out.print("Żeby rzucić kością naciśnij (r): ");
                String move = input.nextLine();
                if (move.equals("r")) {
                    Dice.diceRoll();
                    System.out.println(board);
                } else {
                    System.out.println("Naciśnij (r)");
                    input.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    j++;
                }
                int animationPosition = pPosition[j];
                pPosition[j] = pPosition[j] + Dice.ran;
                for (int k = 1; k <= Dice.ran; k++) {
                    p[animationPosition] = " ";
                    animationPosition++;
                    if (animationPosition >= 40) {
                        animationPosition -= 40;
                        pPosition[k] = animationPosition;
                    }
                    p[animationPosition] = Menu.player[j];
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    board = "      -----              ###   ###   ###              -----\n" + "     | " + r[0] + " " + r[1] + " |            # " + p[8] + " # # " + p[9] + " # # " + p[10] + " #            | " + y[0] + " " + y[1] + " |\n" + "     | " + r[2] + " " + r[3] + " |             ###   ###   ###             | " + y[2] + " " + y[3] + " |\n" + "      -----             # " + p[7] + " #       # " + p[11] + " #             -----\n" + "                         ###         ###\n" + "                        # " + p[6] + " #       # " + p[12] + " #\n" + "                         ###         ###\n" + "                        # " + p[5] + " #       # " + p[13] + " #\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ###\n" + "# " + p[0] + " # # " + p[1] + " # # " + p[2] + " # # " + p[3] + " # # " + p[4] + " #       # " + p[14] + " # # " + p[15] + " # # " + p[16] + " # # " + p[17] + " # # " + p[18] + " #\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ###\n" + " ###                                                         ###\n" + "# " + p[39] + " #                                                       # " + p[19] + " #\n" + " ###                                                         ###\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ### \n" + "# " + p[38] + " # # " + p[37] + " # # " + p[36] + " # # " + p[35] + " # # " + p[34] + " #       # " + p[24] + " # # " + p[23] + " # # " + p[22] + " # # " + p[21] + " # # " + p[20] + " #\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ### \n" + "                        # " + p[33] + " #       # " + p[25] + " #\n" + "                         ###         ###\n" + "                        # " + p[32] + " #       # " + p[26] + " #\n" + "                         ###         ###\n" + "      -----             # " + p[31] + " #       # " + p[27] + " #             -----\n" + "     | " + b[0] + " " + b[1] + " |             ###   ###   ###             | " + g[0] + " " + g[1] + " |\n" + "     | " + b[2] + " " + b[3] + " |            # " + p[30] + " # # " + p[29] + " # # " + p[28] + " #            | " + g[2] + " " + g[3] + " |\n" + "      -----              ###   ###   ###              -----\n";
                    System.out.println(board);
                }
            }
        }
    }
}
