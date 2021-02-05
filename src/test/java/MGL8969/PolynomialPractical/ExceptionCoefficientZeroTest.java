package MGL8969.PolynomialPractical;

import org.junit.Test;

public class ExceptionCoefficientZeroTest {

    @Test
    public void ConstructorTest() throws ExceptionCoefficientZero {
        Term term = new Term(2, '.', 0);
    }
}
