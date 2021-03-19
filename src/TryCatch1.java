package cursos.tec.datos1.errores;

public class TryCatch1 {
    public static void main(String[] args) {
        int [] array = new int[20];

        try {
            array[-3] = 24;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Error con el indice en el array");
        }
    }
}
