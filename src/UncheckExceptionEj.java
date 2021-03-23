
public class UncheckExceptionEj {

    // Metodo principal
    public void mainMethod(){
        methodThrowsRuntimeException();
        methodThrowsRuntimeException2();
    }

    // lanzara una exception de tipo runtime.
    public void methodThrowsRuntimeException(){
        throw new ExampleRuntimeException();
    }

    // lanzara una exception de tipo runtime que si esta declarada en su
    // firma, esta deja mas claro al desarrollador las excepciones que
    // deberia menejar.
    public void methodThrowsRuntimeException2() throws ExampleRuntimeException{
        throw new ExampleRuntimeException();
    }

    // Clase de error de tipo runtime
    public static class ExampleRuntimeException extends RuntimeException {
        public ExampleRuntimeException() {
            super();
        }
    }
}
