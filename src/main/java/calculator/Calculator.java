package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expression) {
        String a = expression [0];
        String op1 = expression [1];
        String b = expression [2];
        String op2 = expression [3];
        String c = expression [4];



        double result1 = calc (a, op1, b);
        double result2 = calc (Double.toString (result1), op2, c);

        return Double.toString(result2);
    }

    double calc(String stra, String op, String strb) {
        double result;
        double a = Double.parseDouble(stra);
        double b = Double.parseDouble(strb);

        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                result = 0;
        }
        return result;
    }

}
