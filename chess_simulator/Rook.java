package chess_simulator;

public class Rook extends Figure {

    public Rook(int startX, int startY) {
        super("Rook", startX, startY);
    }

    public boolean moveTo(int x, int y) throws InvalidMoveException {
        if (x == this.currentX || y == this.currentY) {
            System.out.println(this.pieceName + " moves to (" + x + ", " + y + ")");
            this.currentX = x;
            this.currentY = y;
            return true;
        } else {
            throw new InvalidMoveException("Invalid move for a Rook!");
        }
    }
}