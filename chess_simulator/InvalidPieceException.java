package chess_simulator;

// custom exception for invalid piece names / selection
public class InvalidPieceException extends Exception {
    public InvalidPieceException(String msg) { 
        super(msg); // comes from each chess piece class
    }
}