package radian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertorTest {


    @Test
    void degreeToRadian() {

        // given
        double value = 2d;

        // then
        double radian = Convertor.degreeToRadian(value);

        // then
        assertEquals(radian, 0.03490658503988659);
    }

}