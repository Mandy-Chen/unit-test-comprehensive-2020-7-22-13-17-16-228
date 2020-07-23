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
                }else if(answer.indexOf(guessNumber.charAt(i))>-1) {
                    B++;
                }
            }
        }
        return A+"A"+B+"B";
    }

    public Boolean valid(String guessNumber) {
        Boolean flag=IsRepeatNumber(guessNumber);
        if(guessNumber.length()!=4){
            return false;
        }else if(flag){
            return false;
        }else {
            return true;
        }
    }

    private Boolean IsRepeatNumber(String guessNumber) {
        for (int i = 0; i < guessNumber.length(); i++) {
            for (int j = i + 1; j < guessNumber.length(); j++) {
                if(guessNumber.charAt(i)==guessNumber.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
}
