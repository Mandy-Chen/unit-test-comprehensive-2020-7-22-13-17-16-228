package example;

public class GuessNumberGame {

    public GuessNumberGame(AnswerGenerateImp answerGenerate) {
        this.answer = answerGenerate.generate();
    }

    private String answer;

    public String guess(String guessNumber) {
        int rightNumberAndRightPosition = 0;
        int rightNumberAndWrongPosition = 0;

        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == guessNumber.charAt(i)) {
                rightNumberAndRightPosition++;
            } else if (answer.contains(String.valueOf(guessNumber.charAt(i)))) {
                rightNumberAndWrongPosition++;
            }
        }
        return rightNumberAndRightPosition + "A" + rightNumberAndWrongPosition + "B";
    }

}
