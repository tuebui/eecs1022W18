package eecs1022.lab3;

/**
 * Created by etjsc on 2/13/18.
 */

public class Player {
    private String name = "";
    private int score = 0;
    private String choicesRound1;
    private String choicesRound2;
    private String choicesRound3;

    public void increaseScore(){
        score++;
    }

    public String getChoicesRound1() {
        return choicesRound1;
    }

    public void setChoicesRound1(String choicesRound1) {
        this.choicesRound1 = choicesRound1;
    }

    public String getChoicesRound2() {
        return choicesRound2;
    }

    public void setChoicesRound2(String choicesRound2) {
        this.choicesRound2 = choicesRound2;
    }

    public String getChoicesRound3() {
        return choicesRound3;
    }

    public void setChoicesRound3(String choicesRound3) {
        this.choicesRound3 = choicesRound3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
