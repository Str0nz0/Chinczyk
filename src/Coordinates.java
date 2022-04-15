import java.util.Scanner;

public class Coordinates {
    static String[] p = new String[40]; //p = position, shorter version's easier to read in String syntax
    static String[] r = new String[]{"\u001B[31m" + "@" + "\u001B[0m","\u001B[31m" + "@" + "\u001B[0m","\u001B[31m" + "@" + "\u001B[0m","\u001B[31m" + "@" + "\u001B[0m"};
    static String[] y = new String[]{"\u001B[33m" + "@" + "\u001B[0m","\u001B[33m" + "@" + "\u001B[0m","\u001B[33m" + "@" + "\u001B[0m","\u001B[33m" + "@" + "\u001B[0m"};
    static String[] b = new String[]{"\u001B[34m" + "@" + "\u001B[0m","\u001B[34m" + "@" + "\u001B[0m","\u001B[34m" + "@" + "\u001B[0m","\u001B[34m" + "@" + "\u001B[0m"};
    static String[] g = new String[]{"\u001B[32m" + "@" + "\u001B[0m","\u001B[32m" + "@" + "\u001B[0m","\u001B[32m" + "@" + "\u001B[0m","\u001B[32m" + "@" + "\u001B[0m"};
    static String board = "      -----              ###   ###   ###              -----\n" + "     | " + r[0] + " " + r[1] + " |            # " + p[8] + " # # " + p[9] + " # # " + p[10] + " #            | " + y[0] + " " + y[1] + " |\n" + "     | " + r[2] + " " + r[3] + " |             ###   ###   ###             | " + y[2] + " " + y[3] + " |\n" + "      -----             # " + p[7] + " #       # " + p[11] + " #             -----\n" + "                         ###         ###\n" + "                        # " + p[6] + " #       # " + p[12] + " #\n" + "                         ###         ###\n" + "                        # " + p[5] + " #       # " + p[13] + " #\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ###\n" + "# " + p[0] + " # # " + p[1] + " # # " + p[2] + " # # " + p[3] + " # # " + p[4] + " #       # " + p[14] + " # # " + p[15] + " # # " + p[16] + " # # " + p[17] + " # # " + p[18] + " #\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ###\n" + " ###                                                         ###\n" + "# " + p[39] + " #                                                       # " + p[19] + " #\n" + " ###                                                         ###\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ### \n" + "# " + p[38] + " # # " + p[37] + " # # " + p[36] + " # # " + p[35] + " # # " + p[34] + " #       # " + p[24] + " # # " + p[23] + " # # " + p[22] + " # # " + p[21] + " # # " + p[20] + " #\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ### \n" + "                        # " + p[33] + " #       # " + p[25] + " #\n" + "                         ###         ###\n" + "                        # " + p[32] + " #       # " + p[26] + " #\n" + "                         ###         ###\n" + "      -----             # " + p[31] + " #       # " + p[27] + " #             -----\n" + "     | " + b[0] + " " + b[1] + " |             ###   ###   ###             | " + g[0] + " " + g[1] + " |\n" + "     | " + b[2] + " " + b[3] + " |            # " + p[30] + " # # " + p[29] + " # # " + p[28] + " #            | " + g[2] + " " + g[3] + " |\n" + "      -----              ###   ###   ###              -----\n";
    static int animationPosition;
    static int[] pPosition = new int[5];
    static int i2;

    public static void boardPrinting() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<40; i++){
            p[i]= " ";
        }
        boolean[] isPlayerOut = new boolean[]{false, false, false, false, false};
        String move;


        while(true){
            for(int i=1; i<=Menu.numberOfPlayers; i++){
                i2 = i;
                if (isPlayerOut[1] && pPosition[1] == pPosition[2]) {
                    p[pPosition[1]] = "+";
                }
                if (pPosition[1] == pPosition[3]) {
                    p[pPosition[1]] = "+";
                }
                if (pPosition[1] == pPosition[4]) {
                    p[pPosition[1]] = "+";
                }
                if (pPosition[2] == pPosition[3]) {
                    p[pPosition[2]] = "+";
                }
                if (pPosition[2] == pPosition[4]) {
                    p[pPosition[2]] = "+";
                }
                if (pPosition[3] == pPosition[4]) {
                    p[pPosition[3]] = "+";
                }

                System.out.println(board);
                System.out.println("Czas na gracza o imieniu "+Menu.playerNames[i]);
                System.out.print("Żeby rzucić kością naciśnij (r): ");
                move = input.next();
                if (move.equals("r")) {
                    Dice.diceRoll();
                } else {
                    System.out.println("Naciśnij (r)");
                    input.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    continue;
                }

                if(Dice.ran == 6 || Dice.ran == 1){
                    isPlayerOut[i] = true;
                }

                if(isPlayerOut[i]) {
                    animationPosition = pPosition[i];
                    pPosition[i] += Dice.ran;
                    System.out.println(board);
                    switch (Menu.playerChoice[i]) {
                        case 'r' -> pPosition[i] = 1;
                        case 'y' -> pPosition[i] = 11;
                        case 'b' -> pPosition[i] = 31;
                        case 'g' -> pPosition[i] = 21;
                    }


                    switch (i) {
                        case 1 -> {
                            p[pPosition[2]] = Menu.player[2];
                            p[pPosition[3]] = Menu.player[3];
                            p[pPosition[4]] = Menu.player[4];
                        }
                        case 2 -> {
                            p[pPosition[1]] = Menu.player[1];
                            p[pPosition[3]] = Menu.player[3];
                            p[pPosition[4]] = Menu.player[4];
                        }
                        case 3 -> {
                            p[pPosition[1]] = Menu.player[1];
                            p[pPosition[2]] = Menu.player[2];
                            p[pPosition[4]] = Menu.player[4];
                        }
                        case 4 -> {
                            p[pPosition[1]] = Menu.player[1];
                            p[pPosition[2]] = Menu.player[2];
                            p[pPosition[3]] = Menu.player[3];
                        }
                    }

                    boardAnimation(p);
                }

                else{
                    System.out.println("Stoisz koleżko");
                    input.nextLine();
                    input.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
            }
        }
    }

    public static void boardAnimation(String[] p) throws InterruptedException {
        for(int i=0; i<40; i++){
            p[i]= " ";
        }
        for (int j = 1; j <= Dice.ran; j++) {
            //animacja na ruch

            switch (i2) {
                case 1 -> {
                    p[pPosition[2]] = Menu.player[2];
                    p[pPosition[3]] = Menu.player[3];
                    p[pPosition[4]] = Menu.player[4];
                }
                case 2 -> {
                    p[pPosition[1]] = Menu.player[1];
                    p[pPosition[3]] = Menu.player[3];
                    p[pPosition[4]] = Menu.player[4];
                }
                case 3 -> {
                    p[pPosition[1]] = Menu.player[1];
                    p[pPosition[2]] = Menu.player[2];
                    p[pPosition[4]] = Menu.player[4];
                }
                case 4 -> {
                    p[pPosition[1]] = Menu.player[1];
                    p[pPosition[2]] = Menu.player[2];
                    p[pPosition[3]] = Menu.player[3];
                }
            }

            p[animationPosition] = " ";
            animationPosition += 1;
            if (animationPosition >= 40) {
                animationPosition -= 40;
                pPosition[j] = animationPosition;
            }
            p[animationPosition] = Menu.player[i2];
            if (pPosition[1] == pPosition[2] /*|| pPosition[1] == animationPosition && i != 1*/) {
                p[pPosition[1]] = "+";
            }
            if (pPosition[1] == pPosition[3] /*|| pPosition[1] == animationPosition && i != 1*/) {
                p[pPosition[1]] = "+";
            }
            if (pPosition[1] == pPosition[4] /*|| pPosition[1] == animationPosition && i != 1*/) {
                p[pPosition[1]] = "+";
            }
            if (pPosition[2] == pPosition[3] /*|| pPosition[2] == animationPosition && i != 2*/) {
                p[pPosition[2]] = "+";
            }
            if (pPosition[2] == pPosition[4] /*|| pPosition[2] == animationPosition && i != 2*/) {
                p[pPosition[2]] = "+";
            }
            if (pPosition[3] == pPosition[4] /*|| pPosition[3] == animationPosition && i != 3*/) {
                p[pPosition[3]] = "+";
            }
                        /*if (pPosition[4] == animationPosition && i != 4) {
                            p[pPosition[4]] = "+";
                        }*/

            Thread.sleep(500);
            System.out.print("\033[H\033[2J");
            System.out.flush();
                    /*p[pPosition[1]] = Menu.player[1];
                    p[pPosition[1]] = Menu.player[1];
                    p[pPosition[1]] = Menu.player[1];
                    p[pPosition[1]] = Menu.player[1];*/
            board = "      -----              ###   ###   ###              -----\n" + "     | " + r[0] + " " + r[1] + " |            # " + p[8] + " # # " + p[9] + " # # " + p[10] + " #            | " + y[0] + " " + y[1] + " |\n" + "     | " + r[2] + " " + r[3] + " |             ###   ###   ###             | " + y[2] + " " + y[3] + " |\n" + "      -----             # " + p[7] + " #       # " + p[11] + " #             -----\n" + "                         ###         ###\n" + "                        # " + p[6] + " #       # " + p[12] + " #\n" + "                         ###         ###\n" + "                        # " + p[5] + " #       # " + p[13] + " #\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ###\n" + "# " + p[0] + " # # " + p[1] + " # # " + p[2] + " # # " + p[3] + " # # " + p[4] + " #       # " + p[14] + " # # " + p[15] + " # # " + p[16] + " # # " + p[17] + " # # " + p[18] + " #\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ###\n" + " ###                                                         ###\n" + "# " + p[39] + " #                                                       # " + p[19] + " #\n" + " ###                                                         ###\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ### \n" + "# " + p[38] + " # # " + p[37] + " # # " + p[36] + " # # " + p[35] + " # # " + p[34] + " #       # " + p[24] + " # # " + p[23] + " # # " + p[22] + " # # " + p[21] + " # # " + p[20] + " #\n" + " ###   ###   ###   ###   ###         ###   ###   ###   ###   ### \n" + "                        # " + p[33] + " #       # " + p[25] + " #\n" + "                         ###         ###\n" + "                        # " + p[32] + " #       # " + p[26] + " #\n" + "                         ###         ###\n" + "      -----             # " + p[31] + " #       # " + p[27] + " #             -----\n" + "     | " + b[0] + " " + b[1] + " |             ###   ###   ###             | " + g[0] + " " + g[1] + " |\n" + "     | " + b[2] + " " + b[3] + " |            # " + p[30] + " # # " + p[29] + " # # " + p[28] + " #            | " + g[2] + " " + g[3] + " |\n" + "      -----              ###   ###   ###              -----\n";
            System.out.println(board);
        }
    }
}
