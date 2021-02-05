package MGL8969.PolynomialPractical;

public class Term {
    private double coefficient;
    private int exponent;
    private char name;

    public Term(double coefficient, char name, int exponent) {
        try {
            if (coefficient == 0) {
                throw new ExceptionCoefficientZero();
            }
            this.coefficient = coefficient;
            this.exponent = exponent;
            this.name = name;
        } catch (ExceptionCoefficientZero e) {
            System.out.println(e.getMessage());
        }
    }


    
    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if(name != ' ')
        return coefficient + "" + name + "^" + exponent;
        else
        return coefficient +"";
    }

}
