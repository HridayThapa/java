package com.wipro.java.usecase3;
import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        int moves = 0;

        while (moves < 9) {
            printBoard();
            System.out.print("Player " + currentPlayer + ", enter your move (1-9): ");
            int move = scanner.nextInt();

            if (!isValidMove(move)) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            makeMove(move);
            moves++;

            if (checkWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins! ");
                gameWon = true;
                break;
            }

            // Switch player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        if (!gameWon) {
            printBoard();
            System.out.println("It's a draw! ");
        }

        scanner.close();
    }

    private static void printBoard() {
        System.out.println("\n");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print("| " + cell + " ");
            }
            System.out.println("|");
        }
        System.out.println();
    }

    private static boolean isValidMove(int move) {
        if (move < 1 || move > 9) return false;

        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        return board[row][col] != 'X' && board[row][col] != 'O';
    }

    private static void makeMove(int move) {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        board[row][col] = currentPlayer;
    }

    private static boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) return true;
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) return true;
        }
        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) return true;
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) return true;

        return false;
    }
}
