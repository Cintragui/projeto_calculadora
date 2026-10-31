package calculadora;

/**
 * Calculadora de operações básicas do projeto FinançApp.
 *
 * @author Guilherme Cintra Doraciotto
 * @version 2.0
 */
public class Calculadora {

    /**
     * Executa uma operação matemática com dois números inteiros.
     *
     * @param a primeiro valor
     * @param b segundo valor
     * @param op operador (+, -, * ou /)
     * @return resultado da operação
     * @throws ArithmeticException se ocorrer divisão por zero
     * @throws IllegalArgumentException se o operador for nulo ou inválido
     */
    public double calc(int a, int b, String op) {
        validarOperador(op);

        switch (op) {
            case "+":
                return (double) a + b;
            case "-":
                return (double) a - b;
            case "*":
                return (double) a * b;
            case "/":
                return dividir(a, b);
            default:
                throw new IllegalArgumentException("Operação inválida: " + op);
        }
    }

    /** Verifica se o operador foi informado. */
    private void validarOperador(String op) {
        if (op == null) {
            throw new IllegalArgumentException("Operação inválida: null");
        }
    }

    /** Centraliza a validação e o cálculo da divisão. */
    private double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero");
        }
        return (double) a / b;
    }
}
