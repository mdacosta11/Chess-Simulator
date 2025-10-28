package chess_simulator;

public class Pawn extends Figure {

    public Pawn(int startX, int startY) {
        super("Pawn", startX, startY);
    }
    
    public boolean moveTo(int x, int y) throws InvalidMoveException {
        // A simple pawn moves one step forward (increasing Y)
        if (x == this.currentX && y == this.currentY + 1) {
            System.out.println(this.pieceName + " moves to (" + x + ", " + y + ")");
            this.currentY = y;
            return true;
        } else {
            throw new InvalidMoveException("Invalid move for a Pawn!");
        }
    }
}