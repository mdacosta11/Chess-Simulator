package chess_simulator;

/*
 * Interface for chessboard verification
 */
public interface IntChessBoard {
    boolean verifyCoordinate(int x, int y) throws InvalidCoordinateException;;
}