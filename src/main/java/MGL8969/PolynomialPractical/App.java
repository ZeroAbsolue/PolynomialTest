package MGL8969.PolynomialPractical;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        APolynomial ap = new APolynomial();
        Term term = new Term(2, 'x', 3);
        ap.addTerm(term);
        ap.addTerm(new Term(2, 'y', 4));
        ap.addTerm(new Term(-7, 'y', 4));
        ap.addTerm(new Term(-7, 'z', 4));
        ap.addTerm(new Term(7, 't', 4));
        ap.addTerm(new Term(7, ' ', 0));

        APolynomial ap2 = new APolynomial();
        ap2.addTerm(new Term(2, 'y', 4));
        ap2.addTerm(new Term(-7, 'y', 4));
        ap2.addTerm(new Term(-7, 'z', 4));
        ap2.addTerm(new Term(-7, 't', 4));
        ap2.addTerm(new Term(7, ' ', 0));

        Mathematics math = new Mathematics();
        System.out.println((math.sumPolynomials(ap, ap2)).toString());
    }
}
