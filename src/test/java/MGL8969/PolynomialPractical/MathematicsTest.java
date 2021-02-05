package MGL8969.PolynomialPractical;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;    
    
public class MathematicsTest {
    APolynomial ap;
    Term term;

    @Before
    public void setup() {
        ap = new APolynomial();
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

        APolynomial ap2 = new APolynomial();
        ap2.addTerm(new Term(2, 'y', 4));
        ap2.addTerm(new Term(-7, 'y', 4));
        ap2.addTerm(new Term(-7, 'z', 4));
        ap2.addTerm(new Term(-7, 't', 4));

        
        Mathematics math = new Mathematics();
        assertEquals("the result is the following String: 2.0x^3.-10.0y^4.-14.0z^4", (math.sumPolynomials(ap, ap2)).toString());
    }
}
    