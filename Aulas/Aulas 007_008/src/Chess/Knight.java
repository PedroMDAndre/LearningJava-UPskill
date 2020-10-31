package Chess;

public class Knight extends ChessPiece {
    // Attributes

    // Constructors
    public Knight(int pos_x, int pos_y, boolean white) {
        super(pos_x, pos_y, white);
    }

    // Methods
    public Position[] possibleMoves() {
        // Current Position
        int x_curr = getPosition().getX();
        int y_curr = getPosition().getY();
        Position[] result = new Position[8];
        int nrValidMoves = 0;

        // Moves to test by adding position
        int[] y = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] x = {-1, 2, -2, 2, -2, 2, -1, 1};

        for (int i = 0; i < y.length; i++) {
            if ((y[i] + y_curr > 0 && y[i] + y_curr <= 8) && (x[i] + x_curr > 0 && x[i] + y_curr <= 8)) {
                result[i] = new Position(x[i] + x_curr,  y[i] + y_curr);
                nrValidMoves += 1;
            } else {
                result[i] = new Position(0,0); // 0 marks an invalid position
            }

        }
        result = auxRemoveInvalidPositions(result, nrValidMoves);
        return result;
    }

    private Position[] auxRemoveInvalidPositions(Position[] listMoves, int nrValidMoves) {
        Position[] result = new Position[nrValidMoves];
        int pos_result = 0; // position in the result matrix
        for (int i = 0; i < listMoves.length; i++) {
            if (listMoves[i].getX() != 0) {
                result[pos_result] = listMoves[i];
                pos_result += 1;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        //Se quiser, no toString pode traduzir para a notação de coordenadas do xadrês).
        String text = "Knight (" + color() + ")\n--------------\nPosition (" + getPosition().getX() + ", " + getPosition().getY() + ")";
        return text;
    }

    @Override
    public String toStringChessNotation() {
        String text = "Knight (" + color() +")\n--------------\nPosition: " + columnToChessNotation(getPosition().getX()) + " " + getPosition().getY();
        return text;
    }
}
