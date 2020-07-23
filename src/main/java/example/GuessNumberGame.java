package example;

import java.util.Scanner;

public class GuessNumberGame {

    public GuessNumberGame(AnswerGenerateImp answerGenerate) {
        this.answer = answerGenerate.generate();
    }

    String answer;

    public String guess(String guessNumber) {
        int A = 0;
        int B = 0;
        if (guessNumber.equals(answer)) {
            return "4A0B";
        } else {
            for (int i = 0; i < answer.length(); i++) {
                if (answer.charAt(i) == guessNumber.charAt(i)) {
                    A++;
                } else if (answer.indexOf(guessNumber.charAt(i)) > -1) {
                    B++;
                }
            }
        }
        return A + "A" + B + "B";
    }

    public Boolean valid(String guessNumber) {
        Boolean flag = IsRepeatNumber(guessNumber);
        if (guessNumber.length() != 4) {
            return false;
        } else if (flag) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean IsRepeatNumber(String guessNumber) {
        for (int i = 0; i < guessNumber.length(); i++) {
            for (int j = i + 1; j < guessNumber.length(); j++) {
                if (guessNumber.charAt(i) == guessNumber.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AnswerGenerateImp answerGenerate = new AnswerGenerateImp();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerate);
        int count = 6;
        while (count>0) {
            System.out.print("请输入四个数字,还剩" + count + "次机会：");
            count--;
            Scanner scanner = new Scanner(System.in);
            String inputNumber = "";
            String result = "";
            if (scanner.hasNext()) {
                inputNumber = scanner.next();
            }
            if (guessNumberGame.valid(inputNumber)) {
                result = guessNumberGame.guess(inputNumber);
                System.out.println(result);
                continue;
            } else {
                System.out.println("Wrong Input，Input again");
                continue;
            }
        }
    }
}
