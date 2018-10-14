public class GCD {
    int calculate(int firstOperand, int secondOperand) {
        if(firstOperand % secondOperand == 0) {
            return secondOperand;
        } else {
            return calculate(secondOperand, firstOperand % secondOperand);
        }
    }
}
