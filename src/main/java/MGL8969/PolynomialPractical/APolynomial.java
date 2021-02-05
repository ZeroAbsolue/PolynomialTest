package MGL8969.PolynomialPractical;

public class APolynomial implements Polynomial {
    private final int MAX_LENGTH_POLYNOMIAL = 100;
    private int numberTerms = 0;
    public Term[] terms;

    public APolynomial() {
        this.terms = new Term[MAX_LENGTH_POLYNOMIAL];
    }

    @Override
    public boolean addTerm(Term term) {
        this.numberTerms++;
        if (this.numberTerms < MAX_LENGTH_POLYNOMIAL) {
            this.terms[this.numberTerms - 1] = term;
            return true;
        }
        this.numberTerms--;
        return false;
    }

    @Override
    public int getNumberTerms() {
        return this.numberTerms;
    }

    @Override
    public boolean removeTerm(Term t) {
        Boolean result = false;
        for (int index = 0; index < this.numberTerms; index = index + 1) {
            Term term = this.terms[index];
            if (term != null) {
                if ((this.terms[index].toString()).equals(t.toString())) {
                    for (int j = index; j < this.numberTerms; j++) {
                        this.terms[j] = this.terms[j + 1];
                    }
                    this.numberTerms--;
                    result = true;
                }
            }
        }
        return result;
    }

    @Override
    public int[] getExponents() {
        int[] result = new int[this.numberTerms];
        int i = 0;
        for (Term term : this.terms) {
            if (term != null) {
                int exposant = term.getExponent();
                if (!checkIfExposantExist(result, exposant)) {
                    result[i] = exposant;
                    i++;
                }
            }
        }
        return result;
    }

    @Override
    public char[] getVariables() {
        char[] result = new char[this.numberTerms];
        int i = 0;
        for (Term term : this.terms) {
            if (term != null) {
                char variable = term.getName();
                if (!checkIfVariableExist(result, variable)) {
                    result[i] = variable;
                    i++;
                }
            }
        }
        return result;
    }

    @Override
    public Term[] getTerms(char variable, int exponent) {
        Term[] result = new Term[this.numberTerms];
        int i = 0;
        for (Term term : this.terms) {
            if (term != null) {
                if (term.getName() == variable && term.getExponent() == exponent) {
                    result[i] = term;
                    i++;
                }
            }
        }
        return result;
    }

    @Override
    public Term[] getAllTerms() {
        Term[] result = new Term[this.numberTerms];
        int index = 0;
        for (char variable : getVariables()) {
            for (int exponent : this.getExponents()) {
                for (Term term : this.getTerms(variable, exponent)) {
                    if (term != null) {
                        if (index < this.numberTerms) {
                            result[index] = term;
                            index++;
                        }
                    }
                }
            }
        }
        return result;
    }

    public boolean checkIfExposantExist(int[] exposants, int e) {
        Boolean exist = false;
        for (int exposant : exposants) {
            exist = exposant == e;
            if (exist)
                break;
        }
        return exist;
    }

    public boolean checkIfVariableExist(char[] chars, char e) {
        Boolean exist = false;
        for (char exposant : chars) {
            exist = exposant == e;
            if (exist)
                break;
        }
        return exist;
    }

    @Override
    public String toString() {
        String result = "the result is the following String: ";
        Boolean i = true;
        for (Term term : this.getAllTerms()) {
            if (term != null) {
                if (i) {
                    result += term.toString();
                    i = false;
                } else {
                    result += "." + term.toString();
                }
            }
        }
        return result;
    }

}
