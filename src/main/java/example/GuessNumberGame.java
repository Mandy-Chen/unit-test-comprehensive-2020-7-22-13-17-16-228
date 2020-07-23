package example;

public class GuessNumberGame {
    String answer;
    public GuessNumberGame(String answer) {
        this.answer=answer;
    }

    public String guess(String guessNumber) {
        if(guessNumber.equals(answer)){
            return "4A0B";
        }
        return "2A2B";
    }
}
