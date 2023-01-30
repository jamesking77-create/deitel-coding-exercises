package deitelChapters.chapter8.ticTacToe;

public class TicTacToePlayer {
    private String name;
    private static int currentPlayer;

    private int rowPosition;

    private int columnPosition;
    private String symbol;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentPlayer(int currentPlayer) {
        TicTacToePlayer.currentPlayer = currentPlayer;
    }

    public TicTacToePlayer(String name) {
        this.name = name;
        switch (currentPlayer){
            case 0 -> {
                symbol = TicTacCharacters.X.getSymbol();
            }
            case 1 -> {
                symbol = TicTacCharacters.O.getSymbol();
            }
        }
        adjustCurrentPlayer();
    }

    public static void adjustCurrentPlayer() {
        currentPlayer++;
        if (currentPlayer > 1){
            currentPlayer = 0;
        }
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public static int  getCurrentPlayer(){
        return currentPlayer;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }
}
