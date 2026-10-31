package calculadora;

/**
 * Calculadora de operações básicas do projeto FinançApp.
 * @author Guilherme Cintra Doraciotto
 * @version 1.0
 */
public class Calculadora {
    /**
     * Realiza uma operação com dois números inteiros.
     * @param a primeiro valor
     * @param b segundo valor
     * @param op operador (+, -, * ou /)
     * @return resultado numérico da operação
     * @throws ArithmeticException quando há divisão por zero
     * @throws IllegalArgumentException quando o operador é inválido
     */
    public double calc(int a, int b, String op) {
        if (op == null) {
            throw new IllegalArgumentException("Operação inválida: null");
        }
        if (op.equals("+")) {
            return a + (double) b;
        } else if (op.equals("-")) {
            return a - (double) b;
        } else if (op.equals("*")) {
            return a * (double) b;
        } else if (op.equals("/")) {
            if (b == 0) {
                throw new ArithmeticException("Não é possível dividir por zero");
            }
            return (double) a / b;
        } else {
            throw new IllegalArgumentException("Operação inválida: " + op);
        }
    }
}
