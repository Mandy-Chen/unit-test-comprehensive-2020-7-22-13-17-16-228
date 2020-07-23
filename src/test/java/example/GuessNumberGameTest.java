package example;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_1234_given_1234() {
        AnswerGenerate mockedAnswerGenerate= Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        //given
        String guessNumber = "1234";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        String actual=guessNumberGame.guess(guessNumber);
        //then
        assertEquals("4A0B", actual);
    }
    @Test
    void should_return_2A2B_when_1234_given_1243(){
        //given
        AnswerGenerate mockedAnswerGenerate= Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        String guessNumber = "1243";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        String actual=guessNumberGame.guess(guessNumber);
        //then
        assertEquals("2A2B", actual);
    }
    @Test
    void should_return_1A1B_when_1234_given_1025(){
        //given
        AnswerGenerate mockedAnswerGenerate= Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        String guessNumber = "1025";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        String actual=guessNumberGame.guess(guessNumber);
        //then
        assertEquals("1A1B", actual);
    }
    @Test
    void should_return_0A4B_when_1234_given_4321(){
        //given
        AnswerGenerate mockedAnswerGenerate= Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        String guessNumber = "4321";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        String actual=guessNumberGame.guess(guessNumber);
        //then
        assertEquals("0A4B", actual);
    }
    @Test
    void should_return_0A2B_when_1234_given_2107(){
        //given
        AnswerGenerate mockedAnswerGenerate= Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        String guessNumber = "2107";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        String actual=guessNumberGame.guess(guessNumber);
        //then
        assertEquals("0A2B", actual);
    }
    @Test
    void should_return_0A0B_when_1234_given_5678(){
        //given
        AnswerGenerate mockedAnswerGenerate= Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        String guessNumber = "5678";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        String actual=guessNumberGame.guess(guessNumber);
        //then
        assertEquals("0A0B", actual);
    }
    @Test
    void should_return_true_when_1234_given_12(){
        //given
        AnswerGenerate mockedAnswerGenerate= Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        String guessNumber = "3462";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        Boolean actual=guessNumberGame.valid(guessNumber);
        //then
        assertEquals(true, actual);
    }

}
