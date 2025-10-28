package chess_simulator;
public abstract class Figure implements IntFigure {
    protected int currentX;
    protected int currentY;
    protected String pieceName;

    public Figure(String pieceName, int startX, int startY) {
        this.pieceName = pieceName;
        this.currentX = startX;
        this.currentY = startY;
    }

    public int getCurrentX() {
        return currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public String toString() {
        return this.pieceName + " at (" + currentX + ", " + currentY + ")";
    }
}