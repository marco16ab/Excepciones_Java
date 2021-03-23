## Excepciones_Java

**Throw:** sirve para lanzar una excepción en una línea del código.

`1. throw new AritmeticException("No se puede dividir entre cero");`

**Throws:** sirve para pasar la excepción hacia arriba en una función.

`1. void miFuncion() throws AritmeticException{`    
`2.     // ... `    
`3. }`

**Checked exception:** El compilador de Java obliga a tratar ciertas excepciones (por ejemplo FileNotFoundException); es decir, pasar la excepción para arriba con la función con throws o capturarla con try-catch.

`1. try {`  
`2.     FileReader fichero = new FileReader("fichero.txt");`    
`3.     // Hacer algo si existe el fichero`     
`4. } catch (FileNotFoundException e) {`    
`5.     // Hacer algo si NO existe el fichero`  
`6. }`  

**Unchecked exception:** El compilador de Java NO obliga a tratar ciertas excepciones (como NullPointerExcepcion).

`1. fichero = null;`    
`2. fichero.read();`    
`3. // Se lanzara el error NullPointerException seguro, pero el
    complilador no obliga a capturarlo`
