package example;

import java.util.Scanner;

public class GuessNumberGame {

    public GuessNumberGame(AnswerGenerateImp answerGenerate) {
        this.answer = answerGenerate.generate();
    }

    private String answer;

    public String guess(String guessNumber) {
        int rightNumberAndRightPosition = 0;
        int rightNumberAndWrongPosition = 0;
        if (guessNumber.equals(answer)) {
            return "4A0B";
        } else {
            for (int i = 0; i < answer.length(); i++) {
                if (answer.charAt(i) == guessNumber.charAt(i)) {
                    rightNumberAndRightPosition++;
                } else if (answer.contains(String.valueOf(guessNumber.charAt(i)))) {
                    rightNumberAndWrongPosition++;
                }
            }
        }
        return rightNumberAndRightPosition + "A" + rightNumberAndWrongPosition + "B";
    }

//TODO  赢了直接退出
//    public static void main(String[] args) {
//        AnswerGenerateImp answerGenerate = new AnswerGenerateImp();
//        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerate);
//        int count = 6;
//        while (count>0) {
//            System.out.print("请输入四个数字,还剩" + count + "次机会：");
//            count--;
//            Scanner scanner = new Scanner(System.in);
//            String inputNumber = "";
//            if (scanner.hasNext()) {
//                inputNumber = scanner.next();
//            }
//            if (guessNumberGame.valid(inputNumber)) {
//                System.out.println(guessNumberGame.guess(inputNumber));
//                continue;
//            } else {
//                System.out.println("Wrong Input，Input again");
//                continue;
//            }
//        }
//    }
}
