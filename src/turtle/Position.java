package turtle;

public class Position {
    private int row;
    private int column;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override public  boolean equals(Object object){
        Position position = (Position) object;
        return position.getColumn() == column && position.getRow() == row;
    }
}
