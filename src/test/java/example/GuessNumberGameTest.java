package example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_1234_given_1234() {
        //given
        String guessNumber = "12324";
        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        guessNumberGame.guess(guessNumber);
        //then
        assertEquals("4A0B", guessNumber);
    }


}
