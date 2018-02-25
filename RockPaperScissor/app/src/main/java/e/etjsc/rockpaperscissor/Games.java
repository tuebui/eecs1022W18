package e.etjsc.rockpaperscissor;

/**
 * Created by etjsc on 2/10/18.
 */

public class Games {
    private Player player1;
    private Player player2;
    private Player winnerRound1;
    private Player winnerRound2;
    private Player winnerRound3;
    public Games(){
        player1 = new Player();
        player2 = new Player();
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public void resetGame(){
        winnerRound1 = null;
        winnerRound2 = null;
        winnerRound3 = null;
        player1.setScore(0);
        player2.setScore(0);
    }

    public void finishRound1(){
        if(player1.getChoicesRound1().equals("Paper")){
            if(player2.getChoicesRound1().equals("Paper")){
                winnerRound1 = null;
            } else if (player2.getChoicesRound1().equals("Rock")){
                winnerRound1 = player1;
            } else if (player2.getChoicesRound1().equals("Scissor")){
                winnerRound1 = player2;
            }
        } else if (player1.getChoicesRound1().equals("Rock")){
            if(player2.getChoicesRound1().equals("Paper")){
                winnerRound1 = player2;
            } else if (player2.getChoicesRound1().equals("Scissor")){
                winnerRound1 = player1;
            } else if (player2.getChoicesRound1().equals("Rock")){
                winnerRound1 = null;
            }
        } else if (player1.getChoicesRound1().equals("Scissor")){
            if(player2.getChoicesRound1().equals("Paper")){
                winnerRound1 = player1;
            } else if (player2.getChoicesRound1().equals("Rock")){
                winnerRound1 = player2;
            } else if (player2.getChoicesRound1().equals("Scissor")){
                winnerRound1 = null;
            }
        }
    }

    public void finishRound2(){
        if(player1.getChoicesRound2().equals("Paper")){
            if(player2.getChoicesRound2().equals("Paper")){
                winnerRound2 = null;
            } else if (player2.getChoicesRound2().equals("Rock")){
                winnerRound2 = player1;
            } else if (player2.getChoicesRound2().equals("Scissor")){
                winnerRound2 = player2;
            }
        } else if (player1.getChoicesRound2().equals("Rock")){
            if(player2.getChoicesRound2().equals("Paper")){
                winnerRound2 = player2;
            } else if (player2.getChoicesRound2().equals("Scissor")){
                winnerRound2 = player1;
            } else if (player2.getChoicesRound2().equals("Rock")){
                winnerRound2 = null;
            }
        } else if (player1.getChoicesRound2().equals("Scissor")){
            if(player2.getChoicesRound2().equals("Paper")){
                winnerRound2 = player1;
            } else if (player2.getChoicesRound2().equals("Rock")){
                winnerRound2 = player2;
            } else if (player2.getChoicesRound2().equals("Scissor")){
                winnerRound2 = null;
            }
        }
    }

    public void finishRound3(){
        if(player1.getChoicesRound3().equals("Paper")){
            if(player2.getChoicesRound3().equals("Paper")){
                winnerRound3 = null;
            } else if (player2.getChoicesRound3().equals("Rock")){
                winnerRound3 = player1;
            } else if (player2.getChoicesRound3().equals("Scissor")){
                winnerRound3 = player2;
            }
        } else if (player1.getChoicesRound3().equals("Rock")){
            if(player2.getChoicesRound3().equals("Paper")){
                winnerRound3 = player2;
            } else if (player2.getChoicesRound3().equals("Scissor")){
                winnerRound3 = player1;
            } else if (player2.getChoicesRound3().equals("Rock")){
                winnerRound3 = null;
            }
        } else if (player1.getChoicesRound3().equals("Scissor")){
            if(player2.getChoicesRound3().equals("Paper")){
                winnerRound3 = player1;
            } else if (player2.getChoicesRound3().equals("Rock")){
                winnerRound3 = player2;
            } else if (player2.getChoicesRound3().equals("Scissor")){
                winnerRound3 = null;
            }
        }
    }

    @Override
    public String toString() {
        String matchend = "";
        player1.setScore(0);
        player2.setScore(0);
        /*if(winnerRound1!=null){
            winnerRound1.increaseScore();

        } else {
            matchend = "Round 1 Finished: there is a tie between: "+getPlayer1().getName() + "and" +getPlayer2().getName();
        }
        if(winnerRound2!=null){
            winnerRound2.increaseScore();
        } else {
            matchend = "Round 2 Finished: there is a tie between: "+getPlayer1().getName() + "and" + getPlayer2().getName();
        }
        if(winnerRound3!=null){
            winnerRound3.increaseScore();
        } else {
            matchend = "Round 3 Finished: there is a tie between: "+getPlayer1().getName() + "and" + getPlayer2().getName();
        }*/
        if(winnerRound1!=null){
            winnerRound1.increaseScore();
        }
        if (player1.getScore()==1){
            if(player2.getScore()==0){
                matchend = "Round 1 Finished: the winner is: " + getPlayer1().getName();
            }
        } else if (player2.getScore()==1){
            if(player1.getScore()==0){
                matchend = "Round 1 Finished: the winner is: " + getPlayer2().getName();
            }
        }
        if(winnerRound2!=null){
            winnerRound2.increaseScore();
        }
        if(player1.getScore()==2){
            if(player2.getScore()==0){
                matchend = "Round 2 Finished: the winner is: " + getPlayer1().getName();
            }
        } else if (player1.getScore() ==1){
            if(player2.getScore()==1){
                matchend = "Round 2 Finished: Tie between: " + getPlayer1().getName() + "and" + getPlayer2().getName();
            }
        } else if (player2.getScore()==2){
            if(player1.getScore() == 0){
                matchend = "Round 2 Finished: the winner is:  " + getPlayer2().getName();
            }
        }
        if (winnerRound3!=null){
            winnerRound3.increaseScore();
        }
        if(player1.getScore()==1){
            if(player2.getScore()==2){
                matchend = "Round 3 Finished: the winner is: " + getPlayer2().getName();
            }
        } else if (player1.getScore()==2){
            if(player2.getScore()==1){
                matchend = "Round 3 Finished: the winner is: " + getPlayer1().getName();
            }
        }
        /*if(player1.getScore()>player2.getScore()){
            matchend = "the winner is: " + getPlayer1().getName();
        } else if (player1.getScore()<player2.getScore()){
            matchend = "the winner is: " + getPlayer2().getName();
        }*/
        return matchend;
    }
    public boolean gameIsEnded(){
        return player1.getScore()==2 || player2.getScore()==2;
    }
}
