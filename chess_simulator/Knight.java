package chess_simulator;

public class Knight extends Figure {

    public Knight(int startX, int startY) {
        super("Knight", startX, startY);
    }

    public boolean moveTo(int x, int y) throws InvalidMoveException {
        int finalX = Math.abs(x - this.currentX);
        int finalY = Math.abs(y - this.currentY);

        if ((finalX == 1 && finalY == 2) || (finalX == 2 && finalY == 1)) {
            System.out.println(this.pieceName + " moves to (" + x + ", " + y + ")");
            this.currentX = x;
            this.currentY = y;
            return true;
        } else {
            throw new InvalidMoveException("Invalid move for a Knight!");
        }
    }
}