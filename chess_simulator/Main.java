package chess_simulator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ChessBoard board = new ChessBoard();

        // Piece initialization
        Figure[] pieces = new Figure[5];
        pieces[0] = new Pawn(1, 2);    // a2
        pieces[1] = new Rook(4, 4);    // d4
        pieces[2] = new Knight(3, 1);  // c1
        pieces[3] = new Queen(5, 5);   // e5
        pieces[4] = new King(8, 8);    // h8
        Bishop bishop = new Bishop(6, 1); // f1

        int targetX = 0;
        int targetY = 0;

        while (true) {
            try {
                System.out.print("Enter target coordinate (e.g., a4, g3): ");
                String chessCoord = input.next().toLowerCase(); // Read input and convert to lowercase

                // Validate input format
                if (chessCoord.length() != 2) {
                    System.out.println("Error: Invalid format. Please enter a letter followed by a number (e.g., h8).");
                    continue; // Restart the loop
                }

                char x = chessCoord.charAt(0); // The letter part (file)
                char y = chessCoord.charAt(1); // The number part (rank)

                // Convert character to integer coordinates
                if (x >= 'a' && x <= 'h' && y >= '1' && y <= '8') {
                    targetX = x - 'a' + 1; // 'a' becomes 1, 'b' becomes 2, etc.
                    targetY = Character.getNumericValue(y); // '1' becomes 1, '2' becomes 2, etc.
                } else {
                    System.out.println("Error: Coordinate is outside the board. Use a-h and 1-8.");
                    continue; // Restart the loop
                }

                // Use the ChessBoard object to verify (this is now a bit redundant but good practice)
                board.verifyCoordinate(targetX, targetY);
                break; // Exit loop if input is valid and converted

            } catch (InvalidCoordinateException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred. Please try again.");
                input.next(); // Clear scanner buffer
            }
        }
        
        // Loop through the array of Figures and try to move each one
        for (Figure piece : pieces) {
            System.out.println("Trying to move " + piece.toString() + " to (" + targetX + ", " + targetY + ")");
            try {
                if (piece.moveTo(targetX, targetY)) {
                    System.out.println("  Success! New position: " + piece.toString());
                }
            } catch (InvalidMoveException e) {
                System.out.println("  Failed: " + e.getMessage());
            }
        }

        // Then the bishop
        System.out.println("Trying to move " + bishop.toString() + " to (" + targetX + ", " + targetY + ")");
        try {
            if (bishop.moveToBishop(targetX, targetY)) {
                 System.out.println("  -> Success! New position: " + bishop.toString());
            }
        } catch (InvalidMoveException e) {
            System.out.println("  -> Failed: " + e.getMessage());
        }
        
        input.close();
    }
}