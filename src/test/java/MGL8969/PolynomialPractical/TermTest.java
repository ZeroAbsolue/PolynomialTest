package MGL8969.PolynomialPractical;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class TermTest {

    Term term;

    @Before
    public void setup() {

    }

    @Test
    public void constructorTest() {
        try {
            term = new Term(0, 'x', 0);
        } catch (Exception ex) {
            assertEquals("The terms with coefficient zero are not valid", ex.getMessage());
        }
    }

    @Test
    public void toStringTest() {
        term = new Term(2, ' ', 4);
        assertEquals(term.getCoefficient() + "", term.toString());
     
    }
}
