package calculadora;

/** Ponto de entrada para demonstração da calculadora. */
public class Main {
    /** @param args argumentos de linha de comando (não utilizados) */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("=== FinançApp - Calculadora ===");
        String[] ops = {"+", "-", "*", "/", "/", "%"};
        int[] as = {8, 8, 8, 8, 8, 8};
        int[] bs = {2, 2, 2, 2, 0, 2};
        for (int i = 0; i < ops.length; i++) {
            try {
                System.out.println(as[i] + " " + ops[i] + " " + bs[i] + " = " + calculadora.calc(as[i], bs[i], ops[i]));
            } catch (IllegalArgumentException | ArithmeticException erro) {
                System.out.println("Erro tratado: " + erro.getMessage());
            }
        }
    }
}
