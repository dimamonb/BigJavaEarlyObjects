package ch10.pe_13;

import java.util.ArrayList;

public class Grid {
    private int numRows;
    private int numColumns;
    private String[][] desc;
    private ArrayList<Location> locations;

    public Grid(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.locations = new ArrayList<>();
        this.desc = new String[numRows][numColumns];
    }

    public void add(int row, int column, String description) {
        this.desc[row][column] = description;
        this.locations.add(new Location(row, column));
    }

    public String getDescription(int row, int column) {
        return desc[row][column];
    }

    public ArrayList<Location> getDescribedLocations() {
        return locations;
    }

    class Location implements Comparable{
        private int row;
        private int column;
        //private String desctiption;

        public Location(int row, int column/*, String desctiption*/) {
            this.row = row;
            this.column = column;
            //this.desctiption = desctiption;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }
}
