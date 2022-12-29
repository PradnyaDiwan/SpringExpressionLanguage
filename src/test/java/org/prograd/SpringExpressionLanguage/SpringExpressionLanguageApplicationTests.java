package org.prograd.SpringExpressionLanguage;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringExpressionLanguageApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void shouldCheckThatFourIsEvenNumber() {
		OddOrEven oddoreven=new OddOrEven();
		String expected = "Even";
		String actual = oddoreven.isOddOrEven(4);
		assertThat(actual).isEqualTo(expected);
	}
	@Test
	void shouldCheckThatMinusFourIsEvenNumber() {
		OddOrEven oddoreven=new OddOrEven();
		String expected = "Even";
		String actual = oddoreven.isOddOrEven(-4);
		assertThat(actual).isEqualTo(expected);
	}
	@Test
	void shouldCheckThatFiveIsNotEvenNumber() {
		OddOrEven oddoreven=new OddOrEven();
		String expected = "Even";
		String actual = oddoreven.isOddOrEven(5);
		assertThat(actual).isNotEqualTo(expected);
	}
	@Test
	void shouldCheckIfNineIsSquare() {
		SquareOrCube squareOrCube=new SquareOrCube();
		String expected = "Square";
		String actual = squareOrCube.isSquareOrCube(9);
		assertThat(actual).isEqualTo(expected);
	}
	@Test
	void shouldCheckIfMinusNineIsNotSquare() {
		SquareOrCube squareOrCube=new SquareOrCube();
		String expected = "Square";
		String actual = squareOrCube.isSquareOrCube(-9);
		assertThat(actual).isNotEqualTo(expected);
	}
	@Test
	void shouldCheckIfSevenIsNotSquare() {
		SquareOrCube squareOrCube=new SquareOrCube();
		String expected = "Square";
		String actual = squareOrCube.isSquareOrCube(7);
		assertThat(actual).isNotEqualTo(expected);
	}
	@Test
	void shouldCheckIfEightIsCube() {
		SquareOrCube squareOrCube=new SquareOrCube();
		String expected = "Cube";
		String actual = squareOrCube.isSquareOrCube(8);
		assertThat(actual).isEqualTo(expected);
	}
	@Test
	void shouldCheckIfMinusEightIsNotCube() {
		SquareOrCube squareOrCube=new SquareOrCube();
		String expected = "Cube";
		String actual = squareOrCube.isSquareOrCube(-8);
		assertThat(actual).isNotEqualTo(expected);
	}
	@Test
	void shouldCheckIfSevenIsNotCube() {
		SquareOrCube squareOrCube=new SquareOrCube();
		String expected = "Cube";
		String actual = squareOrCube.isSquareOrCube(7);
		assertThat(actual).isNotEqualTo(expected);
	}
        @Test
	void shouldCheckIfSevenIsNotComposite() {
		PrimeOrComposite primeOrComposite=new PrimeOrComposite();
		String expected = "Composite";
		String actual = primeOrComposite.isPrimeOrComposite(7);
		assertThat(actual).isNotEqualTo(expected);
	}
        @Test
	void shouldCheckIfTwelveIsComposite() {
		PrimeOrComposite primeOrComposite=new PrimeOrComposite();
		String expected = "Composite";
		String actual = primeOrComposite.isPrimeOrComposite(12);
		assertThat(actual).isEqualTo(expected);
	}
        @Test
	void shouldCheckIfSevenIsPrime() {
		PrimeOrComposite primeOrComposite=new PrimeOrComposite();
		String expected = "Prime";
		String actual = primeOrComposite.isPrimeOrComposite(7);
		assertThat(actual).isEqualTo(expected);
	}

}
