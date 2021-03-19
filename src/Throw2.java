package cursos.tec.datos1.errores;

/*
 * Ejemplos de excepciones en java con throw y throws
 * #====== Ejemplo 2 con Throws ======#
 * */

public class Throw2 {
    public static int x = 5;
    public static int y = 0;

    public static void main(String[] args) {
        try {
            dividir();
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
    }

    // --- con throws debe ir la operacion en otro metodo
    private static void dividir() throws ArithmeticException {
        System.out.println(x / y);
    }
}
