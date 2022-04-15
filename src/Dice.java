import java.util.Random;
import java.util.Scanner;

public class Dice {
    static int ran;
    static String emptyDice = " ------ \n" + "|      |\n" + "|      |\n" + " ------";
    static String dice1 = " ------ \n" + "|      |\n" + "| *    |\n" + " ------";
    static String dice2 = " ------ \n" + "|    * |\n" + "| *    |\n" + " ------";
    static String dice3 = " ------ \n" + "| *  * |\n" + "| *    |\n" + " ------";
    static String dice4 = " ------ \n" + "| *  * |\n" + "| *  * |\n" + " ------";
    static String dice5 = " ------ \n" + "| * * *|\n" + "| *  * |\n" + " ------";
    static String dice6 = " ------ \n" + "| * * *|\n" + "| * * *|\n" + " ------";
    static String yourDice = "";
    static String[] animDice = new String[]{" ------ \n" + "| *    |\n" + "|      |\n" + " ------",
            " ------ \n" + "| *  * |\n" + "|      |\n" + " ------", " ------ \n" + "| *  * |\n" + "| *    |\n" + " ------",
            " ------ \n" + "| *  * |\n" + "| *  * |\n" + " ------"};
    public static void diceAnimation() throws InterruptedException {
        while(true){

            for(int i = 0; i < 4; i++) {
                Thread.sleep(500);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println(animDice[i]);
            }
        }
    }

    public static void diceRoll() throws InterruptedException{
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        for(int j=0; j<2; j++){
            for(int i = 0; i < 4; i++) {
                Thread.sleep(250);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println(animDice[i]);
            }
        }
        ran = rand.nextInt(6)+1;

        switch(ran){
            case 1:
                yourDice = dice1;
                break;
            case 2:
                yourDice = dice2;
                break;
            case 3:
                yourDice = dice3;
                break;
            case 4:
                yourDice = dice4;
                break;
            case 5:
                yourDice = dice5;
                break;
            case 6:
                yourDice = dice6;
                break;
        }

        Thread.sleep(250);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(yourDice);
        System.out.println("Wykulałeś "+ran+" !");
        input.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
