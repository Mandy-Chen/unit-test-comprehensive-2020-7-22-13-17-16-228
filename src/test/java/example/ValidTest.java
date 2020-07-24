package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class ValidTest {
    @Test
    void should_return_true_when_1234_given_3462() {
        //given
        String validValue = "3462";
        //when
        Valid valid = new Valid();
        Boolean actual = valid.valid(validValue);
        //then
        assertEquals(true, actual);
    }

    @Test
    void should_return_true_when_1234_given_12() {
        //given
        String validValue = "12";
        //when
        Valid valid = new Valid();
        Boolean actual = valid.valid(validValue);
        //then
        assertEquals(false, actual);
    }
    @Test
    void should_return_true_when_1234_given_123456() {
        //given
        String validValue = "123456";
        //when
        Valid valid = new Valid();
        Boolean actual = valid.valid(validValue);
        //then
        assertEquals(false, actual);
    }
//    @Test
//    void should_return_true_when_1234_given_123456() {
//        //given
//        AnswerGenerateImp mockedAnswerGenerate = Mockito.mock(AnswerGenerateImp.class);
//        given(mockedAnswerGenerate.generate()).willReturn("1234");
//        String guessNumber = "123456";
//        //when
//        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
//        Boolean actual = guessNumberGame.valid(guessNumber);
//        //then
//        assertEquals(false, actual);
//    }
//
//    @Test
//    void should_return_true_when_1234_given_1123() {
//        //given
//        AnswerGenerateImp mockedAnswerGenerate = Mockito.mock(AnswerGenerateImp.class);
//        given(mockedAnswerGenerate.generate()).willReturn("1234");
//        String guessNumber = "1123";
//        //when
//        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
//        Boolean actual = guessNumberGame.valid(guessNumber);
//        //then
//        assertEquals(false, actual);
//    }
}
