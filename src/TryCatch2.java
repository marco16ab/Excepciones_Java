package cursos.tec.datos1.errores;

// Try catch con finally
public class TryCatch2 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("Mi error");
            throw e;
        } catch (Exception exception){
            exception.printStackTrace();
        } finally {
            System.out.println("Se ejecuta finally");
        }
    }
}
