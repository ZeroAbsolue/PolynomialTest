package MGL8969.PolynomialPractical;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Before;
import org.junit.Rule;

public class ExceptionCoefficientZeroTest {

    @Test
    public void ConstructorTest() throws ExceptionCoefficientZero {
        Term term = new Term(2, '.', 0);
    }
}
