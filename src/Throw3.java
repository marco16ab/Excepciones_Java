package cursos.tec.datos1.errores;

/*
 * Ejemplos de excepciones en java con throw y throws
 * #====== Ejemplo 3 con Throw ======#
 * */

public class Throw3 {
    public static int x = 5;
    public static int y = 0;

    public static void main(String[] args) {
        dividir();
    }

    private static void dividir() {
        try {
            if (y == 0)
                throw new IllegalArgumentException("No se puede dividir por cero");
            System.out.println(x / y);
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }
    }
}
