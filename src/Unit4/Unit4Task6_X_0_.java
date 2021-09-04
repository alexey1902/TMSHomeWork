package Unit4;

import java.util.Scanner;

public class Unit4Task6_X_0_ {
    public static void main(String[] args) {

        char[][] XO = new char[3][3];
        boolean isFirstPlayer = true, isWin = false;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < XO.length; i++) {
            for (int j = 0; j < XO.length; j++) {
                XO[i][j] = ' ';
            }
        }

        for (int steps = 0; steps < 10; steps++) {
            for (int i = 0, k = 1; i < XO.length; i++, k += 2) {
                for (int j = 0; j < XO.length; j++) {
                    System.out.print("|");
                    if (XO[i][j] == ' ') {
                        System.out.print(i + j + k);
                    } else {
                        System.out.print(XO[i][j]);
                    }
                }
                System.out.println("|");
            }
            if (steps == 9) {
                System.out.println("Ничья!");
                break;
            }
            if (isWin && isFirstPlayer) {
                System.out.println("Победил второй игрок!");
                break;
            } else if (isWin) {
                System.out.println("Победил первый игрок!");
                break;
            }
            if (isFirstPlayer) {
                System.out.print("Первый игрок ходит - ");
            } else {
                System.out.print("Второй игрок ходит - ");
            }
            while (true) {
                int field = scan.nextInt();
                if (field > 9 || field < 1) {
                    System.out.print("Некорректное число!" + "\n" + "Вводите заново - ");
                    continue;
                }
                int i = field / 3, j;
                if (field % 3 == 0) {
                    i--;
                }
                if (field <= 3) {
                    j = field - 1;
                } else if (field < 7) {
                    j = field - 4;
                } else {
                    j = field - 7;
                }
                if (XO[i][j] == ' ' && isFirstPlayer) {
                    XO[i][j] = 'X';
                } else if (XO[i][j] == ' ') {
                    XO[i][j] = 'O';
                } else {
                    System.out.print("Клетка занята!" + "\n" + "Вводите заново - ");
                    continue;
                }
                break;
            }
            char checkSymbol;
            for (int i = 0; i < XO.length; i++) {
                if (XO[i][0] != ' ' && !isWin) {
                    checkSymbol = XO[i][0];
                    for (int j = 1; j < XO.length; j++) {
                        if (XO[i][j] == checkSymbol) {
                            isWin = true;
                        } else {
                            isWin = false;
                            break;
                        }
                    }
                }
                if (XO[0][i] != ' ' && !isWin) {
                    checkSymbol = XO[0][i];
                    for (int j = 1; j < XO.length; j++) {
                        if (XO[j][i] == checkSymbol) {
                            isWin = true;
                        } else {
                            isWin = false;
                            break;
                        }
                    }
                }
            }
            if (XO[0][0] == XO[1][1] && XO[0][0] == XO[2][2] && XO[0][0] != ' ' ||
                    XO[0][2] == XO[1][1] && XO[0][2] == XO[2][0] && XO[0][2] != ' ') {
                isWin = true;
            }
            isFirstPlayer = !isFirstPlayer;
        }
    }
}

