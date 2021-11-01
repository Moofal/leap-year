import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestIfYearIsNotLeapYear {

    @ParameterizedTest
    @MethodSource("year")
    @DisplayName("Is ether not divisible by 4 or divisible by 100 and not 400")
    public void is_Leap_Year(int year) {
        assertFalse(Year.isLeapYear(year));
    }

    @ParameterizedTest
    @MethodSource("year")
    public void not_divisible_by_4(int year) {
        assertFalse(Year.isLeapYear(year));
    }

    @ParameterizedTest
    @MethodSource("year")
    public void divisible_by_100_not_400(int year) {
        assertFalse(Year.isLeapYear(year));
    }
    
    public static Stream<Arguments> year() {
        return Stream.of(
                Arguments.of(1700),
                Arguments.of(1800),
                Arguments.of(1900)
        );
    }
}
