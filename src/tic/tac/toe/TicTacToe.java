package tic.tac.toe;

import java.util.*;

public class TicTacToe {

    public static void main(String[] args) {
        // TODO code application logic here
        //char ttt[][] = new char[3][3];
        char hints[][] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        Scanner sc = new Scanner(System.in);
        int place;
        int counter = 1;
        char symbol = 'x';
        while (counter <= 9) {
            //border
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(hints[i][j] + "\t");
                }
                System.out.println();
            }
            if (counter % 2 == 0) {
                symbol = 'o';
            } else {
                symbol = 'x';
            }
            counter++;
            System.out.println("Enter the number of cell you want to fill");
            System.out.print("it's " + symbol + " turn : ");
            place = sc.nextInt();
            switch (place) {
                case 1:
                    hints[0][0] = symbol;
                    Won(hints);
                    switch (Won(hints)) {
                        case 'x':
                            System.out.println("X is won");
                            counter = 10;
                            break;
                        case 'o':
                            System.out.println("O is won");
                            counter = 10;
                            break;
                        default:
                            break;
                    }
                    break;

                case 2:
                    hints[0][1] = symbol;
                    Won(hints);
                    switch (Won(hints)) {
                        case 'x':
                            System.out.println("X is won");
                            counter = 10;
                            break;
                        case 'o':
                            System.out.println("O is won");
                            counter = 10;
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    hints[0][2] = symbol;
                    Won(hints);
                    switch (Won(hints)) {
                        case 'x':
                            System.out.println("X is won");
                            counter = 10;
                            break;
                        case 'o':
                            System.out.println("O is won");
                            counter = 10;
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    hints[1][0] = symbol;
                    Won(hints);
                    switch (Won(hints)) {
                        case 'x':
                            System.out.println("X is won");
                            counter = 10;
                            break;
                        case 'o':
                            System.out.println("O is won");
                            counter = 10;
                            break;
                        default:
                            break;
                    }
                    break;

                case 5:
                    hints[1][1] = symbol;
                    Won(hints);
                    switch (Won(hints)) {
                        case 'x':
                            System.out.println("X is won");
                            counter = 10;
                            break;
                        case 'o':
                            System.out.println("O is won");
                            counter = 10;
                            break;
                        default:
                            break;
                    }
                    break;
                case 6:
                    hints[1][2] = symbol;
                    Won(hints);
                    switch (Won(hints)) {
                        case 'x':
                            System.out.println("X is won");
                            counter = 10;
                            break;
                        case 'o':
                            System.out.println("O is won");
                            counter = 10;
                            break;
                        default:
                            break;
                    }
                    break;
                case 7:
                    hints[2][0] = symbol;
                    Won(hints);
                    switch (Won(hints)) {
                        case 'x':
                            System.out.println("X is won");
                            counter = 10;
                            break;
                        case 'o':
                            System.out.println("O is won");
                            counter = 10;
                            break;
                        default:
                            break;
                    }
                    break;
                case 8:
                    hints[2][1] = symbol;
                    Won(hints);
                    switch (Won(hints)) {
                        case 'x':
                            System.out.println("X is won");
                            counter = 10;
                            break;
                        case 'o':
                            System.out.println("O is won");
                            counter = 10;
                            break;
                        default:
                            break;
                    }
                    break;
                case 9:
                    hints[2][2] = symbol;
                    Won(hints);
                    switch (Won(hints)) {
                        case 'x':
                            System.out.println("X is won");
                            counter = 10;
                            break;
                        case 'o':
                            System.out.println("O is won");
                            counter = 10;
                            break;
                        default:
                            break;
                    }
                    break;

                default:
                    System.out.println("Wrong cell... try another number");
                    counter--;
                    break;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(hints[i][j] + "\t");
            }
            System.out.println();
        }
    }

    protected static char Won(char arr[][]) {
        //won with rows
        for (int i = 0; i < 3; i++) {
            if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
                return arr[i][0];
            }
        }
        //won with column
        for (int i = 0; i < 3; i++) {
            if (arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i]) {
                return arr[0][i];
            }
        }
        //won with diagonal
        if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
            return arr[0][0];
        }
        if (arr[2][0] == arr[1][1] && arr[1][1] == arr[0][2]) {
            return arr[2][0];
        }
        //No one won 
        return ' ';
    }
}
