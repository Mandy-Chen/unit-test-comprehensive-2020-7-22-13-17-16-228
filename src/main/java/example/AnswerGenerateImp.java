package example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AnswerGenerateImp implements AnswerGenerate {
    @Override
    public String generate() {
        Integer[] allNumber={0,1,2,3,4,5,6,7,8,9};
        String answer = "";
        for (int i = 0; i <4; i++) {
            int numberSub=(int)(Math.random()*allNumber.length);
            int randNumber = allNumber[numberSub];
            answer+=randNumber;
            Arrays.asList(allNumber).remove(numberSub);
        }
        System.out.println("答案"+answer);
        return answer;
    }
}
