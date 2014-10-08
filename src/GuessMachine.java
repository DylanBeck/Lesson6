import TerminalIO.*;
public class GuessMachine {

    private int number;
    private int numGuesses;
    private int guess;

    public GuessMachine() {
        number = (int) (Math.random() * 100) + 1;
        guess = 0;
        numGuesses = 0;
        //to do- add methods
        //giveHint(), setGuess(), getNumGuesses()
    }

    public String giveHint() {
        if (guess > number) {
            return (" Guess Lower");
        } else if (guess < number) {
            return (" Guess Higher");
        } else {
            return ("YOU GOT IT");
        }

    }

    public int getNumGuesses() {
        return numGuesses;
    }
    public boolean setGuess(int g){
        if(g>0 && g<=100){
           guess=g;
           numGuesses+=1;
            return true;
        }
        else  return false;
    }

    
}
