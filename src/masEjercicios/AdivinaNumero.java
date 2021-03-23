package masEjercicios;

/*
* NOTAS SOBRE EL EJERCICIO:
* Escribe un programa que juegue con el usuario a adivinar un número. El
* ordenador debe generar un número entre 1 y 500, y el usuario tiene que
* intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor,
* el ordenador debe decirle al usuario si el número que tiene  que adivinar
* es mayor o menor que el que ha introducido el usuario. Cuando consiga
* adivinarlo, debe indicárselo e imprimir en pantalla el número de veces
* que el usuario ha intentado adivinar el número. Si el usuario introduce
* algo que no es un número, debe indicarlo en pantalla, y contarlo como un
* intento.*/

import java.util.Scanner;

public class AdivinaNumero {
    public static <inputMismatchException extends Throwable> void main(String[] args) throws inputMismatchException {
        Scanner teclado = new Scanner(System.in);

        int numAdiv = (int)(Math.random()*500);

        // Debe ser un numero entre 1 y 500, entonces incrementa en 1
        int numero = 0;
        int intentos = 0;

        do {
            Boolean leido;
            do {
                System.out.println("Intriduzca un numero (1-500) ");
                intentos++;
                numero = teclado.nextInt();
                System.out.println("El numero introduciodo es; "+numero);
                leido = true;
            } while (leido == false);
            if (numero > numAdiv) {
                System.out.println("el numero es menor");
            }
            if (numero < numAdiv){
                System.out.println("el numero es mayor");
            }
        } while (numero != numAdiv);
        System.out.println("Has acertado!!! El numero es: "+numAdiv);
    }








}




