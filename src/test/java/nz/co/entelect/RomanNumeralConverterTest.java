package nz.co.entelect;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumeralConverterTest {

    @Test
    public void whenRomanStringIsOne_thenReturn1() {
        NumeralConverter converter = new NumeralConverter();

        // When
        int result = converter.convert("i");

        // Then
        assertThat(result, is(1));
    }

    @Test
    public void whenRomanStringIsTwo_thenReturn2() {
        NumeralConverter converter = new NumeralConverter();

        // When
        int result = converter.convert("ii");

        // Then
        assertThat(result, is(2));
    }

    @Test
    public void whenRomanStringIsFive_thenReturn5() {
        NumeralConverter converter = new NumeralConverter();

        // When
        int result = converter.convert("v");

        // Then
        assertThat(result, is(5));
    }

    @Test
    public void whenRomanStringIsFifteen_thenReturn15() {
        NumeralConverter converter = new NumeralConverter();

        // When
        int result = converter.convert("xv");

        // Then
        assertThat(result, is(15));
    }

    @Test
    public void whenRomanStringIsSixteen_thenReturn16() {
        NumeralConverter converter = new NumeralConverter();

        // When
        int result = converter.convert("xvi");

        // Then
        assertThat(result, is(16));
    }

    @Test
    public void whenRomanStringIsTwentySix_thenReturn26() {
        NumeralConverter converter = new NumeralConverter();

        // When
        int result = converter.convert("xxvi");

        // Then
        assertThat(result, is(26));
    }

    @Test
    public void whenRomanStringIsTwentySix_thenReturn26() {
        NumeralConverter converter = new NumeralConverter();

        // When
        int result = converter.convert("xxvi");

        // Then
        assertThat(result, is(26));
    }

}

/**
 *
 * i
 * ii
 * iii
 * iv
 * v
 * vi
 * vii
 * viii
 * ix
 * x
 *
 */