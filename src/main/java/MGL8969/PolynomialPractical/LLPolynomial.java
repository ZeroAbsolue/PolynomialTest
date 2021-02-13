package MGL8969.PolynomialPractical;

import java.util.LinkedList;
import java.util.List;

public class LLPolynomial implements Polynomial {
    public List<Term> terms;

    public LLPolynomial() {
        this.terms = new LinkedList<Term>();
    }

    @Override
    public boolean addTerm(Term t) {
        return this.terms.add(t);
    }

    @Override
    public int getNumberTerms() {
        return this.terms.size();
    }

    @Override
    public boolean removeTerm(Term t) {
        return this.terms.remove(t);
    }

    @Override
    public List<Integer> getExponents() {
        List<Integer> exponents = new LinkedList<Integer>();
        for (Term term : this.terms) {
            int exponent = term.getExponent();
            if (!exponents.contains(exponent)) {
                exponents.add(exponent);
            }
        }
        return exponents;
    }

    @Override
    public List<Character> getVariables() {
        List<Character> variables = new LinkedList<Character>();
        for (Term term : this.terms) {
            char variable = term.getName();
            if (!variables.contains(variable)) {
                variables.add(variable);
            }
        }
        return variables;
    }

    @Override
    public List<Term> getTerms(char variable, int exponent) {
        List<Term> rTerms = new LinkedList<Term>();
        for (Term term : this.terms) {
            if (term.getName() == variable && term.getExponent() == exponent) {
                rTerms.add(term);
            }
        }
        return rTerms;
    }

    @Override
    public List<Term> getAllTerms() {
        List<Term> rTerms = new LinkedList<Term>();
        for (char name : getVariables()) {
            for (int exponent : getExponents()) {
                for (Term term : getTerms(name, exponent)) {
                    rTerms.add(term);
                }
            }
        }
        return rTerms;
    }

    @Override
    public String toString() {
        String result = "the result is the following String: ";
        Boolean i = true;
        for (Term term : this.terms) {
            if (i) {
                result += term.toString();
                i = false;
            } else {
                result += "." + term.toString();
            }
        }
        return result;
    }
}
