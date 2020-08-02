package example;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GuessNumberGameTest {

    @Test
    void should_return_4A0B_when_1234_given_1234() {
        AnswerGenerateImp mockedAnswerGenerate = getAnswerGenerateImp();
        //given
        String guessNumber = "1234";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        String actual = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("4A0B", actual);
    }

    private AnswerGenerateImp getAnswerGenerateImp() {
        AnswerGenerateImp mockedAnswerGenerate = Mockito.mock(AnswerGenerateImp.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        return mockedAnswerGenerate;
    }

    @Test
    void should_return_2A2B_when_1234_given_1243() {
        //given
        AnswerGenerateImp mockedAnswerGenerate = getAnswerGenerateImp();
        String guessNumber = "1243";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        String actual = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("2A2B", actual);
    }

    @Test
    void should_return_1A1B_when_1234_given_1025() {
        //given
        AnswerGenerateImp mockedAnswerGenerate = getAnswerGenerateImp();
        String guessNumber = "1025";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        String actual = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("1A1B", actual);
    }

    @Test
    void should_return_0A4B_when_1234_given_4321() {
        //given
        AnswerGenerateImp mockedAnswerGenerate = getAnswerGenerateImp();
        String guessNumber = "4321";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        String actual = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("0A4B", actual);
    }

    @Test
    void should_return_0A2B_when_1234_given_2107() {
        //given
        AnswerGenerateImp mockedAnswerGenerate = getAnswerGenerateImp();
        String guessNumber = "2107";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        String actual = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("0A2B", actual);
    }

    @Test
    void should_return_0A0B_when_1234_given_5678() {
        //given
        AnswerGenerateImp mockedAnswerGenerate = getAnswerGenerateImp();
        String guessNumber = "5678";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        String actual = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("0A0B", actual);
    }



}
