package calculadora;

/**
 * Testes unitários independentes de bibliotecas externas.
 * Executar com TESTAR.bat ou via linha de comando.
 */
public class TesteCalculadora {
    private static int aprovados = 0;
    private static int reprovados = 0;
    private static final Calculadora calculadora = new Calculadora();

    private static void testar(String descricao, int a, int b, String op, double esperado) {
        try {
            double obtido = calculadora.calc(a, b, op);
            boolean passou = Double.compare(obtido, esperado) == 0;
            registrar(descricao, "(" + a + ", " + b + ", " + op + ")", esperado + "", obtido + "", passou);
        } catch (Exception e) {
            registrar(descricao, "(" + a + ", " + b + ", " + op + ")", esperado + "", e.toString(), false);
        }
    }

    private static void testarExcecao(String descricao, int a, int b, String op, Class<? extends Exception> esperada) {
        try {
            double obtido = calculadora.calc(a, b, op);
            registrar(descricao, "(" + a + ", " + b + ", " + op + ")", esperada.getSimpleName(), obtido + "", false);
        } catch (Exception e) {
            registrar(descricao, "(" + a + ", " + b + ", " + op + ")", esperada.getSimpleName(), e.getClass().getSimpleName(), esperada.isInstance(e));
        }
    }

    private static void registrar(String descricao, String entrada, String esperado, String obtido, boolean passou) {
        if (passou) aprovados++; else reprovados++;
        System.out.printf("%-23s entrada=%-12s esperado=%-25s obtido=%-25s %s%n",
                descricao, entrada, esperado, obtido, passou ? "APROVADO" : "REPROVADO");
    }

    public static void main(String[] args) {
        testar("Soma", 8, 2, "+", 10.0);
        testar("Subtracao", 8, 2, "-", 6.0);
        testar("Multiplicacao", 8, 2, "*", 16.0);
        testar("Divisao", 7, 2, "/", 3.5);
        testarExcecao("Divisao por zero", 8, 0, "/", ArithmeticException.class);
        testarExcecao("Operacao invalida", 8, 2, "%", IllegalArgumentException.class);
        testarExcecao("Operador nulo (extra)", 8, 2, null, IllegalArgumentException.class);
        System.out.println("RESULTADO: " + aprovados + " aprovados; " + reprovados + " reprovados.");
        if (reprovados > 0) System.exit(1);
    }
}
