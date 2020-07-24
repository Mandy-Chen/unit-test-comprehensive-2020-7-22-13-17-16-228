package example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnswerGenerateImp implements AnswerGenerate {
    @Override
    //TODO 测试

    public String generate() {
        String answer = "";
        Random random = new Random();
        List alreadyExists = new ArrayList();
        for (int i = 0; i < alreadyExists.size(); i++) {
            int ranNumber = random.nextInt(10);
            if (alreadyExists.contains(ranNumber)) {
            } else {
                answer += random.nextInt(10);
            }
        }
        System.out.println("答案"+answer);
        return answer;
    }
}
