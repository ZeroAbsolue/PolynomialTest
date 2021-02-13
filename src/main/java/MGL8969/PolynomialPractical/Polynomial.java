package MGL8969.PolynomialPractical;

import java.util.List;

public interface Polynomial {
    // public boolean addTerm(Term t);

    // public int getNumberTerms();

    // public boolean removeTerm(Term t);

    // public int[] getExponents();

    // public char[] getVariables();

    // public Term[] getTerms(char variable, int exponent);

    // public Term[] getAllTerms();

    public boolean addTerm(Term t);

    public int getNumberTerms();

    public boolean removeTerm(Term t);

    public List<Integer> getExponents();

    public List<Character> getVariables();

    public List<Term> getTerms(char variable, int exponent);

    public List<Term> getAllTerms();

}
