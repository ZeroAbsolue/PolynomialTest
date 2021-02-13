package MGL8969.PolynomialPractical;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;    
    
public class MathematicsTest {
    LLPolynomial ap;
    Term term;

    @Before
    public void setup() {
        ap = new LLPolynomial();
        term = new Term(2, 'x', 3);
    }

    @Test
    public void simplify() {
        ap.addTerm(term);
        ap.addTerm(new Term(2, 'y', 4));
        ap.addTerm(new Term(-7, 'y', 4));
        ap.addTerm(new Term(-7, 'z', 4));
        ap.addTerm(new Term(-7, 't', 4));
        Mathematics math = new Mathematics();
        assertEquals("the result is the following String: 2.0x^3.-5.0y^4.-7.0z^4.-7.0t^4", (math.simplify(ap)).toString());
    }


    @Test
    public void sumPolynomials() {
        ap.addTerm(term);
        ap.addTerm(new Term(2, 'y', 4));
        ap.addTerm(new Term(-7, 'y', 4));
        ap.addTerm(new Term(-7, 'z', 4));
        ap.addTerm(new Term(7, 't', 4));

        LLPolynomial ap2 = new LLPolynomial();
        ap2.addTerm(new Term(2, 'y', 4));
        ap2.addTerm(new Term(-7, 'y', 4));
        ap2.addTerm(new Term(-7, 'z', 4));
        ap2.addTerm(new Term(-7, 't', 4));

        
        Mathematics math = new Mathematics();
        assertEquals("the result is the following String: 2.0x^3.-10.0y^4.-14.0z^4", (math.sumPolynomials(ap, ap2)).toString());
    }
   
    @Test
    public void sort() {
        LLPolynomial ap2 = new LLPolynomial();
        ap2.addTerm(new Term(7, 'z', 2));
        ap2.addTerm(new Term(12, 'x', 2));
        ap2.addTerm(new Term(4, 'x', 1));
        ap2.addTerm(new Term(5, ' ', 0));
        ap2.addTerm(new Term(4, ' ', 0));
        ap2.addTerm(new Term(8, 'z', 5));

        
        Mathematics math = new Mathematics();
        String result = math.sort(ap2).toString();
        assertEquals("the result is the following String: 12.0x^2.4.0x^1.8.0z^5.7.0z^2.5.0", result);
    }
}
    