package MGL8969.PolynomialPractical;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Mathematics {

    public Polynomial simplify(Polynomial polynomial) {

        LLPolynomial copie = (LLPolynomial) polynomial;
        LLPolynomial result = new LLPolynomial();
        // Tant qu'il y'a des termes dans la copie de polynomial
        do {
            // Je recupere le premier terme
            if (copie.getNumberTerms() > 0) {
                Term term = copie.getAllTerms().get(0);
                // Je recupere les termes identiques a ce term
                char name = term.getName();
                int exponent = term.getExponent();
                List<Term> terms = copie.getTerms(name, exponent);
                // Calcul de la somme des coefficients
                int coefficient = 0;
                for (Term term2 : terms) {
                    if (term2 != null) {
                        coefficient += term2.getCoefficient();
                    }
                }

                if (coefficient != 0)
                    result.addTerm(new Term(coefficient, name, exponent));

                // Je retire tous les termes de ce genre dans la copie
                for (Term term2 : terms) {
                    if (term2 != null) {
                        copie.removeTerm(term2);
                    }
                }

            }

        } while (copie.getNumberTerms() > 0);

        return (Polynomial) result;
    }

    public Polynomial sumPolynomials(Polynomial polynomial1, Polynomial polynomial2) {

        LLPolynomial p1 = new LLPolynomial();
        LLPolynomial p2 = new LLPolynomial();

        for (Term term : ((LLPolynomial) simplify(polynomial1)).getAllTerms()) {
            p1.addTerm(new Term(term.getCoefficient(), term.getName(), term.getExponent()));
        }

        for (Term term : ((LLPolynomial) simplify(polynomial2)).getAllTerms()) {
            p2.addTerm(new Term(term.getCoefficient(), term.getName(), term.getExponent()));
        }

        for (Term term : p2.getAllTerms()) {
            if (term != null) {
                p1.addTerm(term);
            }
        }

        return simplify((Polynomial) p1);
    }

    public Polynomial sort(Polynomial polynomial) {
        SortedSet<Term> termSorted = new TreeSet<Term>(new TermComparator());
        LLPolynomial polynomial2 = new LLPolynomial();
        for (Term term : ((LLPolynomial) polynomial).getAllTerms()) {
            termSorted.add(term);
        }

        System.out.println(termSorted);

        for (Term term : termSorted) {
            polynomial2.addTerm(term);
        }
       
        return (Polynomial) polynomial2;
    }
}
