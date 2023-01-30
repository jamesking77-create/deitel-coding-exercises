package deitelChapters.chapter7;

public class Player {
    private String name;
    private final int [] scores;
    private int scoreIndex = 0;
    private int totalShot = 0;
    public Player (String name){
        this.name = name;
        scores = new int[3];
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScores(int index) {
        return scores[index];
    }
    public void setScores(int score) {
        scores[scoreIndex] = score;
        setTotalShot(score);
        scoreIndex++;
    }

    public int getTotalShot() {
        return totalShot;
    }
    public void setTotalShot(int score) {
        totalShot += score;
    }
}
