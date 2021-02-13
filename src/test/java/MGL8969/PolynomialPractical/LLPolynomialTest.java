package MGL8969.PolynomialPractical;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
    
public class LLPolynomialTest {

    LLPolynomial ap;
    Term term;

    @Before
    public void setup() {
        ap = new LLPolynomial();
        term = new Term(2, 'x', 3);
    }

    @Test
    public void ApConstructorTest() {

        assertSame(ap.terms.size(),0);
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
    public void getExponents() {
        ap.addTerm(term);
        term = new Term(2, 'x', 4);
        ap.addTerm(term);
        term = new Term(2, 'x', 5);
        ap.addTerm(term);
        int integer = ap.getExponents().get(2);
        assertEquals(integer, 5);
    }

    @Test
    public void getVariables() {
        ap.addTerm(term);
        term = new Term(2, '.', 4);
        ap.addTerm(term);
        term = new Term(2, 'y', 5);
        ap.addTerm(term);
        char name = ap.getVariables().get(1);
        assertEquals(name, '.');
    }

    @Test
    public void getTerms() {
        ap.addTerm(term);
        term = new Term(2, 'y', 4);
        Term term3 = new Term(-7, 'y', 4);
        ap.addTerm(term);
        ap.addTerm(term3);
        assertEquals(ap.getTerms('y', 4).get(0), term);
        assertEquals(ap.getTerms('y', 4).get(1), term3);
    }

    @Test
    public void getAllTerms() {
        ap.addTerm(term);
        assertEquals(ap.getAllTerms().get(0), term);
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
    