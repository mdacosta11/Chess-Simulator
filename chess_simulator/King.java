package chess_simulator;

public class King extends Queen {

    public King(int startX, int startY) {
        super(startX, startY);
        this.pieceName = "King"; // Override the piece name
    }

    public boolean moveTo(int x, int y) throws InvalidMoveException {
        int deltaX = Math.abs(x - this.currentX);
        int deltaY = Math.abs(y - this.currentY);

        // Check if the move is only one square away
        if (deltaX <= 1 && deltaY <= 1) {
            // Now, use the parent (Queen's) moveTo to validate direction
            return super.moveTo(x, y);
        } else {
            throw new InvalidMoveException("Invalid move for a King! Can only move one square.");
        }
    }
}