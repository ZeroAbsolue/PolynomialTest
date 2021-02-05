package MGL8969.PolynomialPractical;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class APolynomialTest {
    APolynomial ap;
    Term term;

    @Before
    public void setup() {
        ap = new APolynomial();
        term = new Term(2, 'x', 3);
    }

    @Test
    public void ApConstructorTest() {

        assertSame(ap.terms.length, 100);
    }

    @Test
    public void addTerm() {

        assertTrue(ap.addTerm(term));
    }

    @Test
    public void getNumberTerms() {

        ap.addTerm(term);
        assertEquals(ap.getNumberTerms(), 1);
    }

    @Test
    public void removeTerm() {
        assertFalse(ap.removeTerm(term));
    }

    @Test
    public void checkIfExposantExist() {
        int[] exposants = new int[] { 1, 2, 3, 4 };
        assertTrue(ap.checkIfExposantExist(exposants, 4));
    }

    @Test
    public void checkIfVariableExist() {
        char[] chars = new char[] { 'a', 'b', 'c', 'd' };
        assertTrue(ap.checkIfVariableExist(chars, 'a'));
    }

    @Test
    public void getExponents() {
        ap.addTerm(term);
        term = new Term(2, 'x', 4);
        ap.addTerm(term);
        term = new Term(2, 'x', 5);
        ap.addTerm(term);
        assertEquals(ap.getExponents()[2], 5);
    }

    @Test
    public void getVariables() {
        ap.addTerm(term);
        term = new Term(2, '.', 4);
        ap.addTerm(term);
        term = new Term(2, 'y', 5);
        ap.addTerm(term);
        assertEquals(ap.getVariables()[1], '.');
    }

    @Test
    public void getTerms() {
        ap.addTerm(term);
        term = new Term(2, 'y', 4);
        Term term3 = new Term(-7, 'y', 4);
        ap.addTerm(term);
        ap.addTerm(term3);
        assertEquals(ap.getTerms('y', 4)[0], term);
        assertEquals(ap.getTerms('y', 4)[1], term3);
    }

    @Test
    public void getAllTerms() {
        ap.addTerm(term);
        assertEquals(ap.getAllTerms()[0], term);
    }

    @Test
    public void toStringTest() {
        ap.addTerm(term);
        ap.addTerm(new Term(2, 'y', 4));
        ap.addTerm(new Term(-7, 'y', 4));
        ap.addTerm(new Term(-7, 'z', 4));
        ap.addTerm(new Term(-7, 't', 4));
        assertEquals("the result is the following String: 2.0x^3.2.0y^4.-7.0y^4.-7.0z^4.-7.0t^4", ap.toString());
        System.out.println(ap.toString());
    }

}
