package example;

import java.util.Scanner;

public class MainProcess {
    public static void main(String[] args) {
        AnswerGenerateImp answerGenerate = new AnswerGenerateImp();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerate);
        int count = 6;
        Valid valid = new Valid();
        while (count > 0) {
            System.out.print("请输入四个数字,还剩" + count + "次机会：");
            count--;
            Scanner scanner = new Scanner(System.in);
            String inputNumber = "";
            if (scanner.hasNext()) {
                inputNumber = scanner.next();
            }
            if (valid.valid(inputNumber)) {
                String result = guessNumberGame.guess(inputNumber);
                System.out.println(result);
                if (result.equals("4A0B")) {
                    System.out.println("Congratulations on your guess. game over!");
                    break;
                }
            } else {
                System.out.println("Wrong Input，Input again");
            }
            continue;
        }
    }
}
