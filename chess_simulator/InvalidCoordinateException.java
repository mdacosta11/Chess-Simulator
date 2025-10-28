package chess_simulator;

// thrown when coordinates are outside board
public class InvalidCoordinateException extends Exception {
    public InvalidCoordinateException(String msg) { 
        super(msg); // comes from each chess piece class
    }
}