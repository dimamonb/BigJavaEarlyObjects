package ch08;

public class Bug {
    private double distanceFromTerminus;
    private int row;
    private int column;
    private int direction;

    public void move(double distanceMoved){
        distanceFromTerminus += distanceMoved;
    }

    public void moveOneUnit()
    {
        final int NORTH = 0;
        final int EAST = 1;
        final int SOUTH = 2;
        final int WEST = 3;

        if (direction == NORTH) { row--; }
        else if (direction == EAST) { column++; }
        else if (direction == SOUTH) { row++; }
        else if (direction == WEST) { column--; }
    }

    public void turnRight(){
        int DIRECTIONS = 4;

        direction++;
        if (direction == DIRECTIONS) { direction = 0; }
    }

    public int getRow() { return row; }
    public int getColumn() { return column; }
}
