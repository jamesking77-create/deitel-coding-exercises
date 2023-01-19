package deitelChapters.chapter8.ticTacToe;

public enum TicTacCharacters {
    X("X"),
    O("O"),
    EMPTY(" ");

public final String symbol;

    public String getSymbol() {
        return   symbol;
    }

    TicTacCharacters(String symbol) {
        this.symbol = symbol;
    }
}
