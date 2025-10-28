package chess_simulator;

public class Queen extends Rook implements IntBishop {

    public Queen(int startX, int startY) {
        super(startX, startY);
        this.pieceName = "Queen"; // Override the piece name from Rook
    }

    public boolean moveToBishop(int x, int y) throws InvalidMoveException {
        if (Math.abs(x - this.currentX) == Math.abs(y - this.currentY)) {
            return true; // It's a valid diagonal move
        }
        throw new InvalidMoveException("Invalid diagonal move!");
    }

    public boolean moveTo(int x, int y) throws InvalidMoveException {
        try {
            // Try to move like a Rook first
            return super.moveTo(x, y);
        } catch (InvalidMoveException e) {
            // If Rook move fails, try to move like a Bishop
            if (moveToBishop(x, y)) {
                System.out.println(this.pieceName + " moves to (" + x + ", " + y + ")");
                this.currentX = x;
                this.currentY = y;
                return true;
            } else {
                // If neither works, it's an invalid move for the Queen
                throw new InvalidMoveException("Invalid move for a Queen!");
            }
        }
    }
}