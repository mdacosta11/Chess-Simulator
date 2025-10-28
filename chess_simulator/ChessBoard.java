package chess_simulator;

public class ChessBoard implements IntChessBoard {

    public boolean verifyCoordinate(int x, int y) throws InvalidCoordinateException {
        if (x >= 1 && x <= 8 && y >= 1 && y <= 8) {
            return true;
        } else {
            throw new InvalidCoordinateException("Coordinates (" + x + ", " + y + ") are outside the board!");
        }
    }
}