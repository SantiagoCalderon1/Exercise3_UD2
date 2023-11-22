
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author alumnot
 */
public class Exercise3_UD2_Factorial {

    // Método para calcular el factorial de un número
    public static int calcularFactorial(int numero) {
        if (numero > 0) {
            int resultado = numero * calcularFactorial(numero - 1);
            return resultado;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        // Utilizar un Scanner para obtener la entrada del usuario
        Scanner entrada = new Scanner(System.in);
        int numero;
        // Solicitar al usuario que ingrese un número
        System.out.print("Introduce un número: ");
        numero = entrada.nextInt();

    

        // Imprimir el resultado
        System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));

        // Cerrar el Scanner
        entrada.close();
    }

}
