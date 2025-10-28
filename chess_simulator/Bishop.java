package chess_simulator;

public class Bishop implements IntBishop {
    private int currentX;
    private int currentY;
    private final String pieceName = "Bishop";

    public Bishop(int startX, int startY) {
        this.currentX = startX;
        this.currentY = startY;
    }

    public boolean moveToBishop(int x, int y) throws InvalidMoveException {
        if (Math.abs(x - this.currentX) == Math.abs(y - this.currentY)) {
            System.out.println(this.pieceName + " moves to (" + x + ", " + y + ")");
            this.currentX = x;
            this.currentY = y;
            return true;
        } else {
            throw new InvalidMoveException("Invalid move for a Bishop!");
        }
    }

    public String toString() {
        return this.pieceName + " at (" + currentX + ", " + currentY + ")";
    }
}