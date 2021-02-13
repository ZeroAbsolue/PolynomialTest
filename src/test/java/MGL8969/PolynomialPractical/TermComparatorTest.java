package MGL8969.PolynomialPractical;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class TermComparatorTest {
    Term term1;
    Term term2;

    @Before
    public void setup() {
        term1 = new Term(2, 'x', 2);
        term2 = new Term(2, 'y', 3);
    }

    @Test
    public void compare() {
        TermComparator tc = new TermComparator();
        assertEquals(-1, tc.compare(term1, term2));
    }
}
