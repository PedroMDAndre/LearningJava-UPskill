package Chess;

public class Position {
    // Attributes
    private int x;
    private int y;


    // Constructors
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }


    // Methods
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
}
