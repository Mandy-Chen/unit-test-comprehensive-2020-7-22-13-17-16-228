package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


    @Test
    void should_return_true_when_1234_given_1123() {
        //given
        String validValue = "1123";
        //when
        Valid valid = new Valid();
        Boolean actual = valid.valid(validValue);
        //then
        assertEquals(false, actual);
    }

    @Test
    void should_return_true_when_1234_given_as12() {
        //given
        String validValue = "as12";
        //when
        Valid valid = new Valid();
        Boolean actual = valid.valid(validValue);
        //then
        assertEquals(false, actual);
    }
}
