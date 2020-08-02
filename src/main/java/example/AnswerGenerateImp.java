package example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnswerGenerateImp implements AnswerGenerate {
    @Override
    public String generate() {
        List<String> allNumber = Arrays.asList(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
        String answer = "";
        Collections.shuffle(allNumber);
        for (int i = 0; i < 4; i++) {
            answer += allNumber.get(i);

        }
        return answer;
    }
}
