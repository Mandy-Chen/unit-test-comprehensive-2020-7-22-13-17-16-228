package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnswerGenerateImp implements AnswerGenerate {
    @Override
    public String generate() {
        String answer = "";
        Random random = new Random();
        List alreadyExists = new ArrayList();
        for (int i = 0; i < 4; i++) {
            int ranNumber = random.nextInt(10);
            if (alreadyExists.contains(ranNumber)) {
            } else {
                answer += random.nextInt(10);
            }
        }
        return answer;
    }
}
