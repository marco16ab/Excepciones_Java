package cursos.tec.datos1.errores;

/*
 * Ejemplos de excepciones en java con throw y throws
 * #====== Ejemplo 1 sin Throw ni throws ======#
 * */

public class Throw1 {
    public static int x = 5;
    public static int y = 0;

    public static void main(String[] args) {
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
    }
}