import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestIfYearIsLeapYear {

    @ParameterizedTest
    @MethodSource("year")
    @DisplayName("Is ether divisible by 400 or divisible by 4 and not 100")
    public void is_leap_year(int year) {
        assertTrue(Year.isLeapYear(year));
    }

    @ParameterizedTest
    @MethodSource("year")
    public void divisible_by_400(int year) {
        assertTrue(Year.isLeapYear(year));
    }

    @ParameterizedTest
    @MethodSource("year")
    public void divisible_by4_not_100(int year) {
        assertTrue(Year.isLeapYear(year));
    }

    public static Stream<Arguments> year() {
        return Stream.of(
                Arguments.of(2000),
                Arguments.of(2004),
                Arguments.of(2008)
        );
    }
}
