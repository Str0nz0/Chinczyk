import java.util.Scanner;

public class Menu {
    public static char[] playerChoice = new char[5];
    public static String[] player = new String[5];
    public static String symbol = "";
    public static int numberOfPlayers;
    public static String[] playerNames = new String[5];

    public static void menu()throws InterruptedException{
        Scanner input = new Scanner(System.in);
        //boolean bol = false;

        while(true/*bol == false*/) {
            System.out.println("Witaj w Chińczyku!");
            System.out.println("-----------------------");
            System.out.print("Ile graczy będzie grało? (max 4): ");
            numberOfPlayers = input.nextInt();
            input.nextLine();

            if (numberOfPlayers == 1) {
                System.out.println("Nie możesz grać sam głupolu");
                input.nextLine();
                System.out.print("\033[H\033[2J");
                System.out.flush();
                //bol = false;
                continue;
            }

            else if (numberOfPlayers > 4){
                System.out.println("Chyba przecież napisałem, że nie może być więcej niż 4 graczy");
                input.nextLine();
                System.out.print("\033[H\033[2J");
                System.out.flush();
                continue;
            }

            else if (numberOfPlayers > 1 && numberOfPlayers < 5){
                for (int i=1; i<=numberOfPlayers; i++){
                    System.out.println("Podaj nazwę gracza nr " + i);
                    playerNames[i] = input.nextLine();
                }
            }

            if (numberOfPlayers == 2){
                System.out.println(playerNames[1] + ", wybierz kolor swojego pionka:");
                System.out.println("-----------------------------------------");
                System.out.println("Czerwony (r)");
                System.out.println("Żółty (y)");
                System.out.println("Niebieski (b)");
                System.out.println("Zielony (g)");
                playerChoice[1] = input.next().charAt(0);

                if(playerChoice[1] == 'D'){
                    System.out.println("WELCOME IN THE DEMO MODE!");
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
                    System.out.println();
                    System.out.println("Wybierz kolor swojego pionka:");
                    System.out.println("---------------------------");
                    System.out.println("Czerwony (r)");
                    System.out.println("Żółty (y)");
                    System.out.println("Niebieski (b)");
                    System.out.println("Zielony (g)");
                    char player = input.next().charAt(0);

                    switch(player){
                        case 'r':
                            symbol = "\u001B[31m" + "@" + "\u001B[0m";
                            break;
                        case 'y':
                            symbol = "\u001B[33m" + "@" + "\u001B[0m";
                            break;
                        case 'b':
                            symbol = "\u001B[34m" + "@" + "\u001B[0m";
                            break;
                        case 'g':
                            symbol = "\u001B[32m" + "@" + "\u001B[0m";
                            break;
                        default:
                            System.out.println("Wpisz dobry kolor dziwaku");
                            continue;
                    }

                    PrintingDemo.board_animation_test();
                }

                switch(playerChoice[1]){
                    case 'r':
                        System.out.println(playerNames[2] + ", wybierz kolor swojego pionka:");
                        System.out.println("-----------------------------------------");
                        System.out.println("Żółty (y)");
                        System.out.println("Niebieski (b)");
                        System.out.println("Zielony (g)");
                        playerChoice[2] = input.next().charAt(0);
                        break;
                    case 'y':
                        System.out.println(playerNames[2] + ", wybierz kolor swojego pionka:");
                        System.out.println("-----------------------------------------");
                        System.out.println("Czerwony (r)");
                        System.out.println("Niebieski (b)");
                        System.out.println("Zielony (g)");
                        playerChoice[2] = input.next().charAt(0);
                        break;
                    case 'b':
                        System.out.println(playerNames[2] + ", wybierz kolor swojego pionka:");
                        System.out.println("-----------------------------------------");
                        System.out.println("Czerwony (r)");
                        System.out.println("Żółty (y)");
                        System.out.println("Zielony (g)");
                        playerChoice[2] = input.next().charAt(0);
                        break;
                    case 'g':
                        System.out.println(playerNames[2] + ", wybierz kolor swojego pionka:");
                        System.out.println("-----------------------------------------");
                        System.out.println("Czerwony (r)");
                        System.out.println("Żółty (y)");
                        System.out.println("Niebieski (b)");
                        playerChoice[2] = input.next().charAt(0);
                        break;
                    default:
                        System.out.println("Wpisz dobry kolor dziwaku");
                        break;
                }
                break;
            }

            if (numberOfPlayers == 3){
                System.out.println(playerNames[1] + ", wybierz kolor swojego pionka:");
                System.out.println("-----------------------------------------");
                System.out.println("Czerwony (r)");
                System.out.println("Żółty (y)");
                System.out.println("Niebieski (b)");
                System.out.println("Zielony (g)");
                playerChoice[1] = input.next().charAt(0);

                if(playerChoice[1] == 'D'){
                    System.out.println("WELCOME IN THE DEMO MODE!");
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
                    System.out.println();
                    System.out.println("Wybierz kolor swojego pionka:");
                    System.out.println("---------------------------");
                    System.out.println("Czerwony (r)");
                    System.out.println("Żółty (y)");
                    System.out.println("Niebieski (b)");
                    System.out.println("Zielony (g)");
                    char player = input.next().charAt(0);

                    switch(player){
                        case 'r':
                            symbol = "\u001B[31m" + "@" + "\u001B[0m";
                            break;
                        case 'y':
                            symbol = "\u001B[33m" + "@" + "\u001B[0m";
                            break;
                        case 'b':
                            symbol = "\u001B[34m" + "@" + "\u001B[0m";
                            break;
                        case 'g':
                            symbol = "\u001B[32m" + "@" + "\u001B[0m";
                            break;
                        default:
                            System.out.println("Wpisz dobry kolor dziwaku");
                            continue;
                    }

                    PrintingDemo.board_animation_test();
                }

                switch(playerChoice[1]){
                    case 'r':
                        System.out.println(playerNames[2] + ", wybierz kolor swojego pionka:");
                        System.out.println("-----------------------------------------");
                        System.out.println("Żółty (y)");
                        System.out.println("Niebieski (b)");
                        System.out.println("Zielony (g)");
                        playerChoice[2] = input.next().charAt(0);

                        switch(playerChoice[2]){
                            case 'y':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Niebieski (b)");
                                System.out.println("Zielony (g)");
                                playerChoice[3] = input.next().charAt(0);
                                break;
                            case 'b':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Żółty (y)");
                                System.out.println("Zielony (g)");
                                playerChoice[3] = input.next().charAt(0);
                                break;
                            case 'g':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Żółty (y)");
                                System.out.println("Niebieski (b)");
                                playerChoice[3] = input.next().charAt(0);
                                break;
                            default:
                                System.out.println("Wpisz dobry kolor dziwaku");
                                continue;
                        }
                        break;
                    case 'y':
                        System.out.println(playerNames[2] + ", wybierz kolor swojego pionka:");
                        System.out.println("-----------------------------------------");
                        System.out.println("Czerwony (r)");
                        System.out.println("Niebieski (b)");
                        System.out.println("Zielony (g)");
                        playerChoice[2] = input.next().charAt(0);

                        switch(playerChoice[2]){
                            case 'r':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Niebieski (b)");
                                System.out.println("Zielony (g)");
                                playerChoice[3] = input.next().charAt(0);
                                break;
                            case 'b':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Czerwony (r)");
                                System.out.println("Zielony (g)");
                                playerChoice[3] = input.next().charAt(0);
                                break;
                            case 'g':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Czerwony (r)");
                                System.out.println("Niebieski (b)");
                                playerChoice[3] = input.next().charAt(0);
                                break;
                            default:
                                System.out.println("Wpisz dobry kolor dziwaku");
                                continue;
                        }
                        break;
                    case 'b':
                        System.out.println(playerNames[2] + ", wybierz kolor swojego pionka:");
                        System.out.println("-----------------------------------------");
                        System.out.println("Czerwony (r)");
                        System.out.println("Żółty (y)");
                        System.out.println("Zielony (g)");
                        playerChoice[2] = input.next().charAt(0);

                        switch(playerChoice[2]){
                            case 'r':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Żółty (y)");
                                System.out.println("Zielony (g)");
                                playerChoice[3] = input.next().charAt(0);
                                break;
                            case 'y':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Czerwony (r)");
                                System.out.println("Zielony (g)");
                                playerChoice[3] = input.next().charAt(0);
                                break;
                            case 'g':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Czerwony (r)");
                                System.out.println("Żółty (y)");
                                playerChoice[3] = input.next().charAt(0);
                                break;
                            default:
                                System.out.println("Wpisz dobry kolor dziwaku");
                                continue;
                        }
                        break;
                    case 'g':
                        System.out.println(playerNames[2] + ", wybierz kolor swojego pionka:");
                        System.out.println("-----------------------------------------");
                        System.out.println("Czerwony (r)");
                        System.out.println("Żółty (y)");
                        System.out.println("Niebieski (b)");
                        playerChoice[2] = input.next().charAt(0);

                        switch(playerChoice[2]){
                            case 'r':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Żółty (y)");
                                System.out.println("Niebieski (b)");
                                playerChoice[3] = input.next().charAt(0);
                                break;
                            case 'y':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Czerwony (r)");
                                System.out.println("Niebieski (b)");
                                playerChoice[3] = input.next().charAt(0);
                                break;
                            case 'b':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Czerwony (r)");
                                System.out.println("Żółty (y)");
                                playerChoice[3] = input.next().charAt(0);
                                break;
                            default:
                                System.out.println("Wpisz dobry kolor dziwaku");
                                continue;
                        }
                        break;
                    default:
                        System.out.println("Wpisz dobry kolor dziwaku");
                        break;
                }
                break;
            }

            if (numberOfPlayers == 4){
                System.out.println(playerNames[1] + ", wybierz kolor swojego pionka:");
                System.out.println("-----------------------------------------");
                System.out.println("Czerwony (r)");
                System.out.println("Żółty (y)");
                System.out.println("Niebieski (b)");
                System.out.println("Zielony (g)");
                playerChoice[1] = input.next().charAt(0);

                if(playerChoice[1] == 'D'){
                    System.out.println("WELCOME IN THE DEMO MODE!");
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
                    System.out.println();
                    System.out.println("Wybierz kolor swojego pionka:");
                    System.out.println("---------------------------");
                    System.out.println("Czerwony (r)");
                    System.out.println("Żółty (y)");
                    System.out.println("Niebieski (b)");
                    System.out.println("Zielony (g)");
                    char player = input.next().charAt(0);

                    switch(player){
                        case 'r':
                            symbol = "\u001B[31m" + "@" + "\u001B[0m";
                            break;
                        case 'y':
                            symbol = "\u001B[33m" + "@" + "\u001B[0m";
                            break;
                        case 'b':
                            symbol = "\u001B[34m" + "@" + "\u001B[0m";
                            break;
                        case 'g':
                            symbol = "\u001B[32m" + "@" + "\u001B[0m";
                            break;
                        default:
                            System.out.println("Wpisz dobry kolor dziwaku");
                            continue;
                    }

                    PrintingDemo.board_animation_test();
                }

                switch(playerChoice[1]){
                    case 'r':
                        System.out.println(playerNames[2] + ", wybierz kolor swojego pionka:");
                        System.out.println("-----------------------------------------");
                        System.out.println("Żółty (y)");
                        System.out.println("Niebieski (b)");
                        System.out.println("Zielony (g)");
                        playerChoice[2] = input.next().charAt(0);

                        switch(playerChoice[2]){
                            case 'y':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Niebieski (b)");
                                System.out.println("Zielony (g)");
                                playerChoice[3] = input.next().charAt(0);

                                switch(playerChoice[3]){
                                    case 'b' -> playerChoice[4] = 'g';
                                    case 'g' -> playerChoice[4] = 'b';
                                }
                                break;
                            case 'b':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Żółty (y)");
                                System.out.println("Zielony (g)");
                                playerChoice[3] = input.next().charAt(0);

                                switch(playerChoice[3]){
                                    case 'y' -> playerChoice[4] = 'g';
                                    case 'g' -> playerChoice[4] = 'y';
                                }
                                break;
                            case 'g':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Żółty (y)");
                                System.out.println("Niebieski (b)");
                                playerChoice[3] = input.next().charAt(0);

                                switch(playerChoice[3]){
                                    case 'y' -> playerChoice[4] = 'b';
                                    case 'b' -> playerChoice[4] = 'y';
                                }
                                break;
                            default:
                                System.out.println("Wpisz dobry kolor dziwaku");
                                continue;
                        }
                        break;
                    case 'y':
                        System.out.println(playerNames[2] + ", wybierz kolor swojego pionka:");
                        System.out.println("-----------------------------------------");
                        System.out.println("Czerwony (r)");
                        System.out.println("Niebieski (b)");
                        System.out.println("Zielony (g)");
                        playerChoice[2] = input.next().charAt(0);

                        switch(playerChoice[2]){
                            case 'r':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Niebieski (b)");
                                System.out.println("Zielony (g)");
                                playerChoice[3] = input.next().charAt(0);

                                switch(playerChoice[3]){
                                    case 'b' -> playerChoice[4] = 'g';
                                    case 'g' -> playerChoice[4] = 'b';
                                }
                                break;
                            case 'b':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Czerwony (r)");
                                System.out.println("Zielony (g)");
                                playerChoice[3] = input.next().charAt(0);

                                switch(playerChoice[3]){
                                    case 'r' -> playerChoice[4] = 'g';
                                    case 'g' -> playerChoice[4] = 'r';
                                }
                                break;
                            case 'g':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Czerwony (r)");
                                System.out.println("Niebieski (b)");
                                playerChoice[3] = input.next().charAt(0);

                                switch(playerChoice[3]){
                                    case 'r' -> playerChoice[4] = 'b';
                                    case 'b' -> playerChoice[4] = 'r';
                                }
                                break;
                            default:
                                System.out.println("Wpisz dobry kolor dziwaku");
                                continue;
                        }
                        break;
                    case 'b':
                        System.out.println(playerNames[2] + ", wybierz kolor swojego pionka:");
                        System.out.println("-----------------------------------------");
                        System.out.println("Czerwony (r)");
                        System.out.println("Żółty (y)");
                        System.out.println("Zielony (g)");
                        playerChoice[2] = input.next().charAt(0);

                        switch(playerChoice[2]){
                            case 'r':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Żółty (y)");
                                System.out.println("Zielony (g)");
                                playerChoice[3] = input.next().charAt(0);

                                switch(playerChoice[3]){
                                    case 'y' -> playerChoice[4] = 'g';
                                    case 'g' -> playerChoice[4] = 'y';
                                }
                                break;
                            case 'y':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Czerwony (r)");
                                System.out.println("Zielony (g)");
                                playerChoice[3] = input.next().charAt(0);

                                switch(playerChoice[3]){
                                    case 'r' -> playerChoice[4] = 'g';
                                    case 'g' -> playerChoice[4] = 'r';
                                }
                                break;
                            case 'g':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Czerwony (r)");
                                System.out.println("Żółty (y)");
                                playerChoice[3] = input.next().charAt(0);

                                switch(playerChoice[3]){
                                    case 'r' -> playerChoice[4] = 'y';
                                    case 'y' -> playerChoice[4] = 'r';
                                }
                                break;
                            default:
                                System.out.println("Wpisz dobry kolor dziwaku");
                                continue;
                        }
                        break;
                    case 'g':
                        System.out.println(playerNames[2] + ", wybierz kolor swojego pionka:");
                        System.out.println("-----------------------------------------");
                        System.out.println("Czerwony (r)");
                        System.out.println("Żółty (y)");
                        System.out.println("Niebieski (b)");
                        playerChoice[2] = input.next().charAt(0);

                        switch(playerChoice[2]){
                            case 'r':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Żółty (y)");
                                System.out.println("Niebieski (b)");
                                playerChoice[3] = input.next().charAt(0);

                                switch(playerChoice[3]){
                                    case 'y' -> playerChoice[4] = 'b';
                                    case 'b' -> playerChoice[4] = 'y';
                                }
                                break;
                            case 'y':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Czerwony (r)");
                                System.out.println("Niebieski (b)");
                                playerChoice[3] = input.next().charAt(0);

                                switch(playerChoice[3]){
                                    case 'r' -> playerChoice[4] = 'b';
                                    case 'b' -> playerChoice[4] = 'r';
                                }
                                break;
                            case 'b':
                                System.out.println(playerNames[3] + ", wybierz kolor swojego pionka:");
                                System.out.println("-----------------------------------------");
                                System.out.println("Czerwony (r)");
                                System.out.println("Żółty (y)");
                                playerChoice[3] = input.next().charAt(0);

                                switch(playerChoice[3]){
                                    case 'r' -> playerChoice[4] = 'y';
                                    case 'y' -> playerChoice[4] = 'r';
                                }
                                break;
                            default:
                                System.out.println("Wpisz dobry kolor dziwaku");
                                continue;
                        }
                        break;
                    default:
                        System.out.println("Wpisz dobry kolor dziwaku");
                        break;
                }
                break;
            }
        }
    }

    static void colors(){
        switch(Menu.playerChoice[1]){
            case 'r' -> Menu.player[1] = "\u001B[31m" + "@" + "\u001B[0m";
            case 'y' -> Menu.player[1] = "\u001B[33m" + "@" + "\u001B[0m";
            case 'b' -> Menu.player[1] = "\u001B[34m" + "@" + "\u001B[0m";
            case 'g' -> Menu.player[1] = "\u001B[32m" + "@" + "\u001B[0m";
            default -> System.out.println("Wpisz dobry kolor dziwaku");
        }
        switch(Menu.playerChoice[2]){
            case 'r' -> Menu.player[2] = "\u001B[31m" + "@" + "\u001B[0m";
            case 'y' -> Menu.player[2] = "\u001B[33m" + "@" + "\u001B[0m";
            case 'b' -> Menu.player[2] = "\u001B[34m" + "@" + "\u001B[0m";
            case 'g' -> Menu.player[2] = "\u001B[32m" + "@" + "\u001B[0m";
            default -> System.out.println("Wpisz dobry kolor dziwaku");
        }
        switch(Menu.playerChoice[3]){
            case 'r' -> Menu.player[3] = "\u001B[31m" + "@" + "\u001B[0m";
            case 'y' -> Menu.player[3] = "\u001B[33m" + "@" + "\u001B[0m";
            case 'b' -> Menu.player[3] = "\u001B[34m" + "@" + "\u001B[0m";
            case 'g' -> Menu.player[3] = "\u001B[32m" + "@" + "\u001B[0m";
            default -> System.out.println("Wpisz dobry kolor dziwaku");
        }
        switch(Menu.playerChoice[4]){
            case 'r' -> Menu.player[4] = "\u001B[31m" + "@" + "\u001B[0m";
            case 'y' -> Menu.player[4] = "\u001B[33m" + "@" + "\u001B[0m";
            case 'b' -> Menu.player[4] = "\u001B[34m" + "@" + "\u001B[0m";
            case 'g' -> Menu.player[4] = "\u001B[32m" + "@" + "\u001B[0m";
            default -> System.out.println("Wpisz dobry kolor dziwaku");
        }
    }
}
