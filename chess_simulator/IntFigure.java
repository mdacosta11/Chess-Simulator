package chess_simulator;

/*
 * Interface for chess figures
 */
public interface IntFigure {
    // moveTo uses integer coordinates (1..8 for both X and Y)
    boolean moveTo(int x, int y) throws InvalidMoveException;
}