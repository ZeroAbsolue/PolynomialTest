package MGL8969.PolynomialPractical;

import java.util.Comparator;

public class TermComparator implements Comparator<Term> {

    @Override
    public int compare(Term o1, Term o2) {
        int result = Character.compare(o1.getName(), o2.getName());
        if (result == 0) {
            return (Integer.compare(o1.getExponent(), o2.getExponent()) * -1);
        }
        if (Math.abs(result) > 51)
            return Math.abs(result);
        return result;
    }

}
