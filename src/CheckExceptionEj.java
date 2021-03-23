public class CheckExceptionEj {

    // Metodo que atrapa la excepcion
    public void catchCheckedException(){
        try{
            throwCheckedException();
        } catch (ExampleCheckedException e) {
            // Hacer algo en caso de error
        }
    }

    // lanza una checked exception a un metodo superior
    public void rethrowCheckedExxception() throws ExampleCheckedException{
        throwCheckedException();
    }

    //lanza una checked exception
    private void throwCheckedException() throws ExampleCheckedException {
        throw new ExampleCheckedException();
    }

    // clase de la excepcion de ejemplo
    private static final class ExampleCheckedException extends Exception {

        public ExampleCheckedException() {
            super();
        }

    }
}
