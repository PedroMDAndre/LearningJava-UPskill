package Chess;

// Bottom Left of the board considered to be position x: 0, y: 0
public abstract class ChessPiece {
    // Attributes
    private Position position;
    private boolean white;
    // Constructors
    public ChessPiece(int pos_x, int pos_y, boolean white) {
        this.position = new Position(pos_x, pos_y); // x: line | y: column
        this.white = white;
    }

    // Methods
    public Position getPosition() {
        return position;
    }

    public boolean isWhite() {
        return white;
    }

    public abstract Position[] possibleMoves();

    @Override
    public abstract String toString();
    public abstract String toStringChessNotation();

    public static String columnToChessNotation(int x) {
        switch (x) {
            case 1:
                return "a";
            case 2:
                return "b";
            case 3:
                return "c";
            case 4:
                return "d";
            case 5:
                return "e";
            case 6:
                return "f";
            case 7:
                return "g";
            case 8:
                return "h";
            default:
                return "";
        }
    }

    public String color() {
        if(isWhite()) {
            return "White";
        }
        return "Black";
    }
}
