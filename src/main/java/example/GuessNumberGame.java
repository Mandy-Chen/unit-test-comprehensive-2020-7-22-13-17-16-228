package example;

public class GuessNumberGame {
    String answer;
    public GuessNumberGame(AnswerGenerate answerGenerate) {
        this.answer=answerGenerate.generate();
    }

    public String guess(String guessNumber) {
        int A=0;
        int B=0;
        if(guessNumber.equals(answer)){
            return "4A0B";
        }else {

            for (int i = 0; i < answer.length(); i++) {
                if(answer.charAt(i)==guessNumber.charAt(i)){
                    A++;
                }else if(answer.indexOf(guessNumber.charAt(i))>0) {
                    B++;
                }
            }
        }
        return A+"A"+B+"B";
    }
}
