package MGL8969.PolynomialPractical;

public class ExceptionCoefficientZero extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ExceptionCoefficientZero(String message) {
        super(message);
    }

    public ExceptionCoefficientZero() {
        super("The terms with coefficient zero are not valid");
    }
    
}
