package MGL8969.PolynomialPractical;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Before;
import org.junit.Rule;    
    
public class ExceptionCoefficientZeroTest {


    @Before
    public void setup(){

    }
        
    @Test(expected = ExceptionCoefficientZero.class)
    public void ConstructorTest() {
        Term term = new Term(2, '.', 0);
    }
}
    