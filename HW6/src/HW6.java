import java.util.Scanner;
import java.util.InputMismatchException;

public class HW6 {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.startGame();
    }
}

class TicTacToe {
    private char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private Scanner sc = new Scanner(System.in);
    private char currentPlayer = 'X';

    public void startGame() {
        while (true) {
            drawBoard();

            boolean validInput = false;
            while (!validInput) {
                System.out.println("Player " + currentPlayer + ", enter your move (row and column):");
                try {
                    int row = sc.nextInt();
                    int col = sc.nextInt();

                    if (isValidMove(row, col)) {
                        board[row][col] = currentPlayer;
                        validInput = true;
                    } else {
                        System.out.println("This move at (" + row + "," + col + ") is not valid. Try again.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter numbers for row and column.");
                    sc.nextLine(); // Clear the scanner buffer
                }
            }

            if (checkWinner()) {
                System.out.println("Game Over! Player " + currentPlayer + " wins!");
                drawBoard();
                break;
            }

            if (isBoardFull()) {
                System.out.println("It's a tie!");
                drawBoard();
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    // Draws the Tic Tac Toe board
    private void drawBoard() {
        System.out.println("Board");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-+-+-");
        }
    }

    // Checks if a move is valid
    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    // Checks if there's a winner
    private boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return true;
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                return true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return true;
        }
        return false; // No winner yet
    }

    // Checks if the board is full
    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

