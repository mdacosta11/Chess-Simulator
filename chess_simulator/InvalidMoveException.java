package chess_simulator;

// thrown when a move is invalid for that piece
public class InvalidMoveException extends Exception {
    public InvalidMoveException(String msg) { 
        super(msg); // comes from each chess piece class
    }
}