package Chess;

public class Pawn extends ChessPiece {
    // Attributes

    // Constructors
    public Pawn(int x_pos, int y_pos, boolean white) {
        super(x_pos, y_pos, white);
    }

    // Methods
    public Position[] possibleMoves() {
        int x_pos = getPosition().getX();
        int y_pos = getPosition().getY();

        if (isWhite()) {
            if (y_pos == 2) {
                Position[] result = new Position[2];
                result[0] = new Position(x_pos, y_pos + 1);
                result[1] = new Position(x_pos, y_pos + 2);
                return result;
            } else if (y_pos + 1 <= 8) {
                Position[] result = new Position[1];
                result[0] = new Position(x_pos, y_pos + 1);
                return result;
            } else {
                return new Position[0];
            }
        } else {
            if (y_pos == 7) {
                Position[] result = new Position[2];
                result[0] = new Position(x_pos, y_pos - 1);
                result[1] = new Position(x_pos, y_pos - 2);
                return result;
            } else if (y_pos - 1 >= 1) {
                Position[] result = new Position[1];
                result[0] = new Position(x_pos, y_pos - 1);
                return result;
            } else {
                return new Position[0];
            }
        }
    }

    @Override
    public String toString() {
        //Se quiser, no toString pode traduzir para a notação de coordenadas do xadrez).
        String text = "Pawn (" + color() + ")\n-----------\nPosition: " + getPosition();
        return text;
    }

    @Override
    public String toStringChessNotation() {
        String text = "Pawn (" + color() + ")\n-----------\nPosition: " + columnToChessNotation(getPosition().getX()) + " " + getPosition().getY();
        return text;
    }

}
