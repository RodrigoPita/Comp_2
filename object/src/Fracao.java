import static java.lang.Math.abs;

public class Fracao {

    /**
     * O numerador da fração. Sempre positivo.
     */
    private final int numerador;

    /**
     * O denominador da fração. Sempre positivo.
     */
    private final int denominador;

    private static String separador = "/";

    /**
     * Indica o sinal da fração. Se true, a fração é positiva.
     * @return
     */
    private final boolean positiva;

    public boolean ehPropria() {
        return numerador < denominador;
    }

    /**
     *
     * @param n O numerador. Precisa ser não-negativo.
     * @param d O denominador. Precisa ser positivo.
     */
    public Fracao(int n, int d) throws IllegalArgumentException{
        if (d == 0) {
            throw new IllegalArgumentException("Denominador inválido");
        }

        numerador = abs(n);
        denominador = abs(d);
        positiva = n >= 0 && d > 0 || n < 0 && d < 0;
    }

    public String toString() {
        String sinal = positiva ? "" : "-";
        return String.format("%s%d%s%d", sinal, numerador, separador, denominador);
    }
}