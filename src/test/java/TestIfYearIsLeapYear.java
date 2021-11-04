import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestIfYearIsLeapYear {

    @ParameterizedTest
    @MethodSource("leap_year")
    @DisplayName("Is ether divisible by 400 or divisible by 4 and not 100")
    public void is_leap_year(int year) {
        assertTrue(Year.isLeapYear(year));
    }

    @ParameterizedTest
    @MethodSource("leap_year")
    public void divisible_by_400(int year) {
        assertTrue(Year.isLeapYear(year));
    }

    @ParameterizedTest
    @MethodSource("leap_year")
    public void divisible_by4_not_100(int year) {
        assertTrue(Year.isLeapYear(year));
    }

    public static Stream<Arguments> leap_year() {
        return Stream.of(
                Arguments.of(2000),
                Arguments.of(2004),
                Arguments.of(2008)
        );
    }

    @ParameterizedTest
    @MethodSource("not_leap_year")
    @DisplayName("Is ether not divisible by 4 or divisible by 100 and not 400")
    public void is_Leap_Year(int year) {
        assertFalse(Year.isLeapYear(year));
    }

    @ParameterizedTest
    @MethodSource("not_leap_year")
    public void not_divisible_by_4(int year) {
        assertFalse(Year.isLeapYear(year));
    }

    @ParameterizedTest
    @MethodSource("not_leap_year")
    public void divisible_by_100_not_400(int year) {
        assertFalse(Year.isLeapYear(year));
    }

    public static Stream<Arguments> not_leap_year() {
        return Stream.of(
                Arguments.of(1700),
                Arguments.of(1800),
                Arguments.of(1900)
        );
    }
    
}
